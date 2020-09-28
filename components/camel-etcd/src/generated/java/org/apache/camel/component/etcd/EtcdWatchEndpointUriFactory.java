/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.etcd;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class EtcdWatchEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":path";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(15);
        set.add("path");
        set.add("bridgeErrorHandler");
        set.add("recursive");
        set.add("servicePath");
        set.add("uris");
        set.add("sendEmptyExchangeOnTimeout");
        set.add("timeout");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("fromIndex");
        set.add("basicPropertyBinding");
        set.add("synchronous");
        set.add("password");
        set.add("sslContextParameters");
        set.add("userName");
        PROPERTY_NAMES = set;
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "etcd-watch".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "path", null, false, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

