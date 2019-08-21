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
 * Represents a Debezium endpoint which is used for interacting with Debezium
 * embedded engine.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DebeziumEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Debezium component.
     */
    public interface DebeziumEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedDebeziumEndpointBuilder advanced() {
            return (AdvancedDebeziumEndpointBuilder) this;
        }
    }

    /**
     * Advanced builder for endpoint for the Debezium component.
     */
    public interface AdvancedDebeziumEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default DebeziumEndpointBuilder basic() {
            return (DebeziumEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedDebeziumEndpointBuilder basicPropertyBinding(
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
         * Group: advanced
         */
        default AdvancedDebeziumEndpointBuilder basicPropertyBinding(
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
         * Group: advanced
         */
        default AdvancedDebeziumEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedDebeziumEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Debezium (camel-debezium)
     * Represents a Debezium endpoint which is used for interacting with
     * Debezium embedded engine.
     * 
     * Category: database,sql,nosql
     * Available as of version: 3.0
     * Maven coordinates: org.apache.camel:camel-debezium
     * 
     * Syntax: <code>debezium:connectorType</code>
     * 
     * Path parameter: connectorType (required)
     * The Debezium connector type that is supported by Camel Debezium
     * component.
     */
    default DebeziumEndpointBuilder debezium(String path) {
        class DebeziumEndpointBuilderImpl extends AbstractEndpointBuilder implements DebeziumEndpointBuilder, AdvancedDebeziumEndpointBuilder {
            public DebeziumEndpointBuilderImpl(String path) {
                super("debezium", path);
            }
        }
        return new DebeziumEndpointBuilderImpl(path);
    }
}