/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.atmosphere.websocket;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class WebsocketEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        WebsocketEndpoint target = (WebsocketEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "chunked": target.setChunked(property(camelContext, boolean.class, value)); return true;
        case "disablestreamcache":
        case "disableStreamCache": target.setDisableStreamCache(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "sendtoall":
        case "sendToAll": target.setSendToAll(property(camelContext, boolean.class, value)); return true;
        case "transferexception":
        case "transferException": target.setTransferException(property(camelContext, boolean.class, value)); return true;
        case "usestreaming":
        case "useStreaming": target.setUseStreaming(property(camelContext, boolean.class, value)); return true;
        case "httpbinding":
        case "httpBinding": target.setHttpBinding(property(camelContext, org.apache.camel.http.common.HttpBinding.class, value)); return true;
        case "async": target.setAsync(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "httpmethodrestrict":
        case "httpMethodRestrict": target.setHttpMethodRestrict(property(camelContext, java.lang.String.class, value)); return true;
        case "matchonuriprefix":
        case "matchOnUriPrefix": target.setMatchOnUriPrefix(property(camelContext, boolean.class, value)); return true;
        case "muteexception":
        case "muteException": target.setMuteException(property(camelContext, boolean.class, value)); return true;
        case "responsebuffersize":
        case "responseBufferSize": target.setResponseBufferSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "servletname":
        case "servletName": target.setServletName(property(camelContext, java.lang.String.class, value)); return true;
        case "attachmentmultipartbinding":
        case "attachmentMultipartBinding": target.setAttachmentMultipartBinding(property(camelContext, boolean.class, value)); return true;
        case "eagercheckcontentavailable":
        case "eagerCheckContentAvailable": target.setEagerCheckContentAvailable(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "filenameextwhitelist":
        case "fileNameExtWhitelist": target.setFileNameExtWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "optionsenabled":
        case "optionsEnabled": target.setOptionsEnabled(property(camelContext, boolean.class, value)); return true;
        case "traceenabled":
        case "traceEnabled": target.setTraceEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeendpoint":
        case "bridgeEndpoint": target.setBridgeEndpoint(property(camelContext, boolean.class, value)); return true;
        case "connectionclose":
        case "connectionClose": target.setConnectionClose(property(camelContext, boolean.class, value)); return true;
        case "copyheaders":
        case "copyHeaders": target.setCopyHeaders(property(camelContext, boolean.class, value)); return true;
        case "httpmethod":
        case "httpMethod": target.setHttpMethod(property(camelContext, org.apache.camel.http.common.HttpMethods.class, value)); return true;
        case "ignoreresponsebody":
        case "ignoreResponseBody": target.setIgnoreResponseBody(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "preservehostheader":
        case "preserveHostHeader": target.setPreserveHostHeader(property(camelContext, boolean.class, value)); return true;
        case "throwexceptiononfailure":
        case "throwExceptionOnFailure": target.setThrowExceptionOnFailure(property(camelContext, boolean.class, value)); return true;
        case "cookiehandler":
        case "cookieHandler": target.setCookieHandler(property(camelContext, org.apache.camel.http.base.cookie.CookieHandler.class, value)); return true;
        case "okstatuscoderange":
        case "okStatusCodeRange": target.setOkStatusCodeRange(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "maphttpmessagebody":
        case "mapHttpMessageBody": target.setMapHttpMessageBody(property(camelContext, boolean.class, value)); return true;
        case "maphttpmessageformurlencodedbody":
        case "mapHttpMessageFormUrlEncodedBody": target.setMapHttpMessageFormUrlEncodedBody(property(camelContext, boolean.class, value)); return true;
        case "maphttpmessageheaders":
        case "mapHttpMessageHeaders": target.setMapHttpMessageHeaders(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "proxyauthscheme":
        case "proxyAuthScheme": target.setProxyAuthScheme(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.setProxyPort(property(camelContext, int.class, value)); return true;
        case "authhost":
        case "authHost": target.setAuthHost(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

