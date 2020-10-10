/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.debezium;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class DebeziumMongodbEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":name";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(57);
        props.add("mongodbServerSelectionTimeoutMs");
        props.add("maxBatchSize");
        props.add("internalKeyConverter");
        props.add("synchronous");
        props.add("snapshotDelayMs");
        props.add("mongodbSslEnabled");
        props.add("offsetStorageTopic");
        props.add("bridgeErrorHandler");
        props.add("connectMaxAttempts");
        props.add("provideTransactionMetadata");
        props.add("converters");
        props.add("tombstonesOnDelete");
        props.add("heartbeatIntervalMs");
        props.add("heartbeatTopicsPrefix");
        props.add("skippedOperations");
        props.add("mongodbHosts");
        props.add("sourceStructVersion");
        props.add("mongodbName");
        props.add("connectBackoffInitialDelayMs");
        props.add("connectBackoffMaxDelayMs");
        props.add("fieldRenames");
        props.add("eventProcessingFailureHandlingMode");
        props.add("offsetCommitTimeoutMs");
        props.add("mongodbPollIntervalMs");
        props.add("mongodbAuthsource");
        props.add("databaseIncludeList");
        props.add("offsetFlushIntervalMs");
        props.add("mongodbMembersAutoDiscover");
        props.add("offsetStorageFileName");
        props.add("name");
        props.add("snapshotFetchSize");
        props.add("offsetStoragePartitions");
        props.add("databaseExcludeList");
        props.add("additionalProperties");
        props.add("offsetStorageReplicationFactor");
        props.add("exceptionHandler");
        props.add("mongodbConnectTimeoutMs");
        props.add("basicPropertyBinding");
        props.add("databaseHistoryFileFilename");
        props.add("offsetStorage");
        props.add("internalValueConverter");
        props.add("retriableRestartConnectorWaitMs");
        props.add("maxQueueSize");
        props.add("collectionExcludeList");
        props.add("mongodbSslInvalidHostnameAllowed");
        props.add("pollIntervalMs");
        props.add("sanitizeFieldNames");
        props.add("fieldExcludeList");
        props.add("mongodbPassword");
        props.add("mongodbUser");
        props.add("exchangePattern");
        props.add("initialSyncMaxThreads");
        props.add("mongodbSocketTimeoutMs");
        props.add("collectionIncludeList");
        props.add("queryFetchSize");
        props.add("snapshotMode");
        props.add("offsetCommitPolicy");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "debezium-mongodb".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "name", null, true, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

