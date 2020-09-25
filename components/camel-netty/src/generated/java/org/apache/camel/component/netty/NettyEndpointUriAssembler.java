/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.netty;

import java.net.URISyntaxException;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.EndpointUriAssembler;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class NettyEndpointUriAssembler extends org.apache.camel.support.component.EndpointUriAssemblerSupport implements EndpointUriAssembler {

    private static final String BASE = ":protocol:host:port";

    @Override
    public boolean isEnabled(String scheme) {
        return "netty".equals(scheme);
    }

    @Override
    public String buildUri(CamelContext camelContext, String scheme, Map<String, Object> parameters) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        uri = buildPathParameter(camelContext, syntax, uri, "protocol", null, true, parameters);
        uri = buildPathParameter(camelContext, syntax, uri, "host", null, true, parameters);
        uri = buildPathParameter(camelContext, syntax, uri, "port", null, true, parameters);
        uri = buildQueryParameters(camelContext, uri, parameters);
        return uri;
    }
}

