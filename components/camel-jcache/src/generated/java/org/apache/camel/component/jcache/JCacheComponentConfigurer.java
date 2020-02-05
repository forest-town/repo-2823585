/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jcache;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JCacheComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JCacheComponent target = (JCacheComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "cachingprovider":
        case "cachingProvider": target.setCachingProvider(property(camelContext, java.lang.String.class, value)); return true;
        case "cacheconfiguration":
        case "cacheConfiguration": target.setCacheConfiguration(property(camelContext, javax.cache.configuration.Configuration.class, value)); return true;
        case "cacheconfigurationproperties":
        case "cacheConfigurationProperties": target.setCacheConfigurationProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "cacheconfigurationpropertiesref":
        case "cacheConfigurationPropertiesRef": target.setCacheConfigurationPropertiesRef(property(camelContext, java.lang.String.class, value)); return true;
        case "configurationuri":
        case "configurationUri": target.setConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

