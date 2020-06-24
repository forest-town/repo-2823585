/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.pulsar;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class PulsarComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.pulsar.PulsarConfiguration getOrCreateConfiguration(PulsarComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.pulsar.PulsarConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        PulsarComponent target = (PulsarComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "ackgrouptimemillis":
        case "ackGroupTimeMillis": getOrCreateConfiguration(target).setAckGroupTimeMillis(property(camelContext, long.class, value)); return true;
        case "acktimeoutmillis":
        case "ackTimeoutMillis": getOrCreateConfiguration(target).setAckTimeoutMillis(property(camelContext, long.class, value)); return true;
        case "allowmanualacknowledgement":
        case "allowManualAcknowledgement": getOrCreateConfiguration(target).setAllowManualAcknowledgement(property(camelContext, boolean.class, value)); return true;
        case "autoconfiguration":
        case "autoConfiguration": target.setAutoConfiguration(property(camelContext, org.apache.camel.component.pulsar.utils.AutoConfiguration.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "batcherbuilder":
        case "batcherBuilder": getOrCreateConfiguration(target).setBatcherBuilder(property(camelContext, org.apache.pulsar.client.api.BatcherBuilder.class, value)); return true;
        case "batchingenabled":
        case "batchingEnabled": getOrCreateConfiguration(target).setBatchingEnabled(property(camelContext, boolean.class, value)); return true;
        case "batchingmaxmessages":
        case "batchingMaxMessages": getOrCreateConfiguration(target).setBatchingMaxMessages(property(camelContext, int.class, value)); return true;
        case "batchingmaxpublishdelaymicros":
        case "batchingMaxPublishDelayMicros": getOrCreateConfiguration(target).setBatchingMaxPublishDelayMicros(property(camelContext, long.class, value)); return true;
        case "blockifqueuefull":
        case "blockIfQueueFull": getOrCreateConfiguration(target).setBlockIfQueueFull(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "compressiontype":
        case "compressionType": getOrCreateConfiguration(target).setCompressionType(property(camelContext, org.apache.pulsar.client.api.CompressionType.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.pulsar.PulsarConfiguration.class, value)); return true;
        case "consumername":
        case "consumerName": getOrCreateConfiguration(target).setConsumerName(property(camelContext, java.lang.String.class, value)); return true;
        case "consumernameprefix":
        case "consumerNamePrefix": getOrCreateConfiguration(target).setConsumerNamePrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "consumerqueuesize":
        case "consumerQueueSize": getOrCreateConfiguration(target).setConsumerQueueSize(property(camelContext, int.class, value)); return true;
        case "deadlettertopic":
        case "deadLetterTopic": getOrCreateConfiguration(target).setDeadLetterTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "initialsequenceid":
        case "initialSequenceId": getOrCreateConfiguration(target).setInitialSequenceId(property(camelContext, long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxpendingmessages":
        case "maxPendingMessages": getOrCreateConfiguration(target).setMaxPendingMessages(property(camelContext, int.class, value)); return true;
        case "maxpendingmessagesacrosspartitions":
        case "maxPendingMessagesAcrossPartitions": getOrCreateConfiguration(target).setMaxPendingMessagesAcrossPartitions(property(camelContext, int.class, value)); return true;
        case "maxredelivercount":
        case "maxRedeliverCount": getOrCreateConfiguration(target).setMaxRedeliverCount(property(camelContext, java.lang.Integer.class, value)); return true;
        case "messagerouter":
        case "messageRouter": getOrCreateConfiguration(target).setMessageRouter(property(camelContext, org.apache.pulsar.client.api.MessageRouter.class, value)); return true;
        case "messageroutingmode":
        case "messageRoutingMode": getOrCreateConfiguration(target).setMessageRoutingMode(property(camelContext, org.apache.pulsar.client.api.MessageRoutingMode.class, value)); return true;
        case "negativeackredeliverydelaymicros":
        case "negativeAckRedeliveryDelayMicros": getOrCreateConfiguration(target).setNegativeAckRedeliveryDelayMicros(property(camelContext, long.class, value)); return true;
        case "numberofconsumers":
        case "numberOfConsumers": getOrCreateConfiguration(target).setNumberOfConsumers(property(camelContext, int.class, value)); return true;
        case "producername":
        case "producerName": getOrCreateConfiguration(target).setProducerName(property(camelContext, java.lang.String.class, value)); return true;
        case "pulsarclient":
        case "pulsarClient": target.setPulsarClient(property(camelContext, org.apache.pulsar.client.api.PulsarClient.class, value)); return true;
        case "pulsarmessagereceiptfactory":
        case "pulsarMessageReceiptFactory": target.setPulsarMessageReceiptFactory(property(camelContext, org.apache.camel.component.pulsar.PulsarMessageReceiptFactory.class, value)); return true;
        case "sendtimeoutms":
        case "sendTimeoutMs": getOrCreateConfiguration(target).setSendTimeoutMs(property(camelContext, int.class, value)); return true;
        case "subscriptioninitialposition":
        case "subscriptionInitialPosition": getOrCreateConfiguration(target).setSubscriptionInitialPosition(property(camelContext, org.apache.camel.component.pulsar.utils.consumers.SubscriptionInitialPosition.class, value)); return true;
        case "subscriptionname":
        case "subscriptionName": getOrCreateConfiguration(target).setSubscriptionName(property(camelContext, java.lang.String.class, value)); return true;
        case "subscriptiontype":
        case "subscriptionType": getOrCreateConfiguration(target).setSubscriptionType(property(camelContext, org.apache.camel.component.pulsar.utils.consumers.SubscriptionType.class, value)); return true;
        case "topicspattern":
        case "topicsPattern": getOrCreateConfiguration(target).setTopicsPattern(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("ackGroupTimeMillis", long.class);
        answer.put("ackTimeoutMillis", long.class);
        answer.put("allowManualAcknowledgement", boolean.class);
        answer.put("autoConfiguration", org.apache.camel.component.pulsar.utils.AutoConfiguration.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("batcherBuilder", org.apache.pulsar.client.api.BatcherBuilder.class);
        answer.put("batchingEnabled", boolean.class);
        answer.put("batchingMaxMessages", int.class);
        answer.put("batchingMaxPublishDelayMicros", long.class);
        answer.put("blockIfQueueFull", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("compressionType", org.apache.pulsar.client.api.CompressionType.class);
        answer.put("configuration", org.apache.camel.component.pulsar.PulsarConfiguration.class);
        answer.put("consumerName", java.lang.String.class);
        answer.put("consumerNamePrefix", java.lang.String.class);
        answer.put("consumerQueueSize", int.class);
        answer.put("deadLetterTopic", java.lang.String.class);
        answer.put("initialSequenceId", long.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("maxPendingMessages", int.class);
        answer.put("maxPendingMessagesAcrossPartitions", int.class);
        answer.put("maxRedeliverCount", java.lang.Integer.class);
        answer.put("messageRouter", org.apache.pulsar.client.api.MessageRouter.class);
        answer.put("messageRoutingMode", org.apache.pulsar.client.api.MessageRoutingMode.class);
        answer.put("negativeAckRedeliveryDelayMicros", long.class);
        answer.put("numberOfConsumers", int.class);
        answer.put("producerName", java.lang.String.class);
        answer.put("pulsarClient", org.apache.pulsar.client.api.PulsarClient.class);
        answer.put("pulsarMessageReceiptFactory", org.apache.camel.component.pulsar.PulsarMessageReceiptFactory.class);
        answer.put("sendTimeoutMs", int.class);
        answer.put("subscriptionInitialPosition", org.apache.camel.component.pulsar.utils.consumers.SubscriptionInitialPosition.class);
        answer.put("subscriptionName", java.lang.String.class);
        answer.put("subscriptionType", org.apache.camel.component.pulsar.utils.consumers.SubscriptionType.class);
        answer.put("topicsPattern", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        PulsarComponent target = (PulsarComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "ackgrouptimemillis":
        case "ackGroupTimeMillis": return getOrCreateConfiguration(target).getAckGroupTimeMillis();
        case "acktimeoutmillis":
        case "ackTimeoutMillis": return getOrCreateConfiguration(target).getAckTimeoutMillis();
        case "allowmanualacknowledgement":
        case "allowManualAcknowledgement": return getOrCreateConfiguration(target).isAllowManualAcknowledgement();
        case "autoconfiguration":
        case "autoConfiguration": return target.getAutoConfiguration();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "batcherbuilder":
        case "batcherBuilder": return getOrCreateConfiguration(target).getBatcherBuilder();
        case "batchingenabled":
        case "batchingEnabled": return getOrCreateConfiguration(target).isBatchingEnabled();
        case "batchingmaxmessages":
        case "batchingMaxMessages": return getOrCreateConfiguration(target).getBatchingMaxMessages();
        case "batchingmaxpublishdelaymicros":
        case "batchingMaxPublishDelayMicros": return getOrCreateConfiguration(target).getBatchingMaxPublishDelayMicros();
        case "blockifqueuefull":
        case "blockIfQueueFull": return getOrCreateConfiguration(target).isBlockIfQueueFull();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "compressiontype":
        case "compressionType": return getOrCreateConfiguration(target).getCompressionType();
        case "configuration": return target.getConfiguration();
        case "consumername":
        case "consumerName": return getOrCreateConfiguration(target).getConsumerName();
        case "consumernameprefix":
        case "consumerNamePrefix": return getOrCreateConfiguration(target).getConsumerNamePrefix();
        case "consumerqueuesize":
        case "consumerQueueSize": return getOrCreateConfiguration(target).getConsumerQueueSize();
        case "deadlettertopic":
        case "deadLetterTopic": return getOrCreateConfiguration(target).getDeadLetterTopic();
        case "initialsequenceid":
        case "initialSequenceId": return getOrCreateConfiguration(target).getInitialSequenceId();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxpendingmessages":
        case "maxPendingMessages": return getOrCreateConfiguration(target).getMaxPendingMessages();
        case "maxpendingmessagesacrosspartitions":
        case "maxPendingMessagesAcrossPartitions": return getOrCreateConfiguration(target).getMaxPendingMessagesAcrossPartitions();
        case "maxredelivercount":
        case "maxRedeliverCount": return getOrCreateConfiguration(target).getMaxRedeliverCount();
        case "messagerouter":
        case "messageRouter": return getOrCreateConfiguration(target).getMessageRouter();
        case "messageroutingmode":
        case "messageRoutingMode": return getOrCreateConfiguration(target).getMessageRoutingMode();
        case "negativeackredeliverydelaymicros":
        case "negativeAckRedeliveryDelayMicros": return getOrCreateConfiguration(target).getNegativeAckRedeliveryDelayMicros();
        case "numberofconsumers":
        case "numberOfConsumers": return getOrCreateConfiguration(target).getNumberOfConsumers();
        case "producername":
        case "producerName": return getOrCreateConfiguration(target).getProducerName();
        case "pulsarclient":
        case "pulsarClient": return target.getPulsarClient();
        case "pulsarmessagereceiptfactory":
        case "pulsarMessageReceiptFactory": return target.getPulsarMessageReceiptFactory();
        case "sendtimeoutms":
        case "sendTimeoutMs": return getOrCreateConfiguration(target).getSendTimeoutMs();
        case "subscriptioninitialposition":
        case "subscriptionInitialPosition": return getOrCreateConfiguration(target).getSubscriptionInitialPosition();
        case "subscriptionname":
        case "subscriptionName": return getOrCreateConfiguration(target).getSubscriptionName();
        case "subscriptiontype":
        case "subscriptionType": return getOrCreateConfiguration(target).getSubscriptionType();
        case "topicspattern":
        case "topicsPattern": return getOrCreateConfiguration(target).isTopicsPattern();
        default: return null;
        }
    }
}

