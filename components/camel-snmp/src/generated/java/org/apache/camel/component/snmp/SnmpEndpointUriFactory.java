/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.snmp;

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
public class SnmpEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":host:port";

    private static final Set<String> PROPERTY_NAMES = Set.of(
            "authenticationPassphrase", "authenticationProtocol", "backoffErrorThreshold", "backoffIdleThreshold",
            "backoffMultiplier", "bridgeErrorHandler", "delay", "exceptionHandler", "exchangePattern", "greedy", "host",
            "initialDelay", "lazyStartProducer", "oids", "pollStrategy", "port", "privacyPassphrase", "privacyProtocol",
            "protocol", "repeatCount", "retries", "runLoggingLevel", "scheduledExecutorService", "scheduler",
            "schedulerProperties", "securityLevel", "securityName", "sendEmptyMessageWhenIdle", "snmpCommunity",
            "snmpContextEngineId", "snmpContextName", "snmpVersion", "startScheduler", "timeUnit", "timeout", "treeList",
            "type", "useFixedDelay");
    private static final Set<String> SECRET_PROPERTY_NAMES = Set.of(
            "authenticationPassphrase", "privacyPassphrase", "privacyProtocol", "securityName");
    private static final Set<String> MULTI_VALUE_PREFIXES = Set.of(
            "scheduler.");

    @Override
    public boolean isEnabled(String scheme) {
        return "snmp".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "host", null, true, copy);
        uri = buildPathParameter(syntax, uri, "port", null, true, copy);
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

