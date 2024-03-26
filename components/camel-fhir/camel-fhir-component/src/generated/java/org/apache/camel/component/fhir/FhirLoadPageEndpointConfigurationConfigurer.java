/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.fhir;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.fhir.FhirLoadPageEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class FhirLoadPageEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("AccessToken", java.lang.String.class);
        map.put("ApiName", org.apache.camel.component.fhir.internal.FhirApiName.class);
        map.put("Bundle", org.hl7.fhir.instance.model.api.IBaseBundle.class);
        map.put("Client", ca.uhn.fhir.rest.client.api.IGenericClient.class);
        map.put("ClientFactory", ca.uhn.fhir.rest.client.api.IRestfulClientFactory.class);
        map.put("Compress", boolean.class);
        map.put("ConnectionTimeout", java.lang.Integer.class);
        map.put("DeferModelScanning", boolean.class);
        map.put("Encoding", java.lang.String.class);
        map.put("ExtraParameters", java.util.Map.class);
        map.put("FhirContext", ca.uhn.fhir.context.FhirContext.class);
        map.put("FhirVersion", java.lang.String.class);
        map.put("ForceConformanceCheck", boolean.class);
        map.put("Log", boolean.class);
        map.put("MethodName", java.lang.String.class);
        map.put("Password", java.lang.String.class);
        map.put("PrettyPrint", boolean.class);
        map.put("ProxyHost", java.lang.String.class);
        map.put("ProxyPassword", java.lang.String.class);
        map.put("ProxyPort", java.lang.Integer.class);
        map.put("ProxyUser", java.lang.String.class);
        map.put("ReturnType", java.lang.Class.class);
        map.put("ServerUrl", java.lang.String.class);
        map.put("SessionCookie", java.lang.String.class);
        map.put("SocketTimeout", java.lang.Integer.class);
        map.put("Summary", java.lang.String.class);
        map.put("Url", java.lang.String.class);
        map.put("Username", java.lang.String.class);
        map.put("ValidationMode", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.fhir.FhirLoadPageEndpointConfiguration target = (org.apache.camel.component.fhir.FhirLoadPageEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": target.setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "apiname":
        case "apiName": target.setApiName(property(camelContext, org.apache.camel.component.fhir.internal.FhirApiName.class, value)); return true;
        case "bundle": target.setBundle(property(camelContext, org.hl7.fhir.instance.model.api.IBaseBundle.class, value)); return true;
        case "client": target.setClient(property(camelContext, ca.uhn.fhir.rest.client.api.IGenericClient.class, value)); return true;
        case "clientfactory":
        case "clientFactory": target.setClientFactory(property(camelContext, ca.uhn.fhir.rest.client.api.IRestfulClientFactory.class, value)); return true;
        case "compress": target.setCompress(property(camelContext, boolean.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": target.setConnectionTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "defermodelscanning":
        case "deferModelScanning": target.setDeferModelScanning(property(camelContext, boolean.class, value)); return true;
        case "encoding": target.setEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "extraparameters":
        case "extraParameters": target.setExtraParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "fhircontext":
        case "fhirContext": target.setFhirContext(property(camelContext, ca.uhn.fhir.context.FhirContext.class, value)); return true;
        case "fhirversion":
        case "fhirVersion": target.setFhirVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "forceconformancecheck":
        case "forceConformanceCheck": target.setForceConformanceCheck(property(camelContext, boolean.class, value)); return true;
        case "log": target.setLog(property(camelContext, boolean.class, value)); return true;
        case "methodname":
        case "methodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "prettyprint":
        case "prettyPrint": target.setPrettyPrint(property(camelContext, boolean.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxypassword":
        case "proxyPassword": target.setProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyuser":
        case "proxyUser": target.setProxyUser(property(camelContext, java.lang.String.class, value)); return true;
        case "returntype":
        case "returnType": target.setReturnType(property(camelContext, java.lang.Class.class, value)); return true;
        case "serverurl":
        case "serverUrl": target.setServerUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "sessioncookie":
        case "sessionCookie": target.setSessionCookie(property(camelContext, java.lang.String.class, value)); return true;
        case "sockettimeout":
        case "socketTimeout": target.setSocketTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "summary": target.setSummary(property(camelContext, java.lang.String.class, value)); return true;
        case "url": target.setUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "validationmode":
        case "validationMode": target.setValidationMode(property(camelContext, java.lang.String.class, value)); return true;
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
        case "accesstoken":
        case "accessToken": return java.lang.String.class;
        case "apiname":
        case "apiName": return org.apache.camel.component.fhir.internal.FhirApiName.class;
        case "bundle": return org.hl7.fhir.instance.model.api.IBaseBundle.class;
        case "client": return ca.uhn.fhir.rest.client.api.IGenericClient.class;
        case "clientfactory":
        case "clientFactory": return ca.uhn.fhir.rest.client.api.IRestfulClientFactory.class;
        case "compress": return boolean.class;
        case "connectiontimeout":
        case "connectionTimeout": return java.lang.Integer.class;
        case "defermodelscanning":
        case "deferModelScanning": return boolean.class;
        case "encoding": return java.lang.String.class;
        case "extraparameters":
        case "extraParameters": return java.util.Map.class;
        case "fhircontext":
        case "fhirContext": return ca.uhn.fhir.context.FhirContext.class;
        case "fhirversion":
        case "fhirVersion": return java.lang.String.class;
        case "forceconformancecheck":
        case "forceConformanceCheck": return boolean.class;
        case "log": return boolean.class;
        case "methodname":
        case "methodName": return java.lang.String.class;
        case "password": return java.lang.String.class;
        case "prettyprint":
        case "prettyPrint": return boolean.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxypassword":
        case "proxyPassword": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return java.lang.Integer.class;
        case "proxyuser":
        case "proxyUser": return java.lang.String.class;
        case "returntype":
        case "returnType": return java.lang.Class.class;
        case "serverurl":
        case "serverUrl": return java.lang.String.class;
        case "sessioncookie":
        case "sessionCookie": return java.lang.String.class;
        case "sockettimeout":
        case "socketTimeout": return java.lang.Integer.class;
        case "summary": return java.lang.String.class;
        case "url": return java.lang.String.class;
        case "username": return java.lang.String.class;
        case "validationmode":
        case "validationMode": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.fhir.FhirLoadPageEndpointConfiguration target = (org.apache.camel.component.fhir.FhirLoadPageEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return target.getAccessToken();
        case "apiname":
        case "apiName": return target.getApiName();
        case "bundle": return target.getBundle();
        case "client": return target.getClient();
        case "clientfactory":
        case "clientFactory": return target.getClientFactory();
        case "compress": return target.isCompress();
        case "connectiontimeout":
        case "connectionTimeout": return target.getConnectionTimeout();
        case "defermodelscanning":
        case "deferModelScanning": return target.isDeferModelScanning();
        case "encoding": return target.getEncoding();
        case "extraparameters":
        case "extraParameters": return target.getExtraParameters();
        case "fhircontext":
        case "fhirContext": return target.getFhirContext();
        case "fhirversion":
        case "fhirVersion": return target.getFhirVersion();
        case "forceconformancecheck":
        case "forceConformanceCheck": return target.isForceConformanceCheck();
        case "log": return target.isLog();
        case "methodname":
        case "methodName": return target.getMethodName();
        case "password": return target.getPassword();
        case "prettyprint":
        case "prettyPrint": return target.isPrettyPrint();
        case "proxyhost":
        case "proxyHost": return target.getProxyHost();
        case "proxypassword":
        case "proxyPassword": return target.getProxyPassword();
        case "proxyport":
        case "proxyPort": return target.getProxyPort();
        case "proxyuser":
        case "proxyUser": return target.getProxyUser();
        case "returntype":
        case "returnType": return target.getReturnType();
        case "serverurl":
        case "serverUrl": return target.getServerUrl();
        case "sessioncookie":
        case "sessionCookie": return target.getSessionCookie();
        case "sockettimeout":
        case "socketTimeout": return target.getSocketTimeout();
        case "summary": return target.getSummary();
        case "url": return target.getUrl();
        case "username": return target.getUsername();
        case "validationmode":
        case "validationMode": return target.getValidationMode();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "extraparameters":
        case "extraParameters": return java.lang.Object.class;
        case "returntype":
        case "returnType": return org.hl7.fhir.instance.model.api.IBaseBundle.class;
        default: return null;
        }
    }
}

