/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.cometd;

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
public class CometdEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CometdEndpoint target = (CometdEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowedorigins":
        case "allowedOrigins": target.setAllowedOrigins(property(camelContext, java.lang.String.class, value)); return true;
        case "baseresource":
        case "baseResource": target.setBaseResource(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "crossoriginfilteron":
        case "crossOriginFilterOn": target.setCrossOriginFilterOn(property(camelContext, boolean.class, value)); return true;
        case "disconnectlocalsession":
        case "disconnectLocalSession": target.setDisconnectLocalSession(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "filterpath":
        case "filterPath": target.setFilterPath(property(camelContext, java.lang.String.class, value)); return true;
        case "interval": target.setInterval(property(camelContext, int.class, value)); return true;
        case "jsoncommented":
        case "jsonCommented": target.setJsonCommented(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "loglevel":
        case "logLevel": target.setLogLevel(property(camelContext, int.class, value)); return true;
        case "maxinterval":
        case "maxInterval": target.setMaxInterval(property(camelContext, int.class, value)); return true;
        case "multiframeinterval":
        case "multiFrameInterval": target.setMultiFrameInterval(property(camelContext, int.class, value)); return true;
        case "sessionheadersenabled":
        case "sessionHeadersEnabled": target.setSessionHeadersEnabled(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeout": target.setTimeout(property(camelContext, int.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowedorigins":
        case "allowedOrigins": return java.lang.String.class;
        case "baseresource":
        case "baseResource": return java.lang.String.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "crossoriginfilteron":
        case "crossOriginFilterOn": return boolean.class;
        case "disconnectlocalsession":
        case "disconnectLocalSession": return boolean.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "filterpath":
        case "filterPath": return java.lang.String.class;
        case "interval": return int.class;
        case "jsoncommented":
        case "jsonCommented": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "loglevel":
        case "logLevel": return int.class;
        case "maxinterval":
        case "maxInterval": return int.class;
        case "multiframeinterval":
        case "multiFrameInterval": return int.class;
        case "sessionheadersenabled":
        case "sessionHeadersEnabled": return boolean.class;
        case "synchronous": return boolean.class;
        case "timeout": return int.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        CometdEndpoint target = (CometdEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowedorigins":
        case "allowedOrigins": return target.getAllowedOrigins();
        case "baseresource":
        case "baseResource": return target.getBaseResource();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "crossoriginfilteron":
        case "crossOriginFilterOn": return target.isCrossOriginFilterOn();
        case "disconnectlocalsession":
        case "disconnectLocalSession": return target.isDisconnectLocalSession();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "filterpath":
        case "filterPath": return target.getFilterPath();
        case "interval": return target.getInterval();
        case "jsoncommented":
        case "jsonCommented": return target.isJsonCommented();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "loglevel":
        case "logLevel": return target.getLogLevel();
        case "maxinterval":
        case "maxInterval": return target.getMaxInterval();
        case "multiframeinterval":
        case "multiFrameInterval": return target.getMultiFrameInterval();
        case "sessionheadersenabled":
        case "sessionHeadersEnabled": return target.isSessionHeadersEnabled();
        case "synchronous": return target.isSynchronous();
        case "timeout": return target.getTimeout();
        default: return null;
        }
    }
}

