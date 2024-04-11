/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sql.stored;

import javax.annotation.processing.Generated;
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
@Generated("org.apache.camel.maven.packaging.EndpointSchemaGeneratorMojo")
@SuppressWarnings("unchecked")
public class SqlStoredEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SqlStoredEndpoint target = (SqlStoredEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "batch": target.setBatch(property(camelContext, boolean.class, value)); return true;
        case "datasource":
        case "dataSource": target.setDataSource(property(camelContext, javax.sql.DataSource.class, value)); return true;
        case "function": target.setFunction(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "noop": target.setNoop(property(camelContext, boolean.class, value)); return true;
        case "outputheader":
        case "outputHeader": target.setOutputHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "templateoptions":
        case "templateOptions": target.setTemplateOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "usemessagebodyfortemplate":
        case "useMessageBodyForTemplate": target.setUseMessageBodyForTemplate(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "batch": return boolean.class;
        case "datasource":
        case "dataSource": return javax.sql.DataSource.class;
        case "function": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "noop": return boolean.class;
        case "outputheader":
        case "outputHeader": return java.lang.String.class;
        case "templateoptions":
        case "templateOptions": return java.util.Map.class;
        case "usemessagebodyfortemplate":
        case "useMessageBodyForTemplate": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SqlStoredEndpoint target = (SqlStoredEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "batch": return target.isBatch();
        case "datasource":
        case "dataSource": return target.getDataSource();
        case "function": return target.isFunction();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "noop": return target.isNoop();
        case "outputheader":
        case "outputHeader": return target.getOutputHeader();
        case "templateoptions":
        case "templateOptions": return target.getTemplateOptions();
        case "usemessagebodyfortemplate":
        case "useMessageBodyForTemplate": return target.isUseMessageBodyForTemplate();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "templateoptions":
        case "templateOptions": return java.lang.Object.class;
        default: return null;
        }
    }
}

