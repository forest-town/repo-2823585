/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.hdfs;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class HdfsEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":hostName:port/path";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(50);
        set.add("hostName");
        set.add("port");
        set.add("path");
        set.add("connectOnStartup");
        set.add("fileSystemType");
        set.add("fileType");
        set.add("keyType");
        set.add("namedNodes");
        set.add("owner");
        set.add("valueType");
        set.add("bridgeErrorHandler");
        set.add("pattern");
        set.add("sendEmptyMessageWhenIdle");
        set.add("streamDownload");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("pollStrategy");
        set.add("append");
        set.add("lazyStartProducer");
        set.add("overwrite");
        set.add("basicPropertyBinding");
        set.add("blockSize");
        set.add("bufferSize");
        set.add("checkIdleInterval");
        set.add("chunkSize");
        set.add("compressionCodec");
        set.add("compressionType");
        set.add("openedSuffix");
        set.add("readSuffix");
        set.add("replication");
        set.add("splitStrategy");
        set.add("synchronous");
        set.add("maxMessagesPerPoll");
        set.add("backoffErrorThreshold");
        set.add("backoffIdleThreshold");
        set.add("backoffMultiplier");
        set.add("delay");
        set.add("greedy");
        set.add("initialDelay");
        set.add("repeatCount");
        set.add("runLoggingLevel");
        set.add("scheduledExecutorService");
        set.add("scheduler");
        set.add("schedulerProperties");
        set.add("startScheduler");
        set.add("timeUnit");
        set.add("useFixedDelay");
        set.add("kerberosConfigFileLocation");
        set.add("kerberosKeytabLocation");
        set.add("kerberosUsername");
        PROPERTY_NAMES = set;
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "hdfs".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "hostName", null, true, copy);
        uri = buildPathParameter(syntax, uri, "port", "8020", false, copy);
        uri = buildPathParameter(syntax, uri, "path", null, true, copy);
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

