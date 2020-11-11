/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.optaplanner;

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
public class OptaPlannerEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        OptaPlannerEndpoint target = (OptaPlannerEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "async": target.getConfiguration().setAsync(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "problemid":
        case "problemId": target.getConfiguration().setProblemId(property(camelContext, java.lang.Long.class, value)); return true;
        case "solverid":
        case "solverId": target.getConfiguration().setSolverId(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "threadpoolsize":
        case "threadPoolSize": target.getConfiguration().setThreadPoolSize(property(camelContext, int.class, value)); return true;
        case "usesolvermanager":
        case "useSolverManager": target.getConfiguration().setUseSolverManager(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "async": return boolean.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "problemid":
        case "problemId": return java.lang.Long.class;
        case "solverid":
        case "solverId": return java.lang.String.class;
        case "synchronous": return boolean.class;
        case "threadpoolsize":
        case "threadPoolSize": return int.class;
        case "usesolvermanager":
        case "useSolverManager": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        OptaPlannerEndpoint target = (OptaPlannerEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "async": return target.getConfiguration().isAsync();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "problemid":
        case "problemId": return target.getConfiguration().getProblemId();
        case "solverid":
        case "solverId": return target.getConfiguration().getSolverId();
        case "synchronous": return target.isSynchronous();
        case "threadpoolsize":
        case "threadPoolSize": return target.getConfiguration().getThreadPoolSize();
        case "usesolvermanager":
        case "useSolverManager": return target.getConfiguration().isUseSolverManager();
        default: return null;
        }
    }
}

