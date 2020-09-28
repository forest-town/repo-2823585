/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.rabbitmq;

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
public class RabbitMQComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("addresses", java.lang.String.class);
        map.put("autoDelete", boolean.class);
        map.put("connectionFactory", com.rabbitmq.client.ConnectionFactory.class);
        map.put("deadLetterExchange", java.lang.String.class);
        map.put("deadLetterExchangeType", java.lang.String.class);
        map.put("deadLetterQueue", java.lang.String.class);
        map.put("deadLetterRoutingKey", java.lang.String.class);
        map.put("declare", boolean.class);
        map.put("durable", boolean.class);
        map.put("exclusive", boolean.class);
        map.put("hostname", java.lang.String.class);
        map.put("passive", boolean.class);
        map.put("portNumber", int.class);
        map.put("skipExchangeDeclare", boolean.class);
        map.put("skipQueueBind", boolean.class);
        map.put("skipQueueDeclare", boolean.class);
        map.put("vhost", java.lang.String.class);
        map.put("autoAck", boolean.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("exclusiveConsumer", boolean.class);
        map.put("prefetchCount", int.class);
        map.put("prefetchEnabled", boolean.class);
        map.put("prefetchGlobal", boolean.class);
        map.put("prefetchSize", int.class);
        map.put("threadPoolSize", int.class);
        map.put("allowNullHeaders", boolean.class);
        map.put("channelPoolMaxSize", int.class);
        map.put("channelPoolMaxWait", long.class);
        map.put("guaranteedDeliveries", boolean.class);
        map.put("immediate", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("mandatory", boolean.class);
        map.put("publisherAcknowledgements", boolean.class);
        map.put("publisherAcknowledgementsTimeout", long.class);
        map.put("args", java.util.Map.class);
        map.put("autoDetectConnectionFactory", boolean.class);
        map.put("automaticRecoveryEnabled", java.lang.Boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("clientProperties", java.util.Map.class);
        map.put("connectionFactoryExceptionHandler", com.rabbitmq.client.ExceptionHandler.class);
        map.put("connectionTimeout", int.class);
        map.put("networkRecoveryInterval", java.lang.Integer.class);
        map.put("requestedChannelMax", int.class);
        map.put("requestedFrameMax", int.class);
        map.put("requestedHeartbeat", int.class);
        map.put("requestTimeout", long.class);
        map.put("requestTimeoutCheckerInterval", long.class);
        map.put("topologyRecoveryEnabled", java.lang.Boolean.class);
        map.put("transferException", boolean.class);
        map.put("password", java.lang.String.class);
        map.put("sslProtocol", java.lang.String.class);
        map.put("trustManager", javax.net.ssl.TrustManager.class);
        map.put("username", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        RabbitMQComponent target = (RabbitMQComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "addresses": target.setAddresses(property(camelContext, java.lang.String.class, value)); return true;
        case "allownullheaders":
        case "allowNullHeaders": target.setAllowNullHeaders(property(camelContext, boolean.class, value)); return true;
        case "args": target.setArgs(property(camelContext, java.util.Map.class, value)); return true;
        case "autoack":
        case "autoAck": target.setAutoAck(property(camelContext, boolean.class, value)); return true;
        case "autodelete":
        case "autoDelete": target.setAutoDelete(property(camelContext, boolean.class, value)); return true;
        case "autodetectconnectionfactory":
        case "autoDetectConnectionFactory": target.setAutoDetectConnectionFactory(property(camelContext, boolean.class, value)); return true;
        case "automaticrecoveryenabled":
        case "automaticRecoveryEnabled": target.setAutomaticRecoveryEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "channelpoolmaxsize":
        case "channelPoolMaxSize": target.setChannelPoolMaxSize(property(camelContext, int.class, value)); return true;
        case "channelpoolmaxwait":
        case "channelPoolMaxWait": target.setChannelPoolMaxWait(property(camelContext, long.class, value)); return true;
        case "clientproperties":
        case "clientProperties": target.setClientProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "connectionfactory":
        case "connectionFactory": target.setConnectionFactory(property(camelContext, com.rabbitmq.client.ConnectionFactory.class, value)); return true;
        case "connectionfactoryexceptionhandler":
        case "connectionFactoryExceptionHandler": target.setConnectionFactoryExceptionHandler(property(camelContext, com.rabbitmq.client.ExceptionHandler.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": target.setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "deadletterexchange":
        case "deadLetterExchange": target.setDeadLetterExchange(property(camelContext, java.lang.String.class, value)); return true;
        case "deadletterexchangetype":
        case "deadLetterExchangeType": target.setDeadLetterExchangeType(property(camelContext, java.lang.String.class, value)); return true;
        case "deadletterqueue":
        case "deadLetterQueue": target.setDeadLetterQueue(property(camelContext, java.lang.String.class, value)); return true;
        case "deadletterroutingkey":
        case "deadLetterRoutingKey": target.setDeadLetterRoutingKey(property(camelContext, java.lang.String.class, value)); return true;
        case "declare": target.setDeclare(property(camelContext, boolean.class, value)); return true;
        case "durable": target.setDurable(property(camelContext, boolean.class, value)); return true;
        case "exclusive": target.setExclusive(property(camelContext, boolean.class, value)); return true;
        case "exclusiveconsumer":
        case "exclusiveConsumer": target.setExclusiveConsumer(property(camelContext, boolean.class, value)); return true;
        case "guaranteeddeliveries":
        case "guaranteedDeliveries": target.setGuaranteedDeliveries(property(camelContext, boolean.class, value)); return true;
        case "hostname": target.setHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "immediate": target.setImmediate(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mandatory": target.setMandatory(property(camelContext, boolean.class, value)); return true;
        case "networkrecoveryinterval":
        case "networkRecoveryInterval": target.setNetworkRecoveryInterval(property(camelContext, java.lang.Integer.class, value)); return true;
        case "passive": target.setPassive(property(camelContext, boolean.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "portnumber":
        case "portNumber": target.setPortNumber(property(camelContext, int.class, value)); return true;
        case "prefetchcount":
        case "prefetchCount": target.setPrefetchCount(property(camelContext, int.class, value)); return true;
        case "prefetchenabled":
        case "prefetchEnabled": target.setPrefetchEnabled(property(camelContext, boolean.class, value)); return true;
        case "prefetchglobal":
        case "prefetchGlobal": target.setPrefetchGlobal(property(camelContext, boolean.class, value)); return true;
        case "prefetchsize":
        case "prefetchSize": target.setPrefetchSize(property(camelContext, int.class, value)); return true;
        case "publisheracknowledgements":
        case "publisherAcknowledgements": target.setPublisherAcknowledgements(property(camelContext, boolean.class, value)); return true;
        case "publisheracknowledgementstimeout":
        case "publisherAcknowledgementsTimeout": target.setPublisherAcknowledgementsTimeout(property(camelContext, long.class, value)); return true;
        case "requesttimeout":
        case "requestTimeout": target.setRequestTimeout(property(camelContext, long.class, value)); return true;
        case "requesttimeoutcheckerinterval":
        case "requestTimeoutCheckerInterval": target.setRequestTimeoutCheckerInterval(property(camelContext, long.class, value)); return true;
        case "requestedchannelmax":
        case "requestedChannelMax": target.setRequestedChannelMax(property(camelContext, int.class, value)); return true;
        case "requestedframemax":
        case "requestedFrameMax": target.setRequestedFrameMax(property(camelContext, int.class, value)); return true;
        case "requestedheartbeat":
        case "requestedHeartbeat": target.setRequestedHeartbeat(property(camelContext, int.class, value)); return true;
        case "skipexchangedeclare":
        case "skipExchangeDeclare": target.setSkipExchangeDeclare(property(camelContext, boolean.class, value)); return true;
        case "skipqueuebind":
        case "skipQueueBind": target.setSkipQueueBind(property(camelContext, boolean.class, value)); return true;
        case "skipqueuedeclare":
        case "skipQueueDeclare": target.setSkipQueueDeclare(property(camelContext, boolean.class, value)); return true;
        case "sslprotocol":
        case "sslProtocol": target.setSslProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "threadpoolsize":
        case "threadPoolSize": target.setThreadPoolSize(property(camelContext, int.class, value)); return true;
        case "topologyrecoveryenabled":
        case "topologyRecoveryEnabled": target.setTopologyRecoveryEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "transferexception":
        case "transferException": target.setTransferException(property(camelContext, boolean.class, value)); return true;
        case "trustmanager":
        case "trustManager": target.setTrustManager(property(camelContext, javax.net.ssl.TrustManager.class, value)); return true;
        case "username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "vhost": target.setVhost(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        RabbitMQComponent target = (RabbitMQComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "addresses": return target.getAddresses();
        case "allownullheaders":
        case "allowNullHeaders": return target.isAllowNullHeaders();
        case "args": return target.getArgs();
        case "autoack":
        case "autoAck": return target.isAutoAck();
        case "autodelete":
        case "autoDelete": return target.isAutoDelete();
        case "autodetectconnectionfactory":
        case "autoDetectConnectionFactory": return target.isAutoDetectConnectionFactory();
        case "automaticrecoveryenabled":
        case "automaticRecoveryEnabled": return target.getAutomaticRecoveryEnabled();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "channelpoolmaxsize":
        case "channelPoolMaxSize": return target.getChannelPoolMaxSize();
        case "channelpoolmaxwait":
        case "channelPoolMaxWait": return target.getChannelPoolMaxWait();
        case "clientproperties":
        case "clientProperties": return target.getClientProperties();
        case "connectionfactory":
        case "connectionFactory": return target.getConnectionFactory();
        case "connectionfactoryexceptionhandler":
        case "connectionFactoryExceptionHandler": return target.getConnectionFactoryExceptionHandler();
        case "connectiontimeout":
        case "connectionTimeout": return target.getConnectionTimeout();
        case "deadletterexchange":
        case "deadLetterExchange": return target.getDeadLetterExchange();
        case "deadletterexchangetype":
        case "deadLetterExchangeType": return target.getDeadLetterExchangeType();
        case "deadletterqueue":
        case "deadLetterQueue": return target.getDeadLetterQueue();
        case "deadletterroutingkey":
        case "deadLetterRoutingKey": return target.getDeadLetterRoutingKey();
        case "declare": return target.isDeclare();
        case "durable": return target.isDurable();
        case "exclusive": return target.isExclusive();
        case "exclusiveconsumer":
        case "exclusiveConsumer": return target.isExclusiveConsumer();
        case "guaranteeddeliveries":
        case "guaranteedDeliveries": return target.isGuaranteedDeliveries();
        case "hostname": return target.getHostname();
        case "immediate": return target.isImmediate();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "mandatory": return target.isMandatory();
        case "networkrecoveryinterval":
        case "networkRecoveryInterval": return target.getNetworkRecoveryInterval();
        case "passive": return target.isPassive();
        case "password": return target.getPassword();
        case "portnumber":
        case "portNumber": return target.getPortNumber();
        case "prefetchcount":
        case "prefetchCount": return target.getPrefetchCount();
        case "prefetchenabled":
        case "prefetchEnabled": return target.isPrefetchEnabled();
        case "prefetchglobal":
        case "prefetchGlobal": return target.isPrefetchGlobal();
        case "prefetchsize":
        case "prefetchSize": return target.getPrefetchSize();
        case "publisheracknowledgements":
        case "publisherAcknowledgements": return target.isPublisherAcknowledgements();
        case "publisheracknowledgementstimeout":
        case "publisherAcknowledgementsTimeout": return target.getPublisherAcknowledgementsTimeout();
        case "requesttimeout":
        case "requestTimeout": return target.getRequestTimeout();
        case "requesttimeoutcheckerinterval":
        case "requestTimeoutCheckerInterval": return target.getRequestTimeoutCheckerInterval();
        case "requestedchannelmax":
        case "requestedChannelMax": return target.getRequestedChannelMax();
        case "requestedframemax":
        case "requestedFrameMax": return target.getRequestedFrameMax();
        case "requestedheartbeat":
        case "requestedHeartbeat": return target.getRequestedHeartbeat();
        case "skipexchangedeclare":
        case "skipExchangeDeclare": return target.isSkipExchangeDeclare();
        case "skipqueuebind":
        case "skipQueueBind": return target.isSkipQueueBind();
        case "skipqueuedeclare":
        case "skipQueueDeclare": return target.isSkipQueueDeclare();
        case "sslprotocol":
        case "sslProtocol": return target.getSslProtocol();
        case "threadpoolsize":
        case "threadPoolSize": return target.getThreadPoolSize();
        case "topologyrecoveryenabled":
        case "topologyRecoveryEnabled": return target.getTopologyRecoveryEnabled();
        case "transferexception":
        case "transferException": return target.isTransferException();
        case "trustmanager":
        case "trustManager": return target.getTrustManager();
        case "username": return target.getUsername();
        case "vhost": return target.getVhost();
        default: return null;
        }
    }
}

