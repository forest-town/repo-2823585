/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.FaultToleranceConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class FaultToleranceConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.FaultToleranceConfigurationProperties target = (org.apache.camel.main.FaultToleranceConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bulkheadenabled":
        case "BulkheadEnabled": target.setBulkheadEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "bulkheadexecutorserviceref":
        case "BulkheadExecutorServiceRef": target.setBulkheadExecutorServiceRef(property(camelContext, java.lang.String.class, value)); return true;
        case "bulkheadmaxconcurrentcalls":
        case "BulkheadMaxConcurrentCalls": target.setBulkheadMaxConcurrentCalls(property(camelContext, java.lang.Integer.class, value)); return true;
        case "bulkheadwaitingtaskqueue":
        case "BulkheadWaitingTaskQueue": target.setBulkheadWaitingTaskQueue(property(camelContext, java.lang.Integer.class, value)); return true;
        case "circuitbreakerref":
        case "CircuitBreakerRef": target.setCircuitBreakerRef(property(camelContext, java.lang.String.class, value)); return true;
        case "delay":
        case "Delay": target.setDelay(property(camelContext, java.lang.Long.class, value)); return true;
        case "failureratio":
        case "FailureRatio": target.setFailureRatio(property(camelContext, java.lang.Integer.class, value)); return true;
        case "requestvolumethreshold":
        case "RequestVolumeThreshold": target.setRequestVolumeThreshold(property(camelContext, java.lang.Integer.class, value)); return true;
        case "successthreshold":
        case "SuccessThreshold": target.setSuccessThreshold(property(camelContext, java.lang.Integer.class, value)); return true;
        case "timeoutduration":
        case "TimeoutDuration": target.setTimeoutDuration(property(camelContext, java.lang.Long.class, value)); return true;
        case "timeoutenabled":
        case "TimeoutEnabled": target.setTimeoutEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "timeoutpoolsize":
        case "TimeoutPoolSize": target.setTimeoutPoolSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "timeoutscheduledexecutorserviceref":
        case "TimeoutScheduledExecutorServiceRef": target.setTimeoutScheduledExecutorServiceRef(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("BulkheadEnabled", java.lang.Boolean.class);
        answer.put("BulkheadExecutorServiceRef", java.lang.String.class);
        answer.put("BulkheadMaxConcurrentCalls", java.lang.Integer.class);
        answer.put("BulkheadWaitingTaskQueue", java.lang.Integer.class);
        answer.put("CircuitBreakerRef", java.lang.String.class);
        answer.put("Delay", java.lang.Long.class);
        answer.put("FailureRatio", java.lang.Integer.class);
        answer.put("RequestVolumeThreshold", java.lang.Integer.class);
        answer.put("SuccessThreshold", java.lang.Integer.class);
        answer.put("TimeoutDuration", java.lang.Long.class);
        answer.put("TimeoutEnabled", java.lang.Boolean.class);
        answer.put("TimeoutPoolSize", java.lang.Integer.class);
        answer.put("TimeoutScheduledExecutorServiceRef", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.FaultToleranceConfigurationProperties target = (org.apache.camel.main.FaultToleranceConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bulkheadenabled":
        case "BulkheadEnabled": return target.getBulkheadEnabled();
        case "bulkheadexecutorserviceref":
        case "BulkheadExecutorServiceRef": return target.getBulkheadExecutorServiceRef();
        case "bulkheadmaxconcurrentcalls":
        case "BulkheadMaxConcurrentCalls": return target.getBulkheadMaxConcurrentCalls();
        case "bulkheadwaitingtaskqueue":
        case "BulkheadWaitingTaskQueue": return target.getBulkheadWaitingTaskQueue();
        case "circuitbreakerref":
        case "CircuitBreakerRef": return target.getCircuitBreakerRef();
        case "delay":
        case "Delay": return target.getDelay();
        case "failureratio":
        case "FailureRatio": return target.getFailureRatio();
        case "requestvolumethreshold":
        case "RequestVolumeThreshold": return target.getRequestVolumeThreshold();
        case "successthreshold":
        case "SuccessThreshold": return target.getSuccessThreshold();
        case "timeoutduration":
        case "TimeoutDuration": return target.getTimeoutDuration();
        case "timeoutenabled":
        case "TimeoutEnabled": return target.getTimeoutEnabled();
        case "timeoutpoolsize":
        case "TimeoutPoolSize": return target.getTimeoutPoolSize();
        case "timeoutscheduledexecutorserviceref":
        case "TimeoutScheduledExecutorServiceRef": return target.getTimeoutScheduledExecutorServiceRef();
        default: return null;
        }
    }
}

