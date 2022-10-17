/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.sheets.stream;

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
public class GoogleSheetsStreamEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":spreadsheetId";

    private static final Set<String> PROPERTY_NAMES = Set.of(
            "accessToken", "applicationName", "backoffErrorThreshold", "backoffIdleThreshold", "backoffMultiplier",
            "bridgeErrorHandler", "clientId", "clientSecret", "delay", "delegate", "exceptionHandler", "exchangePattern",
            "greedy", "includeGridData", "initialDelay", "majorDimension", "maxResults", "pollStrategy", "range",
            "refreshToken", "repeatCount", "runLoggingLevel", "scheduledExecutorService", "scheduler",
            "schedulerProperties", "scopes", "sendEmptyMessageWhenIdle", "serviceAccountKey", "splitResults",
            "spreadsheetId", "startScheduler", "timeUnit", "useFixedDelay", "valueRenderOption");
    private static final Set<String> SECRET_PROPERTY_NAMES = Set.of(
            "accessToken", "clientSecret", "refreshToken");
    private static final Set<String> MULTI_VALUE_PREFIXES = Set.of(
            "scheduler.");

    @Override
    public boolean isEnabled(String scheme) {
        return "google-sheets-stream".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "spreadsheetId", null, true, copy);
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
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

