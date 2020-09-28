/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.vm;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.seda.SedaEndpointConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class VmEndpointConfigurer extends SedaEndpointConfigurer implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("name", java.lang.String.class);
        map.put("size", int.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("concurrentConsumers", int.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("limitConcurrentConsumers", boolean.class);
        map.put("multipleConsumers", boolean.class);
        map.put("pollTimeout", int.class);
        map.put("purgeWhenStopping", boolean.class);
        map.put("blockWhenFull", boolean.class);
        map.put("discardIfNoConsumers", boolean.class);
        map.put("discardWhenFull", boolean.class);
        map.put("failIfNoConsumers", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("offerTimeout", long.class);
        map.put("timeout", long.class);
        map.put("waitForTaskToComplete", org.apache.camel.WaitForTaskToComplete.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("queue", java.util.concurrent.BlockingQueue.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
    }

}

