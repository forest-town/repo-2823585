/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.file.remote;

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
public class FtpEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":host:port/directoryName";

    private static final Set<String> PROPERTY_NAMES = Set.of(
            "account", "activePortRange", "allowNullBody", "antExclude", "antFilterCaseSensitive", "antInclude",
            "autoCreate", "backoffErrorThreshold", "backoffIdleThreshold", "backoffMultiplier", "binary",
            "bridgeErrorHandler", "bufferSize", "charset", "chmod", "connectTimeout", "delay", "delete", "directoryName",
            "disconnect", "disconnectOnBatchComplete", "doneFileName", "download", "eagerDeleteTargetFile",
            "eagerMaxMessagesPerPoll", "exceptionHandler", "exchangePattern", "exclude", "excludeExt",
            "exclusiveReadLockStrategy", "fastExistsCheck", "fileExist", "fileName", "filter", "filterDirectory",
            "filterFile", "flatten", "ftpClient", "ftpClientConfig", "ftpClientConfigParameters", "ftpClientParameters",
            "greedy", "handleDirectoryParserAbsoluteResult", "host", "idempotent", "idempotentKey", "idempotentRepository",
            "ignoreFileNotFoundOrPermissionError", "inProgressRepository", "include", "includeExt", "initialDelay",
            "jailStartingDirectory", "keepLastModified", "lazyStartProducer", "localWorkDirectory", "maxDepth",
            "maxMessagesPerPoll", "maximumReconnectAttempts", "minDepth", "move", "moveExisting",
            "moveExistingFileStrategy", "moveFailed", "noop", "onCompletionExceptionHandler", "passiveMode", "password",
            "pollStrategy", "port", "preMove", "preSort", "processStrategy", "readLock", "readLockCheckInterval",
            "readLockDeleteOrphanLockFiles", "readLockLoggingLevel", "readLockMarkerFile", "readLockMinAge",
            "readLockMinLength", "readLockRemoveOnCommit", "readLockRemoveOnRollback", "readLockTimeout", "reconnectDelay",
            "recursive", "repeatCount", "resumeDownload", "runLoggingLevel", "scheduledExecutorService", "scheduler",
            "schedulerProperties", "sendEmptyMessageWhenIdle", "sendNoop", "separator", "shuffle", "siteCommand",
            "soTimeout", "sortBy", "sorter", "startScheduler", "stepwise", "streamDownload", "tempFileName", "tempPrefix",
            "throwExceptionOnConnectFailed", "timeUnit", "timeout", "transferLoggingIntervalSeconds",
            "transferLoggingLevel", "transferLoggingVerbose", "useFixedDelay", "useList", "username");
    private static final Set<String> SECRET_PROPERTY_NAMES = Set.of(
            "account", "password", "username");
    private static final Set<String> MULTI_VALUE_PREFIXES = Set.of(
            "ftpClient.", "ftpClientConfig.", "scheduler.");

    @Override
    public boolean isEnabled(String scheme) {
        return "ftp".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "host", null, true, copy);
        uri = buildPathParameter(syntax, uri, "port", null, false, copy);
        uri = buildPathParameter(syntax, uri, "directoryName", null, false, copy);
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

