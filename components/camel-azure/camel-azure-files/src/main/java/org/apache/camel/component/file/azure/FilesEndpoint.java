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

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Category;
import org.apache.camel.FailedToCreateConsumerException;
import org.apache.camel.FailedToCreateProducerException;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.api.management.ManagedAttribute;
import org.apache.camel.api.management.ManagedResource;
import org.apache.camel.component.file.GenericFileConfiguration;
import org.apache.camel.component.file.GenericFileEndpoint;
import org.apache.camel.component.file.GenericFileOperationFailedException;
import org.apache.camel.component.file.GenericFileOperations;
import org.apache.camel.component.file.GenericFileProcessStrategy;
import org.apache.camel.component.file.GenericFileProducer;
import org.apache.camel.component.file.azure.strategy.FilesProcessStrategyFactory;
import org.apache.camel.component.file.remote.RemoteFileComponent;
import org.apache.camel.component.file.remote.RemoteFileConfiguration.PathSeparator;
import org.apache.camel.component.file.remote.RemoteFileConsumer;
import org.apache.camel.component.file.remote.RemoteFileEndpoint;
import org.apache.camel.component.file.remote.RemoteFileOperations;
import org.apache.camel.component.file.remote.RemoteFileProducer;
import org.apache.camel.component.file.remote.strategy.FtpProcessStrategyFactory;
import org.apache.camel.component.file.strategy.FileMoveExistingStrategy;
import org.apache.camel.spi.ClassResolver;
import org.apache.camel.spi.Metadata;
import org.apache.camel.spi.UriEndpoint;
import org.apache.camel.spi.UriParam;
import org.apache.camel.util.ObjectHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.azure.storage.file.share.ShareServiceClient;
import com.azure.storage.file.share.ShareServiceClientBuilder;
import com.azure.storage.file.share.models.ShareFileItem;

// , extendsScheme = "file"   in FTPS but AzureBlob does not have it
@UriEndpoint(firstVersion = "3.21.0", scheme = "azure-files", title = "Azure Files",
             syntax = "azure-files:host/share",
             category = { Category.CLOUD, Category.FILE }, headersClass = FilesConstants.class)
@Metadata(excludeProperties = "appendChars,readLockIdempotentReleaseAsync,readLockIdempotentReleaseAsyncPoolSize,"
                              + "readLockIdempotentReleaseDelay,readLockIdempotentReleaseExecutorService,"
                              + "directoryMustExist,extendedAttributes,probeContentType,startingDirectoryMustExist,"
                              + "startingDirectoryMustHaveAccess,chmodDirectory,forceWrites,copyAndDeleteOnRenameFail,"
                              + "renameUsingCopy,synchronous")
@ManagedResource(description = "Managed Azure Files Endpoint")
public class FilesEndpoint<T extends ShareFileItem> extends RemoteFileEndpoint<ShareFileItem> {

    private static final Logger LOG = LoggerFactory.getLogger(FilesEndpoint.class);

    @UriParam
    protected FilesConfiguration configuration;

    @UriParam(label = "common", defaultValue = "DEBUG")
    protected LoggingLevel transferLoggingLevel = LoggingLevel.DEBUG;
    @UriParam(label = "common", defaultValue = "5")
    protected int transferLoggingIntervalSeconds = 5;
    @UriParam(label = "common")
    protected boolean transferLoggingVerbose;
    @UriParam(label = "consumer")
    protected boolean resumeDownload;
    
    @UriParam(label = "both", description = "part of SAS token")
    protected String sv;
    @UriParam(label = "both", description = "part of SAS token")
    protected String ss;
    @UriParam(label = "both", description = "part of SAS token")
    protected String srt;
    @UriParam(label = "both", description = "part of SAS token")
    protected String sp;
    @UriParam(label = "both", description = "part of SAS token")
    protected String se;
    @UriParam(label = "both", description = "part of SAS token")
    protected String st;
    @UriParam(label = "both", description = "part of SAS token")
    protected String spr;
    @UriParam(label = "both", description = "part of SAS token")
    protected String sig;

    public FilesEndpoint() {
    }

    public FilesEndpoint(String uri, RemoteFileComponent<ShareFileItem> component, FilesConfiguration configuration) {
        super(uri, component, configuration);
        this.configuration = configuration;
    }

    public String getSv() {
      return sv;
    }

    public void setSv(String sv) {
      this.sv = sv;
    }

    public String getSs() {
      return ss;
    }

    public void setSs(String ss) {
      this.ss = ss;
    }

    public String getSrt() {
      return srt;
    }

    public void setSrt(String srt) {
      this.srt = srt;
    }

    public String getSp() {
      return sp;
    }

    public void setSp(String sp) {
      this.sp = sp;
    }

    public String getSe() {
      return se;
    }

    public void setSe(String se) {
      this.se = se;
    }

    public String getSt() {
      return st;
    }

    public void setSt(String st) {
      this.st = st;
    }

    public String getSpr() {
      return spr;
    }

    public void setSpr(String spr) {
      this.spr = spr;
    }

    public String getSig() {
      return sig;
    }

    public void setSig(String sig) {
      this.sig = sig;
    }

    @Override
    public String getScheme() {
        return "azure-files";
    }

    @Override
    public RemoteFileConsumer<ShareFileItem> createConsumer(Processor processor) throws Exception {
        if (isResumeDownload() && ObjectHelper.isEmpty(getLocalWorkDirectory())) {
            throw new IllegalArgumentException("The option localWorkDirectory must be configured when resumeDownload=true");
        }
        if (isResumeDownload() && !getConfiguration().isBinary()) {
            throw new IllegalArgumentException("The option binary must be enabled when resumeDownload=true");
        }
        return super.createConsumer(processor);
    }
    
    public String getShare() {
      var uri = getEndpointBaseUri();
      return uri.substring(uri.lastIndexOf('/'));
    }

    @Override
    protected RemoteFileConsumer<ShareFileItem> buildConsumer(Processor processor) {
        try {
            return new FilesConsumer(
                    this, processor, createRemoteFileOperations(),
                    processStrategy != null ? processStrategy : createGenericFileStrategy());
        } catch (Exception e) {
            throw new FailedToCreateConsumerException(this, e);
        }
    }

    @Override
    protected GenericFileProducer<ShareFileItem> buildProducer() {
        try {
            if (this.getMoveExistingFileStrategy() == null) {
                this.setMoveExistingFileStrategy(createDefaultFtpMoveExistingFileStrategy());
            }
            return new FilesProducer<>(this, createRemoteFileOperations());
        } catch (Exception e) {
            throw new FailedToCreateProducerException(this, e);
        }
    }


    private FileMoveExistingStrategy createDefaultFtpMoveExistingFileStrategy() {
        return new FileMoveExistingStrategy() {
          @Override
          public boolean moveExistingFile(GenericFileEndpoint endpoint,
              GenericFileOperations operations, String fileName)
              throws GenericFileOperationFailedException {
            LOG.warn("The fileExist=Move option is not supported.");
            return false;
          }
        };
    }

    @Override
    protected GenericFileProcessStrategy<ShareFileItem> createGenericFileStrategy() {
        return new FilesProcessStrategyFactory().createGenericFileProcessStrategy(getCamelContext(), getParamsAsMap());
    }

    @Override
    public RemoteFileOperations<ShareFileItem> createRemoteFileOperations() throws Exception {
        ShareServiceClient client = createClient();

        FilesOperations operations = new FilesOperations(client);
        operations.setEndpoint(this);
        return operations;
    }

    /**
     * Create the client
     *
     * @throws Exception may throw client-specific exceptions if the client cannot be created
     */
    protected ShareServiceClient createClient() throws Exception {
        ShareServiceClient client = new ShareServiceClientBuilder().endpoint(filesHost()).sasToken(token()).buildClient();
        return client;
    }
    
    
    // sv=2021-12-02&ss=f&srt=o&sp=rwdlc&se=2023-05-05T19:27:05Z&st=2023-04-28T11:27:05Z&spr=https&sig=TCU0PcBjrxRbKOW%2FLA7HrPLISin6FXLNkRtLvmxkvhY%3D"
    private String token() {
      return String.format("sv=%s&ss=%s&srt=%s&sp=%s&se=%s&st=%s&spr=%s&sig=%s", sv, ss, srt, sp, se, st, spr, sig);
    }
    
    private String filesHost() {
      var base = getEndpointBaseUri();
      return base.substring(base.indexOf(":"), base.indexOf('/'));
    }

    @Override
    public FilesConfiguration getConfiguration() {
        if (configuration == null) {
            configuration = new FilesConfiguration();
        }
        return configuration;
    }

    @Override
    public void setConfiguration(GenericFileConfiguration configuration) {
        if (configuration == null) {
            throw new IllegalArgumentException("Configuration expected");
        }
        // need to set on both
        this.configuration = (FilesConfiguration) configuration;
        super.setConfiguration(configuration);
    }

    public LoggingLevel getTransferLoggingLevel() {
        return transferLoggingLevel;
    }

    /**
     * Configure the logging level to use when logging the progress of upload and download operations.
     */
    public void setTransferLoggingLevel(LoggingLevel transferLoggingLevel) {
        this.transferLoggingLevel = transferLoggingLevel;
    }

    @ManagedAttribute(description = "Logging level to use when logging the progress of upload and download operations")
    public void setTransferLoggingLevelName(String transferLoggingLevel) {
        this.transferLoggingLevel = getCamelContext().getTypeConverter().convertTo(LoggingLevel.class, transferLoggingLevel);
    }

    @ManagedAttribute
    public String getTransferLoggingLevelName() {
        return transferLoggingLevel.name();
    }

    @ManagedAttribute
    public int getTransferLoggingIntervalSeconds() {
        return transferLoggingIntervalSeconds;
    }

    /**
     * Configures the interval in seconds to use when logging the progress of upload and download operations that are
     * in-flight. This is used for logging progress when operations takes longer time.
     */
    @ManagedAttribute(description = "Interval in seconds to use when logging the progress of upload and download operations that are in-flight")
    public void setTransferLoggingIntervalSeconds(int transferLoggingIntervalSeconds) {
        this.transferLoggingIntervalSeconds = transferLoggingIntervalSeconds;
    }

    @ManagedAttribute
    public boolean isTransferLoggingVerbose() {
        return transferLoggingVerbose;
    }

    /**
     * Configures whether the perform verbose (fine grained) logging of the progress of upload and download operations.
     */
    @ManagedAttribute(description = "Whether the perform verbose (fine grained) logging of the progress of upload and download operations")
    public void setTransferLoggingVerbose(boolean transferLoggingVerbose) {
        this.transferLoggingVerbose = transferLoggingVerbose;
    }

    public boolean isResumeDownload() {
        return resumeDownload;
    }

    /**
     * Configures whether resume download is enabled. This must be supported by the FTP server (almost all FTP servers
     * support it). In addition the options <tt>localWorkDirectory</tt> must be configured so downloaded files are
     * stored in a local directory, and the option <tt>binary</tt> must be enabled, which is required to support
     * resuming of downloads.
     */
    public void setResumeDownload(boolean resumeDownload) {
        this.resumeDownload = resumeDownload;
    }

    @Override
    public char getFileSeparator() {
        // the regular ftp component should use the configured separator
        // as FTP servers may require you to use windows or unix style
        // and therefore you need to be able to control that
        PathSeparator pathSeparator = getConfiguration().getSeparator();
        switch (pathSeparator) {
            case Windows:
                return '\\';
            case UNIX:
                return '/';
            default:
                return super.getFileSeparator();
        }
    }
}
