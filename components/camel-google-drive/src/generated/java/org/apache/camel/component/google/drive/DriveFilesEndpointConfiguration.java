
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.google.api.services.drive.Drive$Files
 */
@ApiParams(apiName = "drive-files", apiMethods = "copy,delete,emptyTrash,export,generateIds,get,insert,list,patch,touch,trash,untrash,update,watch")
@UriParams
@Configurer
public final class DriveFilesEndpointConfiguration extends GoogleDriveConfiguration {
    @UriParam
    private com.google.api.services.drive.model.File content;
    @UriParam
    private com.google.api.services.drive.model.Channel contentChannel;
    @UriParam
    private String fileId;
    @UriParam
    private com.google.api.client.http.AbstractInputStreamContent mediaContent;
    @UriParam
    private String mimeType;

    public com.google.api.services.drive.model.File getContent() {
        return content;
    }

    public void setContent(com.google.api.services.drive.model.File content) {
        this.content = content;
    }

    public com.google.api.services.drive.model.Channel getContentChannel() {
        return contentChannel;
    }

    public void setContentChannel(com.google.api.services.drive.model.Channel contentChannel) {
        this.contentChannel = contentChannel;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public com.google.api.client.http.AbstractInputStreamContent getMediaContent() {
        return mediaContent;
    }

    public void setMediaContent(com.google.api.client.http.AbstractInputStreamContent mediaContent) {
        this.mediaContent = mediaContent;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
}
