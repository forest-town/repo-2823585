/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.olingo2;

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
public class Olingo2EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Olingo2Endpoint target = (Olingo2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "connecttimeout":
        case "connectTimeout": target.getConfiguration().setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "contenttype":
        case "contentType": target.getConfiguration().setContentType(property(camelContext, java.lang.String.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "entityproviderreadproperties":
        case "entityProviderReadProperties": target.getConfiguration().setEntityProviderReadProperties(property(camelContext, org.apache.olingo.odata2.api.ep.EntityProviderReadProperties.class, value)); return true;
        case "entityproviderwriteproperties":
        case "entityProviderWriteProperties": target.getConfiguration().setEntityProviderWriteProperties(property(camelContext, org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "filteralreadyseen":
        case "filterAlreadySeen": target.getConfiguration().setFilterAlreadySeen(property(camelContext, boolean.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "httpasyncclientbuilder":
        case "httpAsyncClientBuilder": target.getConfiguration().setHttpAsyncClientBuilder(property(camelContext, org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class, value)); return true;
        case "httpclientbuilder":
        case "httpClientBuilder": target.getConfiguration().setHttpClientBuilder(property(camelContext, org.apache.http.impl.client.HttpClientBuilder.class, value)); return true;
        case "httpheaders":
        case "httpHeaders": target.getConfiguration().setHttpHeaders(property(camelContext, java.util.Map.class, value)); return true;
        case "inbody":
        case "inBody": target.setInBody(property(camelContext, java.lang.String.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "proxy": target.getConfiguration().setProxy(property(camelContext, org.apache.http.HttpHost.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "serviceuri":
        case "serviceUri": target.getConfiguration().setServiceUri(property(camelContext, java.lang.String.class, value)); return true;
        case "sockettimeout":
        case "socketTimeout": target.getConfiguration().setSocketTimeout(property(camelContext, int.class, value)); return true;
        case "splitresult":
        case "splitResult": target.getConfiguration().setSplitResult(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return int.class;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return int.class;
        case "backoffmultiplier":
        case "backoffMultiplier": return int.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "connecttimeout":
        case "connectTimeout": return int.class;
        case "contenttype":
        case "contentType": return java.lang.String.class;
        case "delay": return long.class;
        case "entityproviderreadproperties":
        case "entityProviderReadProperties": return org.apache.olingo.odata2.api.ep.EntityProviderReadProperties.class;
        case "entityproviderwriteproperties":
        case "entityProviderWriteProperties": return org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "filteralreadyseen":
        case "filterAlreadySeen": return boolean.class;
        case "greedy": return boolean.class;
        case "httpasyncclientbuilder":
        case "httpAsyncClientBuilder": return org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class;
        case "httpclientbuilder":
        case "httpClientBuilder": return org.apache.http.impl.client.HttpClientBuilder.class;
        case "httpheaders":
        case "httpHeaders": return java.util.Map.class;
        case "inbody":
        case "inBody": return java.lang.String.class;
        case "initialdelay":
        case "initialDelay": return long.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "pollstrategy":
        case "pollStrategy": return org.apache.camel.spi.PollingConsumerPollStrategy.class;
        case "proxy": return org.apache.http.HttpHost.class;
        case "repeatcount":
        case "repeatCount": return long.class;
        case "runlogginglevel":
        case "runLoggingLevel": return org.apache.camel.LoggingLevel.class;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return java.util.concurrent.ScheduledExecutorService.class;
        case "scheduler": return java.lang.Object.class;
        case "schedulerproperties":
        case "schedulerProperties": return java.util.Map.class;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return boolean.class;
        case "serviceuri":
        case "serviceUri": return java.lang.String.class;
        case "sockettimeout":
        case "socketTimeout": return int.class;
        case "splitresult":
        case "splitResult": return boolean.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "startscheduler":
        case "startScheduler": return boolean.class;
        case "synchronous": return boolean.class;
        case "timeunit":
        case "timeUnit": return java.util.concurrent.TimeUnit.class;
        case "usefixeddelay":
        case "useFixedDelay": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Olingo2Endpoint target = (Olingo2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "connecttimeout":
        case "connectTimeout": return target.getConfiguration().getConnectTimeout();
        case "contenttype":
        case "contentType": return target.getConfiguration().getContentType();
        case "delay": return target.getDelay();
        case "entityproviderreadproperties":
        case "entityProviderReadProperties": return target.getConfiguration().getEntityProviderReadProperties();
        case "entityproviderwriteproperties":
        case "entityProviderWriteProperties": return target.getConfiguration().getEntityProviderWriteProperties();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "filteralreadyseen":
        case "filterAlreadySeen": return target.getConfiguration().isFilterAlreadySeen();
        case "greedy": return target.isGreedy();
        case "httpasyncclientbuilder":
        case "httpAsyncClientBuilder": return target.getConfiguration().getHttpAsyncClientBuilder();
        case "httpclientbuilder":
        case "httpClientBuilder": return target.getConfiguration().getHttpClientBuilder();
        case "httpheaders":
        case "httpHeaders": return target.getConfiguration().getHttpHeaders();
        case "inbody":
        case "inBody": return target.getInBody();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "proxy": return target.getConfiguration().getProxy();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "serviceuri":
        case "serviceUri": return target.getConfiguration().getServiceUri();
        case "sockettimeout":
        case "socketTimeout": return target.getConfiguration().getSocketTimeout();
        case "splitresult":
        case "splitResult": return target.getConfiguration().isSplitResult();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getConfiguration().getSslContextParameters();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "synchronous": return target.isSynchronous();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        default: return null;
        }
    }
}

