/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.rest.openapi;

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
public class RestOpenApiComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        RestOpenApiComponent target = (RestOpenApiComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "basepath":
        case "basePath": target.setBasePath(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "componentname":
        case "componentName": target.setComponentName(property(camelContext, java.lang.String.class, value)); return true;
        case "consumercomponentname":
        case "consumerComponentName": target.setConsumerComponentName(property(camelContext, java.lang.String.class, value)); return true;
        case "consumes": target.setConsumes(property(camelContext, java.lang.String.class, value)); return true;
        case "host": target.setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "missingoperation":
        case "missingOperation": target.setMissingOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "produces": target.setProduces(property(camelContext, java.lang.String.class, value)); return true;
        case "requestvalidationcustomizer":
        case "requestValidationCustomizer": target.setRequestValidationCustomizer(property(camelContext, org.apache.camel.component.rest.openapi.validator.RequestValidationCustomizer.class, value)); return true;
        case "requestvalidationenabled":
        case "requestValidationEnabled": target.setRequestValidationEnabled(property(camelContext, boolean.class, value)); return true;
        case "restopenapiprocessorstrategy":
        case "restOpenapiProcessorStrategy": target.setRestOpenapiProcessorStrategy(property(camelContext, org.apache.camel.component.rest.openapi.RestOpenapiProcessorStrategy.class, value)); return true;
        case "specificationuri":
        case "specificationUri": target.setSpecificationUri(property(camelContext, java.net.URI.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "basepath":
        case "basePath": return java.lang.String.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "componentname":
        case "componentName": return java.lang.String.class;
        case "consumercomponentname":
        case "consumerComponentName": return java.lang.String.class;
        case "consumes": return java.lang.String.class;
        case "host": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "missingoperation":
        case "missingOperation": return java.lang.String.class;
        case "produces": return java.lang.String.class;
        case "requestvalidationcustomizer":
        case "requestValidationCustomizer": return org.apache.camel.component.rest.openapi.validator.RequestValidationCustomizer.class;
        case "requestvalidationenabled":
        case "requestValidationEnabled": return boolean.class;
        case "restopenapiprocessorstrategy":
        case "restOpenapiProcessorStrategy": return org.apache.camel.component.rest.openapi.RestOpenapiProcessorStrategy.class;
        case "specificationuri":
        case "specificationUri": return java.net.URI.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        RestOpenApiComponent target = (RestOpenApiComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "basepath":
        case "basePath": return target.getBasePath();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "componentname":
        case "componentName": return target.getComponentName();
        case "consumercomponentname":
        case "consumerComponentName": return target.getConsumerComponentName();
        case "consumes": return target.getConsumes();
        case "host": return target.getHost();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "missingoperation":
        case "missingOperation": return target.getMissingOperation();
        case "produces": return target.getProduces();
        case "requestvalidationcustomizer":
        case "requestValidationCustomizer": return target.getRequestValidationCustomizer();
        case "requestvalidationenabled":
        case "requestValidationEnabled": return target.isRequestValidationEnabled();
        case "restopenapiprocessorstrategy":
        case "restOpenapiProcessorStrategy": return target.getRestOpenapiProcessorStrategy();
        case "specificationuri":
        case "specificationUri": return target.getSpecificationUri();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getSslContextParameters();
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return target.isUseGlobalSslContextParameters();
        default: return null;
        }
    }
}

