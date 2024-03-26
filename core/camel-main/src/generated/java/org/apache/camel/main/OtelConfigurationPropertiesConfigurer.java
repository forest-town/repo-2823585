/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.OtelConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class OtelConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.OtelConfigurationProperties target = (org.apache.camel.main.OtelConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "enabled": target.setEnabled(property(camelContext, boolean.class, value)); return true;
        case "encoding": target.setEncoding(property(camelContext, boolean.class, value)); return true;
        case "excludepatterns":
        case "excludePatterns": target.setExcludePatterns(property(camelContext, java.lang.String.class, value)); return true;
        case "instrumentationname":
        case "instrumentationName": target.setInstrumentationName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "enabled": return boolean.class;
        case "encoding": return boolean.class;
        case "excludepatterns":
        case "excludePatterns": return java.lang.String.class;
        case "instrumentationname":
        case "instrumentationName": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.OtelConfigurationProperties target = (org.apache.camel.main.OtelConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "enabled": return target.isEnabled();
        case "encoding": return target.isEncoding();
        case "excludepatterns":
        case "excludePatterns": return target.getExcludePatterns();
        case "instrumentationname":
        case "instrumentationName": return target.getInstrumentationName();
        default: return null;
        }
    }
}

