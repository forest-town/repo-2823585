/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.undertow;

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
public class UndertowEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":httpURI";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(32);
        props.add("basicPropertyBinding");
        props.add("sendTimeout");
        props.add("synchronous");
        props.add("sendToAll");
        props.add("sslContextParameters");
        props.add("undertowHttpBinding");
        props.add("useStreaming");
        props.add("bridgeErrorHandler");
        props.add("securityProvider");
        props.add("httpURI");
        props.add("transferException");
        props.add("headerFilterStrategy");
        props.add("options");
        props.add("tcpNoDelay");
        props.add("muteException");
        props.add("reuseAddresses");
        props.add("keepAlive");
        props.add("throwExceptionOnFailure");
        props.add("httpMethodRestrict");
        props.add("allowedRoles");
        props.add("matchOnUriPrefix");
        props.add("exchangePattern");
        props.add("accessLog");
        props.add("lazyStartProducer");
        props.add("preserveHostHeader");
        props.add("fireWebSocketChannelEvents");
        props.add("handlers");
        props.add("accessLogReceiver");
        props.add("optionsEnabled");
        props.add("cookieHandler");
        props.add("exceptionHandler");
        props.add("securityConfiguration");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "undertow".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "httpURI", null, true, copy);
        uri = buildQueryParameters(uri, copy);
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
        return true;
    }
}

