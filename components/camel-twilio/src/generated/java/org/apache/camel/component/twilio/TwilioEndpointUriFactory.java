/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.twilio;

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
public class TwilioEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":apiName/methodName";

    private static final Set<String> PROPERTY_NAMES = Set.of(
            "apiName", "applicationSid", "areaCode", "backoffErrorThreshold", "backoffIdleThreshold", "backoffMultiplier",
            "body", "bridgeErrorHandler", "callbackUrl", "city", "credentialListSid", "customerName", "delay",
            "domainName", "endDate", "exceptionHandler", "exchangePattern", "friendlyName", "from", "greedy", "inBody",
            "initialDelay", "ipAccessControlListSid", "ipAddress", "isoCountry", "lazyStartProducer", "mediaUrl",
            "messagingServiceSid", "methodName", "password", "pathAccountSid", "pathAddOnResultSid", "pathAddressSid",
            "pathCallSid", "pathConferenceSid", "pathCountryCode", "pathCredentialListSid", "pathDomainSid",
            "pathIpAccessControlListSid", "pathMessageSid", "pathQueueSid", "pathRecordingSid", "pathReferenceSid",
            "pathSid", "phoneNumber", "pollStrategy", "postalCode", "qualityScore", "region", "repeatCount",
            "runLoggingLevel", "scheduledExecutorService", "scheduler", "schedulerProperties", "sendEmptyMessageWhenIdle",
            "startDate", "startScheduler", "status", "street", "timeUnit", "to", "triggerValue", "twiml", "url",
            "usageCategory", "useFixedDelay", "username");
    private static final Set<String> SECRET_PROPERTY_NAMES = Set.of();
    private static final Set<String> MULTI_VALUE_PREFIXES = Set.of(
            "scheduler.");

    @Override
    public boolean isEnabled(String scheme) {
        return "twilio".equals(scheme);
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

