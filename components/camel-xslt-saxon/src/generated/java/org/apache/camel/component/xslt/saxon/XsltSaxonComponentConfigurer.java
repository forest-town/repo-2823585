/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.xslt.saxon;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.xslt.XsltComponentConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class XsltSaxonComponentConfigurer extends XsltComponentConfigurer implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        XsltSaxonComponent target = (XsltSaxonComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "saxonconfiguration":
        case "saxonConfiguration": target.setSaxonConfiguration(property(camelContext, net.sf.saxon.Configuration.class, value)); return true;
        case "saxonconfigurationproperties":
        case "saxonConfigurationProperties": target.setSaxonConfigurationProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "saxonextensionfunctions":
        case "saxonExtensionFunctions": target.setSaxonExtensionFunctions(property(camelContext, java.lang.String.class, value)); return true;
        default: return super.configure(camelContext, obj, name, value, ignoreCase);
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "saxonconfiguration":
        case "saxonConfiguration": return net.sf.saxon.Configuration.class;
        case "saxonconfigurationproperties":
        case "saxonConfigurationProperties": return java.util.Map.class;
        case "saxonextensionfunctions":
        case "saxonExtensionFunctions": return java.lang.String.class;
        default: return super.getOptionType(name, ignoreCase);
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        XsltSaxonComponent target = (XsltSaxonComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "saxonconfiguration":
        case "saxonConfiguration": return target.getSaxonConfiguration();
        case "saxonconfigurationproperties":
        case "saxonConfigurationProperties": return target.getSaxonConfigurationProperties();
        case "saxonextensionfunctions":
        case "saxonExtensionFunctions": return target.getSaxonExtensionFunctions();
        default: return super.getOptionValue(obj, name, ignoreCase);
        }
    }
}

