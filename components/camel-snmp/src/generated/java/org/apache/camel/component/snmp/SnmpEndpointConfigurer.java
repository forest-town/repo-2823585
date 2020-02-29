/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.snmp;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SnmpEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SnmpEndpoint target = (SnmpEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authenticationpassphrase":
        case "authenticationPassphrase": target.setAuthenticationPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "authenticationprotocol":
        case "authenticationProtocol": target.setAuthenticationProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "oids": target.setOids(property(camelContext, org.apache.camel.component.snmp.OIDList.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "privacypassphrase":
        case "privacyPassphrase": target.setPrivacyPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "privacyprotocol":
        case "privacyProtocol": target.setPrivacyProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "protocol": target.setProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "retries": target.setRetries(property(camelContext, int.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "securitylevel":
        case "securityLevel": target.setSecurityLevel(property(camelContext, int.class, value)); return true;
        case "securityname":
        case "securityName": target.setSecurityName(property(camelContext, java.lang.String.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "snmpcommunity":
        case "snmpCommunity": target.setSnmpCommunity(property(camelContext, java.lang.String.class, value)); return true;
        case "snmpcontextengineid":
        case "snmpContextEngineId": target.setSnmpContextEngineId(property(camelContext, java.lang.String.class, value)); return true;
        case "snmpcontextname":
        case "snmpContextName": target.setSnmpContextName(property(camelContext, java.lang.String.class, value)); return true;
        case "snmpversion":
        case "snmpVersion": target.setSnmpVersion(property(camelContext, int.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "timeout": target.setTimeout(property(camelContext, int.class, value)); return true;
        case "treelist":
        case "treeList": target.setTreeList(property(camelContext, boolean.class, value)); return true;
        case "type": target.setType(property(camelContext, org.apache.camel.component.snmp.SnmpActionType.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

