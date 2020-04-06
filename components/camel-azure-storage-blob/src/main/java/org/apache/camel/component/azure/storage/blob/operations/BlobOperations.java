package org.apache.camel.component.azure.storage.blob.operations;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.ResponseBase;
import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.models.AccessTier;
import com.azure.storage.blob.models.AppendBlobItem;
import com.azure.storage.blob.models.AppendBlobRequestConditions;
import com.azure.storage.blob.models.BlobDownloadHeaders;
import com.azure.storage.blob.models.BlobHttpHeaders;
import com.azure.storage.blob.models.BlobProperties;
import com.azure.storage.blob.models.BlobRange;
import com.azure.storage.blob.models.BlobRequestConditions;
import com.azure.storage.blob.models.Block;
import com.azure.storage.blob.models.BlockBlobItem;
import com.azure.storage.blob.models.BlockList;
import com.azure.storage.blob.models.BlockListType;
import com.azure.storage.blob.models.DownloadRetryOptions;
import com.azure.storage.blob.models.PageBlobItem;
import com.azure.storage.blob.models.PageBlobRequestConditions;
import com.azure.storage.blob.models.PageList;
import com.azure.storage.blob.models.PageRange;
import com.azure.storage.blob.specialized.BlobInputStream;
import org.apache.camel.Exchange;
import org.apache.camel.InvalidPayloadException;
import org.apache.camel.WrappedFile;
import org.apache.camel.component.azure.storage.blob.BlobBlock;
import org.apache.camel.component.azure.storage.blob.BlobCommonRequestOptions;
import org.apache.camel.component.azure.storage.blob.BlobConfiguration;
import org.apache.camel.component.azure.storage.blob.BlobConstants;
import org.apache.camel.component.azure.storage.blob.BlobStreamAndLength;
import org.apache.camel.component.azure.storage.blob.BlobType;
import org.apache.camel.component.azure.storage.blob.BlobExchangeHeaders;
import org.apache.camel.component.azure.storage.blob.BlobUtils;
import org.apache.camel.component.azure.storage.blob.client.BlobClientWrapper;
import org.apache.camel.util.ObjectHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * All operations related {@link BlobClient}. This is at the blob level.
 */
public class BlobOperations {

    private static final Logger LOG = LoggerFactory.getLogger(BlobOperations.class);

    private final BlobConfiguration configuration;
    private final BlobClientWrapper client;

    public BlobOperations(final BlobConfiguration configuration, final BlobClientWrapper client) {
        ObjectHelper.notNull(client, "client can not be null.");

        this.configuration = configuration;
        this.client = client;
    }

    public BlobOperationResponse getBlob(final Exchange exchange) {
        if (exchange == null) {
            final Map<String, Object> blobInputStream = client.openInputStream(new BlobRange(0), null);
            final BlobExchangeHeaders blobExchangeHeaders = BlobExchangeHeaders.createBlobExchangeHeadersFromBlobProperties((BlobProperties) blobInputStream.get("properties"));

            return new BlobOperationResponse(blobInputStream.get("inputStream"), blobExchangeHeaders.toMap());
        }

        LOG.trace("Getting a blob [{}] from exchange [{}]...", configuration.getBlobName(), exchange);

        final OutputStream outputStream = BlobUtils.getInMessage(exchange).getBody(OutputStream.class);
        final BlobRange blobRange = getBlobRangeFromHeadersOrConfig(exchange, configuration);
        final BlobCommonRequestOptions blobCommonRequestOptions = BlobUtils.getCommonRequestOptions(exchange);

        if (outputStream == null) {
            // Then we create an input stream
            final Map<String, Object> blobInputStream = client.openInputStream(blobRange, blobCommonRequestOptions.getBlobRequestConditions());
            final BlobExchangeHeaders blobExchangeHeaders = BlobExchangeHeaders.createBlobExchangeHeadersFromBlobProperties(((BlobProperties) blobInputStream.get("properties")));

            return new BlobOperationResponse(blobInputStream.get("inputStream"), blobExchangeHeaders.toMap());
        }
        // we have an outputStream set, so we use it
        final DownloadRetryOptions downloadRetryOptions = new DownloadRetryOptions();
        downloadRetryOptions.setMaxRetryRequests(configuration.getMaxRetryRequests());

        final ResponseBase<BlobDownloadHeaders, Void> response =  client.downloadWithResponse(outputStream, blobRange, downloadRetryOptions, blobCommonRequestOptions.getBlobRequestConditions(),
                configuration.isGetRangeContentMd5(), blobCommonRequestOptions.getTimeout());

        final BlobExchangeHeaders blobExchangeHeaders = BlobExchangeHeaders.createBlobExchangeHeadersFromBlobDownloadHeaders(response.getDeserializedHeaders())
                .httpHeaders(response.getHeaders());

        return new BlobOperationResponse(outputStream, blobExchangeHeaders.toMap());
    }

    public BlobOperationResponse uploadBlockBlob(final Exchange exchange) throws IOException {
        ObjectHelper.notNull(exchange, "exchange cannot be null");

        final BlobStreamAndLength blobStreamAndLength = BlobStreamAndLength.createBlobStreamAndLengthFromExchangeBody(exchange);
        final BlobCommonRequestOptions commonRequestOptions = BlobUtils.getCommonRequestOptions(exchange);

        LOG.trace("Putting a block blob [{}] from exchange [{}]...", configuration.getBlobName(), exchange);

        try {
            final Response<BlockBlobItem> response = client.uploadBlockBlob(blobStreamAndLength.getInputStream(), blobStreamAndLength.getStreamLength(), commonRequestOptions.getBlobHttpHeaders(), commonRequestOptions.getMetadata(), commonRequestOptions.getAccessTier(),
                    commonRequestOptions.getContentMD5(), commonRequestOptions.getBlobRequestConditions(), commonRequestOptions.getTimeout());

            return buildResponse(response, true);
        } finally {
            closeInputStreamIfNeeded(blobStreamAndLength.getInputStream());
        }
    }

    public BlobOperationResponse stageBlockBlobList(final Exchange exchange) throws Exception {
        ObjectHelper.notNull(exchange, "exchange cannot be null");

        final Object object = exchange.getIn().getMandatoryBody();

        List<BlobBlock> blobBlocks = null;
        if (object instanceof List) {
            blobBlocks = (List<BlobBlock>) object;
        } else if (object instanceof BlobBlock) {
            blobBlocks = Collections.singletonList((BlobBlock)object);
        }
        if (blobBlocks == null || blobBlocks.isEmpty()) {
            throw new IllegalArgumentException("Illegal storageBlocks payload");
        }

        LOG.trace("Putting a blob [{}] from blocks from exchange [{}]...", configuration.getBlobName(), exchange);

        final BlobCommonRequestOptions commonRequestOptions = BlobUtils.getCommonRequestOptions(exchange);

        final List<Block> blockEntries = new LinkedList<>();

        blobBlocks.forEach(blobBlock -> {
            blockEntries.add(blobBlock.getBlockEntry());
            client.stageBlockBlob(blobBlock.getBlockEntry().getName(), blobBlock.getBlockStream(), blobBlock.getBlockEntry().getSize(),
                    commonRequestOptions.getContentMD5(), commonRequestOptions.leaseId(), commonRequestOptions.getTimeout());
        });

        final boolean commitBlockListLater = BlobExchangeHeaders.getCommitBlockListFlagFromHeaders(exchange);

        if (!commitBlockListLater) {
            // let us commit now
            exchange.getIn().setBody(blockEntries);
            return commitBlobBlockList(exchange);
        }

        return new BlobOperationResponse(true);
    }

    public BlobOperationResponse commitBlobBlockList(final Exchange exchange) throws Exception {
        ObjectHelper.notNull(exchange, "exchange cannot be null");

        final Object object = exchange.getIn().getMandatoryBody();

        List<Block> blockEntries = null;
        if (object instanceof List) {
            blockEntries = (List<Block>) object;
        } else if (object instanceof Block) {
            blockEntries = Collections.singletonList((Block)object);
        }
        if (blockEntries == null || blockEntries.isEmpty()) {
            throw new IllegalArgumentException("Illegal commit block list payload");
        }

        LOG.trace("Putting a blob [{}] block list from exchange [{}]...", configuration.getBlobName(), exchange);

        final BlobCommonRequestOptions commonRequestOptions = BlobUtils.getCommonRequestOptions(exchange);

        final List<String> blockIds = blockEntries.stream()
                .map(Block::getName)
                .collect(Collectors.toList());

        final Response<BlockBlobItem> response = client.commitBlockBlob(blockIds, commonRequestOptions.getBlobHttpHeaders(), commonRequestOptions.getMetadata(),
                commonRequestOptions.getAccessTier(), commonRequestOptions.getBlobRequestConditions(), commonRequestOptions.getTimeout());

        return buildResponse(response, true);
    }

    public BlobOperationResponse getBlobBlockList(final Exchange exchange) {
        if (exchange == null) {
            final Response<BlockList> response = client.listBlobBlocks(BlockListType.COMMITTED, null, null);

            return buildResponse(response, false);
        }

        LOG.trace("Getting the blob block list [{}] from exchange [{}]...", configuration.getBlobName(), exchange);

        final BlockListType blockListType = BlobExchangeHeaders.getBlockListTypeFromHeaders(exchange) == null ? BlockListType.COMMITTED : BlobExchangeHeaders.getBlockListTypeFromHeaders(exchange);
        final BlobCommonRequestOptions commonRequestOptions = BlobUtils.getCommonRequestOptions(exchange);

        final Response<BlockList> response = client.listBlobBlocks(blockListType, commonRequestOptions.leaseId(), commonRequestOptions.getTimeout());

        return buildResponse(response, false);
    }

    public BlobOperationResponse createAppendBlob(final Exchange exchange) {
        if (exchange == null) {
            final Response<AppendBlobItem> response = client.createAppendBlob(null, null, null, null);

            return buildResponse(response, true);
        }

        LOG.trace("Creating an append blob [{}] from exchange [{}]...", configuration.getBlobName(), exchange);

        final BlobCommonRequestOptions commonRequestOptions = BlobUtils.getCommonRequestOptions(exchange);

        final Response<AppendBlobItem> response = client.createAppendBlob(commonRequestOptions.getBlobHttpHeaders(), commonRequestOptions.getMetadata(),
                commonRequestOptions.getBlobRequestConditions(), commonRequestOptions.getTimeout());

        return buildResponse(response, true);
    }

    public BlobOperationResponse updateAppendBlob(final Exchange exchange) throws IOException {
        ObjectHelper.notNull(exchange, "exchange cannot be null");

        final BlobCommonRequestOptions commonRequestOptions = BlobUtils.getCommonRequestOptions(exchange);
        final boolean appendBlockCreated = BlobExchangeHeaders.getAppendBlockCreatedFlagFromHeaders(exchange);

        if (!appendBlockCreated) {
            createAppendBlob(exchange);
        }

        final BlobStreamAndLength streamAndLength = BlobStreamAndLength.createBlobStreamAndLengthFromExchangeBody(exchange);

        try {
            final Response<AppendBlobItem> response = client.appendBlobBlock(streamAndLength.getInputStream(), streamAndLength.getStreamLength(),
                    commonRequestOptions.getContentMD5(), commonRequestOptions.getBlobRequestConditions(), commonRequestOptions.getTimeout());

            return buildResponse(response, true);
        } finally {
            closeInputStreamIfNeeded(streamAndLength.getInputStream());
        }
    }

    public BlobOperationResponse createPageBlob(final Exchange exchange) {
        if (exchange == null) {
            final Response<PageBlobItem> response = client.createPageBlob(getPageBlobSize(null), null, null, null, null
                    , null);
            return buildResponse(response, true);
        }

        LOG.trace("Creating a page blob [{}] from exchange [{}]...", configuration.getBlobName(), exchange);

        final Long pageSize = getPageBlobSize(exchange);
        final BlobCommonRequestOptions requestOptions = BlobUtils.getCommonRequestOptions(exchange);
        final Long sequenceNumber = BlobExchangeHeaders.getBlobSequenceNumberFromHeaders(exchange);

        final Response<PageBlobItem> response = client.createPageBlob(pageSize, sequenceNumber, requestOptions.getBlobHttpHeaders(),
                requestOptions.getMetadata(), requestOptions.getBlobRequestConditions(), requestOptions.getTimeout());

        return buildResponse(response, true);
    }

    public BlobOperationResponse uploadPageBlob(final Exchange exchange) throws IOException {
        ObjectHelper.notNull(exchange, "exchange cannot be null");

        final boolean pageBlobCreated = BlobExchangeHeaders.getPageBlockCreatedFlagFromHeaders(exchange);

        if (!pageBlobCreated) {
            createPageBlob(exchange);
        }

        final BlobStreamAndLength streamAndLength = BlobStreamAndLength.createBlobStreamAndLengthFromExchangeBody(exchange);
        final BlobCommonRequestOptions requestOptions = BlobUtils.getCommonRequestOptions(exchange);
        final PageRange pageRange = BlobExchangeHeaders.getPageRangeFromHeaders(exchange);

        if (pageRange == null) {
            throw new IllegalArgumentException("You need to set page range in the exchange headers.");
        }

        try {
            final Response<PageBlobItem> response = client.uploadPageBlob(pageRange, streamAndLength.getInputStream(), requestOptions.getContentMD5(),
                    requestOptions.getBlobRequestConditions(), requestOptions.getTimeout());

            return buildResponse(response, true);
        } finally {
            closeInputStreamIfNeeded(streamAndLength.getInputStream());
        }
    }

    public BlobOperationResponse resizePageBlob(final Exchange exchange) {
        if (exchange == null) {
            final Response<PageBlobItem> response = client.resizePageBlob(getPageBlobSize(null), null, null);
            return buildResponse(response, true);
        }

        LOG.trace("Resizing a page blob [{}] from exchange [{}]...", configuration.getBlobName(), exchange);

        final Long pageSize = getPageBlobSize(exchange);
        final BlobCommonRequestOptions requestOptions = BlobUtils.getCommonRequestOptions(exchange);

        final Response<PageBlobItem> response = client.resizePageBlob(pageSize, requestOptions.getBlobRequestConditions(), requestOptions.getTimeout());

        return buildResponse(response, true);
    }

    public BlobOperationResponse clearPageBlob(final Exchange exchange) {
        ObjectHelper.notNull(exchange, "exchange cannot be null");

        final PageRange pageRange = BlobExchangeHeaders.getPageRangeFromHeaders(exchange);
        final BlobCommonRequestOptions requestOptions = BlobUtils.getCommonRequestOptions(exchange);

        if (pageRange == null) {
            throw new IllegalArgumentException("You need to set page range in the exchange headers.");
        }

        final Response<PageBlobItem> response = client.clearPagesBlob(pageRange, requestOptions.getBlobRequestConditions(), requestOptions.getTimeout());

        return buildResponse(response, true);
    }

    public BlobOperationResponse getPageBlobRanges(final Exchange exchange) {
        ObjectHelper.notNull(exchange, "exchange cannot be null");

        final BlobRange blobRange = getBlobRangeFromHeadersOrConfig(exchange, configuration);
        final BlobCommonRequestOptions commonRequestOptions = BlobUtils.getCommonRequestOptions(exchange);

        LOG.trace("Getting the page blob ranges [{}] from exchange [{}]...", configuration.getBlobName(), exchange);

        final Response<PageList> response = client.getPageBlobRanges(blobRange, commonRequestOptions.getBlobRequestConditions(), commonRequestOptions.getTimeout());

        return buildResponse(response, false);
    }

    private BlobOperationResponse buildResponse(final Response response, final boolean emptyBody) {
        final Object body = emptyBody ? true : response.getValue();
        BlobExchangeHeaders exchangeHeaders;

        if (response.getValue() instanceof BlockBlobItem) {
            exchangeHeaders = BlobExchangeHeaders.createBlobExchangeHeadersFromBlockBlobItem((BlockBlobItem) response.getValue());
        } else if (response.getValue() instanceof AppendBlobItem) {
            exchangeHeaders = BlobExchangeHeaders.createBlobExchangeHeadersFromAppendBlobItem((AppendBlobItem) response.getValue());
        } else if (response.getValue() instanceof PageBlobItem) {
            exchangeHeaders = BlobExchangeHeaders.createBlobExchangeHeadersFromPageBlobItem((PageBlobItem) response.getValue());
        } else {
            exchangeHeaders = BlobExchangeHeaders.create();
        }

        exchangeHeaders.httpHeaders(response.getHeaders());

        return new BlobOperationResponse(body, exchangeHeaders.toMap());
    }

    private BlobRange getBlobRangeFromHeadersOrConfig(final Exchange exchange, final BlobConfiguration configuration) {
        if (configuration.getBlobType() == BlobType.pageblob) {
            final PageRange pageRange = BlobExchangeHeaders.getPageRangeFromHeaders(exchange);
            if (pageRange != null) {
                final long blobOffset = pageRange.getStart();
                final long dataCount = pageRange.getEnd() - pageRange.getStart();

                return new BlobRange(blobOffset, dataCount);
            }
        }
        return new BlobRange(configuration.getBlobOffset(), configuration.getDataCount());
    }

    private Long getPageBlobSize(final Exchange exchange) {
        if (exchange == null) {
            return BlobConstants.PAGE_BLOB_DEFAULT_SIZE;
        }
        // we try to get the size from the page range if exists
        final PageRange pageRange = BlobExchangeHeaders.getPageRangeFromHeaders(exchange);
        if (pageRange != null) {
            return pageRange.getEnd() - pageRange.getStart() + 1; //e.g: 1023-0+1 = 1024 size
        }
        // now we try the page size
        final Long pageSize = BlobExchangeHeaders.getPageBlobSize(exchange);
        if (pageSize != null) {
            return pageSize;
        }
        return BlobConstants.PAGE_BLOB_DEFAULT_SIZE;
    }

    private void closeInputStreamIfNeeded(InputStream inputStream) throws IOException {
        if (configuration.isCloseStreamAfterWrite()) {
            inputStream.close();
        }
    }
}
