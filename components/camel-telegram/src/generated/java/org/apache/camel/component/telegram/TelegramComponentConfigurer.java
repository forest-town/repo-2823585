/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.telegram;

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
public class TelegramComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        TelegramComponent target = (TelegramComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authorizationtoken":
        case "authorizationToken": target.setAuthorizationToken(property(camelContext, java.lang.String.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "baseuri":
        case "baseUri": target.setBaseUri(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "client": target.setClient(property(camelContext, java.net.http.HttpClient.class, value)); return true;
        case "healthcheckconsumerenabled":
        case "healthCheckConsumerEnabled": target.setHealthCheckConsumerEnabled(property(camelContext, boolean.class, value)); return true;
        case "healthcheckproducerenabled":
        case "healthCheckProducerEnabled": target.setHealthCheckProducerEnabled(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authorizationtoken":
        case "authorizationToken": return java.lang.String.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "baseuri":
        case "baseUri": return java.lang.String.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "client": return java.net.http.HttpClient.class;
        case "healthcheckconsumerenabled":
        case "healthCheckConsumerEnabled": return boolean.class;
        case "healthcheckproducerenabled":
        case "healthCheckProducerEnabled": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        TelegramComponent target = (TelegramComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authorizationtoken":
        case "authorizationToken": return target.getAuthorizationToken();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "baseuri":
        case "baseUri": return target.getBaseUri();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "client": return target.getClient();
        case "healthcheckconsumerenabled":
        case "healthCheckConsumerEnabled": return target.isHealthCheckConsumerEnabled();
        case "healthcheckproducerenabled":
        case "healthCheckProducerEnabled": return target.isHealthCheckProducerEnabled();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        default: return null;
        }
    }
}

