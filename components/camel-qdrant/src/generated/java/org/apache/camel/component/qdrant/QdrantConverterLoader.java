/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.qdrant;

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
public final class QdrantConverterLoader implements TypeConverterLoader, CamelContextAware {

    private CamelContext camelContext;

    public QdrantConverterLoader() {
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
        addTypeConverter(registry, io.qdrant.client.grpc.Points.PointId.class, java.lang.Long.class, false,
            (type, exchange, value) -> org.apache.camel.component.qdrant.QdrantConverter.toPointId((java.lang.Long) value));
        addTypeConverter(registry, io.qdrant.client.grpc.Points.PointId.class, java.util.UUID.class, false,
            (type, exchange, value) -> org.apache.camel.component.qdrant.QdrantConverter.toPointId((java.util.UUID) value));
        addTypeConverter(registry, io.qdrant.client.grpc.Points.PointId.class, long.class, false,
            (type, exchange, value) -> org.apache.camel.component.qdrant.QdrantConverter.toPointId((long) value));
        addTypeConverter(registry, io.qdrant.client.grpc.Points.PointsSelector.class, io.qdrant.client.grpc.Points.Condition.class, false,
            (type, exchange, value) -> org.apache.camel.component.qdrant.QdrantConverter.toPointSelector((io.qdrant.client.grpc.Points.Condition) value));
        addTypeConverter(registry, io.qdrant.client.grpc.Points.PointsSelector.class, io.qdrant.client.grpc.Points.Filter.class, false,
            (type, exchange, value) -> org.apache.camel.component.qdrant.QdrantConverter.toPointSelector((io.qdrant.client.grpc.Points.Filter) value));
        addTypeConverter(registry, io.qdrant.client.grpc.Points.PointsSelector.class, io.qdrant.client.grpc.Points.PointId.class, false,
            (type, exchange, value) -> org.apache.camel.component.qdrant.QdrantConverter.toPointSelector((io.qdrant.client.grpc.Points.PointId) value));
        addTypeConverter(registry, java.util.List.class, io.qdrant.client.grpc.Points.PointId.class, false,
            (type, exchange, value) -> org.apache.camel.component.qdrant.QdrantConverter.toListOfPointIds((io.qdrant.client.grpc.Points.PointId) value));
        addTypeConverter(registry, java.util.List.class, io.qdrant.client.grpc.Points.PointStruct.class, false,
            (type, exchange, value) -> org.apache.camel.component.qdrant.QdrantConverter.toListOfPointStructs((io.qdrant.client.grpc.Points.PointStruct) value));
        addTypeConverter(registry, java.util.List.class, java.util.Collection.class, false,
            (type, exchange, value) -> org.apache.camel.component.qdrant.QdrantConverter.toListOfPointIdsFromCollection((java.util.Collection) value));
        addTypeConverter(registry, java.util.List.class, java.util.Collection.class, false,
            (type, exchange, value) -> org.apache.camel.component.qdrant.QdrantConverter.toListOfPointStructsFromCollection((java.util.Collection) value));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) { 
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }

}
