/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.model.cloud;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.model.cloud.ZooKeeperServiceCallServiceDiscoveryConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ZooKeeperServiceCallServiceDiscoveryConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("BasePath", java.lang.String.class);
        map.put("ConnectionTimeout", java.lang.String.class);
        map.put("Id", java.lang.String.class);
        map.put("Namespace", java.lang.String.class);
        map.put("Nodes", java.lang.String.class);
        map.put("Properties", java.util.List.class);
        map.put("ReconnectBaseSleepTime", java.lang.String.class);
        map.put("ReconnectMaxRetries", java.lang.String.class);
        map.put("ReconnectMaxSleepTime", java.lang.String.class);
        map.put("SessionTimeout", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.model.cloud.ZooKeeperServiceCallServiceDiscoveryConfiguration target = (org.apache.camel.model.cloud.ZooKeeperServiceCallServiceDiscoveryConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basepath":
        case "basePath": target.setBasePath(property(camelContext, java.lang.String.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": target.setConnectionTimeout(property(camelContext, java.lang.String.class, value)); return true;
        case "id": target.setId(property(camelContext, java.lang.String.class, value)); return true;
        case "namespace": target.setNamespace(property(camelContext, java.lang.String.class, value)); return true;
        case "nodes": target.setNodes(property(camelContext, java.lang.String.class, value)); return true;
        case "properties": target.setProperties(property(camelContext, java.util.List.class, value)); return true;
        case "reconnectbasesleeptime":
        case "reconnectBaseSleepTime": target.setReconnectBaseSleepTime(property(camelContext, java.lang.String.class, value)); return true;
        case "reconnectmaxretries":
        case "reconnectMaxRetries": target.setReconnectMaxRetries(property(camelContext, java.lang.String.class, value)); return true;
        case "reconnectmaxsleeptime":
        case "reconnectMaxSleepTime": target.setReconnectMaxSleepTime(property(camelContext, java.lang.String.class, value)); return true;
        case "sessiontimeout":
        case "sessionTimeout": target.setSessionTimeout(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basepath":
        case "basePath": return java.lang.String.class;
        case "connectiontimeout":
        case "connectionTimeout": return java.lang.String.class;
        case "id": return java.lang.String.class;
        case "namespace": return java.lang.String.class;
        case "nodes": return java.lang.String.class;
        case "properties": return java.util.List.class;
        case "reconnectbasesleeptime":
        case "reconnectBaseSleepTime": return java.lang.String.class;
        case "reconnectmaxretries":
        case "reconnectMaxRetries": return java.lang.String.class;
        case "reconnectmaxsleeptime":
        case "reconnectMaxSleepTime": return java.lang.String.class;
        case "sessiontimeout":
        case "sessionTimeout": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.model.cloud.ZooKeeperServiceCallServiceDiscoveryConfiguration target = (org.apache.camel.model.cloud.ZooKeeperServiceCallServiceDiscoveryConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basepath":
        case "basePath": return target.getBasePath();
        case "connectiontimeout":
        case "connectionTimeout": return target.getConnectionTimeout();
        case "id": return target.getId();
        case "namespace": return target.getNamespace();
        case "nodes": return target.getNodes();
        case "properties": return target.getProperties();
        case "reconnectbasesleeptime":
        case "reconnectBaseSleepTime": return target.getReconnectBaseSleepTime();
        case "reconnectmaxretries":
        case "reconnectMaxRetries": return target.getReconnectMaxRetries();
        case "reconnectmaxsleeptime":
        case "reconnectMaxSleepTime": return target.getReconnectMaxSleepTime();
        case "sessiontimeout":
        case "sessionTimeout": return target.getSessionTimeout();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "properties": return org.apache.camel.model.PropertyDefinition.class;
        default: return null;
        }
    }
}

