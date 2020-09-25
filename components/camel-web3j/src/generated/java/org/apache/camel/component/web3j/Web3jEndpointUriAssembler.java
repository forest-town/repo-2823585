/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.web3j;

import java.net.URISyntaxException;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.EndpointUriAssembler;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class Web3jEndpointUriAssembler extends org.apache.camel.support.component.EndpointUriAssemblerSupport implements EndpointUriAssembler {

    private static final String BASE = ":nodeAddress";

    @Override
    public boolean isEnabled(String scheme) {
        return "web3j".equals(scheme);
    }

    @Override
    public String buildUri(CamelContext camelContext, String scheme, Map<String, Object> parameters) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        uri = buildPathParameter(camelContext, syntax, uri, "nodeAddress", null, true, parameters);
        uri = buildQueryParameters(camelContext, uri, parameters);
        return uri;
    }
}

