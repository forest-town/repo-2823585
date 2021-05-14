/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jcr;

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
public final class JcrConverterLoader implements TypeConverterLoader, CamelContextAware {

    private CamelContext camelContext;

    public JcrConverterLoader() {
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
        addTypeConverter(registry, java.io.InputStream.class, javax.jcr.Value.class, false,
            (type, exchange, value) -> org.apache.camel.component.jcr.JcrConverter.toValue((javax.jcr.Value) value));
        addTypeConverter(registry, java.lang.Boolean.class, javax.jcr.Value.class, false,
            (type, exchange, value) -> org.apache.camel.component.jcr.JcrConverter.toBoolean((javax.jcr.Value) value));
        addTypeConverter(registry, java.lang.String.class, javax.jcr.Value.class, false,
            (type, exchange, value) -> org.apache.camel.component.jcr.JcrConverter.toString((javax.jcr.Value) value));
        addTypeConverter(registry, java.util.Calendar.class, javax.jcr.Value.class, false,
            (type, exchange, value) -> org.apache.camel.component.jcr.JcrConverter.toCalendar((javax.jcr.Value) value));
        addTypeConverter(registry, javax.jcr.Value.class, java.io.InputStream.class, false,
            (type, exchange, value) -> org.apache.camel.component.jcr.JcrConverter.toValue((java.io.InputStream) value));
        addTypeConverter(registry, javax.jcr.Value.class, java.lang.Boolean.class, false,
            (type, exchange, value) -> org.apache.camel.component.jcr.JcrConverter.toValue((java.lang.Boolean) value));
        addTypeConverter(registry, javax.jcr.Value.class, java.lang.String.class, false,
            (type, exchange, value) -> org.apache.camel.component.jcr.JcrConverter.toValue((java.lang.String) value));
        addTypeConverter(registry, javax.jcr.Value.class, java.util.Calendar.class, false,
            (type, exchange, value) -> org.apache.camel.component.jcr.JcrConverter.toValue((java.util.Calendar) value));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) { 
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }

}
