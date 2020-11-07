
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.mail;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.gmail.Gmail.Users.Messages}.
 */
@ApiParams(apiName = "messages", 
           description = "The messages collection of methods",
           apiMethods = {@ApiMethod(methodName = "attachments", description="An accessor for creating requests from the Attachments collection", signatures={"com.google.api.services.gmail.Gmail$Users$Messages$Attachments attachments()"}), @ApiMethod(methodName = "batchDelete", description="Deletes many messages by message ID", signatures={"com.google.api.services.gmail.Gmail$Users$Messages$BatchDelete batchDelete(String userId, com.google.api.services.gmail.model.BatchDeleteMessagesRequest content)"}), @ApiMethod(methodName = "batchModify", description="Modifies the labels on the specified messages", signatures={"com.google.api.services.gmail.Gmail$Users$Messages$BatchModify batchModify(String userId, com.google.api.services.gmail.model.BatchModifyMessagesRequest content)"}), @ApiMethod(methodName = "delete", description="Immediately and permanently deletes the specified message", signatures={"com.google.api.services.gmail.Gmail$Users$Messages$Delete delete(String userId, String id)"}), @ApiMethod(methodName = "get", description="Gets the specified message", signatures={"com.google.api.services.gmail.Gmail$Users$Messages$Get get(String userId, String id)"}), @ApiMethod(methodName = "gmailImport", description="Imports a message into only this user's mailbox, with standard email delivery scanning and classification similar to receiving via SMTP", signatures={"com.google.api.services.gmail.Gmail$Users$Messages$GmailImport gmailImport(String userId, com.google.api.services.gmail.model.Message content)", "com.google.api.services.gmail.Gmail$Users$Messages$GmailImport gmailImport(String userId, com.google.api.services.gmail.model.Message content, com.google.api.client.http.AbstractInputStreamContent mediaContent)"}), @ApiMethod(methodName = "insert", description="Directly inserts a message into only this user's mailbox similar to IMAP APPEND, bypassing most scanning and classification", signatures={"com.google.api.services.gmail.Gmail$Users$Messages$Insert insert(String userId, com.google.api.services.gmail.model.Message content)", "com.google.api.services.gmail.Gmail$Users$Messages$Insert insert(String userId, com.google.api.services.gmail.model.Message content, com.google.api.client.http.AbstractInputStreamContent mediaContent)"}), @ApiMethod(methodName = "list", description="Lists the messages in the user's mailbox", signatures={"com.google.api.services.gmail.Gmail$Users$Messages$List list(String userId)"}), @ApiMethod(methodName = "modify", description="Modifies the labels on the specified message", signatures={"com.google.api.services.gmail.Gmail$Users$Messages$Modify modify(String userId, String id, com.google.api.services.gmail.model.ModifyMessageRequest content)"}), @ApiMethod(methodName = "send", description="Sends the specified message to the recipients in the To, Cc, and Bcc headers", signatures={"com.google.api.services.gmail.Gmail$Users$Messages$Send send(String userId, com.google.api.services.gmail.model.Message content)", "com.google.api.services.gmail.Gmail$Users$Messages$Send send(String userId, com.google.api.services.gmail.model.Message content, com.google.api.client.http.AbstractInputStreamContent mediaContent)"}), @ApiMethod(methodName = "trash", description="Moves the specified message to the trash", signatures={"com.google.api.services.gmail.Gmail$Users$Messages$Trash trash(String userId, String id)"}), @ApiMethod(methodName = "untrash", description="Removes the specified message from the trash", signatures={"com.google.api.services.gmail.Gmail$Users$Messages$Untrash untrash(String userId, String id)"})}, aliases = {})
@UriParams
@Configurer(extended = true)
public final class GmailUsersMessagesEndpointConfiguration extends GoogleMailConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "batchDelete", description="The com.google.api.services.gmail.model.BatchDeleteMessagesRequest")})
    private com.google.api.services.gmail.model.BatchDeleteMessagesRequest batchDeleteMessagesRequest;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "batchModify", description="The com.google.api.services.gmail.model.BatchModifyMessagesRequest")})
    private com.google.api.services.gmail.model.BatchModifyMessagesRequest batchModifyMessagesRequest;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "gmailImport", description="The com.google.api.services.gmail.model.Message media metadata or null if none"), @ApiMethod(methodName = "insert", description="The com.google.api.services.gmail.model.Message media metadata or null if none"), @ApiMethod(methodName = "send", description="The com.google.api.services.gmail.model.Message media metadata or null if none")})
    private com.google.api.services.gmail.model.Message content;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "delete", description="The ID of the message to delete"), @ApiMethod(methodName = "get", description="The ID of the message to retrieve"), @ApiMethod(methodName = "modify", description="The ID of the message to modify"), @ApiMethod(methodName = "trash", description="The ID of the message to Trash"), @ApiMethod(methodName = "untrash", description="The ID of the message to remove from Trash")})
    private String id;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "gmailImport", description="The media HTTP content or null if none"), @ApiMethod(methodName = "insert", description="The media HTTP content or null if none"), @ApiMethod(methodName = "send", description="The media HTTP content or null if none")})
    private com.google.api.client.http.AbstractInputStreamContent mediaContent;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "modify", description="The com.google.api.services.gmail.model.ModifyMessageRequest")})
    private com.google.api.services.gmail.model.ModifyMessageRequest modifyMessageRequest;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "batchDelete", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me"), @ApiMethod(methodName = "batchModify", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me"), @ApiMethod(methodName = "delete", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me"), @ApiMethod(methodName = "get", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me"), @ApiMethod(methodName = "gmailImport", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me"), @ApiMethod(methodName = "insert", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me"), @ApiMethod(methodName = "list", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me"), @ApiMethod(methodName = "modify", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me"), @ApiMethod(methodName = "send", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me"), @ApiMethod(methodName = "trash", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me"), @ApiMethod(methodName = "untrash", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me")})
    private String userId;

    public com.google.api.services.gmail.model.BatchDeleteMessagesRequest getBatchDeleteMessagesRequest() {
        return batchDeleteMessagesRequest;
    }

    public void setBatchDeleteMessagesRequest(com.google.api.services.gmail.model.BatchDeleteMessagesRequest batchDeleteMessagesRequest) {
        this.batchDeleteMessagesRequest = batchDeleteMessagesRequest;
    }

    public com.google.api.services.gmail.model.BatchModifyMessagesRequest getBatchModifyMessagesRequest() {
        return batchModifyMessagesRequest;
    }

    public void setBatchModifyMessagesRequest(com.google.api.services.gmail.model.BatchModifyMessagesRequest batchModifyMessagesRequest) {
        this.batchModifyMessagesRequest = batchModifyMessagesRequest;
    }

    public com.google.api.services.gmail.model.Message getContent() {
        return content;
    }

    public void setContent(com.google.api.services.gmail.model.Message content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public com.google.api.client.http.AbstractInputStreamContent getMediaContent() {
        return mediaContent;
    }

    public void setMediaContent(com.google.api.client.http.AbstractInputStreamContent mediaContent) {
        this.mediaContent = mediaContent;
    }

    public com.google.api.services.gmail.model.ModifyMessageRequest getModifyMessageRequest() {
        return modifyMessageRequest;
    }

    public void setModifyMessageRequest(com.google.api.services.gmail.model.ModifyMessageRequest modifyMessageRequest) {
        this.modifyMessageRequest = modifyMessageRequest;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
