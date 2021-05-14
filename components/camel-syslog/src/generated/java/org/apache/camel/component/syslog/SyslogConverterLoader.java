/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.syslog;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
import org.apache.camel.spi.TypeConverterLoader;
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.support.SimpleTypeConverter;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.util.DoubleMap;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public final class SyslogConverterLoader implements TypeConverterLoader, CamelContextAware {

    private CamelContext camelContext;

    public SyslogConverterLoader() {
    }

    @Override
    public void setCamelContext(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    @Override
    public CamelContext getCamelContext() {
        return camelContext;
    }

    @Override
    public void load(TypeConverterRegistry registry) throws TypeConverterLoaderException {
        registerConverters(registry);
    }

    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, java.lang.String.class, org.apache.camel.component.syslog.SyslogMessage.class, false,
            (type, exchange, value) -> org.apache.camel.component.syslog.SyslogConverter.toString((org.apache.camel.component.syslog.SyslogMessage) value));
        addTypeConverter(registry, org.apache.camel.component.syslog.SyslogMessage.class, java.lang.String.class, false,
            (type, exchange, value) -> org.apache.camel.component.syslog.SyslogConverter.toSyslogMessage((java.lang.String) value));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) { 
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }

}
