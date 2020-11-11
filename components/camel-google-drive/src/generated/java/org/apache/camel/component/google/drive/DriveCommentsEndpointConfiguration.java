
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.drive.Drive.Comments}.
 */
@ApiParams(apiName = "drive-comments", 
           description = "The comments collection of methods",
           apiMethods = {@ApiMethod(methodName = "delete", description="Deletes a comment", signatures={"com.google.api.services.drive.Drive$Comments$Delete delete(String fileId, String commentId)"}), @ApiMethod(methodName = "get", description="Gets a comment by ID", signatures={"com.google.api.services.drive.Drive$Comments$Get get(String fileId, String commentId)"}), @ApiMethod(methodName = "insert", description="Creates a new comment on the given file", signatures={"com.google.api.services.drive.Drive$Comments$Insert insert(String fileId, com.google.api.services.drive.model.Comment content)"}), @ApiMethod(methodName = "list", description="Lists a file's comments", signatures={"com.google.api.services.drive.Drive$Comments$List list(String fileId)"}), @ApiMethod(methodName = "patch", description="Updates an existing comment", signatures={"com.google.api.services.drive.Drive$Comments$Patch patch(String fileId, String commentId, com.google.api.services.drive.model.Comment content)"}), @ApiMethod(methodName = "update", description="Updates an existing comment", signatures={"com.google.api.services.drive.Drive$Comments$Update update(String fileId, String commentId, com.google.api.services.drive.model.Comment content)"})}, aliases = {})
@UriParams
@Configurer(extended = true)
public final class DriveCommentsEndpointConfiguration extends GoogleDriveConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "delete", description="The ID of the comment"), @ApiMethod(methodName = "get", description="The ID of the comment"), @ApiMethod(methodName = "patch", description="The ID of the comment"), @ApiMethod(methodName = "update", description="The ID of the comment")})
    private String commentId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "insert", description="The com.google.api.services.drive.model.Comment"), @ApiMethod(methodName = "patch", description="The com.google.api.services.drive.model.Comment"), @ApiMethod(methodName = "update", description="The com.google.api.services.drive.model.Comment")})
    private com.google.api.services.drive.model.Comment content;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "delete", description="The ID of the file"), @ApiMethod(methodName = "get", description="The ID of the file"), @ApiMethod(methodName = "insert", description="The ID of the file"), @ApiMethod(methodName = "list", description="The ID of the file"), @ApiMethod(methodName = "patch", description="The ID of the file"), @ApiMethod(methodName = "update", description="The ID of the file")})
    private String fileId;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public com.google.api.services.drive.model.Comment getContent() {
        return content;
    }

    public void setContent(com.google.api.services.drive.model.Comment content) {
        this.content = content;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
}
