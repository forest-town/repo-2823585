/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.consul;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ConsulEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ConsulEndpoint target = (ConsulEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acltoken":
        case "aclToken": target.getConfiguration().setAclToken(property(camelContext, java.lang.String.class, value)); return true;
        case "action": target.getConfiguration().setAction(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "blockseconds":
        case "blockSeconds": target.getConfiguration().setBlockSeconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "connecttimeoutmillis":
        case "connectTimeoutMillis": target.getConfiguration().setConnectTimeoutMillis(property(camelContext, java.lang.Long.class, value)); return true;
        case "consistencymode":
        case "consistencyMode": target.getConfiguration().setConsistencyMode(property(camelContext, com.orbitz.consul.option.ConsistencyMode.class, value)); return true;
        case "consulclient":
        case "consulClient": target.getConfiguration().setConsulClient(property(camelContext, com.orbitz.consul.Consul.class, value)); return true;
        case "datacenter": target.getConfiguration().setDatacenter(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "firstindex":
        case "firstIndex": target.getConfiguration().setFirstIndex(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "key": target.getConfiguration().setKey(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "nearnode":
        case "nearNode": target.getConfiguration().setNearNode(property(camelContext, java.lang.String.class, value)); return true;
        case "nodemeta":
        case "nodeMeta": target.getConfiguration().setNodeMeta(property(camelContext, java.util.List.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "pinginstance":
        case "pingInstance": target.getConfiguration().setPingInstance(property(camelContext, boolean.class, value)); return true;
        case "readtimeoutmillis":
        case "readTimeoutMillis": target.getConfiguration().setReadTimeoutMillis(property(camelContext, java.lang.Long.class, value)); return true;
        case "recursive": target.getConfiguration().setRecursive(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tags": target.getConfiguration().setTags(property(camelContext, java.lang.String.class, value)); return true;
        case "url": target.getConfiguration().setUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "username":
        case "userName": target.getConfiguration().setUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "valueasstring":
        case "valueAsString": target.getConfiguration().setValueAsString(property(camelContext, boolean.class, value)); return true;
        case "writetimeoutmillis":
        case "writeTimeoutMillis": target.getConfiguration().setWriteTimeoutMillis(property(camelContext, java.lang.Long.class, value)); return true;
        default: return false;
        }
    }

}

