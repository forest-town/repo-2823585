/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.box;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.box.BoxEventLogsManagerEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class BoxEventLogsManagerEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.box.BoxEventLogsManagerEndpointConfiguration target = (org.apache.camel.component.box.BoxEventLogsManagerEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstokencache":
        case "AccessTokenCache": target.setAccessTokenCache(property(camelContext, com.box.sdk.IAccessTokenCache.class, value)); return true;
        case "after":
        case "After": target.setAfter(property(camelContext, java.util.Date.class, value)); return true;
        case "apiname":
        case "ApiName": target.setApiName(property(camelContext, org.apache.camel.component.box.internal.BoxApiName.class, value)); return true;
        case "authenticationtype":
        case "AuthenticationType": target.setAuthenticationType(property(camelContext, java.lang.String.class, value)); return true;
        case "before":
        case "Before": target.setBefore(property(camelContext, java.util.Date.class, value)); return true;
        case "clientid":
        case "ClientId": target.setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "ClientSecret": target.setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "encryptionalgorithm":
        case "EncryptionAlgorithm": target.setEncryptionAlgorithm(property(camelContext, com.box.sdk.EncryptionAlgorithm.class, value)); return true;
        case "enterpriseid":
        case "EnterpriseId": target.setEnterpriseId(property(camelContext, java.lang.String.class, value)); return true;
        case "httpparams":
        case "HttpParams": target.setHttpParams(property(camelContext, java.util.Map.class, value)); return true;
        case "maxcacheentries":
        case "MaxCacheEntries": target.setMaxCacheEntries(property(camelContext, int.class, value)); return true;
        case "methodname":
        case "MethodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "position":
        case "Position": target.setPosition(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekeyfile":
        case "PrivateKeyFile": target.setPrivateKeyFile(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekeypassword":
        case "PrivateKeyPassword": target.setPrivateKeyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "publickeyid":
        case "PublicKeyId": target.setPublicKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "SslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "types":
        case "Types": target.setTypes(property(camelContext, com.box.sdk.BoxEvent.Type[].class, value)); return true;
        case "userid":
        case "UserId": target.setUserId(property(camelContext, java.lang.String.class, value)); return true;
        case "username":
        case "UserName": target.setUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "userpassword":
        case "UserPassword": target.setUserPassword(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("AccessTokenCache", com.box.sdk.IAccessTokenCache.class);
        answer.put("After", java.util.Date.class);
        answer.put("ApiName", org.apache.camel.component.box.internal.BoxApiName.class);
        answer.put("AuthenticationType", java.lang.String.class);
        answer.put("Before", java.util.Date.class);
        answer.put("ClientId", java.lang.String.class);
        answer.put("ClientSecret", java.lang.String.class);
        answer.put("EncryptionAlgorithm", com.box.sdk.EncryptionAlgorithm.class);
        answer.put("EnterpriseId", java.lang.String.class);
        answer.put("HttpParams", java.util.Map.class);
        answer.put("MaxCacheEntries", int.class);
        answer.put("MethodName", java.lang.String.class);
        answer.put("Position", java.lang.String.class);
        answer.put("PrivateKeyFile", java.lang.String.class);
        answer.put("PrivateKeyPassword", java.lang.String.class);
        answer.put("PublicKeyId", java.lang.String.class);
        answer.put("SslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        answer.put("Types", com.box.sdk.BoxEvent.Type[].class);
        answer.put("UserId", java.lang.String.class);
        answer.put("UserName", java.lang.String.class);
        answer.put("UserPassword", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.box.BoxEventLogsManagerEndpointConfiguration target = (org.apache.camel.component.box.BoxEventLogsManagerEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstokencache":
        case "AccessTokenCache": return target.getAccessTokenCache();
        case "after":
        case "After": return target.getAfter();
        case "apiname":
        case "ApiName": return target.getApiName();
        case "authenticationtype":
        case "AuthenticationType": return target.getAuthenticationType();
        case "before":
        case "Before": return target.getBefore();
        case "clientid":
        case "ClientId": return target.getClientId();
        case "clientsecret":
        case "ClientSecret": return target.getClientSecret();
        case "encryptionalgorithm":
        case "EncryptionAlgorithm": return target.getEncryptionAlgorithm();
        case "enterpriseid":
        case "EnterpriseId": return target.getEnterpriseId();
        case "httpparams":
        case "HttpParams": return target.getHttpParams();
        case "maxcacheentries":
        case "MaxCacheEntries": return target.getMaxCacheEntries();
        case "methodname":
        case "MethodName": return target.getMethodName();
        case "position":
        case "Position": return target.getPosition();
        case "privatekeyfile":
        case "PrivateKeyFile": return target.getPrivateKeyFile();
        case "privatekeypassword":
        case "PrivateKeyPassword": return target.getPrivateKeyPassword();
        case "publickeyid":
        case "PublicKeyId": return target.getPublicKeyId();
        case "sslcontextparameters":
        case "SslContextParameters": return target.getSslContextParameters();
        case "types":
        case "Types": return target.getTypes();
        case "userid":
        case "UserId": return target.getUserId();
        case "username":
        case "UserName": return target.getUserName();
        case "userpassword":
        case "UserPassword": return target.getUserPassword();
        default: return null;
        }
    }

    @Override
    public Object getOptionNestedType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "httpparams":
        case "HttpParams": return java.lang.Object.class;
        default: return null;
        }
    }
}

