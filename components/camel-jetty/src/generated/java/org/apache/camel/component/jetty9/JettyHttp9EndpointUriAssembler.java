/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jetty9;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.spi.EndpointUriAssembler;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class JettyHttp9EndpointUriAssembler extends org.apache.camel.support.component.EndpointUriAssemblerSupport implements EndpointUriAssembler {

    private static final String BASE = ":httpUri";

    @Override
    public boolean isEnabled(String scheme) {
        return "jetty".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> parameters) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(parameters);

        uri = buildPathParameter(syntax, uri, "httpUri", null, true, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }
}

