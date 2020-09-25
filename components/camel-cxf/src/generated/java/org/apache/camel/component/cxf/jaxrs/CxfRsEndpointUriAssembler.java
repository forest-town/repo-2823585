/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.cxf.jaxrs;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.spi.EndpointUriAssembler;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class CxfRsEndpointUriAssembler extends org.apache.camel.support.component.EndpointUriAssemblerSupport implements EndpointUriAssembler {

    private static final String BASE = ":beanId:address";

    @Override
    public boolean isEnabled(String scheme) {
        return "cxfrs".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> parameters) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(parameters);

        uri = buildPathParameter(syntax, uri, "beanId", null, false, copy);
        uri = buildPathParameter(syntax, uri, "address", null, false, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }
}

