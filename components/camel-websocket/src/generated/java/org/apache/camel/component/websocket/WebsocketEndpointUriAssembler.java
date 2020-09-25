/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.websocket;

import java.net.URISyntaxException;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.EndpointUriAssembler;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class WebsocketEndpointUriAssembler extends org.apache.camel.support.component.EndpointUriAssemblerSupport implements EndpointUriAssembler {

    private static final String BASE = ":host:port/resourceUri";

    @Override
    public boolean isEnabled(String scheme) {
        return "websocket".equals(scheme);
    }

    @Override
    public String buildUri(CamelContext camelContext, String scheme, Map<String, Object> parameters) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        uri = buildPathParameter(camelContext, syntax, uri, "host", "0.0.0.0", false, parameters);
        uri = buildPathParameter(camelContext, syntax, uri, "port", "9292", false, parameters);
        uri = buildPathParameter(camelContext, syntax, uri, "resourceUri", null, true, parameters);
        uri = buildQueryParameters(camelContext, uri, parameters);
        return uri;
    }
}

