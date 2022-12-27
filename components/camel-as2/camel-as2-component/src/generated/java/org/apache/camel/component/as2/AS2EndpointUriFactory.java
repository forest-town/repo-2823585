/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.as2;

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
public class AS2EndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":apiName/methodName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(37);
        props.add("apiName");
        props.add("as2From");
        props.add("as2MessageStructure");
        props.add("as2To");
        props.add("as2Version");
        props.add("attachedFileName");
        props.add("clientFqdn");
        props.add("compressionAlgorithm");
        props.add("decryptingPrivateKey");
        props.add("dispositionNotificationTo");
        props.add("ediMessage");
        props.add("ediMessageContentType");
        props.add("ediMessageTransferEncoding");
        props.add("ediMessageType");
        props.add("encryptingAlgorithm");
        props.add("encryptingCertificateChain");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("from");
        props.add("inBody");
        props.add("lazyStartProducer");
        props.add("mdnMessageTemplate");
        props.add("methodName");
        props.add("requestUri");
        props.add("requestUriPattern");
        props.add("server");
        props.add("serverFqdn");
        props.add("serverPortNumber");
        props.add("signedReceiptMicAlgorithms");
        props.add("signingAlgorithm");
        props.add("signingCertificateChain");
        props.add("signingPrivateKey");
        props.add("sslContext");
        props.add("subject");
        props.add("targetHostname");
        props.add("targetPortNumber");
        props.add("userAgent");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        MULTI_VALUE_PREFIXES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "as2".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "apiName", null, true, copy);
        uri = buildPathParameter(syntax, uri, "methodName", null, true, copy);
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

