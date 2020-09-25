/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.cassandra;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.spi.EndpointUriAssembler;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class CassandraEndpointUriAssembler extends org.apache.camel.support.component.EndpointUriAssemblerSupport implements EndpointUriAssembler {

    private static final String BASE = ":beanRef:hosts:port/keyspace";

    @Override
    public boolean isEnabled(String scheme) {
        return "cql".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> parameters) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(parameters);

        uri = buildPathParameter(syntax, uri, "beanRef", null, false, copy);
        uri = buildPathParameter(syntax, uri, "hosts", null, false, copy);
        uri = buildPathParameter(syntax, uri, "port", null, false, copy);
        uri = buildPathParameter(syntax, uri, "keyspace", null, false, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }
}

