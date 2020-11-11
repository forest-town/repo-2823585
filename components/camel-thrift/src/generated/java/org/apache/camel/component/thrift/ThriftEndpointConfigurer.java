/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.thrift;

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
public class ThriftEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ThriftEndpoint target = (ThriftEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "clienttimeout":
        case "clientTimeout": target.getConfiguration().setClientTimeout(property(camelContext, int.class, value)); return true;
        case "compressiontype":
        case "compressionType": target.getConfiguration().setCompressionType(property(camelContext, org.apache.camel.component.thrift.ThriftCompressionType.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "exchangeprotocol":
        case "exchangeProtocol": target.getConfiguration().setExchangeProtocol(property(camelContext, org.apache.camel.component.thrift.ThriftExchangeProtocol.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxpoolsize":
        case "maxPoolSize": target.getConfiguration().setMaxPoolSize(property(camelContext, int.class, value)); return true;
        case "method": target.getConfiguration().setMethod(property(camelContext, java.lang.String.class, value)); return true;
        case "negotiationtype":
        case "negotiationType": target.getConfiguration().setNegotiationType(property(camelContext, org.apache.camel.component.thrift.ThriftNegotiationType.class, value)); return true;
        case "poolsize":
        case "poolSize": target.getConfiguration().setPoolSize(property(camelContext, int.class, value)); return true;
        case "sslparameters":
        case "sslParameters": target.getConfiguration().setSslParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "clienttimeout":
        case "clientTimeout": return int.class;
        case "compressiontype":
        case "compressionType": return org.apache.camel.component.thrift.ThriftCompressionType.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "exchangeprotocol":
        case "exchangeProtocol": return org.apache.camel.component.thrift.ThriftExchangeProtocol.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxpoolsize":
        case "maxPoolSize": return int.class;
        case "method": return java.lang.String.class;
        case "negotiationtype":
        case "negotiationType": return org.apache.camel.component.thrift.ThriftNegotiationType.class;
        case "poolsize":
        case "poolSize": return int.class;
        case "sslparameters":
        case "sslParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "synchronous": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        ThriftEndpoint target = (ThriftEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "clienttimeout":
        case "clientTimeout": return target.getConfiguration().getClientTimeout();
        case "compressiontype":
        case "compressionType": return target.getConfiguration().getCompressionType();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "exchangeprotocol":
        case "exchangeProtocol": return target.getConfiguration().getExchangeProtocol();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxpoolsize":
        case "maxPoolSize": return target.getConfiguration().getMaxPoolSize();
        case "method": return target.getConfiguration().getMethod();
        case "negotiationtype":
        case "negotiationType": return target.getConfiguration().getNegotiationType();
        case "poolsize":
        case "poolSize": return target.getConfiguration().getPoolSize();
        case "sslparameters":
        case "sslParameters": return target.getConfiguration().getSslParameters();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}

