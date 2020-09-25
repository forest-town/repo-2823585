/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.ddbstream;

import java.net.URISyntaxException;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.EndpointUriAssembler;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class Ddb2StreamEndpointUriAssembler extends org.apache.camel.support.component.EndpointUriAssemblerSupport implements EndpointUriAssembler {

    private static final String BASE = ":tableName";

    @Override
    public boolean isEnabled(String scheme) {
        return "aws2-ddbstream".equals(scheme);
    }

    @Override
    public String buildUri(CamelContext camelContext, String scheme, Map<String, Object> parameters) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        uri = buildPathParameter(camelContext, syntax, uri, "tableName", null, true, parameters);
        uri = buildQueryParameters(camelContext, uri, parameters);
        return uri;
    }
}

