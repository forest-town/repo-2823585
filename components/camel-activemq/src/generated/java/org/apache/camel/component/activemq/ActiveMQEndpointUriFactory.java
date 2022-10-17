/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.activemq;

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
public class ActiveMQEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":destinationType:destinationName";

    private static final Set<String> PROPERTY_NAMES = Set.of(
            "acceptMessagesWhileStopping", "acknowledgementModeName", "allowAdditionalHeaders", "allowNullBody",
            "allowReplyManagerQuickStop", "allowSerializedHeaders", "alwaysCopyMessage", "artemisConsumerPriority",
            "artemisStreamingEnabled", "asyncConsumer", "asyncStartListener", "asyncStopListener", "autoStartup",
            "cacheLevel", "cacheLevelName", "clientId", "concurrentConsumers", "connectionFactory", "consumerType",
            "correlationProperty", "defaultTaskExecutorType", "deliveryDelay", "deliveryMode", "deliveryPersistent",
            "destinationName", "destinationOptions", "destinationResolver", "destinationType", "disableReplyTo",
            "disableTimeToLive", "durableSubscriptionName", "eagerLoadingOfProperties", "eagerPoisonBody", "errorHandler",
            "errorHandlerLogStackTrace", "errorHandlerLoggingLevel", "exceptionHandler", "exceptionListener",
            "exchangePattern", "explicitQosEnabled", "exposeListenerSession", "forceSendOriginalMessage",
            "formatDateHeadersToIso8601", "headerFilterStrategy", "idleConsumerLimit", "idleTaskExecutionLimit",
            "includeAllJMSXProperties", "includeSentJMSMessageID", "jmsKeyFormatStrategy", "jmsMessageType",
            "lazyCreateTransactionManager", "lazyStartProducer", "mapJmsMessage", "maxConcurrentConsumers",
            "maxMessagesPerTask", "messageConverter", "messageCreatedStrategy", "messageIdEnabled",
            "messageListenerContainerFactory", "messageTimestampEnabled", "password", "preserveMessageQos", "priority",
            "pubSubNoLocal", "receiveTimeout", "recoveryInterval", "replyTo", "replyToCacheLevelName",
            "replyToConcurrentConsumers", "replyToConsumerType", "replyToDeliveryPersistent",
            "replyToDestinationSelectorName", "replyToMaxConcurrentConsumers", "replyToOnTimeoutMaxConcurrentConsumers",
            "replyToOverride", "replyToSameDestinationAllowed", "replyToType", "requestTimeout",
            "requestTimeoutCheckerInterval", "selector", "streamMessageTypeEnabled", "subscriptionDurable",
            "subscriptionName", "subscriptionShared", "synchronous", "taskExecutor", "testConnectionOnStartup",
            "timeToLive", "transacted", "transactedInOut", "transactionManager", "transactionName", "transactionTimeout",
            "transferException", "transferExchange", "useMessageIDAsCorrelationID", "username",
            "waitForProvisionCorrelationToBeUpdatedCounter", "waitForProvisionCorrelationToBeUpdatedThreadSleepingTime");
    private static final Set<String> SECRET_PROPERTY_NAMES = Set.of(
            "password", "username");
    private static final Set<String> MULTI_VALUE_PREFIXES = Set.of(
            "destination.");

    @Override
    public boolean isEnabled(String scheme) {
        return "activemq".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "destinationType", "queue", false, copy);
        uri = buildPathParameter(syntax, uri, "destinationName", null, true, copy);
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

