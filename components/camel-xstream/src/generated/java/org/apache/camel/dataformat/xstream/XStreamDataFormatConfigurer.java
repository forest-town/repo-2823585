/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.dataformat.xstream;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class XStreamDataFormatConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        XStreamDataFormat dataformat = (XStreamDataFormat) target;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "encoding": dataformat.setEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "converters": dataformat.setConverters(property(camelContext, java.util.Map.class, value)); return true;
        case "aliases": dataformat.setAliases(property(camelContext, java.util.Map.class, value)); return true;
        case "omitfields":
        case "omitFields": dataformat.setOmitFields(property(camelContext, java.util.Map.class, value)); return true;
        case "implicitcollections":
        case "implicitCollections": dataformat.setImplicitCollections(property(camelContext, java.util.Map.class, value)); return true;
        case "permissions": dataformat.setPermissions(property(camelContext, java.lang.String.class, value)); return true;
        case "mode": dataformat.setMode(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

