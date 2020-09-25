/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.netty.http;

import java.net.URISyntaxException;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.EndpointUriAssembler;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class NettyHttpEndpointUriAssembler extends org.apache.camel.support.component.EndpointUriAssemblerSupport implements EndpointUriAssembler {

    private static final String SYNTAX = "netty-http:protocol:host:port/path";

    @Override
    public String buildUri(CamelContext camelContext, String scheme, Map<String, Object> parameters) throws URISyntaxException {
        String uri = SYNTAX;

        uri = buildPathParameter(camelContext, SYNTAX, uri, "protocol", null, true, parameters);
        uri = buildPathParameter(camelContext, SYNTAX, uri, "host", null, true, parameters);
        uri = buildPathParameter(camelContext, SYNTAX, uri, "port", null, false, parameters);
        uri = buildPathParameter(camelContext, SYNTAX, uri, "path", null, false, parameters);
        uri = buildQueryParameters(camelContext, uri, parameters);
        return uri;
    }
}

