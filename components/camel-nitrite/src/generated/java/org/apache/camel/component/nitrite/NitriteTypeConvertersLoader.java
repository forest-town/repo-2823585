/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.nitrite;

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
public final class NitriteTypeConvertersLoader implements TypeConverterLoader, CamelContextAware {

    private CamelContext camelContext;

    public NitriteTypeConvertersLoader() {
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
        addTypeConverter(registry, java.util.List.class, org.dizitart.no2.Cursor.class, false,
            (type, exchange, value) -> org.apache.camel.component.nitrite.NitriteTypeConverters.fromCursorToList((org.dizitart.no2.Cursor) value));
        addTypeConverter(registry, org.dizitart.no2.Document.class, java.util.Map.class, false,
            (type, exchange, value) -> org.apache.camel.component.nitrite.NitriteTypeConverters.fromMapToDocument((java.util.Map) value));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) { 
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }

}
