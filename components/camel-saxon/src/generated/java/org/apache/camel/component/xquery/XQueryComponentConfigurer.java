/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.xquery;

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
public class XQueryComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        XQueryComponent target = (XQueryComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, net.sf.saxon.Configuration.class, value)); return true;
        case "configurationproperties":
        case "configurationProperties": target.setConfigurationProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "moduleuriresolver":
        case "moduleURIResolver": target.setModuleURIResolver(property(camelContext, net.sf.saxon.lib.ModuleURIResolver.class, value)); return true;
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
        case "configuration": return net.sf.saxon.Configuration.class;
        case "configurationproperties":
        case "configurationProperties": return java.util.Map.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "moduleuriresolver":
        case "moduleURIResolver": return net.sf.saxon.lib.ModuleURIResolver.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        XQueryComponent target = (XQueryComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configuration": return target.getConfiguration();
        case "configurationproperties":
        case "configurationProperties": return target.getConfigurationProperties();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "moduleuriresolver":
        case "moduleURIResolver": return target.getModuleURIResolver();
        default: return null;
        }
    }
}

