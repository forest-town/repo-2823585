/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.etcd;

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
public class EtcdKeysEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        EtcdKeysEndpoint target = (EtcdKeysEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "recursive": target.getConfiguration().setRecursive(property(camelContext, boolean.class, value)); return true;
        case "servicepath":
        case "servicePath": target.getConfiguration().setServicePath(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timetolive":
        case "timeToLive": target.getConfiguration().setTimeToLive(property(camelContext, java.lang.Integer.class, value)); return true;
        case "timeout": target.getConfiguration().setTimeout(property(camelContext, java.lang.Long.class, value)); return true;
        case "uris": target.getConfiguration().setUris(property(camelContext, java.lang.String.class, value)); return true;
        case "username":
        case "userName": target.getConfiguration().setUserName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "password": return java.lang.String.class;
        case "recursive": return boolean.class;
        case "servicepath":
        case "servicePath": return java.lang.String.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "synchronous": return boolean.class;
        case "timetolive":
        case "timeToLive": return java.lang.Integer.class;
        case "timeout": return java.lang.Long.class;
        case "uris": return java.lang.String.class;
        case "username":
        case "userName": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        EtcdKeysEndpoint target = (EtcdKeysEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "password": return target.getConfiguration().getPassword();
        case "recursive": return target.getConfiguration().isRecursive();
        case "servicepath":
        case "servicePath": return target.getConfiguration().getServicePath();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getConfiguration().getSslContextParameters();
        case "synchronous": return target.isSynchronous();
        case "timetolive":
        case "timeToLive": return target.getConfiguration().getTimeToLive();
        case "timeout": return target.getConfiguration().getTimeout();
        case "uris": return target.getConfiguration().getUris();
        case "username":
        case "userName": return target.getConfiguration().getUserName();
        default: return null;
        }
    }
}

