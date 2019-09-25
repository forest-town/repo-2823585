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
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The lumberjack retrieves logs sent over the network using the Lumberjack
 * protocol.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface LumberjackEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Lumberjack component.
     */
    public interface LumberjackEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedLumberjackEndpointBuilder advanced() {
            return (AdvancedLumberjackEndpointBuilder) this;
        }
        /**
         * SSL configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: consumer
         */
        default LumberjackEndpointBuilder sslContextParameters(
                Object sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * SSL configuration.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: consumer
         */
        default LumberjackEndpointBuilder sslContextParameters(
                String sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Lumberjack component.
     */
    public interface AdvancedLumberjackEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default LumberjackEndpointBuilder basic() {
            return (LumberjackEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedLumberjackEndpointBuilder basicPropertyBinding(
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
        default AdvancedLumberjackEndpointBuilder basicPropertyBinding(
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
        default AdvancedLumberjackEndpointBuilder synchronous(
                boolean synchronous) {
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
        default AdvancedLumberjackEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Lumberjack (camel-lumberjack)
     * The lumberjack retrieves logs sent over the network using the Lumberjack
     * protocol.
     * 
     * Category: log
     * Available as of version: 2.18
     * Maven coordinates: org.apache.camel:camel-lumberjack
     * 
     * Syntax: <code>lumberjack:host:port</code>
     * 
     * Path parameter: host (required)
     * Network interface on which to listen for Lumberjack
     * 
     * Path parameter: port
     * Network port on which to listen for Lumberjack
     * Default value: 5044
     */
    default LumberjackEndpointBuilder lumberjack(String path) {
        class LumberjackEndpointBuilderImpl extends AbstractEndpointBuilder implements LumberjackEndpointBuilder, AdvancedLumberjackEndpointBuilder {
            public LumberjackEndpointBuilderImpl(String path) {
                super("lumberjack", path);
            }
        }
        return new LumberjackEndpointBuilderImpl(path);
    }
}