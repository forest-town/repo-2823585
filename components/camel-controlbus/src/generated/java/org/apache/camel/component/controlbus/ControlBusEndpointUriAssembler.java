/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.controlbus;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.spi.EndpointUriAssembler;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class ControlBusEndpointUriAssembler extends org.apache.camel.support.component.EndpointUriAssemblerSupport implements EndpointUriAssembler {

    private static final String BASE = ":command:language";

    @Override
    public boolean isEnabled(String scheme) {
        return "controlbus".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> parameters) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(parameters);

        uri = buildPathParameter(syntax, uri, "command", null, true, copy);
        uri = buildPathParameter(syntax, uri, "language", null, false, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }
}

