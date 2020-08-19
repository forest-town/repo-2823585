/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.arangodb;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ArangoDbEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ArangoDbEndpoint target = (ArangoDbEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "documentcollection":
        case "documentCollection": target.getConfiguration().setDocumentCollection(property(camelContext, java.lang.String.class, value)); return true;
        case "edgecollection":
        case "edgeCollection": target.getConfiguration().setEdgeCollection(property(camelContext, java.lang.String.class, value)); return true;
        case "graph": target.getConfiguration().setGraph(property(camelContext, java.lang.String.class, value)); return true;
        case "host": target.getConfiguration().setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, org.apache.camel.component.arangodb.ArangoDbOperation.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "port": target.getConfiguration().setPort(property(camelContext, int.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "user": target.getConfiguration().setUser(property(camelContext, java.lang.String.class, value)); return true;
        case "vertexcollection":
        case "vertexCollection": target.getConfiguration().setVertexCollection(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("documentCollection", java.lang.String.class);
        answer.put("edgeCollection", java.lang.String.class);
        answer.put("graph", java.lang.String.class);
        answer.put("host", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("operation", org.apache.camel.component.arangodb.ArangoDbOperation.class);
        answer.put("password", java.lang.String.class);
        answer.put("port", int.class);
        answer.put("synchronous", boolean.class);
        answer.put("user", java.lang.String.class);
        answer.put("vertexCollection", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        ArangoDbEndpoint target = (ArangoDbEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "documentcollection":
        case "documentCollection": return target.getConfiguration().getDocumentCollection();
        case "edgecollection":
        case "edgeCollection": return target.getConfiguration().getEdgeCollection();
        case "graph": return target.getConfiguration().getGraph();
        case "host": return target.getConfiguration().getHost();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "operation": return target.getConfiguration().getOperation();
        case "password": return target.getConfiguration().getPassword();
        case "port": return target.getConfiguration().getPort();
        case "synchronous": return target.isSynchronous();
        case "user": return target.getConfiguration().getUser();
        case "vertexcollection":
        case "vertexCollection": return target.getConfiguration().getVertexCollection();
        default: return null;
        }
    }
}

