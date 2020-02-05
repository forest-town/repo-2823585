/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sql;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SqlEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SqlEndpoint target = (SqlEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allownamedparameters":
        case "allowNamedParameters": target.setAllowNamedParameters(property(camelContext, boolean.class, value)); return true;
        case "datasource":
        case "dataSource": target.setDataSource(property(camelContext, javax.sql.DataSource.class, value)); return true;
        case "datasourceref":
        case "dataSourceRef": target.setDataSourceRef(property(camelContext, java.lang.String.class, value)); return true;
        case "outputclass":
        case "outputClass": target.setOutputClass(property(camelContext, java.lang.String.class, value)); return true;
        case "outputheader":
        case "outputHeader": target.setOutputHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "outputtype":
        case "outputType": target.setOutputType(property(camelContext, org.apache.camel.component.sql.SqlOutputType.class, value)); return true;
        case "separator": target.setSeparator(property(camelContext, char.class, value)); return true;
        case "breakbatchonconsumefail":
        case "breakBatchOnConsumeFail": target.setBreakBatchOnConsumeFail(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "expectedupdatecount":
        case "expectedUpdateCount": target.setExpectedUpdateCount(property(camelContext, int.class, value)); return true;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": target.setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "onconsume":
        case "onConsume": target.setOnConsume(property(camelContext, java.lang.String.class, value)); return true;
        case "onconsumebatchcomplete":
        case "onConsumeBatchComplete": target.setOnConsumeBatchComplete(property(camelContext, java.lang.String.class, value)); return true;
        case "onconsumefailed":
        case "onConsumeFailed": target.setOnConsumeFailed(property(camelContext, java.lang.String.class, value)); return true;
        case "routeemptyresultset":
        case "routeEmptyResultSet": target.setRouteEmptyResultSet(property(camelContext, boolean.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "transacted": target.setTransacted(property(camelContext, boolean.class, value)); return true;
        case "useiterator":
        case "useIterator": target.setUseIterator(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "processingstrategy":
        case "processingStrategy": target.setProcessingStrategy(property(camelContext, org.apache.camel.component.sql.SqlProcessingStrategy.class, value)); return true;
        case "batch": target.setBatch(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "noop": target.setNoop(property(camelContext, boolean.class, value)); return true;
        case "usemessagebodyforsql":
        case "useMessageBodyForSql": target.setUseMessageBodyForSql(property(camelContext, boolean.class, value)); return true;
        case "alwayspopulatestatement":
        case "alwaysPopulateStatement": target.setAlwaysPopulateStatement(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "parameterscount":
        case "parametersCount": target.setParametersCount(property(camelContext, int.class, value)); return true;
        case "placeholder": target.setPlaceholder(property(camelContext, java.lang.String.class, value)); return true;
        case "preparestatementstrategy":
        case "prepareStatementStrategy": target.setPrepareStatementStrategy(property(camelContext, org.apache.camel.component.sql.SqlPrepareStatementStrategy.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "templateoptions":
        case "templateOptions": target.setTemplateOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "useplaceholder":
        case "usePlaceholder": target.setUsePlaceholder(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

