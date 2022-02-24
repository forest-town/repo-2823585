/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.azure.servicebus;

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
public class ServiceBusEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":topicOrQueueName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(26);
        props.add("clientOptions");
        props.add("connectionString");
        props.add("prefetchCount");
        props.add("serviceBusTransactionContext");
        props.add("scheduledEnqueueTime");
        props.add("consumerOperation");
        props.add("senderAsyncClient");
        props.add("bridgeErrorHandler");
        props.add("peekNumMaxMessages");
        props.add("topicOrQueueName");
        props.add("serviceBusType");
        props.add("receiverAsyncClient");
        props.add("fullyQualifiedNamespace");
        props.add("exchangePattern");
        props.add("producerOperation");
        props.add("amqpTransportType");
        props.add("serviceBusReceiveMode");
        props.add("lazyStartProducer");
        props.add("subQueue");
        props.add("subscriptionName");
        props.add("amqpRetryOptions");
        props.add("proxyOptions");
        props.add("tokenCredential");
        props.add("disableAutoComplete");
        props.add("exceptionHandler");
        props.add("maxAutoLockRenewDuration");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(1);
        secretProps.add("connectionString");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
        MULTI_VALUE_PREFIXES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "azure-servicebus".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "topicOrQueueName", null, false, copy);
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

