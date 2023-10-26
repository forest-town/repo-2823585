/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.MainSSLConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MainSSLConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.MainSSLConfigurationProperties target = (org.apache.camel.main.MainSSLConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "clientauthentication":
        case "ClientAuthentication": target.setClientAuthentication(property(camelContext, java.lang.String.class, value)); return true;
        case "enabled":
        case "Enabled": target.setEnabled(property(camelContext, boolean.class, value)); return true;
        case "keystore":
        case "KeyStore": target.setKeyStore(property(camelContext, java.lang.String.class, value)); return true;
        case "keystorepassword":
        case "KeystorePassword": target.setKeystorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "truststore":
        case "TrustStore": target.setTrustStore(property(camelContext, java.lang.String.class, value)); return true;
        case "truststorepassword":
        case "TrustStorePassword": target.setTrustStorePassword(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "clientauthentication":
        case "ClientAuthentication": return java.lang.String.class;
        case "enabled":
        case "Enabled": return boolean.class;
        case "keystore":
        case "KeyStore": return java.lang.String.class;
        case "keystorepassword":
        case "KeystorePassword": return java.lang.String.class;
        case "truststore":
        case "TrustStore": return java.lang.String.class;
        case "truststorepassword":
        case "TrustStorePassword": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.MainSSLConfigurationProperties target = (org.apache.camel.main.MainSSLConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "clientauthentication":
        case "ClientAuthentication": return target.getClientAuthentication();
        case "enabled":
        case "Enabled": return target.isEnabled();
        case "keystore":
        case "KeyStore": return target.getKeyStore();
        case "keystorepassword":
        case "KeystorePassword": return target.getKeystorePassword();
        case "truststore":
        case "TrustStore": return target.getTrustStore();
        case "truststorepassword":
        case "TrustStorePassword": return target.getTrustStorePassword();
        default: return null;
        }
    }
}

