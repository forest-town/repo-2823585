/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.vertx.kafka;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class VertxKafkaComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.vertx.kafka.configuration.VertxKafkaConfiguration getOrCreateConfiguration(VertxKafkaComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.vertx.kafka.configuration.VertxKafkaConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        VertxKafkaComponent target = (VertxKafkaComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acks": getOrCreateConfiguration(target).setAcks(property(camelContext, java.lang.String.class, value)); return true;
        case "allowautocreatetopics":
        case "allowAutoCreateTopics": getOrCreateConfiguration(target).setAllowAutoCreateTopics(property(camelContext, boolean.class, value)); return true;
        case "autocommitintervalms":
        case "autoCommitIntervalMs": getOrCreateConfiguration(target).setAutoCommitIntervalMs(property(camelContext, int.class, value)); return true;
        case "autooffsetreset":
        case "autoOffsetReset": getOrCreateConfiguration(target).setAutoOffsetReset(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "batchsize":
        case "batchSize": getOrCreateConfiguration(target).setBatchSize(property(camelContext, int.class, value)); return true;
        case "bootstrapservers":
        case "bootstrapServers": getOrCreateConfiguration(target).setBootstrapServers(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "buffermemory":
        case "bufferMemory": getOrCreateConfiguration(target).setBufferMemory(property(camelContext, long.class, value)); return true;
        case "checkcrcs":
        case "checkCrcs": getOrCreateConfiguration(target).setCheckCrcs(property(camelContext, boolean.class, value)); return true;
        case "clientdnslookup":
        case "clientDnsLookup": getOrCreateConfiguration(target).setClientDnsLookup(property(camelContext, java.lang.String.class, value)); return true;
        case "clientid":
        case "clientId": getOrCreateConfiguration(target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientrack":
        case "clientRack": getOrCreateConfiguration(target).setClientRack(property(camelContext, java.lang.String.class, value)); return true;
        case "compressiontype":
        case "compressionType": getOrCreateConfiguration(target).setCompressionType(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.vertx.kafka.configuration.VertxKafkaConfiguration.class, value)); return true;
        case "connectionsmaxidlems":
        case "connectionsMaxIdleMs": getOrCreateConfiguration(target).setConnectionsMaxIdleMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "defaultapitimeoutms":
        case "defaultApiTimeoutMs": getOrCreateConfiguration(target).setDefaultApiTimeoutMs(property(camelContext, int.class, value)); return true;
        case "deliverytimeoutms":
        case "deliveryTimeoutMs": getOrCreateConfiguration(target).setDeliveryTimeoutMs(property(camelContext, int.class, value)); return true;
        case "enableautocommit":
        case "enableAutoCommit": getOrCreateConfiguration(target).setEnableAutoCommit(property(camelContext, boolean.class, value)); return true;
        case "enableidempotence":
        case "enableIdempotence": getOrCreateConfiguration(target).setEnableIdempotence(property(camelContext, boolean.class, value)); return true;
        case "excludeinternaltopics":
        case "excludeInternalTopics": getOrCreateConfiguration(target).setExcludeInternalTopics(property(camelContext, boolean.class, value)); return true;
        case "fetchmaxbytes":
        case "fetchMaxBytes": getOrCreateConfiguration(target).setFetchMaxBytes(property(camelContext, int.class, value)); return true;
        case "fetchmaxwaitms":
        case "fetchMaxWaitMs": getOrCreateConfiguration(target).setFetchMaxWaitMs(property(camelContext, int.class, value)); return true;
        case "fetchminbytes":
        case "fetchMinBytes": getOrCreateConfiguration(target).setFetchMinBytes(property(camelContext, int.class, value)); return true;
        case "groupid":
        case "groupId": getOrCreateConfiguration(target).setGroupId(property(camelContext, java.lang.String.class, value)); return true;
        case "groupinstanceid":
        case "groupInstanceId": getOrCreateConfiguration(target).setGroupInstanceId(property(camelContext, java.lang.String.class, value)); return true;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": getOrCreateConfiguration(target).setHeartbeatIntervalMs(property(camelContext, int.class, value)); return true;
        case "interceptorclasses":
        case "interceptorClasses": getOrCreateConfiguration(target).setInterceptorClasses(property(camelContext, java.lang.String.class, value)); return true;
        case "isolationlevel":
        case "isolationLevel": getOrCreateConfiguration(target).setIsolationLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "keydeserializer":
        case "keyDeserializer": getOrCreateConfiguration(target).setKeyDeserializer(property(camelContext, java.lang.String.class, value)); return true;
        case "keyserializer":
        case "keySerializer": getOrCreateConfiguration(target).setKeySerializer(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "lingerms":
        case "lingerMs": getOrCreateConfiguration(target).setLingerMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "maxblockms":
        case "maxBlockMs": getOrCreateConfiguration(target).setMaxBlockMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "maxinflightrequestsperconnection":
        case "maxInFlightRequestsPerConnection": getOrCreateConfiguration(target).setMaxInFlightRequestsPerConnection(property(camelContext, int.class, value)); return true;
        case "maxpartitionfetchbytes":
        case "maxPartitionFetchBytes": getOrCreateConfiguration(target).setMaxPartitionFetchBytes(property(camelContext, int.class, value)); return true;
        case "maxpollintervalms":
        case "maxPollIntervalMs": getOrCreateConfiguration(target).setMaxPollIntervalMs(property(camelContext, int.class, value)); return true;
        case "maxpollrecords":
        case "maxPollRecords": getOrCreateConfiguration(target).setMaxPollRecords(property(camelContext, int.class, value)); return true;
        case "maxrequestsize":
        case "maxRequestSize": getOrCreateConfiguration(target).setMaxRequestSize(property(camelContext, int.class, value)); return true;
        case "metadatamaxagems":
        case "metadataMaxAgeMs": getOrCreateConfiguration(target).setMetadataMaxAgeMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "metadatamaxidlems":
        case "metadataMaxIdleMs": getOrCreateConfiguration(target).setMetadataMaxIdleMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "metricreporters":
        case "metricReporters": getOrCreateConfiguration(target).setMetricReporters(property(camelContext, java.lang.String.class, value)); return true;
        case "metricsnumsamples":
        case "metricsNumSamples": getOrCreateConfiguration(target).setMetricsNumSamples(property(camelContext, int.class, value)); return true;
        case "metricsrecordinglevel":
        case "metricsRecordingLevel": getOrCreateConfiguration(target).setMetricsRecordingLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "metricssamplewindowms":
        case "metricsSampleWindowMs": getOrCreateConfiguration(target).setMetricsSampleWindowMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "partitionassignmentstrategy":
        case "partitionAssignmentStrategy": getOrCreateConfiguration(target).setPartitionAssignmentStrategy(property(camelContext, java.lang.String.class, value)); return true;
        case "partitionerclass":
        case "partitionerClass": getOrCreateConfiguration(target).setPartitionerClass(property(camelContext, java.lang.String.class, value)); return true;
        case "receivebufferbytes":
        case "receiveBufferBytes": getOrCreateConfiguration(target).setReceiveBufferBytes(property(camelContext, int.class, value)); return true;
        case "reconnectbackoffmaxms":
        case "reconnectBackoffMaxMs": getOrCreateConfiguration(target).setReconnectBackoffMaxMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "reconnectbackoffms":
        case "reconnectBackoffMs": getOrCreateConfiguration(target).setReconnectBackoffMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "requesttimeoutms":
        case "requestTimeoutMs": getOrCreateConfiguration(target).setRequestTimeoutMs(property(camelContext, int.class, value)); return true;
        case "retries": getOrCreateConfiguration(target).setRetries(property(camelContext, int.class, value)); return true;
        case "retrybackoffms":
        case "retryBackoffMs": getOrCreateConfiguration(target).setRetryBackoffMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "saslclientcallbackhandlerclass":
        case "saslClientCallbackHandlerClass": getOrCreateConfiguration(target).setSaslClientCallbackHandlerClass(property(camelContext, java.lang.String.class, value)); return true;
        case "sasljaasconfig":
        case "saslJaasConfig": getOrCreateConfiguration(target).setSaslJaasConfig(property(camelContext, java.lang.String.class, value)); return true;
        case "saslkerberoskinitcmd":
        case "saslKerberosKinitCmd": getOrCreateConfiguration(target).setSaslKerberosKinitCmd(property(camelContext, java.lang.String.class, value)); return true;
        case "saslkerberosmintimebeforerelogin":
        case "saslKerberosMinTimeBeforeRelogin": getOrCreateConfiguration(target).setSaslKerberosMinTimeBeforeRelogin(property(camelContext, long.class, value)); return true;
        case "saslkerberosservicename":
        case "saslKerberosServiceName": getOrCreateConfiguration(target).setSaslKerberosServiceName(property(camelContext, java.lang.String.class, value)); return true;
        case "saslkerberosticketrenewjitter":
        case "saslKerberosTicketRenewJitter": getOrCreateConfiguration(target).setSaslKerberosTicketRenewJitter(property(camelContext, double.class, value)); return true;
        case "saslkerberosticketrenewwindowfactor":
        case "saslKerberosTicketRenewWindowFactor": getOrCreateConfiguration(target).setSaslKerberosTicketRenewWindowFactor(property(camelContext, double.class, value)); return true;
        case "sasllogincallbackhandlerclass":
        case "saslLoginCallbackHandlerClass": getOrCreateConfiguration(target).setSaslLoginCallbackHandlerClass(property(camelContext, java.lang.String.class, value)); return true;
        case "saslloginclass":
        case "saslLoginClass": getOrCreateConfiguration(target).setSaslLoginClass(property(camelContext, java.lang.String.class, value)); return true;
        case "saslloginrefreshbufferseconds":
        case "saslLoginRefreshBufferSeconds": getOrCreateConfiguration(target).setSaslLoginRefreshBufferSeconds(property(camelContext, short.class, value)); return true;
        case "saslloginrefreshminperiodseconds":
        case "saslLoginRefreshMinPeriodSeconds": getOrCreateConfiguration(target).setSaslLoginRefreshMinPeriodSeconds(property(camelContext, short.class, value)); return true;
        case "saslloginrefreshwindowfactor":
        case "saslLoginRefreshWindowFactor": getOrCreateConfiguration(target).setSaslLoginRefreshWindowFactor(property(camelContext, double.class, value)); return true;
        case "saslloginrefreshwindowjitter":
        case "saslLoginRefreshWindowJitter": getOrCreateConfiguration(target).setSaslLoginRefreshWindowJitter(property(camelContext, double.class, value)); return true;
        case "saslmechanism":
        case "saslMechanism": getOrCreateConfiguration(target).setSaslMechanism(property(camelContext, java.lang.String.class, value)); return true;
        case "securityprotocol":
        case "securityProtocol": getOrCreateConfiguration(target).setSecurityProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "securityproviders":
        case "securityProviders": getOrCreateConfiguration(target).setSecurityProviders(property(camelContext, java.lang.String.class, value)); return true;
        case "sendbufferbytes":
        case "sendBufferBytes": getOrCreateConfiguration(target).setSendBufferBytes(property(camelContext, int.class, value)); return true;
        case "sessiontimeoutms":
        case "sessionTimeoutMs": getOrCreateConfiguration(target).setSessionTimeoutMs(property(camelContext, int.class, value)); return true;
        case "sslciphersuites":
        case "sslCipherSuites": getOrCreateConfiguration(target).setSslCipherSuites(property(camelContext, java.lang.String.class, value)); return true;
        case "sslenabledprotocols":
        case "sslEnabledProtocols": getOrCreateConfiguration(target).setSslEnabledProtocols(property(camelContext, java.lang.String.class, value)); return true;
        case "sslendpointidentificationalgorithm":
        case "sslEndpointIdentificationAlgorithm": getOrCreateConfiguration(target).setSslEndpointIdentificationAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "sslenginefactoryclass":
        case "sslEngineFactoryClass": getOrCreateConfiguration(target).setSslEngineFactoryClass(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeypassword":
        case "sslKeyPassword": getOrCreateConfiguration(target).setSslKeyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeymanageralgorithm":
        case "sslKeymanagerAlgorithm": getOrCreateConfiguration(target).setSslKeymanagerAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeystorelocation":
        case "sslKeystoreLocation": getOrCreateConfiguration(target).setSslKeystoreLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeystorepassword":
        case "sslKeystorePassword": getOrCreateConfiguration(target).setSslKeystorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeystoretype":
        case "sslKeystoreType": getOrCreateConfiguration(target).setSslKeystoreType(property(camelContext, java.lang.String.class, value)); return true;
        case "sslprotocol":
        case "sslProtocol": getOrCreateConfiguration(target).setSslProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "sslprovider":
        case "sslProvider": getOrCreateConfiguration(target).setSslProvider(property(camelContext, java.lang.String.class, value)); return true;
        case "sslsecurerandomimplementation":
        case "sslSecureRandomImplementation": getOrCreateConfiguration(target).setSslSecureRandomImplementation(property(camelContext, java.lang.String.class, value)); return true;
        case "ssltrustmanageralgorithm":
        case "sslTrustmanagerAlgorithm": getOrCreateConfiguration(target).setSslTrustmanagerAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "ssltruststorelocation":
        case "sslTruststoreLocation": getOrCreateConfiguration(target).setSslTruststoreLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "ssltruststorepassword":
        case "sslTruststorePassword": getOrCreateConfiguration(target).setSslTruststorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "ssltruststoretype":
        case "sslTruststoreType": getOrCreateConfiguration(target).setSslTruststoreType(property(camelContext, java.lang.String.class, value)); return true;
        case "transactiontimeoutms":
        case "transactionTimeoutMs": getOrCreateConfiguration(target).setTransactionTimeoutMs(property(camelContext, int.class, value)); return true;
        case "transactionalid":
        case "transactionalId": getOrCreateConfiguration(target).setTransactionalId(property(camelContext, java.lang.String.class, value)); return true;
        case "valuedeserializer":
        case "valueDeserializer": getOrCreateConfiguration(target).setValueDeserializer(property(camelContext, java.lang.String.class, value)); return true;
        case "valueserializer":
        case "valueSerializer": getOrCreateConfiguration(target).setValueSerializer(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acks": return java.lang.String.class;
        case "allowautocreatetopics":
        case "allowAutoCreateTopics": return boolean.class;
        case "autocommitintervalms":
        case "autoCommitIntervalMs": return int.class;
        case "autooffsetreset":
        case "autoOffsetReset": return java.lang.String.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "batchsize":
        case "batchSize": return int.class;
        case "bootstrapservers":
        case "bootstrapServers": return java.lang.String.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "buffermemory":
        case "bufferMemory": return long.class;
        case "checkcrcs":
        case "checkCrcs": return boolean.class;
        case "clientdnslookup":
        case "clientDnsLookup": return java.lang.String.class;
        case "clientid":
        case "clientId": return java.lang.String.class;
        case "clientrack":
        case "clientRack": return java.lang.String.class;
        case "compressiontype":
        case "compressionType": return java.lang.String.class;
        case "configuration": return org.apache.camel.component.vertx.kafka.configuration.VertxKafkaConfiguration.class;
        case "connectionsmaxidlems":
        case "connectionsMaxIdleMs": return long.class;
        case "defaultapitimeoutms":
        case "defaultApiTimeoutMs": return int.class;
        case "deliverytimeoutms":
        case "deliveryTimeoutMs": return int.class;
        case "enableautocommit":
        case "enableAutoCommit": return boolean.class;
        case "enableidempotence":
        case "enableIdempotence": return boolean.class;
        case "excludeinternaltopics":
        case "excludeInternalTopics": return boolean.class;
        case "fetchmaxbytes":
        case "fetchMaxBytes": return int.class;
        case "fetchmaxwaitms":
        case "fetchMaxWaitMs": return int.class;
        case "fetchminbytes":
        case "fetchMinBytes": return int.class;
        case "groupid":
        case "groupId": return java.lang.String.class;
        case "groupinstanceid":
        case "groupInstanceId": return java.lang.String.class;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return int.class;
        case "interceptorclasses":
        case "interceptorClasses": return java.lang.String.class;
        case "isolationlevel":
        case "isolationLevel": return java.lang.String.class;
        case "keydeserializer":
        case "keyDeserializer": return java.lang.String.class;
        case "keyserializer":
        case "keySerializer": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "lingerms":
        case "lingerMs": return long.class;
        case "maxblockms":
        case "maxBlockMs": return long.class;
        case "maxinflightrequestsperconnection":
        case "maxInFlightRequestsPerConnection": return int.class;
        case "maxpartitionfetchbytes":
        case "maxPartitionFetchBytes": return int.class;
        case "maxpollintervalms":
        case "maxPollIntervalMs": return int.class;
        case "maxpollrecords":
        case "maxPollRecords": return int.class;
        case "maxrequestsize":
        case "maxRequestSize": return int.class;
        case "metadatamaxagems":
        case "metadataMaxAgeMs": return long.class;
        case "metadatamaxidlems":
        case "metadataMaxIdleMs": return long.class;
        case "metricreporters":
        case "metricReporters": return java.lang.String.class;
        case "metricsnumsamples":
        case "metricsNumSamples": return int.class;
        case "metricsrecordinglevel":
        case "metricsRecordingLevel": return java.lang.String.class;
        case "metricssamplewindowms":
        case "metricsSampleWindowMs": return long.class;
        case "partitionassignmentstrategy":
        case "partitionAssignmentStrategy": return java.lang.String.class;
        case "partitionerclass":
        case "partitionerClass": return java.lang.String.class;
        case "receivebufferbytes":
        case "receiveBufferBytes": return int.class;
        case "reconnectbackoffmaxms":
        case "reconnectBackoffMaxMs": return long.class;
        case "reconnectbackoffms":
        case "reconnectBackoffMs": return long.class;
        case "requesttimeoutms":
        case "requestTimeoutMs": return int.class;
        case "retries": return int.class;
        case "retrybackoffms":
        case "retryBackoffMs": return long.class;
        case "saslclientcallbackhandlerclass":
        case "saslClientCallbackHandlerClass": return java.lang.String.class;
        case "sasljaasconfig":
        case "saslJaasConfig": return java.lang.String.class;
        case "saslkerberoskinitcmd":
        case "saslKerberosKinitCmd": return java.lang.String.class;
        case "saslkerberosmintimebeforerelogin":
        case "saslKerberosMinTimeBeforeRelogin": return long.class;
        case "saslkerberosservicename":
        case "saslKerberosServiceName": return java.lang.String.class;
        case "saslkerberosticketrenewjitter":
        case "saslKerberosTicketRenewJitter": return double.class;
        case "saslkerberosticketrenewwindowfactor":
        case "saslKerberosTicketRenewWindowFactor": return double.class;
        case "sasllogincallbackhandlerclass":
        case "saslLoginCallbackHandlerClass": return java.lang.String.class;
        case "saslloginclass":
        case "saslLoginClass": return java.lang.String.class;
        case "saslloginrefreshbufferseconds":
        case "saslLoginRefreshBufferSeconds": return short.class;
        case "saslloginrefreshminperiodseconds":
        case "saslLoginRefreshMinPeriodSeconds": return short.class;
        case "saslloginrefreshwindowfactor":
        case "saslLoginRefreshWindowFactor": return double.class;
        case "saslloginrefreshwindowjitter":
        case "saslLoginRefreshWindowJitter": return double.class;
        case "saslmechanism":
        case "saslMechanism": return java.lang.String.class;
        case "securityprotocol":
        case "securityProtocol": return java.lang.String.class;
        case "securityproviders":
        case "securityProviders": return java.lang.String.class;
        case "sendbufferbytes":
        case "sendBufferBytes": return int.class;
        case "sessiontimeoutms":
        case "sessionTimeoutMs": return int.class;
        case "sslciphersuites":
        case "sslCipherSuites": return java.lang.String.class;
        case "sslenabledprotocols":
        case "sslEnabledProtocols": return java.lang.String.class;
        case "sslendpointidentificationalgorithm":
        case "sslEndpointIdentificationAlgorithm": return java.lang.String.class;
        case "sslenginefactoryclass":
        case "sslEngineFactoryClass": return java.lang.String.class;
        case "sslkeypassword":
        case "sslKeyPassword": return java.lang.String.class;
        case "sslkeymanageralgorithm":
        case "sslKeymanagerAlgorithm": return java.lang.String.class;
        case "sslkeystorelocation":
        case "sslKeystoreLocation": return java.lang.String.class;
        case "sslkeystorepassword":
        case "sslKeystorePassword": return java.lang.String.class;
        case "sslkeystoretype":
        case "sslKeystoreType": return java.lang.String.class;
        case "sslprotocol":
        case "sslProtocol": return java.lang.String.class;
        case "sslprovider":
        case "sslProvider": return java.lang.String.class;
        case "sslsecurerandomimplementation":
        case "sslSecureRandomImplementation": return java.lang.String.class;
        case "ssltrustmanageralgorithm":
        case "sslTrustmanagerAlgorithm": return java.lang.String.class;
        case "ssltruststorelocation":
        case "sslTruststoreLocation": return java.lang.String.class;
        case "ssltruststorepassword":
        case "sslTruststorePassword": return java.lang.String.class;
        case "ssltruststoretype":
        case "sslTruststoreType": return java.lang.String.class;
        case "transactiontimeoutms":
        case "transactionTimeoutMs": return int.class;
        case "transactionalid":
        case "transactionalId": return java.lang.String.class;
        case "valuedeserializer":
        case "valueDeserializer": return java.lang.String.class;
        case "valueserializer":
        case "valueSerializer": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        VertxKafkaComponent target = (VertxKafkaComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acks": return getOrCreateConfiguration(target).getAcks();
        case "allowautocreatetopics":
        case "allowAutoCreateTopics": return getOrCreateConfiguration(target).isAllowAutoCreateTopics();
        case "autocommitintervalms":
        case "autoCommitIntervalMs": return getOrCreateConfiguration(target).getAutoCommitIntervalMs();
        case "autooffsetreset":
        case "autoOffsetReset": return getOrCreateConfiguration(target).getAutoOffsetReset();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "batchsize":
        case "batchSize": return getOrCreateConfiguration(target).getBatchSize();
        case "bootstrapservers":
        case "bootstrapServers": return getOrCreateConfiguration(target).getBootstrapServers();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "buffermemory":
        case "bufferMemory": return getOrCreateConfiguration(target).getBufferMemory();
        case "checkcrcs":
        case "checkCrcs": return getOrCreateConfiguration(target).isCheckCrcs();
        case "clientdnslookup":
        case "clientDnsLookup": return getOrCreateConfiguration(target).getClientDnsLookup();
        case "clientid":
        case "clientId": return getOrCreateConfiguration(target).getClientId();
        case "clientrack":
        case "clientRack": return getOrCreateConfiguration(target).getClientRack();
        case "compressiontype":
        case "compressionType": return getOrCreateConfiguration(target).getCompressionType();
        case "configuration": return target.getConfiguration();
        case "connectionsmaxidlems":
        case "connectionsMaxIdleMs": return getOrCreateConfiguration(target).getConnectionsMaxIdleMs();
        case "defaultapitimeoutms":
        case "defaultApiTimeoutMs": return getOrCreateConfiguration(target).getDefaultApiTimeoutMs();
        case "deliverytimeoutms":
        case "deliveryTimeoutMs": return getOrCreateConfiguration(target).getDeliveryTimeoutMs();
        case "enableautocommit":
        case "enableAutoCommit": return getOrCreateConfiguration(target).isEnableAutoCommit();
        case "enableidempotence":
        case "enableIdempotence": return getOrCreateConfiguration(target).isEnableIdempotence();
        case "excludeinternaltopics":
        case "excludeInternalTopics": return getOrCreateConfiguration(target).isExcludeInternalTopics();
        case "fetchmaxbytes":
        case "fetchMaxBytes": return getOrCreateConfiguration(target).getFetchMaxBytes();
        case "fetchmaxwaitms":
        case "fetchMaxWaitMs": return getOrCreateConfiguration(target).getFetchMaxWaitMs();
        case "fetchminbytes":
        case "fetchMinBytes": return getOrCreateConfiguration(target).getFetchMinBytes();
        case "groupid":
        case "groupId": return getOrCreateConfiguration(target).getGroupId();
        case "groupinstanceid":
        case "groupInstanceId": return getOrCreateConfiguration(target).getGroupInstanceId();
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return getOrCreateConfiguration(target).getHeartbeatIntervalMs();
        case "interceptorclasses":
        case "interceptorClasses": return getOrCreateConfiguration(target).getInterceptorClasses();
        case "isolationlevel":
        case "isolationLevel": return getOrCreateConfiguration(target).getIsolationLevel();
        case "keydeserializer":
        case "keyDeserializer": return getOrCreateConfiguration(target).getKeyDeserializer();
        case "keyserializer":
        case "keySerializer": return getOrCreateConfiguration(target).getKeySerializer();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "lingerms":
        case "lingerMs": return getOrCreateConfiguration(target).getLingerMs();
        case "maxblockms":
        case "maxBlockMs": return getOrCreateConfiguration(target).getMaxBlockMs();
        case "maxinflightrequestsperconnection":
        case "maxInFlightRequestsPerConnection": return getOrCreateConfiguration(target).getMaxInFlightRequestsPerConnection();
        case "maxpartitionfetchbytes":
        case "maxPartitionFetchBytes": return getOrCreateConfiguration(target).getMaxPartitionFetchBytes();
        case "maxpollintervalms":
        case "maxPollIntervalMs": return getOrCreateConfiguration(target).getMaxPollIntervalMs();
        case "maxpollrecords":
        case "maxPollRecords": return getOrCreateConfiguration(target).getMaxPollRecords();
        case "maxrequestsize":
        case "maxRequestSize": return getOrCreateConfiguration(target).getMaxRequestSize();
        case "metadatamaxagems":
        case "metadataMaxAgeMs": return getOrCreateConfiguration(target).getMetadataMaxAgeMs();
        case "metadatamaxidlems":
        case "metadataMaxIdleMs": return getOrCreateConfiguration(target).getMetadataMaxIdleMs();
        case "metricreporters":
        case "metricReporters": return getOrCreateConfiguration(target).getMetricReporters();
        case "metricsnumsamples":
        case "metricsNumSamples": return getOrCreateConfiguration(target).getMetricsNumSamples();
        case "metricsrecordinglevel":
        case "metricsRecordingLevel": return getOrCreateConfiguration(target).getMetricsRecordingLevel();
        case "metricssamplewindowms":
        case "metricsSampleWindowMs": return getOrCreateConfiguration(target).getMetricsSampleWindowMs();
        case "partitionassignmentstrategy":
        case "partitionAssignmentStrategy": return getOrCreateConfiguration(target).getPartitionAssignmentStrategy();
        case "partitionerclass":
        case "partitionerClass": return getOrCreateConfiguration(target).getPartitionerClass();
        case "receivebufferbytes":
        case "receiveBufferBytes": return getOrCreateConfiguration(target).getReceiveBufferBytes();
        case "reconnectbackoffmaxms":
        case "reconnectBackoffMaxMs": return getOrCreateConfiguration(target).getReconnectBackoffMaxMs();
        case "reconnectbackoffms":
        case "reconnectBackoffMs": return getOrCreateConfiguration(target).getReconnectBackoffMs();
        case "requesttimeoutms":
        case "requestTimeoutMs": return getOrCreateConfiguration(target).getRequestTimeoutMs();
        case "retries": return getOrCreateConfiguration(target).getRetries();
        case "retrybackoffms":
        case "retryBackoffMs": return getOrCreateConfiguration(target).getRetryBackoffMs();
        case "saslclientcallbackhandlerclass":
        case "saslClientCallbackHandlerClass": return getOrCreateConfiguration(target).getSaslClientCallbackHandlerClass();
        case "sasljaasconfig":
        case "saslJaasConfig": return getOrCreateConfiguration(target).getSaslJaasConfig();
        case "saslkerberoskinitcmd":
        case "saslKerberosKinitCmd": return getOrCreateConfiguration(target).getSaslKerberosKinitCmd();
        case "saslkerberosmintimebeforerelogin":
        case "saslKerberosMinTimeBeforeRelogin": return getOrCreateConfiguration(target).getSaslKerberosMinTimeBeforeRelogin();
        case "saslkerberosservicename":
        case "saslKerberosServiceName": return getOrCreateConfiguration(target).getSaslKerberosServiceName();
        case "saslkerberosticketrenewjitter":
        case "saslKerberosTicketRenewJitter": return getOrCreateConfiguration(target).getSaslKerberosTicketRenewJitter();
        case "saslkerberosticketrenewwindowfactor":
        case "saslKerberosTicketRenewWindowFactor": return getOrCreateConfiguration(target).getSaslKerberosTicketRenewWindowFactor();
        case "sasllogincallbackhandlerclass":
        case "saslLoginCallbackHandlerClass": return getOrCreateConfiguration(target).getSaslLoginCallbackHandlerClass();
        case "saslloginclass":
        case "saslLoginClass": return getOrCreateConfiguration(target).getSaslLoginClass();
        case "saslloginrefreshbufferseconds":
        case "saslLoginRefreshBufferSeconds": return getOrCreateConfiguration(target).getSaslLoginRefreshBufferSeconds();
        case "saslloginrefreshminperiodseconds":
        case "saslLoginRefreshMinPeriodSeconds": return getOrCreateConfiguration(target).getSaslLoginRefreshMinPeriodSeconds();
        case "saslloginrefreshwindowfactor":
        case "saslLoginRefreshWindowFactor": return getOrCreateConfiguration(target).getSaslLoginRefreshWindowFactor();
        case "saslloginrefreshwindowjitter":
        case "saslLoginRefreshWindowJitter": return getOrCreateConfiguration(target).getSaslLoginRefreshWindowJitter();
        case "saslmechanism":
        case "saslMechanism": return getOrCreateConfiguration(target).getSaslMechanism();
        case "securityprotocol":
        case "securityProtocol": return getOrCreateConfiguration(target).getSecurityProtocol();
        case "securityproviders":
        case "securityProviders": return getOrCreateConfiguration(target).getSecurityProviders();
        case "sendbufferbytes":
        case "sendBufferBytes": return getOrCreateConfiguration(target).getSendBufferBytes();
        case "sessiontimeoutms":
        case "sessionTimeoutMs": return getOrCreateConfiguration(target).getSessionTimeoutMs();
        case "sslciphersuites":
        case "sslCipherSuites": return getOrCreateConfiguration(target).getSslCipherSuites();
        case "sslenabledprotocols":
        case "sslEnabledProtocols": return getOrCreateConfiguration(target).getSslEnabledProtocols();
        case "sslendpointidentificationalgorithm":
        case "sslEndpointIdentificationAlgorithm": return getOrCreateConfiguration(target).getSslEndpointIdentificationAlgorithm();
        case "sslenginefactoryclass":
        case "sslEngineFactoryClass": return getOrCreateConfiguration(target).getSslEngineFactoryClass();
        case "sslkeypassword":
        case "sslKeyPassword": return getOrCreateConfiguration(target).getSslKeyPassword();
        case "sslkeymanageralgorithm":
        case "sslKeymanagerAlgorithm": return getOrCreateConfiguration(target).getSslKeymanagerAlgorithm();
        case "sslkeystorelocation":
        case "sslKeystoreLocation": return getOrCreateConfiguration(target).getSslKeystoreLocation();
        case "sslkeystorepassword":
        case "sslKeystorePassword": return getOrCreateConfiguration(target).getSslKeystorePassword();
        case "sslkeystoretype":
        case "sslKeystoreType": return getOrCreateConfiguration(target).getSslKeystoreType();
        case "sslprotocol":
        case "sslProtocol": return getOrCreateConfiguration(target).getSslProtocol();
        case "sslprovider":
        case "sslProvider": return getOrCreateConfiguration(target).getSslProvider();
        case "sslsecurerandomimplementation":
        case "sslSecureRandomImplementation": return getOrCreateConfiguration(target).getSslSecureRandomImplementation();
        case "ssltrustmanageralgorithm":
        case "sslTrustmanagerAlgorithm": return getOrCreateConfiguration(target).getSslTrustmanagerAlgorithm();
        case "ssltruststorelocation":
        case "sslTruststoreLocation": return getOrCreateConfiguration(target).getSslTruststoreLocation();
        case "ssltruststorepassword":
        case "sslTruststorePassword": return getOrCreateConfiguration(target).getSslTruststorePassword();
        case "ssltruststoretype":
        case "sslTruststoreType": return getOrCreateConfiguration(target).getSslTruststoreType();
        case "transactiontimeoutms":
        case "transactionTimeoutMs": return getOrCreateConfiguration(target).getTransactionTimeoutMs();
        case "transactionalid":
        case "transactionalId": return getOrCreateConfiguration(target).getTransactionalId();
        case "valuedeserializer":
        case "valueDeserializer": return getOrCreateConfiguration(target).getValueDeserializer();
        case "valueserializer":
        case "valueSerializer": return getOrCreateConfiguration(target).getValueSerializer();
        default: return null;
        }
    }
}

