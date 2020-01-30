/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * A Camel GraphQL Component
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GraphqlEndpointBuilderFactory {


    /**
     * Builder for endpoint for the GraphQL component.
     */
    public interface GraphqlEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedGraphqlEndpointBuilder advanced() {
            return (AdvancedGraphqlEndpointBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default GraphqlEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default GraphqlEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The query or mutation name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default GraphqlEndpointBuilder operationName(String operationName) {
            doSetProperty("operationName", operationName);
            return this;
        }
        /**
         * The proxy host in the format hostname:port.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default GraphqlEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * The query text.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default GraphqlEndpointBuilder query(String query) {
            doSetProperty("query", query);
            return this;
        }
        /**
         * The query file name located in the classpath.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default GraphqlEndpointBuilder queryFile(String queryFile) {
            doSetProperty("queryFile", queryFile);
            return this;
        }
        /**
         * The JsonObject instance containing the operation variables.
         * 
         * The option is a: <code>org.apache.camel.util.json.JsonObject</code>
         * type.
         * 
         * Group: producer
         */
        default GraphqlEndpointBuilder variables(Object variables) {
            doSetProperty("variables", variables);
            return this;
        }
        /**
         * The JsonObject instance containing the operation variables.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.util.json.JsonObject</code> type.
         * 
         * Group: producer
         */
        default GraphqlEndpointBuilder variables(String variables) {
            doSetProperty("variables", variables);
            return this;
        }
        /**
         * The access token sent in the Authorization header.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default GraphqlEndpointBuilder accessToken(String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * The password for Basic authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default GraphqlEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * The username for Basic authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default GraphqlEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the GraphQL component.
     */
    public interface AdvancedGraphqlEndpointBuilder
            extends
                EndpointProducerBuilder {
        default GraphqlEndpointBuilder basic() {
            return (GraphqlEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedGraphqlEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedGraphqlEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedGraphqlEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedGraphqlEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface GraphqlBuilders {
        /**
         * GraphQL (camel-graphql)
         * A Camel GraphQL Component
         * 
         * Category: api
         * Since: 3.0
         * Maven coordinates: org.apache.camel:camel-graphql
         * 
         * Syntax: <code>graphql:httpUri</code>
         * 
         * Path parameter: httpUri (required)
         * The GraphQL server URI.
         */
        default GraphqlEndpointBuilder graphql(String path) {
            return GraphqlEndpointBuilderFactory.graphql(path);
        }
    }
    /**
     * GraphQL (camel-graphql)
     * A Camel GraphQL Component
     * 
     * Category: api
     * Since: 3.0
     * Maven coordinates: org.apache.camel:camel-graphql
     * 
     * Syntax: <code>graphql:httpUri</code>
     * 
     * Path parameter: httpUri (required)
     * The GraphQL server URI.
     */
    static GraphqlEndpointBuilder graphql(String path) {
        class GraphqlEndpointBuilderImpl extends AbstractEndpointBuilder implements GraphqlEndpointBuilder, AdvancedGraphqlEndpointBuilder {
            public GraphqlEndpointBuilderImpl(String path) {
                super("graphql", path);
            }
        }
        return new GraphqlEndpointBuilderImpl(path);
    }
}