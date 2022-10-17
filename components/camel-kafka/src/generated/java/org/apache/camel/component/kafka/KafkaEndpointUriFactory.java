/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.kafka;

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
public class KafkaEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":topic";

    private static final Set<String> PROPERTY_NAMES = Set.of(
            "additionalProperties", "allowManualCommit", "autoCommitEnable", "autoCommitIntervalMs", "autoOffsetReset",
            "batchWithIndividualHeaders", "breakOnFirstError", "bridgeErrorHandler", "brokers", "bufferMemorySize",
            "checkCrcs", "clientId", "commitTimeoutMs", "compressionCodec", "connectionMaxIdleMs",
            "consumerRequestTimeoutMs", "consumersCount", "deliveryTimeoutMs", "enableIdempotence", "exceptionHandler",
            "exchangePattern", "fetchMaxBytes", "fetchMinBytes", "fetchWaitMaxMs", "groupId", "groupInstanceId",
            "headerDeserializer", "headerFilterStrategy", "headerSerializer", "heartbeatIntervalMs", "interceptorClasses",
            "isolationLevel", "kafkaClientFactory", "kafkaManualCommitFactory", "kerberosBeforeReloginMinTime",
            "kerberosInitCmd", "kerberosPrincipalToLocalRules", "kerberosRenewJitter", "kerberosRenewWindowFactor", "key",
            "keyDeserializer", "keySerializer", "lazyStartProducer", "lingerMs", "maxBlockMs", "maxInFlightRequest",
            "maxPartitionFetchBytes", "maxPollIntervalMs", "maxPollRecords", "maxRequestSize", "metadataMaxAgeMs",
            "metricReporters", "metricsSampleWindowMs", "noOfMetricsSample", "offsetRepository", "partitionAssignor",
            "partitionKey", "partitioner", "pollOnError", "pollTimeoutMs", "producerBatchSize",
            "queueBufferingMaxMessages", "receiveBufferBytes", "reconnectBackoffMaxMs", "reconnectBackoffMs",
            "recordMetadata", "requestRequiredAcks", "requestTimeoutMs", "retries", "retryBackoffMs", "saslJaasConfig",
            "saslKerberosServiceName", "saslMechanism", "schemaRegistryURL", "securityProtocol", "seekTo",
            "sendBufferBytes", "sessionTimeoutMs", "shutdownTimeout", "specificAvroReader", "sslCipherSuites",
            "sslContextParameters", "sslEnabledProtocols", "sslEndpointAlgorithm", "sslKeyPassword",
            "sslKeymanagerAlgorithm", "sslKeystoreLocation", "sslKeystorePassword", "sslKeystoreType", "sslProtocol",
            "sslProvider", "sslTrustmanagerAlgorithm", "sslTruststoreLocation", "sslTruststorePassword",
            "sslTruststoreType", "synchronous", "topic", "topicIsPattern", "valueDeserializer", "valueSerializer",
            "workerPool", "workerPoolCoreSize", "workerPoolMaxSize");
    private static final Set<String> SECRET_PROPERTY_NAMES = Set.of(
            "saslJaasConfig", "sslKeyPassword", "sslKeystorePassword", "sslTruststorePassword");
    private static final Set<String> MULTI_VALUE_PREFIXES = Set.of(
            "additionalProperties.");

    @Override
    public boolean isEnabled(String scheme) {
        return "kafka".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "topic", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
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
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

