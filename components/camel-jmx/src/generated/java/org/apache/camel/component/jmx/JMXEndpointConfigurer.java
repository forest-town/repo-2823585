/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jmx;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JMXEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JMXEndpoint target = (JMXEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "differencemode":
        case "differenceMode": target.setDifferenceMode(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "executorservice":
        case "executorService": target.setExecutorService(property(camelContext, java.util.concurrent.ExecutorService.class, value)); return true;
        case "format": target.setFormat(property(camelContext, java.lang.String.class, value)); return true;
        case "granularityperiod":
        case "granularityPeriod": target.setGranularityPeriod(property(camelContext, long.class, value)); return true;
        case "handback": target.setHandback(property(camelContext, java.lang.Object.class, value)); return true;
        case "initthreshold":
        case "initThreshold": target.setInitThreshold(property(camelContext, int.class, value)); return true;
        case "modulus": target.setModulus(property(camelContext, int.class, value)); return true;
        case "monitortype":
        case "monitorType": target.setMonitorType(property(camelContext, java.lang.String.class, value)); return true;
        case "notificationfilter":
        case "notificationFilter": target.setNotificationFilter(property(camelContext, javax.management.NotificationFilter.class, value)); return true;
        case "notifydiffer":
        case "notifyDiffer": target.setNotifyDiffer(property(camelContext, boolean.class, value)); return true;
        case "notifyhigh":
        case "notifyHigh": target.setNotifyHigh(property(camelContext, boolean.class, value)); return true;
        case "notifylow":
        case "notifyLow": target.setNotifyLow(property(camelContext, boolean.class, value)); return true;
        case "notifymatch":
        case "notifyMatch": target.setNotifyMatch(property(camelContext, boolean.class, value)); return true;
        case "objectdomain":
        case "objectDomain": target.setObjectDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "objectname":
        case "objectName": target.setObjectName(property(camelContext, java.lang.String.class, value)); return true;
        case "objectproperties":
        case "objectProperties": target.setObjectProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "observedattribute":
        case "observedAttribute": target.setObservedAttribute(property(camelContext, java.lang.String.class, value)); return true;
        case "offset": target.setOffset(property(camelContext, int.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "reconnectdelay":
        case "reconnectDelay": target.setReconnectDelay(property(camelContext, int.class, value)); return true;
        case "reconnectonconnectionfailure":
        case "reconnectOnConnectionFailure": target.setReconnectOnConnectionFailure(property(camelContext, boolean.class, value)); return true;
        case "stringtocompare":
        case "stringToCompare": target.setStringToCompare(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "testconnectiononstartup":
        case "testConnectionOnStartup": target.setTestConnectionOnStartup(property(camelContext, boolean.class, value)); return true;
        case "thresholdhigh":
        case "thresholdHigh": target.setThresholdHigh(property(camelContext, java.lang.Double.class, value)); return true;
        case "thresholdlow":
        case "thresholdLow": target.setThresholdLow(property(camelContext, java.lang.Double.class, value)); return true;
        case "user": target.setUser(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

