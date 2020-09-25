/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ganglia;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.spi.EndpointUriAssembler;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class GangliaEndpointUriAssembler extends org.apache.camel.support.component.EndpointUriAssemblerSupport implements EndpointUriAssembler {

    private static final String BASE = ":host:port";

    @Override
    public boolean isEnabled(String scheme) {
        return "ganglia".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> parameters) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(parameters);

        uri = buildPathParameter(syntax, uri, "host", "239.2.11.71", false, copy);
        uri = buildPathParameter(syntax, uri, "port", "8649", false, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }
}

