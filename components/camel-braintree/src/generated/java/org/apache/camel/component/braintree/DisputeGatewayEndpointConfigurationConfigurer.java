/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.braintree;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.braintree.DisputeGatewayEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DisputeGatewayEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("AccessToken", java.lang.String.class);
        map.put("ApiName", org.apache.camel.component.braintree.internal.BraintreeApiName.class);
        map.put("Content", java.lang.String.class);
        map.put("DisputeId", java.lang.String.class);
        map.put("DocumentId", java.lang.String.class);
        map.put("Environment", java.lang.String.class);
        map.put("EvidenceId", java.lang.String.class);
        map.put("FileEvidenceRequest", com.braintreegateway.FileEvidenceRequest.class);
        map.put("HttpLogLevel", java.lang.String.class);
        map.put("HttpLogName", java.lang.String.class);
        map.put("HttpReadTimeout", java.lang.Integer.class);
        map.put("Id", java.lang.String.class);
        map.put("LogHandlerEnabled", boolean.class);
        map.put("MerchantId", java.lang.String.class);
        map.put("MethodName", java.lang.String.class);
        map.put("PrivateKey", java.lang.String.class);
        map.put("ProxyHost", java.lang.String.class);
        map.put("ProxyPort", java.lang.Integer.class);
        map.put("PublicKey", java.lang.String.class);
        map.put("Query", com.braintreegateway.DisputeSearchRequest.class);
        map.put("TextEvidenceRequest", com.braintreegateway.TextEvidenceRequest.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.braintree.DisputeGatewayEndpointConfiguration target = (org.apache.camel.component.braintree.DisputeGatewayEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": target.setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "apiname":
        case "apiName": target.setApiName(property(camelContext, org.apache.camel.component.braintree.internal.BraintreeApiName.class, value)); return true;
        case "content": target.setContent(property(camelContext, java.lang.String.class, value)); return true;
        case "disputeid":
        case "disputeId": target.setDisputeId(property(camelContext, java.lang.String.class, value)); return true;
        case "documentid":
        case "documentId": target.setDocumentId(property(camelContext, java.lang.String.class, value)); return true;
        case "environment": target.setEnvironment(property(camelContext, java.lang.String.class, value)); return true;
        case "evidenceid":
        case "evidenceId": target.setEvidenceId(property(camelContext, java.lang.String.class, value)); return true;
        case "fileevidencerequest":
        case "fileEvidenceRequest": target.setFileEvidenceRequest(property(camelContext, com.braintreegateway.FileEvidenceRequest.class, value)); return true;
        case "httploglevel":
        case "httpLogLevel": target.setHttpLogLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "httplogname":
        case "httpLogName": target.setHttpLogName(property(camelContext, java.lang.String.class, value)); return true;
        case "httpreadtimeout":
        case "httpReadTimeout": target.setHttpReadTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "id": target.setId(property(camelContext, java.lang.String.class, value)); return true;
        case "loghandlerenabled":
        case "logHandlerEnabled": target.setLogHandlerEnabled(property(camelContext, boolean.class, value)); return true;
        case "merchantid":
        case "merchantId": target.setMerchantId(property(camelContext, java.lang.String.class, value)); return true;
        case "methodname":
        case "methodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekey":
        case "privateKey": target.setPrivateKey(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "publickey":
        case "publicKey": target.setPublicKey(property(camelContext, java.lang.String.class, value)); return true;
        case "query": target.setQuery(property(camelContext, com.braintreegateway.DisputeSearchRequest.class, value)); return true;
        case "textevidencerequest":
        case "textEvidenceRequest": target.setTextEvidenceRequest(property(camelContext, com.braintreegateway.TextEvidenceRequest.class, value)); return true;
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
        case "apiName": return org.apache.camel.component.braintree.internal.BraintreeApiName.class;
        case "content": return java.lang.String.class;
        case "disputeid":
        case "disputeId": return java.lang.String.class;
        case "documentid":
        case "documentId": return java.lang.String.class;
        case "environment": return java.lang.String.class;
        case "evidenceid":
        case "evidenceId": return java.lang.String.class;
        case "fileevidencerequest":
        case "fileEvidenceRequest": return com.braintreegateway.FileEvidenceRequest.class;
        case "httploglevel":
        case "httpLogLevel": return java.lang.String.class;
        case "httplogname":
        case "httpLogName": return java.lang.String.class;
        case "httpreadtimeout":
        case "httpReadTimeout": return java.lang.Integer.class;
        case "id": return java.lang.String.class;
        case "loghandlerenabled":
        case "logHandlerEnabled": return boolean.class;
        case "merchantid":
        case "merchantId": return java.lang.String.class;
        case "methodname":
        case "methodName": return java.lang.String.class;
        case "privatekey":
        case "privateKey": return java.lang.String.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return java.lang.Integer.class;
        case "publickey":
        case "publicKey": return java.lang.String.class;
        case "query": return com.braintreegateway.DisputeSearchRequest.class;
        case "textevidencerequest":
        case "textEvidenceRequest": return com.braintreegateway.TextEvidenceRequest.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.braintree.DisputeGatewayEndpointConfiguration target = (org.apache.camel.component.braintree.DisputeGatewayEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return target.getAccessToken();
        case "apiname":
        case "apiName": return target.getApiName();
        case "content": return target.getContent();
        case "disputeid":
        case "disputeId": return target.getDisputeId();
        case "documentid":
        case "documentId": return target.getDocumentId();
        case "environment": return target.getEnvironment();
        case "evidenceid":
        case "evidenceId": return target.getEvidenceId();
        case "fileevidencerequest":
        case "fileEvidenceRequest": return target.getFileEvidenceRequest();
        case "httploglevel":
        case "httpLogLevel": return target.getHttpLogLevel();
        case "httplogname":
        case "httpLogName": return target.getHttpLogName();
        case "httpreadtimeout":
        case "httpReadTimeout": return target.getHttpReadTimeout();
        case "id": return target.getId();
        case "loghandlerenabled":
        case "logHandlerEnabled": return target.isLogHandlerEnabled();
        case "merchantid":
        case "merchantId": return target.getMerchantId();
        case "methodname":
        case "methodName": return target.getMethodName();
        case "privatekey":
        case "privateKey": return target.getPrivateKey();
        case "proxyhost":
        case "proxyHost": return target.getProxyHost();
        case "proxyport":
        case "proxyPort": return target.getProxyPort();
        case "publickey":
        case "publicKey": return target.getPublicKey();
        case "query": return target.getQuery();
        case "textevidencerequest":
        case "textEvidenceRequest": return target.getTextEvidenceRequest();
        default: return null;
        }
    }
}

