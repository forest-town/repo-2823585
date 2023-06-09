/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.file.azure;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.util.EmptyStackException;
import java.util.Stack;

import com.azure.core.util.Context;
import com.azure.storage.file.share.ShareDirectoryClient;
import com.azure.storage.file.share.ShareFileClient;
import com.azure.storage.file.share.ShareServiceClient;
import com.azure.storage.file.share.models.ShareFileItem;
import com.azure.storage.file.share.models.ShareFileRange;
import com.azure.storage.file.share.options.ShareListFilesAndDirectoriesOptions;
import org.apache.camel.Exchange;
import org.apache.camel.InvalidPayloadException;
import org.apache.camel.component.file.FileComponent;
import org.apache.camel.component.file.GenericFile;
import org.apache.camel.component.file.GenericFileEndpoint;
import org.apache.camel.component.file.GenericFileExist;
import org.apache.camel.component.file.GenericFileOperationFailedException;
import org.apache.camel.component.file.remote.RemoteFile;
import org.apache.camel.component.file.remote.RemoteFileConfiguration;
import org.apache.camel.component.file.remote.RemoteFileOperations;
import org.apache.camel.util.FileUtil;
import org.apache.camel.util.IOHelper;
import org.apache.camel.util.StopWatch;
import org.apache.camel.util.TimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Operations with locally tracked cwd state.
 * <p>
 * The state limits thread safety.
 */
public class FilesOperations implements RemoteFileOperations<ShareFileItem> {

    static final int HTTP_OK = 200;

    protected final Logger log = LoggerFactory.getLogger(getClass());
    protected final ShareServiceClient client;
    protected FilesEndpoint<ShareFileItem> endpoint;
    private ShareDirectoryClient root;
    private Stack<ShareDirectoryClient> dirStack = new Stack<>();

    public FilesOperations(ShareServiceClient client) {
        this.client = client;
    }

    @Override
    public void setEndpoint(GenericFileEndpoint<ShareFileItem> endpoint) {
        this.endpoint = (FilesEndpoint<ShareFileItem>) endpoint;
    }

    @Override
    public GenericFile<ShareFileItem> newGenericFile() {
        return new RemoteFile<>();
    }

    @Override
    public boolean connect(RemoteFileConfiguration configuration, Exchange exchange)
            throws GenericFileOperationFailedException {
        root = client.getShareClient(endpoint.getShare()).getRootDirectoryClient();
        // TODO what about (starting) directory as the root?
        dirStack.push(root);
        // TODO translate runtime exception to Camel one?
        return existsRemote(root);
    }

    @Override
    public boolean isConnected() throws GenericFileOperationFailedException {
        return root != null;
    }

    @Override
    public void disconnect() throws GenericFileOperationFailedException {
        // noop
    }

    @Override
    public void forceDisconnect() throws GenericFileOperationFailedException {
        var ms = endpoint.configuration.getConnectTimeout();
        root.forceCloseAllHandles(true, Duration.ofMillis(ms), Context.NONE);
        root = null;
        dirStack = new Stack<>();
    }

    @Override
    public boolean deleteFile(String name) throws GenericFileOperationFailedException {
        log.debug("deleteFile({})", name);

        reconnectIfNecessary(null);

        var backup = backup();
        try {
            changeCurrentDirectory(FileUtil.onlyPath(name));
            return deleteRemote(cwd(), FileUtil.stripPath(name));
        } finally {
            restore(backup);
        }
    }

    boolean deleteRemote(ShareDirectoryClient dirClient, String fileName) {
        log.trace("{}> rm {}", dirClient.getDirectoryPath(), fileName);
        return Boolean.TRUE.equals(dirClient
                .deleteFileIfExistsWithResponse(fileName, endpoint.getMetadataTimeout(), Context.NONE)
                .getValue());
    }

    @SuppressWarnings("unchecked")
    void restore(Object backup) {
        dirStack = (Stack<ShareDirectoryClient>) backup;
    }

    Object backup() {
        return dirStack.clone();
    }

    private ShareDirectoryClient cwd() {
        var cwd = dirStack.peek();
        return cwd;
    }

    @Override
    public boolean renameFile(String from, String to) throws GenericFileOperationFailedException {
        // by observation both paths are absolute paths on the share
        log.debug("Renaming file: {} to: {}", from, to);

        var backup = backup();
        try {
            var shareRelativeTo = FilesPath.ensureRelative(to);
            var fileName = FilesPath.trimParentPath(from);

            changeCurrentDirectory(FilesPath.extractParentPath(from));
            var cwd = cwd();
            log.debug("{}> mv {} {}", cwd.getDirectoryPath(), fileName,
                    FilesPath.SHARE_ROOT + shareRelativeTo);
            var file = cwd.getFileClient(fileName);
            file.rename(shareRelativeTo);
            return true;
        } catch (RuntimeException e) {
            throw new GenericFileOperationFailedException("Cannot rename: " + from + " to: " + to, e);
        } finally {
            restore(backup);
        }
    }

    @Override
    public boolean buildDirectory(String directory, boolean absolute)
            throws GenericFileOperationFailedException {

        log.trace("buildDirectory({})", directory);

        reconnectIfNecessary(null);

        // otherwise to() fails:
        // org.apache.camel.component.file.GenericFileOperationFailedException: Cannot cd to the share
        // root: not connected
        // at org.apache.camel.component.file.azure.FilesOperations.cd(FilesOperations.java:605)
        // at
        // org.apache.camel.component.file.azure.FilesOperations.changeCurrentDirectory(FilesOperations.java:563)
        // at
        // org.apache.camel.component.file.azure.FilesOperations.buildDirectory(FilesOperations.java:178)
        // at
        // org.apache.camel.component.file.GenericFileProducer.writeFile(GenericFileProducer.java:279)
        // at
        // org.apache.camel.component.file.GenericFileProducer.processExchange(GenericFileProducer.java:173)
        // at
        // org.apache.camel.component.file.remote.RemoteFileProducer.process(RemoteFileProducer.java:61)

        // must normalize directory first
        directory = endpoint.getConfiguration().normalizePath(directory);

        var backup = backup();
        try {

            boolean success;

            // maybe the full directory already exists
            try {
                changeCurrentDirectory(directory);
                success = true;
            } catch (RuntimeException ex) {
                success = false;
            }
            if (!success) {
                if (absolute) {
                    changeCurrentDirectory(FilesPath.SHARE_ROOT);
                    directory = directory.substring(1);
                }
                log.trace("Trying to build remote directory: {}", directory);
                success = buildDirectoryChunks(directory);
            }

            return success;

        } catch (IOException e) {
            throw new GenericFileOperationFailedException(e.getMessage(), e);
        } finally {
            restore(backup);
        }

    }

    @Override
    public boolean retrieveFile(String name, Exchange exchange, long size)
            throws GenericFileOperationFailedException {
        log.trace("retrieveFile({})", name);
        boolean answer;
        var backup = backup();
        try {
            if (endpoint.getLocalWorkDirectory() != null) {
                answer = retrieveFileToFileInLocalWorkDirectory(name, exchange, endpoint.isResumeDownload());
            } else {
                answer = retrieveFileToBody(name, exchange);
            }
        } finally {
            restore(backup);
        }

        return answer;
    }

    @Override
    public void releaseRetrievedFileResources(Exchange exchange)
            throws GenericFileOperationFailedException {
        log.trace("releaseRetrievedFileResources({})", exchange.getExchangeId());
        var is = exchange.getIn().getHeader(FilesHeaders.REMOTE_FILE_INPUT_STREAM, InputStream.class);

        if (is != null) {
            IOHelper.close(is);
        }
    }

    @SuppressWarnings({ "unchecked", "resource" })
    private boolean retrieveFileToBody(String name, Exchange exchange)
            throws GenericFileOperationFailedException {
        boolean success = false;
        GenericFile<ShareFileItem> target = (GenericFile<ShareFileItem>) exchange.getProperty(FileComponent.FILE_EXCHANGE_FILE);
        org.apache.camel.util.ObjectHelper.notNull(target,
                "Exchange should have the " + FileComponent.FILE_EXCHANGE_FILE + " set");

        String path = FileUtil.onlyPath(name);
        if (path != null) {
            changeCurrentDirectory(path);
        }
        // remote name is now only the file name as we just changed
        // directory
        String remoteName = FileUtil.stripPath(name);

        if (endpoint.getConfiguration().isStreamDownload()) {
            log.trace("Prepared {} for download as opened input stream.", remoteName);
            InputStream is = cwd().getFileClient(remoteName).openInputStream();
            target.setBody(is);
            exchange.getIn().setHeader(FilesHeaders.REMOTE_FILE_INPUT_STREAM, is);
            success = true;
        } else {
            log.trace("Downloading {} to byte[] body.", remoteName);
            var os = new ByteArrayOutputStream();
            ShareFileRange range = new ShareFileRange(0);
            var ret = cwd().getFileClient(remoteName).downloadWithResponse(os, range, null,
                    endpoint.getDataTimeout(), Context.NONE);
            success = ret.getStatusCode() == HTTP_OK;
            IOHelper.close(os);
            target.setBody(os.toByteArray());
        }

        return success;
    }

    @SuppressWarnings("unchecked")
    private boolean retrieveFileToFileInLocalWorkDirectory(
            String name, Exchange exchange,
            boolean resumeDownload)
            throws GenericFileOperationFailedException {
        File inProgress;
        File local = new File(FileUtil.normalizePath(endpoint.getLocalWorkDirectory()));
        OutputStream os;
        long existingSize = -1;

        try {
            // use relative filename in local work directory
            GenericFile<ShareFileItem> target
                    = (GenericFile<ShareFileItem>) exchange.getProperty(FileComponent.FILE_EXCHANGE_FILE);
            org.apache.camel.util.ObjectHelper.notNull(target,
                    "Exchange should have the " + FileComponent.FILE_EXCHANGE_FILE + " set");
            String relativeName = target.getRelativeFilePath();

            inProgress = new File(local, relativeName + ".inprogress");
            local = new File(local, relativeName);

            // create directory to local work file
            boolean result = local.mkdirs();
            if (!result) {
                log.warn(
                        "Failed to create local directory {} while retrieving file in local work directory. Directory may already exist or have been created externally",
                        local);
            }

            // delete any local file (as its the temp file that is in the
            // in-progress download)
            if (local.exists()) {
                if (!FileUtil.deleteFile(local)) {
                    throw new GenericFileOperationFailedException(
                            "Cannot delete existing local work file: " + local);
                }
            }

            // if a previous file exists then store its current size as its a
            // partial download
            boolean exists = inProgress.exists();
            if (exists) {
                existingSize = inProgress.length();
            }

            // if we do not resume download, then delete any existing temp file
            // and create a new to use for in-progress download
            if (!resumeDownload) {
                if (exists && !FileUtil.deleteFile(inProgress)) {
                    throw new GenericFileOperationFailedException(
                            "Cannot delete existing local work file: " + inProgress);
                }
                if (!inProgress.createNewFile()) {
                    throw new GenericFileOperationFailedException(
                            "Cannot create new local work file: " + inProgress);
                }
            }

            // store content as a file in the local work directory in the temp
            // handle
            boolean append = resumeDownload && existingSize > 0;
            os = new FileOutputStream(inProgress, append);

            // set header with the path to the local work file
            exchange.getIn().setHeader(FilesHeaders.FILE_LOCAL_WORK_PATH, local.getPath());

        } catch (Exception e) {
            throw new GenericFileOperationFailedException(
                    "Cannot create new local work file: " + local,
                    e);
        }

        boolean result;
        try {
            GenericFile<ShareFileItem> target
                    = (GenericFile<ShareFileItem>) exchange.getProperty(FileComponent.FILE_EXCHANGE_FILE);
            // store the java.io.File handle as the body
            target.setBody(local);

            String path = FileUtil.onlyPath(name);
            if (path != null) {
                changeCurrentDirectory(path);
            }
            String remoteName = FileUtil.stripPath(name);

            ShareFileRange range = new ShareFileRange(0);
            // the file exists so lets try to resume the download
            if (resumeDownload && existingSize > 0) {
                log.trace("Client restartOffset: {}", existingSize);
                log.debug("Resuming download of file: {} at position: {}", remoteName, existingSize);
                range = new ShareFileRange(existingSize);
            }
            log.trace("Downloading {} to local work directory.", remoteName);
            var ret = cwd().getFileClient(remoteName).downloadWithResponse(os, range, null,
                    endpoint.getDataTimeout(), Context.NONE);
            result = ret.getStatusCode() == HTTP_OK;

        } catch (RuntimeException e) {
            log.trace("Error occurred during retrieving file: {} to local directory.", name);
            // if we do not attempt to resume download, then attempt to delete
            // the temporary file
            if (!resumeDownload) {
                log.trace("Deleting local work file: {}", name);
                // failed to retrieve the file so we need to close streams and
                // delete in progress file
                // must close stream before deleting file
                IOHelper.close(os, "retrieve: " + name, log);
                boolean deleted = FileUtil.deleteFile(inProgress);
                if (!deleted) {
                    log.warn(
                            "Error occurred during retrieving file: {} to local directory. Cannot delete local work file: {}",
                            inProgress, name);
                }
            }
            throw new GenericFileOperationFailedException(e.getMessage(), e);
        } finally {
            // need to close the stream before rename it
            IOHelper.close(os, "retrieve: " + name, log);
        }

        log.debug("Retrieve file to local work file result: {}", result);

        if (result) {
            log.trace("Renaming local in progress file from: {} to: {}", inProgress, local);
            // operation went okay so rename temp to local after we have
            // retrieved the data
            try {
                if (!FileUtil.renameFile(inProgress, local, false)) {
                    throw new GenericFileOperationFailedException(
                            "Cannot rename local work file from: " + inProgress + " to: " + local);
                }
            } catch (IOException e) {
                throw new GenericFileOperationFailedException(
                        "Cannot rename local work file from: " + inProgress + " to: " + local, e);
            }
        }

        return result;
    }

    @Override
    public boolean storeFile(String name, Exchange exchange, long size)
            throws GenericFileOperationFailedException {
        log.trace("storeFile({})", name);

        name = endpoint.getConfiguration().normalizePath(name);

        boolean answer;
        String path = FileUtil.onlyPath(name);
        String targetName = name;
        var backup = backup();

        try {
            if (path != null) {
                changeCurrentDirectory(path);
                targetName = FileUtil.stripPath(name);
            }
            answer = storeFile(name, targetName, exchange);
        } catch (GenericFileOperationFailedException e) {
            throw e;
        } finally {
            restore(backup);
        }

        return answer;
    }

    private boolean storeFile(String name, String targetName, Exchange exchange)
            throws GenericFileOperationFailedException {
        boolean existFile = false;
        // if an existing file already exists what should we do?
        if (endpoint.getFileExist() == GenericFileExist.Ignore
                || endpoint.getFileExist() == GenericFileExist.Fail
                || endpoint.getFileExist() == GenericFileExist.Move
                || endpoint.getFileExist() == GenericFileExist.Append) {
            existFile = existsFile(targetName);
            if (existFile && endpoint.getFileExist() == GenericFileExist.Ignore) {
                // ignore but indicate that the file was written
                log.trace("An existing file already exists: {}. Ignore and do not override it.", name);
                return true;
            } else if (existFile && endpoint.getFileExist() == GenericFileExist.Fail) {
                throw new GenericFileOperationFailedException(
                        "File already exist: " + name + ". Cannot write new file.");
            } else if (existFile && endpoint.getFileExist() == GenericFileExist.Move) {
                // move any existing file first
                this.endpoint.getMoveExistingFileStrategy().moveExistingFile(endpoint, this, targetName);
            }
        }

        InputStream is = null;
        int length = 0;
        if (exchange.getIn().getBody() == null) {
            // Do an explicit test for a null body and decide what to do
            if (endpoint.isAllowNullBody()) {
                log.trace("Writing empty file.");
                is = new ByteArrayInputStream(new byte[] {});
            } else {
                throw new GenericFileOperationFailedException("Cannot write null body to file: " + name);
            }
        }

        try {
            if (is == null) {
                var knownLength = exchange.getIn().getHeader(Exchange.FILE_LENGTH, Long.class);
                if (knownLength != null) {
                    is = exchange.getIn().getMandatoryBody(InputStream.class);
                    length = knownLength.intValue();
                } else {
                    log.warn("No file length header, so converting body to byte[].  It might be memory intensive.");
                    var bytes = exchange.getIn().getMandatoryBody(byte[].class);
                    length = bytes.length;
                    is = new ByteArrayInputStream(bytes);
                }
            }

            final StopWatch watch = new StopWatch();
            boolean answer;
            log.debug("About to store file: {} length: {} using stream: {}", targetName, length, is);
            if (existFile && endpoint.getFileExist() == GenericFileExist.Append) {
                log.trace("Client appendFile: {}", targetName);
                // TODO
                answer = false;
            } else {
                log.trace("Client storeFile: {}", targetName);
                var cwd = cwd();
                var file = cwd.getFileClient(targetName);
                deleteRemote(cwd, targetName);
                file.create(length);
                try (var os = file.getFileOutputStream()) {
                    // TODO add data timeout
                    is.transferTo(os);
                }
                answer = true;
            }
            if (log.isDebugEnabled()) {
                long time = watch.taken();
                log.debug("Took {} ({} millis) to store file: {} and FTP client returned: {}",
                        TimeUtils.printDuration(time, true), time, targetName, answer);
            }

            return answer;

        } catch (IOException e) {
            throw new GenericFileOperationFailedException(e.getMessage(), e);
        } catch (InvalidPayloadException e) {
            throw new GenericFileOperationFailedException("Cannot store file: " + name, e);
        } finally {
            IOHelper.close(is, "store: " + name, log);
        }
    }

    @Override
    public boolean existsFile(String name) throws GenericFileOperationFailedException {
        log.trace("existsFile({})", name);
        String directory = FileUtil.onlyPath(name);
        String onlyName = FileUtil.stripPath(name);
        var backup = backup();
        try {
            changeCurrentDirectory(directory);
            var file = cwd().getFileClient(onlyName);
            return existsRemote(file);
        } catch (RuntimeException e) {
            throw new GenericFileOperationFailedException(e.getMessage(), e);
        } finally {
            restore(backup);
        }
    }

    private boolean existsRemote(ShareDirectoryClient dirClient) {
        return Boolean.TRUE.equals(
                dirClient.existsWithResponse(endpoint.getMetadataTimeout(), Context.NONE).getValue());
    }

    private boolean existsRemote(ShareFileClient fileClient) {
        return Boolean.TRUE.equals(
                fileClient.existsWithResponse(endpoint.getMetadataTimeout(), Context.NONE).getValue());
    }

    /**
     * @return a relative path, from the share root, of the current directory
     */
    @Override
    public String getCurrentDirectory() throws GenericFileOperationFailedException {
        String answer = cwd().getDirectoryPath();
        log.trace("getCurrentDirectory(): {}", answer);
        return answer;
    }

    @Override
    public void changeCurrentDirectory(String path) throws GenericFileOperationFailedException {
        log.trace("changeCurrentDirectory({})", path);
        if (FilesPath.isEmpty(path) || path.equals(FilesPath.CWD)) {
            return;
        }

        var dirs = FilesPath.splitToSteps(path, true);
        for (String dir : dirs) {
            trivialCd(dir);
        }
    }

    private void trivialCd(String pathStep) {
        // TODO blank step like " " could be valid, but Windows trims trailing spaces
        if (pathStep == null || FilesPath.CWD.equals(pathStep) || pathStep.isBlank()) {
            return;
        }

        var cwd = cwd();
        log.trace("{}> cd {}", cwd.getDirectoryPath(), pathStep);
        boolean success;
        try {
            if (FilesPath.SHARE_ROOT.equals(pathStep)) {
                changeToRoot();
                success = true;
            } else if (FilesPath.PARENT.equals(pathStep)) {
                changeToParentDirectory();
                success = true;
            } else {
                var subDir = cwd.getSubdirectoryClient(pathStep);
                success = existsRemote(subDir);
                if (success) {
                    dirStack.push(subDir);
                }
            }
        } catch (RuntimeException e) {
            throw new GenericFileOperationFailedException(e.getMessage(), e);
        }
        if (!success) {
            throw new GenericFileOperationFailedException("Cannot cd(" + pathStep + ").");
        }
    }

    @Override
    public void changeToParentDirectory() throws GenericFileOperationFailedException {
        try {
            dirStack.pop();
        } catch (EmptyStackException e) {
            throw new GenericFileOperationFailedException("Root dir does not have parent.", e);
        }
    }

    void changeToRoot() {
        if (!isConnected()) {
            throw new GenericFileOperationFailedException("Cannot cd to the share root: not connected");
        }
        dirStack.empty();
        dirStack.push(root);
    }

    @Override
    public ShareFileItem[] listFiles() throws GenericFileOperationFailedException {
        log.trace("{}> ls -a", cwd().getDirectoryPath());
        try {
            var withTS = new ShareListFilesAndDirectoriesOptions().setIncludeTimestamps(true);
            return cwd().listFilesAndDirectories(withTS, endpoint.getMetadataTimeout(), Context.NONE)
                    .stream().toArray(ShareFileItem[]::new);
        } catch (RuntimeException e) {
            throw new GenericFileOperationFailedException(e.getMessage(), e);
        }
    }

    @Override
    public ShareFileItem[] listFiles(String path) throws GenericFileOperationFailedException {
        log.trace("listFiles({})", path);

        var backup = backup();
        try {
            changeCurrentDirectory(path);
            return listFiles();
        } finally {
            restore(backup);
        }
    }

    @Override
    public boolean sendNoop() throws GenericFileOperationFailedException {
        log.trace("sendNoOp()");
        return existsRemote(root);
    }

    @Override
    public boolean sendSiteCommand(String command) throws GenericFileOperationFailedException {
        log.trace("sendSiteCommand({})", command);
        return true;
    }

    private boolean buildDirectoryChunks(String dirName) throws IOException {
        var sb = new StringBuilder(dirName.length());
        var dirs = FilesPath.split(dirName);

        boolean success = false;
        for (String dir : dirs) {
            sb.append(dir).append(FilesPath.PATH_SEPARATOR);
            String directory = endpoint.getConfiguration().normalizePath(sb.toString());

            if (!(FilesPath.isRoot(directory))) {
                log.trace("Trying to build remote directory by chunk: {}", dir);

                dir = FileUtil.stripTrailingSeparator(dir);

                var subDir = cwd().createSubdirectoryIfNotExists(dir);
                success = existsRemote(subDir);
                if (success) {
                    dirStack.push(subDir);
                } else {
                    break;
                }
            }
        }

        return success;
    }

    public ShareServiceClient getClient() {
        return client;
    }

    private void reconnectIfNecessary(Exchange exchange) throws GenericFileOperationFailedException {
        boolean reconnectRequired;
        try {
            reconnectRequired = !isConnected();
        } catch (GenericFileOperationFailedException e) {
            log.trace("Going to reconnect because of: ", e);
            reconnectRequired = true;
        }
        if (reconnectRequired) {
            log.trace("Probing if the file service is connectible ...");
            connect(endpoint.getConfiguration(), exchange);
        }
    }

}
