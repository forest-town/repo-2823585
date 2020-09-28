/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.language;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class LanguageEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":languageName:resourceUri";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(11);
        set.add("languageName");
        set.add("resourceUri");
        set.add("allowContextMapAll");
        set.add("binary");
        set.add("cacheScript");
        set.add("contentCache");
        set.add("lazyStartProducer");
        set.add("script");
        set.add("transform");
        set.add("basicPropertyBinding");
        set.add("synchronous");
        PROPERTY_NAMES = set;
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "language".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "languageName", null, true, copy);
        uri = buildPathParameter(syntax, uri, "resourceUri", null, false, copy);
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

