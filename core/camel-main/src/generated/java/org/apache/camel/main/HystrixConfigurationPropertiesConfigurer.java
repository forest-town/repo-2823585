/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.HystrixConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class HystrixConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("AllowMaximumSizeToDivergeFromCoreSize", java.lang.Boolean.class);
        map.put("CircuitBreakerEnabled", java.lang.Boolean.class);
        map.put("CircuitBreakerErrorThresholdPercentage", java.lang.Integer.class);
        map.put("CircuitBreakerForceClosed", java.lang.Boolean.class);
        map.put("CircuitBreakerForceOpen", java.lang.Boolean.class);
        map.put("CircuitBreakerRequestVolumeThreshold", java.lang.Integer.class);
        map.put("CircuitBreakerSleepWindowInMilliseconds", java.lang.Integer.class);
        map.put("CorePoolSize", java.lang.Integer.class);
        map.put("ExecutionIsolationSemaphoreMaxConcurrentRequests", java.lang.Integer.class);
        map.put("ExecutionIsolationStrategy", java.lang.String.class);
        map.put("ExecutionIsolationThreadInterruptOnTimeout", java.lang.Boolean.class);
        map.put("ExecutionTimeoutEnabled", java.lang.Boolean.class);
        map.put("ExecutionTimeoutInMilliseconds", java.lang.Integer.class);
        map.put("FallbackEnabled", java.lang.Boolean.class);
        map.put("FallbackIsolationSemaphoreMaxConcurrentRequests", java.lang.Integer.class);
        map.put("GroupKey", java.lang.String.class);
        map.put("KeepAliveTime", java.lang.Integer.class);
        map.put("MaxQueueSize", java.lang.Integer.class);
        map.put("MaximumSize", java.lang.Integer.class);
        map.put("MetricsHealthSnapshotIntervalInMilliseconds", java.lang.Integer.class);
        map.put("MetricsRollingPercentileBucketSize", java.lang.Integer.class);
        map.put("MetricsRollingPercentileEnabled", java.lang.Boolean.class);
        map.put("MetricsRollingPercentileWindowBuckets", java.lang.Integer.class);
        map.put("MetricsRollingPercentileWindowInMilliseconds", java.lang.Integer.class);
        map.put("MetricsRollingStatisticalWindowBuckets", java.lang.Integer.class);
        map.put("MetricsRollingStatisticalWindowInMilliseconds", java.lang.Integer.class);
        map.put("QueueSizeRejectionThreshold", java.lang.Integer.class);
        map.put("RequestLogEnabled", java.lang.Boolean.class);
        map.put("ThreadPoolKey", java.lang.String.class);
        map.put("ThreadPoolRollingNumberStatisticalWindowBuckets", java.lang.Integer.class);
        map.put("ThreadPoolRollingNumberStatisticalWindowInMilliseconds", java.lang.Integer.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(HystrixConfigurationPropertiesConfigurer::clearBootstrapConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.HystrixConfigurationProperties target = (org.apache.camel.main.HystrixConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowmaximumsizetodivergefromcoresize":
        case "AllowMaximumSizeToDivergeFromCoreSize": target.setAllowMaximumSizeToDivergeFromCoreSize(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "circuitbreakerenabled":
        case "CircuitBreakerEnabled": target.setCircuitBreakerEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "circuitbreakererrorthresholdpercentage":
        case "CircuitBreakerErrorThresholdPercentage": target.setCircuitBreakerErrorThresholdPercentage(property(camelContext, java.lang.Integer.class, value)); return true;
        case "circuitbreakerforceclosed":
        case "CircuitBreakerForceClosed": target.setCircuitBreakerForceClosed(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "circuitbreakerforceopen":
        case "CircuitBreakerForceOpen": target.setCircuitBreakerForceOpen(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "circuitbreakerrequestvolumethreshold":
        case "CircuitBreakerRequestVolumeThreshold": target.setCircuitBreakerRequestVolumeThreshold(property(camelContext, java.lang.Integer.class, value)); return true;
        case "circuitbreakersleepwindowinmilliseconds":
        case "CircuitBreakerSleepWindowInMilliseconds": target.setCircuitBreakerSleepWindowInMilliseconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "corepoolsize":
        case "CorePoolSize": target.setCorePoolSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "executionisolationsemaphoremaxconcurrentrequests":
        case "ExecutionIsolationSemaphoreMaxConcurrentRequests": target.setExecutionIsolationSemaphoreMaxConcurrentRequests(property(camelContext, java.lang.Integer.class, value)); return true;
        case "executionisolationstrategy":
        case "ExecutionIsolationStrategy": target.setExecutionIsolationStrategy(property(camelContext, java.lang.String.class, value)); return true;
        case "executionisolationthreadinterruptontimeout":
        case "ExecutionIsolationThreadInterruptOnTimeout": target.setExecutionIsolationThreadInterruptOnTimeout(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "executiontimeoutenabled":
        case "ExecutionTimeoutEnabled": target.setExecutionTimeoutEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "executiontimeoutinmilliseconds":
        case "ExecutionTimeoutInMilliseconds": target.setExecutionTimeoutInMilliseconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "fallbackenabled":
        case "FallbackEnabled": target.setFallbackEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "fallbackisolationsemaphoremaxconcurrentrequests":
        case "FallbackIsolationSemaphoreMaxConcurrentRequests": target.setFallbackIsolationSemaphoreMaxConcurrentRequests(property(camelContext, java.lang.Integer.class, value)); return true;
        case "groupkey":
        case "GroupKey": target.setGroupKey(property(camelContext, java.lang.String.class, value)); return true;
        case "keepalivetime":
        case "KeepAliveTime": target.setKeepAliveTime(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxqueuesize":
        case "MaxQueueSize": target.setMaxQueueSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maximumsize":
        case "MaximumSize": target.setMaximumSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "metricshealthsnapshotintervalinmilliseconds":
        case "MetricsHealthSnapshotIntervalInMilliseconds": target.setMetricsHealthSnapshotIntervalInMilliseconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "metricsrollingpercentilebucketsize":
        case "MetricsRollingPercentileBucketSize": target.setMetricsRollingPercentileBucketSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "metricsrollingpercentileenabled":
        case "MetricsRollingPercentileEnabled": target.setMetricsRollingPercentileEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "metricsrollingpercentilewindowbuckets":
        case "MetricsRollingPercentileWindowBuckets": target.setMetricsRollingPercentileWindowBuckets(property(camelContext, java.lang.Integer.class, value)); return true;
        case "metricsrollingpercentilewindowinmilliseconds":
        case "MetricsRollingPercentileWindowInMilliseconds": target.setMetricsRollingPercentileWindowInMilliseconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "metricsrollingstatisticalwindowbuckets":
        case "MetricsRollingStatisticalWindowBuckets": target.setMetricsRollingStatisticalWindowBuckets(property(camelContext, java.lang.Integer.class, value)); return true;
        case "metricsrollingstatisticalwindowinmilliseconds":
        case "MetricsRollingStatisticalWindowInMilliseconds": target.setMetricsRollingStatisticalWindowInMilliseconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "queuesizerejectionthreshold":
        case "QueueSizeRejectionThreshold": target.setQueueSizeRejectionThreshold(property(camelContext, java.lang.Integer.class, value)); return true;
        case "requestlogenabled":
        case "RequestLogEnabled": target.setRequestLogEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "threadpoolkey":
        case "ThreadPoolKey": target.setThreadPoolKey(property(camelContext, java.lang.String.class, value)); return true;
        case "threadpoolrollingnumberstatisticalwindowbuckets":
        case "ThreadPoolRollingNumberStatisticalWindowBuckets": target.setThreadPoolRollingNumberStatisticalWindowBuckets(property(camelContext, java.lang.Integer.class, value)); return true;
        case "threadpoolrollingnumberstatisticalwindowinmilliseconds":
        case "ThreadPoolRollingNumberStatisticalWindowInMilliseconds": target.setThreadPoolRollingNumberStatisticalWindowInMilliseconds(property(camelContext, java.lang.Integer.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
        ALL_OPTIONS.clear();
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowmaximumsizetodivergefromcoresize":
        case "AllowMaximumSizeToDivergeFromCoreSize": return java.lang.Boolean.class;
        case "circuitbreakerenabled":
        case "CircuitBreakerEnabled": return java.lang.Boolean.class;
        case "circuitbreakererrorthresholdpercentage":
        case "CircuitBreakerErrorThresholdPercentage": return java.lang.Integer.class;
        case "circuitbreakerforceclosed":
        case "CircuitBreakerForceClosed": return java.lang.Boolean.class;
        case "circuitbreakerforceopen":
        case "CircuitBreakerForceOpen": return java.lang.Boolean.class;
        case "circuitbreakerrequestvolumethreshold":
        case "CircuitBreakerRequestVolumeThreshold": return java.lang.Integer.class;
        case "circuitbreakersleepwindowinmilliseconds":
        case "CircuitBreakerSleepWindowInMilliseconds": return java.lang.Integer.class;
        case "corepoolsize":
        case "CorePoolSize": return java.lang.Integer.class;
        case "executionisolationsemaphoremaxconcurrentrequests":
        case "ExecutionIsolationSemaphoreMaxConcurrentRequests": return java.lang.Integer.class;
        case "executionisolationstrategy":
        case "ExecutionIsolationStrategy": return java.lang.String.class;
        case "executionisolationthreadinterruptontimeout":
        case "ExecutionIsolationThreadInterruptOnTimeout": return java.lang.Boolean.class;
        case "executiontimeoutenabled":
        case "ExecutionTimeoutEnabled": return java.lang.Boolean.class;
        case "executiontimeoutinmilliseconds":
        case "ExecutionTimeoutInMilliseconds": return java.lang.Integer.class;
        case "fallbackenabled":
        case "FallbackEnabled": return java.lang.Boolean.class;
        case "fallbackisolationsemaphoremaxconcurrentrequests":
        case "FallbackIsolationSemaphoreMaxConcurrentRequests": return java.lang.Integer.class;
        case "groupkey":
        case "GroupKey": return java.lang.String.class;
        case "keepalivetime":
        case "KeepAliveTime": return java.lang.Integer.class;
        case "maxqueuesize":
        case "MaxQueueSize": return java.lang.Integer.class;
        case "maximumsize":
        case "MaximumSize": return java.lang.Integer.class;
        case "metricshealthsnapshotintervalinmilliseconds":
        case "MetricsHealthSnapshotIntervalInMilliseconds": return java.lang.Integer.class;
        case "metricsrollingpercentilebucketsize":
        case "MetricsRollingPercentileBucketSize": return java.lang.Integer.class;
        case "metricsrollingpercentileenabled":
        case "MetricsRollingPercentileEnabled": return java.lang.Boolean.class;
        case "metricsrollingpercentilewindowbuckets":
        case "MetricsRollingPercentileWindowBuckets": return java.lang.Integer.class;
        case "metricsrollingpercentilewindowinmilliseconds":
        case "MetricsRollingPercentileWindowInMilliseconds": return java.lang.Integer.class;
        case "metricsrollingstatisticalwindowbuckets":
        case "MetricsRollingStatisticalWindowBuckets": return java.lang.Integer.class;
        case "metricsrollingstatisticalwindowinmilliseconds":
        case "MetricsRollingStatisticalWindowInMilliseconds": return java.lang.Integer.class;
        case "queuesizerejectionthreshold":
        case "QueueSizeRejectionThreshold": return java.lang.Integer.class;
        case "requestlogenabled":
        case "RequestLogEnabled": return java.lang.Boolean.class;
        case "threadpoolkey":
        case "ThreadPoolKey": return java.lang.String.class;
        case "threadpoolrollingnumberstatisticalwindowbuckets":
        case "ThreadPoolRollingNumberStatisticalWindowBuckets": return java.lang.Integer.class;
        case "threadpoolrollingnumberstatisticalwindowinmilliseconds":
        case "ThreadPoolRollingNumberStatisticalWindowInMilliseconds": return java.lang.Integer.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.HystrixConfigurationProperties target = (org.apache.camel.main.HystrixConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowmaximumsizetodivergefromcoresize":
        case "AllowMaximumSizeToDivergeFromCoreSize": return target.getAllowMaximumSizeToDivergeFromCoreSize();
        case "circuitbreakerenabled":
        case "CircuitBreakerEnabled": return target.getCircuitBreakerEnabled();
        case "circuitbreakererrorthresholdpercentage":
        case "CircuitBreakerErrorThresholdPercentage": return target.getCircuitBreakerErrorThresholdPercentage();
        case "circuitbreakerforceclosed":
        case "CircuitBreakerForceClosed": return target.getCircuitBreakerForceClosed();
        case "circuitbreakerforceopen":
        case "CircuitBreakerForceOpen": return target.getCircuitBreakerForceOpen();
        case "circuitbreakerrequestvolumethreshold":
        case "CircuitBreakerRequestVolumeThreshold": return target.getCircuitBreakerRequestVolumeThreshold();
        case "circuitbreakersleepwindowinmilliseconds":
        case "CircuitBreakerSleepWindowInMilliseconds": return target.getCircuitBreakerSleepWindowInMilliseconds();
        case "corepoolsize":
        case "CorePoolSize": return target.getCorePoolSize();
        case "executionisolationsemaphoremaxconcurrentrequests":
        case "ExecutionIsolationSemaphoreMaxConcurrentRequests": return target.getExecutionIsolationSemaphoreMaxConcurrentRequests();
        case "executionisolationstrategy":
        case "ExecutionIsolationStrategy": return target.getExecutionIsolationStrategy();
        case "executionisolationthreadinterruptontimeout":
        case "ExecutionIsolationThreadInterruptOnTimeout": return target.getExecutionIsolationThreadInterruptOnTimeout();
        case "executiontimeoutenabled":
        case "ExecutionTimeoutEnabled": return target.getExecutionTimeoutEnabled();
        case "executiontimeoutinmilliseconds":
        case "ExecutionTimeoutInMilliseconds": return target.getExecutionTimeoutInMilliseconds();
        case "fallbackenabled":
        case "FallbackEnabled": return target.getFallbackEnabled();
        case "fallbackisolationsemaphoremaxconcurrentrequests":
        case "FallbackIsolationSemaphoreMaxConcurrentRequests": return target.getFallbackIsolationSemaphoreMaxConcurrentRequests();
        case "groupkey":
        case "GroupKey": return target.getGroupKey();
        case "keepalivetime":
        case "KeepAliveTime": return target.getKeepAliveTime();
        case "maxqueuesize":
        case "MaxQueueSize": return target.getMaxQueueSize();
        case "maximumsize":
        case "MaximumSize": return target.getMaximumSize();
        case "metricshealthsnapshotintervalinmilliseconds":
        case "MetricsHealthSnapshotIntervalInMilliseconds": return target.getMetricsHealthSnapshotIntervalInMilliseconds();
        case "metricsrollingpercentilebucketsize":
        case "MetricsRollingPercentileBucketSize": return target.getMetricsRollingPercentileBucketSize();
        case "metricsrollingpercentileenabled":
        case "MetricsRollingPercentileEnabled": return target.getMetricsRollingPercentileEnabled();
        case "metricsrollingpercentilewindowbuckets":
        case "MetricsRollingPercentileWindowBuckets": return target.getMetricsRollingPercentileWindowBuckets();
        case "metricsrollingpercentilewindowinmilliseconds":
        case "MetricsRollingPercentileWindowInMilliseconds": return target.getMetricsRollingPercentileWindowInMilliseconds();
        case "metricsrollingstatisticalwindowbuckets":
        case "MetricsRollingStatisticalWindowBuckets": return target.getMetricsRollingStatisticalWindowBuckets();
        case "metricsrollingstatisticalwindowinmilliseconds":
        case "MetricsRollingStatisticalWindowInMilliseconds": return target.getMetricsRollingStatisticalWindowInMilliseconds();
        case "queuesizerejectionthreshold":
        case "QueueSizeRejectionThreshold": return target.getQueueSizeRejectionThreshold();
        case "requestlogenabled":
        case "RequestLogEnabled": return target.getRequestLogEnabled();
        case "threadpoolkey":
        case "ThreadPoolKey": return target.getThreadPoolKey();
        case "threadpoolrollingnumberstatisticalwindowbuckets":
        case "ThreadPoolRollingNumberStatisticalWindowBuckets": return target.getThreadPoolRollingNumberStatisticalWindowBuckets();
        case "threadpoolrollingnumberstatisticalwindowinmilliseconds":
        case "ThreadPoolRollingNumberStatisticalWindowInMilliseconds": return target.getThreadPoolRollingNumberStatisticalWindowInMilliseconds();
        default: return null;
        }
    }
}

