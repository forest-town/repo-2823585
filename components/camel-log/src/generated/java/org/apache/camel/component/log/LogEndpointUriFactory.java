/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.log;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class LogEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":loggerName";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(29);
        set.add("loggerName");
        set.add("groupActiveOnly");
        set.add("groupDelay");
        set.add("groupInterval");
        set.add("groupSize");
        set.add("lazyStartProducer");
        set.add("level");
        set.add("logMask");
        set.add("marker");
        set.add("basicPropertyBinding");
        set.add("exchangeFormatter");
        set.add("synchronous");
        set.add("maxChars");
        set.add("multiline");
        set.add("showAll");
        set.add("showBody");
        set.add("showBodyType");
        set.add("showCaughtException");
        set.add("showException");
        set.add("showExchangeId");
        set.add("showExchangePattern");
        set.add("showFiles");
        set.add("showFuture");
        set.add("showHeaders");
        set.add("showProperties");
        set.add("showStackTrace");
        set.add("showStreams");
        set.add("skipBodyLineSeparator");
        set.add("style");
        PROPERTY_NAMES = set;
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "log".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "loggerName", null, true, copy);
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

