/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.robotframework;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class RobotFrameworkEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        RobotFrameworkEndpoint target = (RobotFrameworkEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcontextmapall":
        case "allowContextMapAll": target.getConfiguration().setAllowContextMapAll(property(camelContext, boolean.class, value)); return true;
        case "allowtemplatefromheader":
        case "allowTemplateFromHeader": target.getConfiguration().setAllowTemplateFromHeader(property(camelContext, boolean.class, value)); return true;
        case "argumentfile":
        case "argumentFile": target.getConfiguration().setArgumentFile(property(camelContext, java.io.File.class, value)); return true;
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
        case "combinedtagstats":
        case "combinedTagStats": target.getConfiguration().setCombinedTagStats(property(camelContext, java.lang.String.class, value)); return true;
        case "contentcache":
        case "contentCache": target.setContentCache(property(camelContext, boolean.class, value)); return true;
        case "criticaltags":
        case "criticalTags": target.getConfiguration().setCriticalTags(property(camelContext, java.lang.String.class, value)); return true;
        case "debugfile":
        case "debugFile": target.getConfiguration().setDebugFile(property(camelContext, java.io.File.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "document": target.getConfiguration().setDocument(property(camelContext, java.lang.String.class, value)); return true;
        case "dryrun": target.getConfiguration().setDryrun(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "excludes": target.getConfiguration().setExcludes(property(camelContext, java.lang.String.class, value)); return true;
        case "exitonfailure":
        case "exitOnFailure": target.getConfiguration().setExitOnFailure(property(camelContext, boolean.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "includes": target.getConfiguration().setIncludes(property(camelContext, java.lang.String.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "listener": target.getConfiguration().setListener(property(camelContext, java.lang.String.class, value)); return true;
        case "listeners": target.getConfiguration().setListeners(property(camelContext, java.lang.String.class, value)); return true;
        case "log": target.getConfiguration().setLog(property(camelContext, java.io.File.class, value)); return true;
        case "loglevel":
        case "logLevel": target.getConfiguration().setLogLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "logtitle":
        case "logTitle": target.getConfiguration().setLogTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "metadata": target.getConfiguration().setMetadata(property(camelContext, java.lang.String.class, value)); return true;
        case "monitorcolors":
        case "monitorColors": target.getConfiguration().setMonitorColors(property(camelContext, java.lang.String.class, value)); return true;
        case "monitorwidth":
        case "monitorWidth": target.getConfiguration().setMonitorWidth(property(camelContext, java.lang.String.class, value)); return true;
        case "name": target.getConfiguration().setName(property(camelContext, java.lang.String.class, value)); return true;
        case "nostatusreturncode":
        case "noStatusReturnCode": target.getConfiguration().setNoStatusReturnCode(property(camelContext, boolean.class, value)); return true;
        case "noncriticaltags":
        case "nonCriticalTags": target.getConfiguration().setNonCriticalTags(property(camelContext, java.lang.String.class, value)); return true;
        case "output": target.getConfiguration().setOutput(property(camelContext, java.io.File.class, value)); return true;
        case "outputdirectory":
        case "outputDirectory": target.getConfiguration().setOutputDirectory(property(camelContext, java.io.File.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "randomize": target.getConfiguration().setRandomize(property(camelContext, java.lang.String.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "report": target.getConfiguration().setReport(property(camelContext, java.io.File.class, value)); return true;
        case "reportbackground":
        case "reportBackground": target.getConfiguration().setReportBackground(property(camelContext, java.lang.String.class, value)); return true;
        case "reporttitle":
        case "reportTitle": target.getConfiguration().setReportTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "runemptysuite":
        case "runEmptySuite": target.getConfiguration().setRunEmptySuite(property(camelContext, boolean.class, value)); return true;
        case "runfailed":
        case "runFailed": target.getConfiguration().setRunFailed(property(camelContext, java.io.File.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "runmode":
        case "runMode": target.getConfiguration().setRunMode(property(camelContext, java.lang.String.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "skipteardownonexit":
        case "skipTeardownOnExit": target.getConfiguration().setSkipTeardownOnExit(property(camelContext, boolean.class, value)); return true;
        case "splitoutputs":
        case "splitOutputs": target.getConfiguration().setSplitOutputs(property(camelContext, java.lang.String.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "suitestatlevel":
        case "suiteStatLevel": target.getConfiguration().setSuiteStatLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "suites": target.getConfiguration().setSuites(property(camelContext, java.lang.String.class, value)); return true;
        case "summarytitle":
        case "summaryTitle": target.getConfiguration().setSummaryTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tagdocs":
        case "tagDocs": target.getConfiguration().setTagDocs(property(camelContext, java.lang.String.class, value)); return true;
        case "tagstatexcludes":
        case "tagStatExcludes": target.getConfiguration().setTagStatExcludes(property(camelContext, java.lang.String.class, value)); return true;
        case "tagstatincludes":
        case "tagStatIncludes": target.getConfiguration().setTagStatIncludes(property(camelContext, java.lang.String.class, value)); return true;
        case "tagstatlinks":
        case "tagStatLinks": target.getConfiguration().setTagStatLinks(property(camelContext, java.lang.String.class, value)); return true;
        case "tags": target.getConfiguration().setTags(property(camelContext, java.lang.String.class, value)); return true;
        case "tests": target.getConfiguration().setTests(property(camelContext, java.lang.String.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "timestampoutputs":
        case "timestampOutputs": target.getConfiguration().setTimestampOutputs(property(camelContext, boolean.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "variablefiles":
        case "variableFiles": target.getConfiguration().setVariableFiles(property(camelContext, java.lang.String.class, value)); return true;
        case "variables": target.getConfiguration().setVariables(property(camelContext, java.lang.String.class, value)); return true;
        case "warnonskippedfiles":
        case "warnOnSkippedFiles": target.getConfiguration().setWarnOnSkippedFiles(property(camelContext, boolean.class, value)); return true;
        case "xunitfile":
        case "xunitFile": target.getConfiguration().setXunitFile(property(camelContext, java.io.File.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcontextmapall":
        case "allowContextMapAll": return boolean.class;
        case "allowtemplatefromheader":
        case "allowTemplateFromHeader": return boolean.class;
        case "argumentfile":
        case "argumentFile": return java.io.File.class;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return int.class;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return int.class;
        case "backoffmultiplier":
        case "backoffMultiplier": return int.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "combinedtagstats":
        case "combinedTagStats": return java.lang.String.class;
        case "contentcache":
        case "contentCache": return boolean.class;
        case "criticaltags":
        case "criticalTags": return java.lang.String.class;
        case "debugfile":
        case "debugFile": return java.io.File.class;
        case "delay": return long.class;
        case "document": return java.lang.String.class;
        case "dryrun": return boolean.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "excludes": return java.lang.String.class;
        case "exitonfailure":
        case "exitOnFailure": return boolean.class;
        case "greedy": return boolean.class;
        case "includes": return java.lang.String.class;
        case "initialdelay":
        case "initialDelay": return long.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "listener": return java.lang.String.class;
        case "listeners": return java.lang.String.class;
        case "log": return java.io.File.class;
        case "loglevel":
        case "logLevel": return java.lang.String.class;
        case "logtitle":
        case "logTitle": return java.lang.String.class;
        case "metadata": return java.lang.String.class;
        case "monitorcolors":
        case "monitorColors": return java.lang.String.class;
        case "monitorwidth":
        case "monitorWidth": return java.lang.String.class;
        case "name": return java.lang.String.class;
        case "nostatusreturncode":
        case "noStatusReturnCode": return boolean.class;
        case "noncriticaltags":
        case "nonCriticalTags": return java.lang.String.class;
        case "output": return java.io.File.class;
        case "outputdirectory":
        case "outputDirectory": return java.io.File.class;
        case "pollstrategy":
        case "pollStrategy": return org.apache.camel.spi.PollingConsumerPollStrategy.class;
        case "randomize": return java.lang.String.class;
        case "repeatcount":
        case "repeatCount": return long.class;
        case "report": return java.io.File.class;
        case "reportbackground":
        case "reportBackground": return java.lang.String.class;
        case "reporttitle":
        case "reportTitle": return java.lang.String.class;
        case "runemptysuite":
        case "runEmptySuite": return boolean.class;
        case "runfailed":
        case "runFailed": return java.io.File.class;
        case "runlogginglevel":
        case "runLoggingLevel": return org.apache.camel.LoggingLevel.class;
        case "runmode":
        case "runMode": return java.lang.String.class;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return java.util.concurrent.ScheduledExecutorService.class;
        case "scheduler": return java.lang.Object.class;
        case "schedulerproperties":
        case "schedulerProperties": return java.util.Map.class;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return boolean.class;
        case "skipteardownonexit":
        case "skipTeardownOnExit": return boolean.class;
        case "splitoutputs":
        case "splitOutputs": return java.lang.String.class;
        case "startscheduler":
        case "startScheduler": return boolean.class;
        case "suitestatlevel":
        case "suiteStatLevel": return java.lang.String.class;
        case "suites": return java.lang.String.class;
        case "summarytitle":
        case "summaryTitle": return java.lang.String.class;
        case "synchronous": return boolean.class;
        case "tagdocs":
        case "tagDocs": return java.lang.String.class;
        case "tagstatexcludes":
        case "tagStatExcludes": return java.lang.String.class;
        case "tagstatincludes":
        case "tagStatIncludes": return java.lang.String.class;
        case "tagstatlinks":
        case "tagStatLinks": return java.lang.String.class;
        case "tags": return java.lang.String.class;
        case "tests": return java.lang.String.class;
        case "timeunit":
        case "timeUnit": return java.util.concurrent.TimeUnit.class;
        case "timestampoutputs":
        case "timestampOutputs": return boolean.class;
        case "usefixeddelay":
        case "useFixedDelay": return boolean.class;
        case "variablefiles":
        case "variableFiles": return java.lang.String.class;
        case "variables": return java.lang.String.class;
        case "warnonskippedfiles":
        case "warnOnSkippedFiles": return boolean.class;
        case "xunitfile":
        case "xunitFile": return java.io.File.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        RobotFrameworkEndpoint target = (RobotFrameworkEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcontextmapall":
        case "allowContextMapAll": return target.getConfiguration().isAllowContextMapAll();
        case "allowtemplatefromheader":
        case "allowTemplateFromHeader": return target.getConfiguration().isAllowTemplateFromHeader();
        case "argumentfile":
        case "argumentFile": return target.getConfiguration().getArgumentFile();
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "combinedtagstats":
        case "combinedTagStats": return target.getConfiguration().getCombinedTagStats();
        case "contentcache":
        case "contentCache": return target.isContentCache();
        case "criticaltags":
        case "criticalTags": return target.getConfiguration().getCriticalTags();
        case "debugfile":
        case "debugFile": return target.getConfiguration().getDebugFile();
        case "delay": return target.getDelay();
        case "document": return target.getConfiguration().getDocument();
        case "dryrun": return target.getConfiguration().isDryrun();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "excludes": return target.getConfiguration().getExcludes();
        case "exitonfailure":
        case "exitOnFailure": return target.getConfiguration().isExitOnFailure();
        case "greedy": return target.isGreedy();
        case "includes": return target.getConfiguration().getIncludes();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "listener": return target.getConfiguration().getListener();
        case "listeners": return target.getConfiguration().getListeners();
        case "log": return target.getConfiguration().getLog();
        case "loglevel":
        case "logLevel": return target.getConfiguration().getLogLevel();
        case "logtitle":
        case "logTitle": return target.getConfiguration().getLogTitle();
        case "metadata": return target.getConfiguration().getMetadata();
        case "monitorcolors":
        case "monitorColors": return target.getConfiguration().getMonitorColors();
        case "monitorwidth":
        case "monitorWidth": return target.getConfiguration().getMonitorWidth();
        case "name": return target.getConfiguration().getName();
        case "nostatusreturncode":
        case "noStatusReturnCode": return target.getConfiguration().isNoStatusReturnCode();
        case "noncriticaltags":
        case "nonCriticalTags": return target.getConfiguration().getNonCriticalTags();
        case "output": return target.getConfiguration().getOutput();
        case "outputdirectory":
        case "outputDirectory": return target.getConfiguration().getOutputDirectory();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "randomize": return target.getConfiguration().getRandomize();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "report": return target.getConfiguration().getReport();
        case "reportbackground":
        case "reportBackground": return target.getConfiguration().getReportBackground();
        case "reporttitle":
        case "reportTitle": return target.getConfiguration().getReportTitle();
        case "runemptysuite":
        case "runEmptySuite": return target.getConfiguration().isRunEmptySuite();
        case "runfailed":
        case "runFailed": return target.getConfiguration().getRunFailed();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "runmode":
        case "runMode": return target.getConfiguration().getRunMode();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "skipteardownonexit":
        case "skipTeardownOnExit": return target.getConfiguration().isSkipTeardownOnExit();
        case "splitoutputs":
        case "splitOutputs": return target.getConfiguration().getSplitOutputs();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "suitestatlevel":
        case "suiteStatLevel": return target.getConfiguration().getSuiteStatLevel();
        case "suites": return target.getConfiguration().getSuites();
        case "summarytitle":
        case "summaryTitle": return target.getConfiguration().getSummaryTitle();
        case "synchronous": return target.isSynchronous();
        case "tagdocs":
        case "tagDocs": return target.getConfiguration().getTagDocs();
        case "tagstatexcludes":
        case "tagStatExcludes": return target.getConfiguration().getTagStatExcludes();
        case "tagstatincludes":
        case "tagStatIncludes": return target.getConfiguration().getTagStatIncludes();
        case "tagstatlinks":
        case "tagStatLinks": return target.getConfiguration().getTagStatLinks();
        case "tags": return target.getConfiguration().getTags();
        case "tests": return target.getConfiguration().getTests();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "timestampoutputs":
        case "timestampOutputs": return target.getConfiguration().isTimestampOutputs();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        case "variablefiles":
        case "variableFiles": return target.getConfiguration().getVariableFiles();
        case "variables": return target.getConfiguration().getVariables();
        case "warnonskippedfiles":
        case "warnOnSkippedFiles": return target.getConfiguration().isWarnOnSkippedFiles();
        case "xunitfile":
        case "xunitFile": return target.getConfiguration().getXunitFile();
        default: return null;
        }
    }
}

