/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.hl7;

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
public final class HL7GenericMessageConverterLoader implements TypeConverterLoader, CamelContextAware {

    private CamelContext camelContext;

    public HL7GenericMessageConverterLoader() {
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
        addTypeConverter(registry, ca.uhn.hl7v2.model.GenericMessage.class, byte[].class, false,
            (type, exchange, value) -> org.apache.camel.component.hl7.HL7GenericMessageConverter.toGenericMessage((byte[]) value, exchange));
        addTypeConverter(registry, ca.uhn.hl7v2.model.GenericMessage.class, java.lang.String.class, false,
            (type, exchange, value) -> org.apache.camel.component.hl7.HL7GenericMessageConverter.toGenericMessage((java.lang.String) value));
        addTypeConverter(registry, ca.uhn.hl7v2.model.GenericMessage.V21.class, byte[].class, false,
            (type, exchange, value) -> org.apache.camel.component.hl7.HL7GenericMessageConverter.toV21GenericMessage((byte[]) value, exchange));
        addTypeConverter(registry, ca.uhn.hl7v2.model.GenericMessage.V21.class, java.lang.String.class, false,
            (type, exchange, value) -> org.apache.camel.component.hl7.HL7GenericMessageConverter.toV21GenericMessage((java.lang.String) value));
        addTypeConverter(registry, ca.uhn.hl7v2.model.GenericMessage.V22.class, byte[].class, false,
            (type, exchange, value) -> org.apache.camel.component.hl7.HL7GenericMessageConverter.toV22GenericMessage((byte[]) value, exchange));
        addTypeConverter(registry, ca.uhn.hl7v2.model.GenericMessage.V22.class, java.lang.String.class, false,
            (type, exchange, value) -> org.apache.camel.component.hl7.HL7GenericMessageConverter.toV22GenericMessage((java.lang.String) value));
        addTypeConverter(registry, ca.uhn.hl7v2.model.GenericMessage.V23.class, byte[].class, false,
            (type, exchange, value) -> org.apache.camel.component.hl7.HL7GenericMessageConverter.toV23GenericMessage((byte[]) value, exchange));
        addTypeConverter(registry, ca.uhn.hl7v2.model.GenericMessage.V23.class, java.lang.String.class, false,
            (type, exchange, value) -> org.apache.camel.component.hl7.HL7GenericMessageConverter.toV23GenericMessage((java.lang.String) value));
        addTypeConverter(registry, ca.uhn.hl7v2.model.GenericMessage.V231.class, byte[].class, false,
            (type, exchange, value) -> org.apache.camel.component.hl7.HL7GenericMessageConverter.toV231GenericMessage((byte[]) value, exchange));
        addTypeConverter(registry, ca.uhn.hl7v2.model.GenericMessage.V231.class, java.lang.String.class, false,
            (type, exchange, value) -> org.apache.camel.component.hl7.HL7GenericMessageConverter.toV231GenericMessage((java.lang.String) value));
        addTypeConverter(registry, ca.uhn.hl7v2.model.GenericMessage.V24.class, byte[].class, false,
            (type, exchange, value) -> org.apache.camel.component.hl7.HL7GenericMessageConverter.toV24GenericMessage((byte[]) value, exchange));
        addTypeConverter(registry, ca.uhn.hl7v2.model.GenericMessage.V24.class, java.lang.String.class, false,
            (type, exchange, value) -> org.apache.camel.component.hl7.HL7GenericMessageConverter.toV24GenericMessage((java.lang.String) value));
        addTypeConverter(registry, ca.uhn.hl7v2.model.GenericMessage.V25.class, byte[].class, false,
            (type, exchange, value) -> org.apache.camel.component.hl7.HL7GenericMessageConverter.toV25GenericMessage((byte[]) value, exchange));
        addTypeConverter(registry, ca.uhn.hl7v2.model.GenericMessage.V25.class, java.lang.String.class, false,
            (type, exchange, value) -> org.apache.camel.component.hl7.HL7GenericMessageConverter.toV25GenericMessage((java.lang.String) value));
        addTypeConverter(registry, ca.uhn.hl7v2.model.GenericMessage.V251.class, byte[].class, false,
            (type, exchange, value) -> org.apache.camel.component.hl7.HL7GenericMessageConverter.toV251GenericMessage((byte[]) value, exchange));
        addTypeConverter(registry, ca.uhn.hl7v2.model.GenericMessage.V251.class, java.lang.String.class, false,
            (type, exchange, value) -> org.apache.camel.component.hl7.HL7GenericMessageConverter.toV251GenericMessage((java.lang.String) value));
        addTypeConverter(registry, ca.uhn.hl7v2.model.GenericMessage.V26.class, byte[].class, false,
            (type, exchange, value) -> org.apache.camel.component.hl7.HL7GenericMessageConverter.toV26GenericMessage((byte[]) value, exchange));
        addTypeConverter(registry, ca.uhn.hl7v2.model.GenericMessage.V26.class, java.lang.String.class, false,
            (type, exchange, value) -> org.apache.camel.component.hl7.HL7GenericMessageConverter.toV26GenericMessage((java.lang.String) value));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) { 
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }

}
