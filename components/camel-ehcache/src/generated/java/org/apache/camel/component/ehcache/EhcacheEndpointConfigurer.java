/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ehcache;

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
public class EhcacheEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("cacheName", java.lang.String.class);
        map.put("cacheManager", org.ehcache.CacheManager.class);
        map.put("cacheManagerConfiguration", org.ehcache.config.Configuration.class);
        map.put("configurationUri", java.lang.String.class);
        map.put("createCacheIfNotExist", boolean.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("eventFiring", org.ehcache.event.EventFiring.class);
        map.put("eventOrdering", org.ehcache.event.EventOrdering.class);
        map.put("eventTypes", java.lang.String.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("action", java.lang.String.class);
        map.put("key", java.lang.Object.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("configuration", org.ehcache.config.CacheConfiguration.class);
        map.put("configurations", java.util.Map.class);
        map.put("keyType", java.lang.String.class);
        map.put("synchronous", boolean.class);
        map.put("valueType", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        EhcacheEndpoint target = (EhcacheEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": target.getConfiguration().setAction(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "cachemanager":
        case "cacheManager": target.getConfiguration().setCacheManager(property(camelContext, org.ehcache.CacheManager.class, value)); return true;
        case "cachemanagerconfiguration":
        case "cacheManagerConfiguration": target.getConfiguration().setCacheManagerConfiguration(property(camelContext, org.ehcache.config.Configuration.class, value)); return true;
        case "configuration": target.getConfiguration().setConfiguration(property(camelContext, org.ehcache.config.CacheConfiguration.class, value)); return true;
        case "configurationuri":
        case "configurationUri": target.getConfiguration().setConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "configurations": target.getConfiguration().setConfigurations(property(camelContext, java.util.Map.class, value)); return true;
        case "createcacheifnotexist":
        case "createCacheIfNotExist": target.getConfiguration().setCreateCacheIfNotExist(property(camelContext, boolean.class, value)); return true;
        case "eventfiring":
        case "eventFiring": target.getConfiguration().setEventFiring(property(camelContext, org.ehcache.event.EventFiring.class, value)); return true;
        case "eventordering":
        case "eventOrdering": target.getConfiguration().setEventOrdering(property(camelContext, org.ehcache.event.EventOrdering.class, value)); return true;
        case "eventtypes":
        case "eventTypes": target.getConfiguration().setEventTypes(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "key": target.getConfiguration().setKey(property(camelContext, java.lang.Object.class, value)); return true;
        case "keytype":
        case "keyType": target.getConfiguration().setKeyType(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "valuetype":
        case "valueType": target.getConfiguration().setValueType(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        EhcacheEndpoint target = (EhcacheEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": return target.getConfiguration().getAction();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "cachemanager":
        case "cacheManager": return target.getConfiguration().getCacheManager();
        case "cachemanagerconfiguration":
        case "cacheManagerConfiguration": return target.getConfiguration().getCacheManagerConfiguration();
        case "configuration": return target.getConfiguration().getConfiguration();
        case "configurationuri":
        case "configurationUri": return target.getConfiguration().getConfigurationUri();
        case "configurations": return target.getConfiguration().getConfigurations();
        case "createcacheifnotexist":
        case "createCacheIfNotExist": return target.getConfiguration().isCreateCacheIfNotExist();
        case "eventfiring":
        case "eventFiring": return target.getConfiguration().getEventFiring();
        case "eventordering":
        case "eventOrdering": return target.getConfiguration().getEventOrdering();
        case "eventtypes":
        case "eventTypes": return target.getConfiguration().getEventTypes();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "key": return target.getConfiguration().getKey();
        case "keytype":
        case "keyType": return target.getConfiguration().getKeyType();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "synchronous": return target.isSynchronous();
        case "valuetype":
        case "valueType": return target.getConfiguration().getValueType();
        default: return null;
        }
    }
}

