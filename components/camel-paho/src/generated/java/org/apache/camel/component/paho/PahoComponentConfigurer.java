/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.paho;

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
public class PahoComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.paho.PahoConfiguration getOrCreateConfiguration(PahoComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.paho.PahoConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        PahoComponent target = (PahoComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "automaticreconnect":
        case "automaticReconnect": getOrCreateConfiguration(target).setAutomaticReconnect(property(camelContext, boolean.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "brokerurl":
        case "brokerUrl": getOrCreateConfiguration(target).setBrokerUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "cleansession":
        case "cleanSession": getOrCreateConfiguration(target).setCleanSession(property(camelContext, boolean.class, value)); return true;
        case "client": target.setClient(property(camelContext, org.eclipse.paho.client.mqttv3.MqttClient.class, value)); return true;
        case "clientid":
        case "clientId": getOrCreateConfiguration(target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.paho.PahoConfiguration.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": getOrCreateConfiguration(target).setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "customwebsocketheaders":
        case "customWebSocketHeaders": getOrCreateConfiguration(target).setCustomWebSocketHeaders(property(camelContext, java.util.Properties.class, value)); return true;
        case "executorservicetimeout":
        case "executorServiceTimeout": getOrCreateConfiguration(target).setExecutorServiceTimeout(property(camelContext, int.class, value)); return true;
        case "filepersistencedirectory":
        case "filePersistenceDirectory": getOrCreateConfiguration(target).setFilePersistenceDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "httpshostnameverificationenabled":
        case "httpsHostnameVerificationEnabled": getOrCreateConfiguration(target).setHttpsHostnameVerificationEnabled(property(camelContext, boolean.class, value)); return true;
        case "keepaliveinterval":
        case "keepAliveInterval": getOrCreateConfiguration(target).setKeepAliveInterval(property(camelContext, int.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxinflight":
        case "maxInflight": getOrCreateConfiguration(target).setMaxInflight(property(camelContext, int.class, value)); return true;
        case "maxreconnectdelay":
        case "maxReconnectDelay": getOrCreateConfiguration(target).setMaxReconnectDelay(property(camelContext, int.class, value)); return true;
        case "mqttversion":
        case "mqttVersion": getOrCreateConfiguration(target).setMqttVersion(property(camelContext, int.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "persistence": getOrCreateConfiguration(target).setPersistence(property(camelContext, org.apache.camel.component.paho.PahoPersistence.class, value)); return true;
        case "qos": getOrCreateConfiguration(target).setQos(property(camelContext, int.class, value)); return true;
        case "retained": getOrCreateConfiguration(target).setRetained(property(camelContext, boolean.class, value)); return true;
        case "serveruris":
        case "serverURIs": getOrCreateConfiguration(target).setServerURIs(property(camelContext, java.lang.String.class, value)); return true;
        case "socketfactory":
        case "socketFactory": getOrCreateConfiguration(target).setSocketFactory(property(camelContext, javax.net.SocketFactory.class, value)); return true;
        case "sslclientprops":
        case "sslClientProps": getOrCreateConfiguration(target).setSslClientProps(property(camelContext, java.util.Properties.class, value)); return true;
        case "sslhostnameverifier":
        case "sslHostnameVerifier": getOrCreateConfiguration(target).setSslHostnameVerifier(property(camelContext, javax.net.ssl.HostnameVerifier.class, value)); return true;
        case "username":
        case "userName": getOrCreateConfiguration(target).setUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "willpayload":
        case "willPayload": getOrCreateConfiguration(target).setWillPayload(property(camelContext, java.lang.String.class, value)); return true;
        case "willqos":
        case "willQos": getOrCreateConfiguration(target).setWillQos(property(camelContext, int.class, value)); return true;
        case "willretained":
        case "willRetained": getOrCreateConfiguration(target).setWillRetained(property(camelContext, boolean.class, value)); return true;
        case "willtopic":
        case "willTopic": getOrCreateConfiguration(target).setWillTopic(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "automaticreconnect":
        case "automaticReconnect": return boolean.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "brokerurl":
        case "brokerUrl": return java.lang.String.class;
        case "cleansession":
        case "cleanSession": return boolean.class;
        case "client": return org.eclipse.paho.client.mqttv3.MqttClient.class;
        case "clientid":
        case "clientId": return java.lang.String.class;
        case "configuration": return org.apache.camel.component.paho.PahoConfiguration.class;
        case "connectiontimeout":
        case "connectionTimeout": return int.class;
        case "customwebsocketheaders":
        case "customWebSocketHeaders": return java.util.Properties.class;
        case "executorservicetimeout":
        case "executorServiceTimeout": return int.class;
        case "filepersistencedirectory":
        case "filePersistenceDirectory": return java.lang.String.class;
        case "httpshostnameverificationenabled":
        case "httpsHostnameVerificationEnabled": return boolean.class;
        case "keepaliveinterval":
        case "keepAliveInterval": return int.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxinflight":
        case "maxInflight": return int.class;
        case "maxreconnectdelay":
        case "maxReconnectDelay": return int.class;
        case "mqttversion":
        case "mqttVersion": return int.class;
        case "password": return java.lang.String.class;
        case "persistence": return org.apache.camel.component.paho.PahoPersistence.class;
        case "qos": return int.class;
        case "retained": return boolean.class;
        case "serveruris":
        case "serverURIs": return java.lang.String.class;
        case "socketfactory":
        case "socketFactory": return javax.net.SocketFactory.class;
        case "sslclientprops":
        case "sslClientProps": return java.util.Properties.class;
        case "sslhostnameverifier":
        case "sslHostnameVerifier": return javax.net.ssl.HostnameVerifier.class;
        case "username":
        case "userName": return java.lang.String.class;
        case "willpayload":
        case "willPayload": return java.lang.String.class;
        case "willqos":
        case "willQos": return int.class;
        case "willretained":
        case "willRetained": return boolean.class;
        case "willtopic":
        case "willTopic": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        PahoComponent target = (PahoComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "automaticreconnect":
        case "automaticReconnect": return getOrCreateConfiguration(target).isAutomaticReconnect();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "brokerurl":
        case "brokerUrl": return getOrCreateConfiguration(target).getBrokerUrl();
        case "cleansession":
        case "cleanSession": return getOrCreateConfiguration(target).isCleanSession();
        case "client": return target.getClient();
        case "clientid":
        case "clientId": return getOrCreateConfiguration(target).getClientId();
        case "configuration": return target.getConfiguration();
        case "connectiontimeout":
        case "connectionTimeout": return getOrCreateConfiguration(target).getConnectionTimeout();
        case "customwebsocketheaders":
        case "customWebSocketHeaders": return getOrCreateConfiguration(target).getCustomWebSocketHeaders();
        case "executorservicetimeout":
        case "executorServiceTimeout": return getOrCreateConfiguration(target).getExecutorServiceTimeout();
        case "filepersistencedirectory":
        case "filePersistenceDirectory": return getOrCreateConfiguration(target).getFilePersistenceDirectory();
        case "httpshostnameverificationenabled":
        case "httpsHostnameVerificationEnabled": return getOrCreateConfiguration(target).isHttpsHostnameVerificationEnabled();
        case "keepaliveinterval":
        case "keepAliveInterval": return getOrCreateConfiguration(target).getKeepAliveInterval();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxinflight":
        case "maxInflight": return getOrCreateConfiguration(target).getMaxInflight();
        case "maxreconnectdelay":
        case "maxReconnectDelay": return getOrCreateConfiguration(target).getMaxReconnectDelay();
        case "mqttversion":
        case "mqttVersion": return getOrCreateConfiguration(target).getMqttVersion();
        case "password": return getOrCreateConfiguration(target).getPassword();
        case "persistence": return getOrCreateConfiguration(target).getPersistence();
        case "qos": return getOrCreateConfiguration(target).getQos();
        case "retained": return getOrCreateConfiguration(target).isRetained();
        case "serveruris":
        case "serverURIs": return getOrCreateConfiguration(target).getServerURIs();
        case "socketfactory":
        case "socketFactory": return getOrCreateConfiguration(target).getSocketFactory();
        case "sslclientprops":
        case "sslClientProps": return getOrCreateConfiguration(target).getSslClientProps();
        case "sslhostnameverifier":
        case "sslHostnameVerifier": return getOrCreateConfiguration(target).getSslHostnameVerifier();
        case "username":
        case "userName": return getOrCreateConfiguration(target).getUserName();
        case "willpayload":
        case "willPayload": return getOrCreateConfiguration(target).getWillPayload();
        case "willqos":
        case "willQos": return getOrCreateConfiguration(target).getWillQos();
        case "willretained":
        case "willRetained": return getOrCreateConfiguration(target).isWillRetained();
        case "willtopic":
        case "willTopic": return getOrCreateConfiguration(target).getWillTopic();
        default: return null;
        }
    }
}

