/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.docker;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DockerEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DockerEndpoint target = (DockerEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "email": target.getConfiguration().setEmail(property(camelContext, java.lang.String.class, value)); return true;
        case "host": target.getConfiguration().setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "port": target.getConfiguration().setPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "requesttimeout":
        case "requestTimeout": target.getConfiguration().setRequestTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "cmdexecfactory":
        case "cmdExecFactory": target.getConfiguration().setCmdExecFactory(property(camelContext, java.lang.String.class, value)); return true;
        case "followredirectfilter":
        case "followRedirectFilter": target.getConfiguration().setFollowRedirectFilter(property(camelContext, boolean.class, value)); return true;
        case "loggingfilter":
        case "loggingFilter": target.getConfiguration().setLoggingFilter(property(camelContext, boolean.class, value)); return true;
        case "maxperrouteconnections":
        case "maxPerRouteConnections": target.getConfiguration().setMaxPerRouteConnections(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxtotalconnections":
        case "maxTotalConnections": target.getConfiguration().setMaxTotalConnections(property(camelContext, java.lang.Integer.class, value)); return true;
        case "serveraddress":
        case "serverAddress": target.getConfiguration().setServerAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "socket": target.getConfiguration().setSocket(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "certpath":
        case "certPath": target.getConfiguration().setCertPath(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "secure": target.getConfiguration().setSecure(property(camelContext, boolean.class, value)); return true;
        case "tlsverify":
        case "tlsVerify": target.getConfiguration().setTlsVerify(property(camelContext, boolean.class, value)); return true;
        case "username": target.getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

