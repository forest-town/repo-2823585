/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.reactive.streams;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ReactiveStreamsComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "internalengineconfiguration":
        case "internalEngineConfiguration": target.setInternalEngineConfiguration(property(camelContext, org.apache.camel.component.reactive.streams.engine.ReactiveStreamsEngineConfiguration.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "servicetype":
        case "serviceType": target.setServiceType(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

