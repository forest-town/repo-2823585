/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.flatpack;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.DeferredContextBinding;
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
@DeferredContextBinding
public final class FlatpackConverterLoader implements TypeConverterLoader, CamelContextAware {

    private CamelContext camelContext;

    public FlatpackConverterLoader() {
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
        addTypeConverter(registry, java.util.List.class, net.sf.flatpack.DataSet.class, false,
            (type, exchange, value) -> org.apache.camel.component.flatpack.FlatpackConverter.toList((net.sf.flatpack.DataSet) value));
        addTypeConverter(registry, java.util.Map.class, net.sf.flatpack.DataSet.class, false,
            (type, exchange, value) -> org.apache.camel.component.flatpack.FlatpackConverter.toMap((net.sf.flatpack.DataSet) value));
        addTypeConverter(registry, org.w3c.dom.Document.class, net.sf.flatpack.DataSet.class, false,
            (type, exchange, value) -> org.apache.camel.component.flatpack.FlatpackConverter.toDocument((net.sf.flatpack.DataSet) value));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) { 
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }

}
