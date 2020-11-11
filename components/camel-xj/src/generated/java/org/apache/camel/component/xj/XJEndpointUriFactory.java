/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.xj;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class XJEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":resourceUri";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(20);
        props.add("basicPropertyBinding");
        props.add("transformDirection");
        props.add("saxonConfiguration");
        props.add("synchronous");
        props.add("contentCache");
        props.add("resourceUri");
        props.add("allowStAX");
        props.add("deleteOutputFile");
        props.add("output");
        props.add("errorListener");
        props.add("lazyStartProducer");
        props.add("entityResolver");
        props.add("transformerFactoryConfigurationStrategy");
        props.add("saxonExtensionFunctions");
        props.add("failOnNullBody");
        props.add("transformerCacheSize");
        props.add("resultHandlerFactory");
        props.add("transformerFactoryClass");
        props.add("transformerFactory");
        props.add("uriResolver");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "xj".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "resourceUri", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

