/* Generated by camel build tools - do NOT edit this file! */
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

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Perform operations on the Qdrant Vector Database.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface QdrantEndpointBuilderFactory {

    /**
     * Builder for endpoint for the Qdrant component.
     */
    public interface QdrantEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedQdrantEndpointBuilder advanced() {
            return (AdvancedQdrantEndpointBuilder) this;
        }

        /**
         * Sets the API key to use for authentication.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param apiKey the value to set
         * @return the dsl builder
         */
        default QdrantEndpointBuilder apiKey(String apiKey) {
            doSetProperty("apiKey", apiKey);
            return this;
        }
        /**
         * The host to connect to.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: localhost
         * Group: producer
         * 
         * @param host the value to set
         * @return the dsl builder
         */
        default QdrantEndpointBuilder host(String host) {
            doSetProperty("host", host);
            return this;
        }
        /**
         * The port to connect to.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 6334
         * Group: producer
         * 
         * @param port the value to set
         * @return the dsl builder
         */
        default QdrantEndpointBuilder port(int port) {
            doSetProperty("port", port);
            return this;
        }
        /**
         * The port to connect to.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 6334
         * Group: producer
         * 
         * @param port the value to set
         * @return the dsl builder
         */
        default QdrantEndpointBuilder port(String port) {
            doSetProperty("port", port);
            return this;
        }
        /**
         * Sets a default timeout for all requests.
         * 
         * The option is a: &lt;code&gt;java.time.Duration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default QdrantEndpointBuilder timeout(java.time.Duration timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * Sets a default timeout for all requests.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.time.Duration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default QdrantEndpointBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * Whether the client uses Transport Layer Security (TLS) to secure
         * communications.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param tls the value to set
         * @return the dsl builder
         */
        default QdrantEndpointBuilder tls(boolean tls) {
            doSetProperty("tls", tls);
            return this;
        }
        /**
         * Whether the client uses Transport Layer Security (TLS) to secure
         * communications.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param tls the value to set
         * @return the dsl builder
         */
        default QdrantEndpointBuilder tls(String tls) {
            doSetProperty("tls", tls);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Qdrant component.
     */
    public interface AdvancedQdrantEndpointBuilder
            extends
                EndpointProducerBuilder {
        default QdrantEndpointBuilder basic() {
            return (QdrantEndpointBuilder) this;
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
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedQdrantEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedQdrantEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface QdrantBuilders {
        /**
         * Qdrant (camel-qdrant)
         * Perform operations on the Qdrant Vector Database.
         * 
         * Category: database,ai
         * Since: 4.5
         * Maven coordinates: org.apache.camel:camel-qdrant
         * 
         * @return the dsl builder for the headers' name.
         */
        default QdrantHeaderNameBuilder qdrant() {
            return QdrantHeaderNameBuilder.INSTANCE;
        }
        /**
         * Qdrant (camel-qdrant)
         * Perform operations on the Qdrant Vector Database.
         * 
         * Category: database,ai
         * Since: 4.5
         * Maven coordinates: org.apache.camel:camel-qdrant
         * 
         * Syntax: <code>qdrant:collection</code>
         * 
         * Path parameter: collection (required)
         * The collection Name
         * 
         * @param path collection
         * @return the dsl builder
         */
        default QdrantEndpointBuilder qdrant(String path) {
            return QdrantEndpointBuilderFactory.endpointBuilder("qdrant", path);
        }
        /**
         * Qdrant (camel-qdrant)
         * Perform operations on the Qdrant Vector Database.
         * 
         * Category: database,ai
         * Since: 4.5
         * Maven coordinates: org.apache.camel:camel-qdrant
         * 
         * Syntax: <code>qdrant:collection</code>
         * 
         * Path parameter: collection (required)
         * The collection Name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path collection
         * @return the dsl builder
         */
        default QdrantEndpointBuilder qdrant(String componentName, String path) {
            return QdrantEndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    /**
     * The builder of headers' name for the Qdrant component.
     */
    public static class QdrantHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final QdrantHeaderNameBuilder INSTANCE = new QdrantHeaderNameBuilder();

        /**
         * The action to be performed.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code QdrantAction}.
         */
        public String qdrantAction() {
            return "CamelQdrantAction";
        }
        /**
         * Payload Selector.
         * 
         * The option is a: {@code
         * io.qdrant.client.grpc.Points$WithPayloadSelector} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code QdrantPointsPayloadSelector}.
         */
        public String qdrantPointsPayloadSelector() {
            return "CamelQdrantPointsPayloadSelector";
        }
        /**
         * Operation ID.
         * 
         * The option is a: {@code long} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code QdrantOperationID}.
         */
        public String qdrantOperationID() {
            return "CamelQdrantOperationID";
        }
        /**
         * Operation Status.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code QdrantOperationStatus}.
         */
        public String qdrantOperationStatus() {
            return "CamelQdrantOperationStatus";
        }
        /**
         * Operation Status Value.
         * 
         * The option is a: {@code int} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code QdrantOperationStatusValue}.
         */
        public String qdrantOperationStatusValue() {
            return "CamelQdrantOperationStatusValue";
        }
        /**
         * Read Consistency.
         * 
         * The option is a: {@code io.qdrant.client.grpc.Points$ReadConsistency}
         * type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code QdrantReadConsistency}.
         */
        public String qdrantReadConsistency() {
            return "CamelQdrantReadConsistency";
        }
        /**
         * Include Payload.
         * 
         * The option is a: {@code boolean} type.
         * 
         * Default: true
         * Group: producer
         * 
         * @return the name of the header {@code QdrantWithPayload}.
         */
        public String qdrantWithPayload() {
            return "CamelQdrantWithPayload";
        }
        /**
         * Include Vectors.
         * 
         * The option is a: {@code boolean} type.
         * 
         * Default: false
         * Group: producer
         * 
         * @return the name of the header {@code QdrantWithVectors}.
         */
        public String qdrantWithVectors() {
            return "CamelQdrantWithVectors";
        }
        /**
         * The number of elements.
         * 
         * The option is a: {@code int} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code QdrantSize}.
         */
        public String qdrantSize() {
            return "CamelQdrantSize";
        }
        /**
         * The point id to use for operation.
         * 
         * The option is a: {@code int} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code QdrantPointId}.
         */
        public String qdrantPointId() {
            return "CamelQdrantPointId";
        }
    }
    static QdrantEndpointBuilder endpointBuilder(String componentName, String path) {
        class QdrantEndpointBuilderImpl extends AbstractEndpointBuilder implements QdrantEndpointBuilder, AdvancedQdrantEndpointBuilder {
            public QdrantEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new QdrantEndpointBuilderImpl(path);
    }
}