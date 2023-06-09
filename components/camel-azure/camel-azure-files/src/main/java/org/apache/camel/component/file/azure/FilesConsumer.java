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

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.azure.storage.file.share.models.ShareFileItem;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.api.management.ManagedResource;
import org.apache.camel.component.file.GenericFile;
import org.apache.camel.component.file.GenericFileOperationFailedException;
import org.apache.camel.component.file.GenericFileProcessStrategy;
import org.apache.camel.component.file.remote.RemoteFile;
import org.apache.camel.component.file.remote.RemoteFileConfiguration;
import org.apache.camel.component.file.remote.RemoteFileConsumer;
import org.apache.camel.component.file.remote.RemoteFileEndpoint;
import org.apache.camel.component.file.remote.RemoteFileOperations;
import org.apache.camel.util.FileUtil;
import org.apache.camel.util.ObjectHelper;
import org.apache.camel.util.StringHelper;
import org.apache.camel.util.URISupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ManagedResource(description = "Managed Azure Files Consumer")
public class FilesConsumer extends RemoteFileConsumer<ShareFileItem> {

    private static final Logger LOG = LoggerFactory.getLogger(FilesConsumer.class);

    protected String endpointPath;

    private transient String toString;

    public FilesConsumer(RemoteFileEndpoint<ShareFileItem> endpoint, Processor processor,
                         RemoteFileOperations<ShareFileItem> fileOperations,
                         GenericFileProcessStrategy processStrategy) {
        super(endpoint, processor, fileOperations, processStrategy);
        this.endpointPath = endpoint.getConfiguration().getDirectory();
    }

    @Override
    protected FilesOperations getOperations() {
        return (FilesOperations) super.getOperations();
    }

    @Override
    protected void doStart() throws Exception {
        // turn off scheduler first, so autoCreate is handled before scheduler
        // starts
        boolean startScheduler = isStartScheduler();
        setStartScheduler(false);
        try {
            super.doStart();
            if (endpoint.isAutoCreate() && hasStartingDirectory()) {
                String dir = endpoint.getConfiguration().getDirectory();
                LOG.debug("Auto creating directory: {}", dir);
                try {
                    connectIfNecessary();
                    operations.buildDirectory(dir, true);
                } catch (GenericFileOperationFailedException e) {
                    // log a WARN as we want to start the consumer.
                    LOG.warn("Error auto creating directory: " + dir + " due " + e.getMessage()
                             + ". This exception is ignored.",
                            e);
                }
            }
        } finally {
            if (startScheduler) {
                setStartScheduler(true);
                startScheduler();
            }
        }
    }

    @Override
    protected boolean pollDirectory(
            String path, List<GenericFile<ShareFileItem>> fileList,
            int depth) {
        LOG.trace("pollDirectory({},,{})", path, depth);

        String backup = operations.getCurrentDirectory();

        boolean answer = doPollDirectory(FileUtil.stripTrailingSeparator(path), null, fileList, depth);
        if (backup != null) {
            operations.changeCurrentDirectory(FilesPath.SHARE_ROOT + backup);
        }

        return answer;
    }

    protected boolean pollSubDirectory(
            String absolutePath, String dirName,
            List<GenericFile<ShareFileItem>> fileList, int depth) {
        boolean answer = doSafePollSubDirectory(absolutePath, dirName, fileList, depth);
        // change back to parent directory when finished polling sub directory
        operations.changeToParentDirectory();
        return answer;
    }

    @Override
    protected boolean doPollDirectory(
            String path, String dirName,
            List<GenericFile<ShareFileItem>> fileList, int depth) {
        LOG.trace("doPollDirectory({},{},,{})", path, dirName, depth);

        dirName = FileUtil.stripTrailingSeparator(dirName);
        var dir = ObjectHelper.isNotEmpty(dirName) ? dirName : path;
        operations.changeCurrentDirectory(dir);

        var files = listFiles(dir);

        if (files == null || files.length == 0) {
            LOG.trace("No files found in directory: {}", dir);
            return true;
        }

        LOG.trace("Found {} files in directory: {}", files.length, dir);

        if (getEndpoint().isPreSort()) {
            Arrays.sort(files, Comparator.comparing(ShareFileItem::getName));
        }

        for (var file : files) {
            if (handleFiles(path, fileList, depth + 1, files, file)) {
                return false;
            }
        }

        return true;
    }

    private boolean handleFiles(
            String path, List<GenericFile<ShareFileItem>> fileList,
            int depth, ShareFileItem[] files, ShareFileItem file) {
        if (LOG.isTraceEnabled()) {
            LOG.trace("Item[name={}, dir={}, file={}]", file.getName(), file.isDirectory(),
                    !file.isDirectory());
        }

        // check if we can continue polling in files
        if (!canPollMoreFiles(fileList)) {
            return true;
        }

        if (file.isDirectory()) {
            if (handleDirectory(path, fileList, depth, files, file)) {
                return true;
            }
        } else {
            handleFile(path, fileList, depth, files, file);
        }
        return false;
    }

    private boolean handleDirectory(
            String absolutePath, List<GenericFile<ShareFileItem>> fileList,
            int depth, ShareFileItem[] files, ShareFileItem file) {
        RemoteFile<ShareFileItem> remote = asRemoteFile(absolutePath, file);
        if (endpoint.isRecursive() && depth < endpoint.getMaxDepth()
                && isValidFile(remote, true, files)) {
            // recursive scan and add the sub files and folders
            String subDirectory = file.getName();
            String path = ObjectHelper.isNotEmpty(absolutePath) ? absolutePath + "/" + subDirectory : subDirectory;
            boolean canPollMore = pollSubDirectory(path, subDirectory, fileList, depth);
            if (!canPollMore) {
                return true;
            }
        }
        return false;
    }

    private void handleFile(
            String path, List<GenericFile<ShareFileItem>> fileList, int depth,
            ShareFileItem[] files, ShareFileItem file) {
        RemoteFile<ShareFileItem> remote = asRemoteFile(path, file);
        if (depth >= endpoint.getMinDepth() && isValidFile(remote, false, files)) {
            // matched file so add
            fileList.add(remote);
        }
    }

    private ShareFileItem[] listFiles(String dir) {
        // TODO unused param
        try {
            return operations.listFiles();
        } catch (GenericFileOperationFailedException e) {
            if (ignoreCannotRetrieveFile(null, null, e)) {
                LOG.debug(
                        "Cannot list files in directory {} due directory does not exists or file permission error.",
                        dir);
                return null;
            } else {
                throw e;
            }
        }
    }

    @Override
    protected boolean isMatched(
            GenericFile<ShareFileItem> file, String doneFileName,
            ShareFileItem[] files) {
        String onlyName = FileUtil.stripPath(doneFileName);

        for (ShareFileItem f : files) {
            if (f.getName().equals(onlyName)) {
                return true;
            }
        }

        LOG.trace("Done file: {} does not exist", doneFileName);
        return false;
    }

    private RemoteFile<ShareFileItem> asRemoteFile(String path, ShareFileItem file) {
        RemoteFile<ShareFileItem> answer = new RemoteFile<>();

        answer.setEndpointPath(endpointPath);
        answer.setFile(file);
        answer.setFileNameOnly(file.getName());
        if (file.isDirectory() == false) {
            answer.setFileLength(file.getFileSize());
            answer.setLastModified(lastModified(file));
        }
        answer.setDirectory(file.isDirectory());
        answer.setHostname(((RemoteFileConfiguration) endpoint.getConfiguration()).getHost());

        boolean absolute = FilesPath.isAbsolute(path);
        answer.setAbsolute(absolute);

        String pseudoAbsoluteFileName = FilesPath.concat(path, file.getName());
        answer.setAbsoluteFilePath(pseudoAbsoluteFileName);

        // the relative filename, skip the leading endpoint configured path
        // TODO likely FTP-specific leftover
        String relativePath = StringHelper.after(pseudoAbsoluteFileName, endpointPath);
        relativePath = FilesPath.ensureRelative(relativePath);
        answer.setRelativeFilePath(relativePath);
        answer.setFileName(relativePath);

        return answer;
    }

    @Override
    protected void updateFileHeaders(GenericFile<ShareFileItem> file, Message message) {
        long length = file.getFile().getFileSize();
        long modified = lastModified(file.getFile());
        file.setFileLength(length);
        file.setLastModified(modified);
        // TODO remove unnecessary conditions?
        if (length >= 0) {
            message.setHeader(FilesHeaders.FILE_LENGTH, length);
        }
        if (modified >= 0) {
            message.setHeader(FilesHeaders.FILE_LAST_MODIFIED, modified);
        }
    }

    @Override
    public String toString() {
        if (toString == null) {
            toString = "FilesConsumer[" + URISupport.sanitizeUri(getEndpoint().getEndpointUri()) + "]";
        }
        return toString;
    }

    private static long lastModified(ShareFileItem file) {
        var raw = file.getProperties().getLastModified();
        if (raw == null) {
            // if ls without metadata
            return -1;
        }
        return raw.toInstant().toEpochMilli();
    }
}
