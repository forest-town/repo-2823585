/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.vertx.kafka;

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
public class VertxKafkaEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":topic";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(97);
        props.add("synchronous");
        props.add("receiveBufferBytes");
        props.add("saslLoginRefreshWindowFactor");
        props.add("reconnectBackoffMaxMs");
        props.add("valueDeserializer");
        props.add("metricReporters");
        props.add("sslTruststoreType");
        props.add("sendBufferBytes");
        props.add("heartbeatIntervalMs");
        props.add("interceptorClasses");
        props.add("acks");
        props.add("saslKerberosTicketRenewWindowFactor");
        props.add("sslKeystoreType");
        props.add("enableIdempotence");
        props.add("securityProviders");
        props.add("retries");
        props.add("enableAutoCommit");
        props.add("isolationLevel");
        props.add("maxPollRecords");
        props.add("additionalProperties");
        props.add("keyDeserializer");
        props.add("saslLoginRefreshMinPeriodSeconds");
        props.add("retryBackoffMs");
        props.add("fetchMaxWaitMs");
        props.add("metricsSampleWindowMs");
        props.add("saslKerberosKinitCmd");
        props.add("sslKeyPassword");
        props.add("keySerializer");
        props.add("allowAutoCreateTopics");
        props.add("maxPartitionFetchBytes");
        props.add("saslLoginCallbackHandlerClass");
        props.add("sslTruststorePassword");
        props.add("sessionTimeoutMs");
        props.add("clientDnsLookup");
        props.add("sslTruststoreLocation");
        props.add("connectionsMaxIdleMs");
        props.add("clientId");
        props.add("maxRequestSize");
        props.add("maxInFlightRequestsPerConnection");
        props.add("partitionId");
        props.add("seekToOffset");
        props.add("sslEngineFactoryClass");
        props.add("sslTrustmanagerAlgorithm");
        props.add("seekToPosition");
        props.add("saslKerberosMinTimeBeforeRelogin");
        props.add("maxPollIntervalMs");
        props.add("reconnectBackoffMs");
        props.add("groupId");
        props.add("saslKerberosTicketRenewJitter");
        props.add("sslProvider");
        props.add("metricsRecordingLevel");
        props.add("compressionType");
        props.add("saslKerberosServiceName");
        props.add("bridgeErrorHandler");
        props.add("saslLoginRefreshBufferSeconds");
        props.add("saslMechanism");
        props.add("deliveryTimeoutMs");
        props.add("lazyStartProducer");
        props.add("sslKeystorePassword");
        props.add("topic");
        props.add("sslProtocol");
        props.add("sslKeymanagerAlgorithm");
        props.add("partitionAssignmentStrategy");
        props.add("exceptionHandler");
        props.add("maxBlockMs");
        props.add("saslLoginClass");
        props.add("groupInstanceId");
        props.add("metadataMaxAgeMs");
        props.add("partitionerClass");
        props.add("sslCipherSuites");
        props.add("transactionalId");
        props.add("saslJaasConfig");
        props.add("fetchMinBytes");
        props.add("sslEndpointIdentificationAlgorithm");
        props.add("metadataMaxIdleMs");
        props.add("saslClientCallbackHandlerClass");
        props.add("lingerMs");
        props.add("securityProtocol");
        props.add("autoCommitIntervalMs");
        props.add("saslLoginRefreshWindowJitter");
        props.add("bootstrapServers");
        props.add("sslEnabledProtocols");
        props.add("sslKeystoreLocation");
        props.add("defaultApiTimeoutMs");
        props.add("metricsNumSamples");
        props.add("exchangePattern");
        props.add("valueSerializer");
        props.add("autoOffsetReset");
        props.add("bufferMemory");
        props.add("requestTimeoutMs");
        props.add("excludeInternalTopics");
        props.add("clientRack");
        props.add("transactionTimeoutMs");
        props.add("fetchMaxBytes");
        props.add("batchSize");
        props.add("sslSecureRandomImplementation");
        props.add("checkCrcs");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "vertx-kafka".equals(scheme);
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
    public boolean isLenientProperties() {
        return false;
    }
}

