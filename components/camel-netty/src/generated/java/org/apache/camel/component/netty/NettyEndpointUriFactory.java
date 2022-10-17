/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.netty;

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
public class NettyEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":protocol://host:port";

    private static final Set<String> PROPERTY_NAMES = Set.of(
            "allowDefaultCodec", "allowSerializedHeaders", "autoAppendDelimiter", "backlog", "bossCount", "bossGroup",
            "bridgeErrorHandler", "broadcast", "channelGroup", "clientInitializerFactory", "clientMode", "connectTimeout",
            "correlationManager", "decoderMaxLineLength", "decoders", "delimiter", "disconnect", "disconnectOnNoReply",
            "enabledProtocols", "encoders", "encoding", "exceptionHandler", "exchangePattern", "host",
            "hostnameVerification", "keepAlive", "keyStoreFile", "keyStoreFormat", "keyStoreResource",
            "lazyChannelCreation", "lazyStartProducer", "nativeTransport", "needClientAuth", "nettyServerBootstrapFactory",
            "networkInterface", "noReplyLogLevel", "options", "passphrase", "port", "producerPoolEnabled",
            "producerPoolMaxIdle", "producerPoolMaxTotal", "producerPoolMinEvictableIdle", "producerPoolMinIdle",
            "protocol", "receiveBufferSize", "receiveBufferSizePredictor", "reconnect", "reconnectInterval",
            "requestTimeout", "reuseAddress", "reuseChannel", "securityProvider", "sendBufferSize",
            "serverClosedChannelExceptionCaughtLogLevel", "serverExceptionCaughtLogLevel", "serverInitializerFactory",
            "ssl", "sslClientCertHeaders", "sslContextParameters", "sslHandler", "sync", "synchronous", "tcpNoDelay",
            "textline", "transferExchange", "trustStoreFile", "trustStoreResource", "udpByteArrayCodec",
            "udpConnectionlessSending", "useByteBuf", "usingExecutorService", "workerCount", "workerGroup");
    private static final Set<String> SECRET_PROPERTY_NAMES = Set.of(
            "passphrase");
    private static final Set<String> MULTI_VALUE_PREFIXES = Set.of(
            "option.");

    @Override
    public boolean isEnabled(String scheme) {
        return "netty".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "protocol", null, true, copy);
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

