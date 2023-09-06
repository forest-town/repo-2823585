/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.springrabbit;

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
public class SpringRabbitMQEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SpringRabbitMQEndpoint target = (SpringRabbitMQEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acknowledgemode":
        case "acknowledgeMode": target.setAcknowledgeMode(property(camelContext, org.springframework.amqp.core.AcknowledgeMode.class, value)); return true;
        case "allownullbody":
        case "allowNullBody": target.setAllowNullBody(property(camelContext, boolean.class, value)); return true;
        case "args": target.setArgs(property(camelContext, java.util.Map.class, value)); return true;
        case "asyncconsumer":
        case "asyncConsumer": target.setAsyncConsumer(property(camelContext, boolean.class, value)); return true;
        case "autodeclare":
        case "autoDeclare": target.setAutoDeclare(property(camelContext, boolean.class, value)); return true;
        case "autostartup":
        case "autoStartup": target.setAutoStartup(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "concurrentconsumers":
        case "concurrentConsumers": target.setConcurrentConsumers(property(camelContext, java.lang.Integer.class, value)); return true;
        case "confirm": target.setConfirm(property(camelContext, java.lang.String.class, value)); return true;
        case "confirmtimeout":
        case "confirmTimeout": target.setConfirmTimeout(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "connectionfactory":
        case "connectionFactory": target.setConnectionFactory(property(camelContext, org.springframework.amqp.rabbit.connection.ConnectionFactory.class, value)); return true;
        case "deadletterexchange":
        case "deadLetterExchange": target.setDeadLetterExchange(property(camelContext, java.lang.String.class, value)); return true;
        case "deadletterexchangetype":
        case "deadLetterExchangeType": target.setDeadLetterExchangeType(property(camelContext, java.lang.String.class, value)); return true;
        case "deadletterqueue":
        case "deadLetterQueue": target.setDeadLetterQueue(property(camelContext, java.lang.String.class, value)); return true;
        case "deadletterroutingkey":
        case "deadLetterRoutingKey": target.setDeadLetterRoutingKey(property(camelContext, java.lang.String.class, value)); return true;
        case "disablereplyto":
        case "disableReplyTo": target.setDisableReplyTo(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "exchangetype":
        case "exchangeType": target.setExchangeType(property(camelContext, java.lang.String.class, value)); return true;
        case "exclusive": target.setExclusive(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxconcurrentconsumers":
        case "maxConcurrentConsumers": target.setMaxConcurrentConsumers(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maximumretryattempts":
        case "maximumRetryAttempts": target.setMaximumRetryAttempts(property(camelContext, int.class, value)); return true;
        case "messageconverter":
        case "messageConverter": target.setMessageConverter(property(camelContext, org.springframework.amqp.support.converter.MessageConverter.class, value)); return true;
        case "messagelistenercontainertype":
        case "messageListenerContainerType": target.setMessageListenerContainerType(property(camelContext, java.lang.String.class, value)); return true;
        case "messagepropertiesconverter":
        case "messagePropertiesConverter": target.setMessagePropertiesConverter(property(camelContext, org.apache.camel.component.springrabbit.MessagePropertiesConverter.class, value)); return true;
        case "nolocal":
        case "noLocal": target.setNoLocal(property(camelContext, boolean.class, value)); return true;
        case "prefetchcount":
        case "prefetchCount": target.setPrefetchCount(property(camelContext, java.lang.Integer.class, value)); return true;
        case "queues": target.setQueues(property(camelContext, java.lang.String.class, value)); return true;
        case "rejectanddontrequeue":
        case "rejectAndDontRequeue": target.setRejectAndDontRequeue(property(camelContext, boolean.class, value)); return true;
        case "replytimeout":
        case "replyTimeout": target.setReplyTimeout(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "retry": target.setRetry(property(camelContext, org.springframework.retry.interceptor.RetryOperationsInterceptor.class, value)); return true;
        case "retrydelay":
        case "retryDelay": target.setRetryDelay(property(camelContext, int.class, value)); return true;
        case "routingkey":
        case "routingKey": target.setRoutingKey(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "testconnectiononstartup":
        case "testConnectionOnStartup": target.setTestConnectionOnStartup(property(camelContext, boolean.class, value)); return true;
        case "usepublisherconnection":
        case "usePublisherConnection": target.setUsePublisherConnection(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acknowledgemode":
        case "acknowledgeMode": return org.springframework.amqp.core.AcknowledgeMode.class;
        case "allownullbody":
        case "allowNullBody": return boolean.class;
        case "args": return java.util.Map.class;
        case "asyncconsumer":
        case "asyncConsumer": return boolean.class;
        case "autodeclare":
        case "autoDeclare": return boolean.class;
        case "autostartup":
        case "autoStartup": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "concurrentconsumers":
        case "concurrentConsumers": return java.lang.Integer.class;
        case "confirm": return java.lang.String.class;
        case "confirmtimeout":
        case "confirmTimeout": return long.class;
        case "connectionfactory":
        case "connectionFactory": return org.springframework.amqp.rabbit.connection.ConnectionFactory.class;
        case "deadletterexchange":
        case "deadLetterExchange": return java.lang.String.class;
        case "deadletterexchangetype":
        case "deadLetterExchangeType": return java.lang.String.class;
        case "deadletterqueue":
        case "deadLetterQueue": return java.lang.String.class;
        case "deadletterroutingkey":
        case "deadLetterRoutingKey": return java.lang.String.class;
        case "disablereplyto":
        case "disableReplyTo": return boolean.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "exchangetype":
        case "exchangeType": return java.lang.String.class;
        case "exclusive": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxconcurrentconsumers":
        case "maxConcurrentConsumers": return java.lang.Integer.class;
        case "maximumretryattempts":
        case "maximumRetryAttempts": return int.class;
        case "messageconverter":
        case "messageConverter": return org.springframework.amqp.support.converter.MessageConverter.class;
        case "messagelistenercontainertype":
        case "messageListenerContainerType": return java.lang.String.class;
        case "messagepropertiesconverter":
        case "messagePropertiesConverter": return org.apache.camel.component.springrabbit.MessagePropertiesConverter.class;
        case "nolocal":
        case "noLocal": return boolean.class;
        case "prefetchcount":
        case "prefetchCount": return java.lang.Integer.class;
        case "queues": return java.lang.String.class;
        case "rejectanddontrequeue":
        case "rejectAndDontRequeue": return boolean.class;
        case "replytimeout":
        case "replyTimeout": return long.class;
        case "retry": return org.springframework.retry.interceptor.RetryOperationsInterceptor.class;
        case "retrydelay":
        case "retryDelay": return int.class;
        case "routingkey":
        case "routingKey": return java.lang.String.class;
        case "synchronous": return boolean.class;
        case "testconnectiononstartup":
        case "testConnectionOnStartup": return boolean.class;
        case "usepublisherconnection":
        case "usePublisherConnection": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SpringRabbitMQEndpoint target = (SpringRabbitMQEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acknowledgemode":
        case "acknowledgeMode": return target.getAcknowledgeMode();
        case "allownullbody":
        case "allowNullBody": return target.isAllowNullBody();
        case "args": return target.getArgs();
        case "asyncconsumer":
        case "asyncConsumer": return target.isAsyncConsumer();
        case "autodeclare":
        case "autoDeclare": return target.isAutoDeclare();
        case "autostartup":
        case "autoStartup": return target.isAutoStartup();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "concurrentconsumers":
        case "concurrentConsumers": return target.getConcurrentConsumers();
        case "confirm": return target.getConfirm();
        case "confirmtimeout":
        case "confirmTimeout": return target.getConfirmTimeout();
        case "connectionfactory":
        case "connectionFactory": return target.getConnectionFactory();
        case "deadletterexchange":
        case "deadLetterExchange": return target.getDeadLetterExchange();
        case "deadletterexchangetype":
        case "deadLetterExchangeType": return target.getDeadLetterExchangeType();
        case "deadletterqueue":
        case "deadLetterQueue": return target.getDeadLetterQueue();
        case "deadletterroutingkey":
        case "deadLetterRoutingKey": return target.getDeadLetterRoutingKey();
        case "disablereplyto":
        case "disableReplyTo": return target.isDisableReplyTo();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "exchangetype":
        case "exchangeType": return target.getExchangeType();
        case "exclusive": return target.isExclusive();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxconcurrentconsumers":
        case "maxConcurrentConsumers": return target.getMaxConcurrentConsumers();
        case "maximumretryattempts":
        case "maximumRetryAttempts": return target.getMaximumRetryAttempts();
        case "messageconverter":
        case "messageConverter": return target.getMessageConverter();
        case "messagelistenercontainertype":
        case "messageListenerContainerType": return target.getMessageListenerContainerType();
        case "messagepropertiesconverter":
        case "messagePropertiesConverter": return target.getMessagePropertiesConverter();
        case "nolocal":
        case "noLocal": return target.isNoLocal();
        case "prefetchcount":
        case "prefetchCount": return target.getPrefetchCount();
        case "queues": return target.getQueues();
        case "rejectanddontrequeue":
        case "rejectAndDontRequeue": return target.isRejectAndDontRequeue();
        case "replytimeout":
        case "replyTimeout": return target.getReplyTimeout();
        case "retry": return target.getRetry();
        case "retrydelay":
        case "retryDelay": return target.getRetryDelay();
        case "routingkey":
        case "routingKey": return target.getRoutingKey();
        case "synchronous": return target.isSynchronous();
        case "testconnectiononstartup":
        case "testConnectionOnStartup": return target.isTestConnectionOnStartup();
        case "usepublisherconnection":
        case "usePublisherConnection": return target.isUsePublisherConnection();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "args": return java.lang.Object.class;
        default: return null;
        }
    }
}

