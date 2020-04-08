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
 * Represents a DJL endpoint.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DJLEndpointBuilderFactory {


    /**
     * Builder for endpoint for the DJL component.
     */
    public interface DJLEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedDJLEndpointBuilder advanced() {
            return (AdvancedDJLEndpointBuilder) this;
        }
        /**
         * Model Artifact.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default DJLEndpointBuilder artifactId(String artifactId) {
            doSetProperty("artifactId", artifactId);
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
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default DJLEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default DJLEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Model.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default DJLEndpointBuilder model(String model) {
            doSetProperty("model", model);
            return this;
        }
        /**
         * Translator.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default DJLEndpointBuilder translator(String translator) {
            doSetProperty("translator", translator);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the DJL component.
     */
    public interface AdvancedDJLEndpointBuilder
            extends
                EndpointProducerBuilder {
        default DJLEndpointBuilder basic() {
            return (DJLEndpointBuilder) this;
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
        default AdvancedDJLEndpointBuilder basicPropertyBinding(
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
        default AdvancedDJLEndpointBuilder basicPropertyBinding(
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
        default AdvancedDJLEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedDJLEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface DJLBuilders {
        /**
         * DJL (camel-djl)
         * Represents a DJL endpoint.
         * 
         * Category: deeplearning
         * Since: 3.2
         * Maven coordinates: org.apache.camel:camel-djl
         * 
         * Syntax: <code>djl:application</code>
         * 
         * Path parameter: application (required)
         * Application name
         */
        default DJLEndpointBuilder djl(String path) {
            return DJLEndpointBuilderFactory.djl(path);
        }
    }
    /**
     * DJL (camel-djl)
     * Represents a DJL endpoint.
     * 
     * Category: deeplearning
     * Since: 3.2
     * Maven coordinates: org.apache.camel:camel-djl
     * 
     * Syntax: <code>djl:application</code>
     * 
     * Path parameter: application (required)
     * Application name
     */
    static DJLEndpointBuilder djl(String path) {
        class DJLEndpointBuilderImpl extends AbstractEndpointBuilder implements DJLEndpointBuilder, AdvancedDJLEndpointBuilder {
            public DJLEndpointBuilderImpl(String path) {
                super("djl", path);
            }
        }
        return new DJLEndpointBuilderImpl(path);
    }
}