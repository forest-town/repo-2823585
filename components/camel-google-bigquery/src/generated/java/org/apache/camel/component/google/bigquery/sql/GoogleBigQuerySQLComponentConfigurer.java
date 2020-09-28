/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.bigquery.sql;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GoogleBigQuerySQLComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("connectionFactory", org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("projectId", java.lang.String.class);
        map.put("basicPropertyBinding", boolean.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GoogleBigQuerySQLComponent target = (GoogleBigQuerySQLComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "connectionfactory":
        case "connectionFactory": target.setConnectionFactory(property(camelContext, org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "projectid":
        case "projectId": target.setProjectId(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        GoogleBigQuerySQLComponent target = (GoogleBigQuerySQLComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "connectionfactory":
        case "connectionFactory": return target.getConnectionFactory();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "projectid":
        case "projectId": return target.getProjectId();
        default: return null;
        }
    }
}

