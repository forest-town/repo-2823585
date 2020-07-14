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
package org.apache.camel.component.minio;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.minio.CopyObjectArgs;
import io.minio.CopySource;
import io.minio.GetObjectArgs;
import io.minio.ListObjectsArgs;
import io.minio.MinioClient;
import io.minio.ObjectWriteResponse;
import io.minio.PutObjectArgs;
import io.minio.RemoveBucketArgs;
import io.minio.RemoveObjectArgs;
import io.minio.RemoveObjectsArgs;
import io.minio.Result;
import io.minio.messages.Bucket;
import io.minio.messages.Item;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.InvalidPayloadException;
import org.apache.camel.Message;
import org.apache.camel.WrappedFile;
import org.apache.camel.support.DefaultProducer;
import org.apache.camel.util.FileUtil;
import org.apache.camel.util.IOHelper;
import org.apache.camel.util.ObjectHelper;
import org.apache.camel.util.URISupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A Producer which sends messages to the Minio Simple Storage
 */
public class MinioProducer extends DefaultProducer {

    private static final Logger LOG = LoggerFactory.getLogger(MinioProducer.class);

    private transient String minioProducerToString;

    public MinioProducer(final Endpoint endpoint) {
        super(endpoint);
    }

    @Override
    public void process(final Exchange exchange) throws Exception {
        MinioOperations operation = determineOperation(exchange);
        if (ObjectHelper.isEmpty(operation)) {
            processSingleOp(exchange);
        } else {
            MinioClient minioClient = getEndpoint().getMinioClient();
            switch (operation) {
                case copyObject:
                    copyObject(minioClient, exchange);
                    break;
                case deleteObject:
                    deleteObject(minioClient, exchange);
                    break;
                case deleteObjects:
                    deleteObjects(minioClient, exchange);
                    break;
                case listBuckets:
                    listBuckets(minioClient, exchange);
                    break;
                case deleteBucket:
                    deleteBucket(minioClient, exchange);
                    break;
                case listObjects:
                    listObjects(minioClient, exchange);
                    break;
                case getObject:
                    getObject(minioClient, exchange);
                    break;
                case getPartialObject:
                    getPartialObject(minioClient, exchange);
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported operation");
            }
        }
    }

    public void processSingleOp(final Exchange exchange) throws Exception {

        final String bucketName = determineBucketName(exchange);
        final String key = determineKey(exchange);
        Map<String, String> objectMetadata = determineMetadata(exchange);
        Map<String, String> extraHeaders = determineExtraHeaders(exchange);

        File filePayload = null;
        InputStream is;
        ByteArrayOutputStream baos;
        Object obj = exchange.getIn().getMandatoryBody();

        // Need to check if the message body is WrappedFile
        if (obj instanceof WrappedFile) {
            obj = ((WrappedFile<?>) obj).getFile();
        }
        if (obj instanceof File) {
            filePayload = (File) obj;
            is = new FileInputStream(filePayload);
        } else {
            is = exchange.getIn().getMandatoryBody(InputStream.class);
            if (objectMetadata.containsKey(Exchange.CONTENT_LENGTH)) {
                if (objectMetadata.get("Content-Length").equals("0") && ObjectHelper.isEmpty(exchange.getProperty(Exchange.CONTENT_LENGTH))) {
                    LOG.debug("The content length is not defined. It needs to be determined by reading the data into memory");
                    baos = determineLengthInputStream(is);
                    objectMetadata.put("Content-Length", String.valueOf(baos.size()));
                    is = new ByteArrayInputStream(baos.toByteArray());
                } else {
                    if (ObjectHelper.isNotEmpty(exchange.getProperty(Exchange.CONTENT_LENGTH))) {
                        objectMetadata.put("Content-Length", exchange.getProperty(Exchange.CONTENT_LENGTH, String.class));
                    }
                }
            }
        }
        PutObjectArgs.Builder putObjectRequest = PutObjectArgs.builder()
                .stream(is, is.available(), -1)
                .bucket(bucketName)
                .object(key)
                .extraHeaders(extraHeaders)
                .userMetadata(objectMetadata);

        if (getConfiguration().getServerSideEncryptionCustomerKey() != null) {
            putObjectRequest.sse(getConfiguration().getServerSideEncryptionCustomerKey());
        }

        LOG.trace("Put object from exchange...");

        ObjectWriteResponse putObjectResult = getEndpoint().getMinioClient().putObject(putObjectRequest.build());

        LOG.trace("Received result...");

        Message message = getMessageForResponse(exchange);
        message.setHeader(MinioConstants.E_TAG, putObjectResult.etag());
        if (putObjectResult.versionId() != null) {
            message.setHeader(MinioConstants.VERSION_ID, putObjectResult.versionId());
        }

        IOHelper.close(is);

        if (getConfiguration().isDeleteAfterWrite() && filePayload != null) {
            FileUtil.deleteFile(filePayload);
        }
    }

    private Map<String, String> determineExtraHeaders(Exchange exchange) {
        Map<String, String> extraHeaders = new HashMap<>();
        String storageClass = determineStorageClass(exchange);
        if (storageClass != null) {
            extraHeaders.put("X-Amz-Storage-Class", storageClass);
        }

        String cannedAcl = exchange.getIn().getHeader(MinioConstants.CANNED_ACL, String.class);
        if (cannedAcl != null) {
            extraHeaders.put("x-amz-acl", cannedAcl);
        }

        return extraHeaders;
    }

    private void copyObject(MinioClient minioClient, Exchange exchange) throws Exception {
        final String bucketName = determineBucketName(exchange);
        final String sourceKey = determineKey(exchange);
        final String destinationKey = exchange.getIn().getHeader(MinioConstants.DESTINATION_OBJECT_NAME, String.class);
        final String bucketNameDestination = exchange.getIn().getHeader(MinioConstants.DESTINATION_BUCKET_NAME, String.class);
        if (getConfiguration().isPojoRequest()) {
            CopyObjectArgs.Builder payload = exchange.getIn().getMandatoryBody(CopyObjectArgs.Builder.class);
            if (payload != null) {
                ObjectWriteResponse result = minioClient.copyObject(payload.build());
                Message message = getMessageForResponse(exchange);
                message.setBody(result);
            }
        } else {
            if (ObjectHelper.isEmpty(bucketNameDestination)) {
                throw new IllegalArgumentException("Bucket Name Destination must be specified for copyObject Operation");
            }
            if (ObjectHelper.isEmpty(destinationKey)) {
                throw new IllegalArgumentException("Destination Key must be specified for copyObject Operation");
            }

            CopySource.Builder copySourceBuilder = CopySource.builder().bucket(bucketName).object(sourceKey);

            if (getConfiguration().getServerSideEncryptionCustomerKey() != null) {
                copySourceBuilder.ssec(getConfiguration().getServerSideEncryptionCustomerKey());
            }

            CopyObjectArgs.Builder copyObjectRequest = CopyObjectArgs.builder().bucket(bucketNameDestination).object(destinationKey).source(copySourceBuilder.build());

            if (getConfiguration().getServerSideEncryption() != null) {
                copyObjectRequest.sse(getConfiguration().getServerSideEncryption());
            }

            ObjectWriteResponse copyObjectResult = minioClient.copyObject(copyObjectRequest.build());

            Message message = getMessageForResponse(exchange);
            if (copyObjectResult.versionId() != null) {
                message.setHeader(MinioConstants.VERSION_ID, copyObjectResult.versionId());
            }
        }
    }

    private void deleteObject(MinioClient minioClient, Exchange exchange) throws Exception {
        final String bucketName = determineBucketName(exchange);
        final String sourceKey = determineKey(exchange);
        if (getConfiguration().isPojoRequest()) {
            RemoveObjectArgs.Builder payload = exchange.getIn().getMandatoryBody(RemoveObjectArgs.Builder.class);
            if (payload != null) {
                minioClient.removeObject(payload.build());
                Message message = getMessageForResponse(exchange);
                message.setBody(true);
            }
        } else {
            RemoveObjectArgs.Builder deleteObjectRequest = RemoveObjectArgs.builder().bucket(bucketName).object(sourceKey).bypassGovernanceMode(getConfiguration().isBypassGovernanceMode());

            if (getConfiguration().getVersionId() != null) {
                deleteObjectRequest.versionId(getConfiguration().getVersionId());
            }

            minioClient.removeObject(deleteObjectRequest.build());
            Message message = getMessageForResponse(exchange);
            message.setBody(true);
        }
    }

    private void deleteObjects(MinioClient minioClient, Exchange exchange) throws Exception {
        if (getConfiguration().isPojoRequest()) {
            RemoveObjectsArgs.Builder payload = exchange.getIn().getMandatoryBody(RemoveObjectsArgs.Builder.class);
            if (payload != null) {
                minioClient.removeObjects(payload.build());
                Message message = getMessageForResponse(exchange);
                message.setBody(true);
            }
        } else {
            throw new IllegalArgumentException("Cannot delete multiple objects without a POJO request");
        }
    }

    private void listBuckets(MinioClient minioClient, Exchange exchange) throws Exception {
        List<Bucket> bucketsList = minioClient.listBuckets();
        Message message = getMessageForResponse(exchange);
        //returns iterator of bucketList
        message.setBody(bucketsList.iterator());
    }

    private void deleteBucket(MinioClient minioClient, Exchange exchange) throws Exception {
        final String bucketName = determineBucketName(exchange);

        if (getConfiguration().isPojoRequest()) {
            RemoveBucketArgs.Builder payload = exchange.getIn().getMandatoryBody(RemoveBucketArgs.Builder.class);
            if (payload != null) {
                minioClient.removeBucket(payload.build());
                Message message = getMessageForResponse(exchange);
                message.setBody("ok");
            }
        } else {

            RemoveBucketArgs.Builder deleteBucketRequest = RemoveBucketArgs.builder().bucket(bucketName);
            minioClient.removeBucket(deleteBucketRequest.build());
            Message message = getMessageForResponse(exchange);
            message.setBody("ok");
        }
    }

    private void getObject(MinioClient minioClient, Exchange exchange) throws Exception {

        if (getConfiguration().isPojoRequest()) {
            GetObjectArgs.Builder payload = exchange.getIn().getMandatoryBody(GetObjectArgs.Builder.class);
            if (payload != null) {
                InputStream respond = minioClient.getObject(payload.build());
                Message message = getMessageForResponse(exchange);
                message.setBody(respond);
            }
        } else {
            final String bucketName = determineBucketName(exchange);
            final String sourceKey = determineKey(exchange);
            GetObjectArgs.Builder getObjectRequest = GetObjectArgs.builder().bucket(bucketName).object(sourceKey);
            InputStream respond = minioClient.getObject(getObjectRequest.build());

            Message message = getMessageForResponse(exchange);
            message.setBody(respond);
        }
    }

    private void getPartialObject(MinioClient minioClient, Exchange exchange) throws Exception {
        final String bucketName = determineBucketName(exchange);
        final String sourceKey = determineKey(exchange);
        final String offset = exchange.getIn().getHeader(MinioConstants.OFFSET, String.class);
        final String length = exchange.getIn().getHeader(MinioConstants.LENGTH, String.class);

        if (getConfiguration().isPojoRequest()) {
            GetObjectArgs.Builder payload = exchange.getIn().getMandatoryBody(GetObjectArgs.Builder.class);
            if (payload != null) {
                InputStream respond = minioClient.getObject(payload.build());
                Message message = getMessageForResponse(exchange);
                message.setBody(respond);
            }
        } else {

            if (ObjectHelper.isEmpty(offset) || ObjectHelper.isEmpty(length)) {
                throw new IllegalArgumentException("A Offset and length header must be configured to perform a partial get operation.");
            }

            GetObjectArgs.Builder getPartialRequest = GetObjectArgs.builder().bucket(bucketName).object(sourceKey)
                    .offset(Long.parseLong(offset)).length(Long.parseLong(length));
            InputStream respond = minioClient.getObject(getPartialRequest.build());

            Message message = getMessageForResponse(exchange);
            message.setBody(respond);
        }
    }

    private void listObjects(MinioClient minioClient, Exchange exchange) throws InvalidPayloadException {
        final String bucketName = determineBucketName(exchange);

        if (getConfiguration().isPojoRequest()) {
            ListObjectsArgs.Builder payload = exchange.getIn().getMandatoryBody(ListObjectsArgs.Builder.class);
            if (payload != null) {
                Iterable<Result<Item>> objectList = minioClient.listObjects(payload.build());
                Message message = getMessageForResponse(exchange);
                message.setBody(objectList);
            }
        } else {

            Iterable<Result<Item>> objectList = minioClient.listObjects(ListObjectsArgs.builder().bucket(bucketName).recursive(getConfiguration().isRecursive()).build());

            Message message = getMessageForResponse(exchange);
            message.setBody(objectList);
        }
    }

    private MinioOperations determineOperation(Exchange exchange) {
        MinioOperations operation = exchange.getIn().getHeader(MinioConstants.MINIO_OPERATION, MinioOperations.class);
        if (operation == null) {
            operation = getConfiguration().getOperation();
        }
        return operation;
    }

    private Map<String, String> determineMetadata(final Exchange exchange) {
        Map<String, String> objectMetadata = new HashMap<>();

        Long contentLength = exchange.getIn().getHeader(MinioConstants.CONTENT_LENGTH, Long.class);
        if (contentLength != null) {
            objectMetadata.put("Content-Length", String.valueOf(contentLength));
        }

        String contentType = exchange.getIn().getHeader(MinioConstants.CONTENT_TYPE, String.class);
        if (contentType != null) {
            objectMetadata.put("Content-Type", contentType);
        }

        String cacheControl = exchange.getIn().getHeader(MinioConstants.CACHE_CONTROL, String.class);
        if (cacheControl != null) {
            objectMetadata.put("Cache-Control", cacheControl);
        }

        String contentDisposition = exchange.getIn().getHeader(MinioConstants.CONTENT_DISPOSITION, String.class);
        if (contentDisposition != null) {
            objectMetadata.put("Content-Disposition", contentDisposition);
        }

        String contentEncoding = exchange.getIn().getHeader(MinioConstants.CONTENT_ENCODING, String.class);
        if (contentEncoding != null) {
            objectMetadata.put("Content-Encoding", contentEncoding);
        }

        String contentMD5 = exchange.getIn().getHeader(MinioConstants.CONTENT_MD5, String.class);
        if (contentMD5 != null) {
            objectMetadata.put("Content-Md5", contentMD5);
        }

        return objectMetadata;
    }

    /**
     * Reads the bucket name from the header of the given exchange. If not
     * provided, it's read from the endpoint configuration.
     *
     * @param exchange The exchange to read the header from.
     * @return The bucket name.
     * @throws IllegalArgumentException if the header could not be determined.
     */
    private String determineBucketName(final Exchange exchange) {
        String bucketName = exchange.getIn().getHeader(MinioConstants.BUCKET_NAME, String.class);

        if (ObjectHelper.isEmpty(bucketName)) {
            bucketName = getConfiguration().getBucketName();
            LOG.trace("Minio Bucket name header is missing, using default one [{}]", bucketName);
        }

        if (bucketName == null) {
            throw new IllegalArgumentException("Minio Bucket name header is missing or not configured.");
        }

        return bucketName;
    }

    private String determineKey(final Exchange exchange) {
        String key = exchange.getIn().getHeader(MinioConstants.OBJECT_NAME, String.class);
        if (ObjectHelper.isEmpty(key)) {
            key = getConfiguration().getKeyName();
        }
        if (key == null) {
            throw new IllegalArgumentException("Minio Key header is missing.");
        }
        return key;
    }

    private String determineStorageClass(final Exchange exchange) {
        String storageClass = exchange.getIn().getHeader(MinioConstants.STORAGE_CLASS, String.class);
        if (storageClass == null) {
            storageClass = getConfiguration().getStorageClass();
        }

        return storageClass;
    }

    private ByteArrayOutputStream determineLengthInputStream(InputStream is) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int count;
        while ((count = is.read(bytes)) > 0) {
            out.write(bytes, 0, count);
        }
        return out;
    }

    protected MinioConfiguration getConfiguration() {
        return getEndpoint().getConfiguration();
    }

    @Override
    public String toString() {
        if (minioProducerToString == null) {
            minioProducerToString = "MinioProducer[" + URISupport.sanitizeUri(getEndpoint().getEndpointUri()) + "]";
        }
        return minioProducerToString;
    }

    @Override
    public MinioEndpoint getEndpoint() {
        return (MinioEndpoint) super.getEndpoint();
    }

    public static Message getMessageForResponse(final Exchange exchange) {
        return exchange.getMessage();
    }

}
