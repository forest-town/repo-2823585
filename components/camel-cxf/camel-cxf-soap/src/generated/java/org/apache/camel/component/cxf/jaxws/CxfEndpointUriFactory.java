/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.cxf.jaxws;

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
public class CxfEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":beanId:address";

    private static final Set<String> PROPERTY_NAMES = Set.of(
            "address", "allowStreaming", "beanId", "bindingId", "bridgeErrorHandler", "bus", "continuationTimeout",
            "cookieHandler", "cxfBinding", "cxfConfigurer", "dataFormat", "defaultBus", "defaultOperationName",
            "defaultOperationNamespace", "exceptionHandler", "exchangePattern", "headerFilterStrategy", "hostnameVerifier",
            "lazyStartProducer", "loggingFeatureEnabled", "loggingSizeLimit", "mergeProtocolHeaders", "mtomEnabled",
            "password", "portName", "properties", "publishedEndpointUrl", "schemaValidationEnabled", "serviceClass",
            "serviceName", "skipFaultLogging", "skipPayloadMessagePartCheck", "sslContextParameters", "synchronous",
            "username", "wrapped", "wrappedStyle", "wsdlURL");
    private static final Set<String> SECRET_PROPERTY_NAMES = Set.of(
            "password", "username");
    private static final Set<String> MULTI_VALUE_PREFIXES = Set.of(
            "properties.");

    @Override
    public boolean isEnabled(String scheme) {
        return "cxf".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "beanId", null, false, copy);
        uri = buildPathParameter(syntax, uri, "address", null, false, copy);
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

