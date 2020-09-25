/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.coap;

import java.net.URISyntaxException;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.EndpointUriAssembler;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class CoAPEndpointUriAssembler extends org.apache.camel.support.component.EndpointUriAssemblerSupport implements EndpointUriAssembler {

    private static final String BASE = "coaps+tcp:uri";
    private static final String[] SCHEMES = new String[]{"coap", "coaps", "coap+tcp", "coaps+tcp"};

    @Override
    public boolean isEnabled(String scheme) {
        for (String s : SCHEMES) {
            if (s.equals(scheme)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String buildUri(CamelContext camelContext, String scheme, Map<String, Object> parameters) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        uri = buildPathParameter(camelContext, syntax, uri, "uri", null, false, parameters);
        uri = buildQueryParameters(camelContext, uri, parameters);
        return uri;
    }
}

