/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.master;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.spi.EndpointUriAssembler;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class MasterEndpointUriAssembler extends org.apache.camel.support.component.EndpointUriAssemblerSupport implements EndpointUriAssembler {

    private static final String BASE = ":namespace:delegateUri";

    @Override
    public boolean isEnabled(String scheme) {
        return "master".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> parameters) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(parameters);

        uri = buildPathParameter(syntax, uri, "namespace", null, true, copy);
        uri = buildPathParameter(syntax, uri, "delegateUri", null, true, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }
}

