/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.reactive.streams;

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
public class ReactiveStreamsComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ReactiveStreamsComponent target = (ReactiveStreamsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backpressurestrategy":
        case "backpressureStrategy": target.setBackpressureStrategy(property(camelContext, org.apache.camel.component.reactive.streams.ReactiveStreamsBackpressureStrategy.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "reactivestreamsengineconfiguration":
        case "reactiveStreamsEngineConfiguration": target.setReactiveStreamsEngineConfiguration(property(camelContext, org.apache.camel.component.reactive.streams.engine.ReactiveStreamsEngineConfiguration.class, value)); return true;
        case "servicetype":
        case "serviceType": target.setServiceType(property(camelContext, java.lang.String.class, value)); return true;
        case "threadpoolmaxsize":
        case "threadPoolMaxSize": target.setThreadPoolMaxSize(property(camelContext, int.class, value)); return true;
        case "threadpoolminsize":
        case "threadPoolMinSize": target.setThreadPoolMinSize(property(camelContext, int.class, value)); return true;
        case "threadpoolname":
        case "threadPoolName": target.setThreadPoolName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backpressurestrategy":
        case "backpressureStrategy": return org.apache.camel.component.reactive.streams.ReactiveStreamsBackpressureStrategy.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "reactivestreamsengineconfiguration":
        case "reactiveStreamsEngineConfiguration": return org.apache.camel.component.reactive.streams.engine.ReactiveStreamsEngineConfiguration.class;
        case "servicetype":
        case "serviceType": return java.lang.String.class;
        case "threadpoolmaxsize":
        case "threadPoolMaxSize": return int.class;
        case "threadpoolminsize":
        case "threadPoolMinSize": return int.class;
        case "threadpoolname":
        case "threadPoolName": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        ReactiveStreamsComponent target = (ReactiveStreamsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backpressurestrategy":
        case "backpressureStrategy": return target.getBackpressureStrategy();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "reactivestreamsengineconfiguration":
        case "reactiveStreamsEngineConfiguration": return target.getReactiveStreamsEngineConfiguration();
        case "servicetype":
        case "serviceType": return target.getServiceType();
        case "threadpoolmaxsize":
        case "threadPoolMaxSize": return target.getThreadPoolMaxSize();
        case "threadpoolminsize":
        case "threadPoolMinSize": return target.getThreadPoolMinSize();
        case "threadpoolname":
        case "threadPoolName": return target.getThreadPoolName();
        default: return null;
        }
    }
}

