/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.netty.http;

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
public class NettyHttpEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":protocol://host:port/path";

    private static final Set<String> PROPERTY_NAMES = Set.of(
            "allowSerializedHeaders", "backlog", "bossCount", "bossGroup", "bridgeEndpoint", "bridgeErrorHandler",
            "channelGroup", "chunkedMaxContentLength", "clientInitializerFactory", "compression", "configuration",
            "connectTimeout", "cookieHandler", "decoders", "disableStreamCache", "disconnect", "disconnectOnNoReply",
            "enabledProtocols", "encoders", "exceptionHandler", "exchangePattern", "headerFilterStrategy", "host",
            "hostnameVerification", "httpMethodRestrict", "keepAlive", "keyStoreFile", "keyStoreFormat",
            "keyStoreResource", "lazyChannelCreation", "lazyStartProducer", "logWarnOnBadRequest", "mapHeaders",
            "matchOnUriPrefix", "maxChunkSize", "maxHeaderSize", "maxInitialLineLength", "muteException",
            "nativeTransport", "needClientAuth", "nettyHttpBinding", "nettyServerBootstrapFactory",
            "nettySharedHttpServer", "noReplyLogLevel", "okStatusCodeRange", "options", "passphrase", "path", "port",
            "producerPoolEnabled", "producerPoolMaxIdle", "producerPoolMaxTotal", "producerPoolMinEvictableIdle",
            "producerPoolMinIdle", "protocol", "receiveBufferSize", "receiveBufferSizePredictor", "requestTimeout",
            "reuseAddress", "reuseChannel", "securityConfiguration", "securityOptions", "securityProvider",
            "send503whenSuspended", "sendBufferSize", "serverClosedChannelExceptionCaughtLogLevel",
            "serverExceptionCaughtLogLevel", "serverInitializerFactory", "ssl", "sslClientCertHeaders",
            "sslContextParameters", "sslHandler", "sync", "synchronous", "tcpNoDelay", "throwExceptionOnFailure",
            "traceEnabled", "transferException", "transferExchange", "trustStoreFile", "trustStoreResource",
            "urlDecodeHeaders", "useRelativePath", "usingExecutorService", "workerCount", "workerGroup");
    private static final Set<String> SECRET_PROPERTY_NAMES = Set.of(
            "passphrase");
    private static final Set<String> MULTI_VALUE_PREFIXES = Set.of(
            "option.", "securityConfiguration.");

    @Override
    public boolean isEnabled(String scheme) {
        return "netty-http".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "protocol", null, true, copy);
        uri = buildPathParameter(syntax, uri, "host", null, true, copy);
        uri = buildPathParameter(syntax, uri, "port", null, false, copy);
        uri = buildPathParameter(syntax, uri, "path", null, false, copy);
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
        return true;
    }
}

