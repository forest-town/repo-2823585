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

import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The jolt component allows you to process a JSON messages using an JOLT
 * specification (such as JSON-JSON transformation).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JoltEndpointBuilderFactory {


    /**
     * Builder for endpoint for the JOLT component.
     */
    public interface JoltEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedJoltEndpointBuilder advanced() {
            return (AdvancedJoltEndpointBuilder) this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default JoltEndpointBuilder contentCache(boolean contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default JoltEndpointBuilder contentCache(String contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Specifies if the input is hydrated JSON or a JSON String.
         * 
         * The option is a:
         * <code>org.apache.camel.component.jolt.JoltInputOutputType</code>
         * type.
         * 
         * Group: producer
         */
        default JoltEndpointBuilder inputType(JoltInputOutputType inputType) {
            doSetProperty("inputType", inputType);
            return this;
        }
        /**
         * Specifies if the input is hydrated JSON or a JSON String.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.jolt.JoltInputOutputType</code>
         * type.
         * 
         * Group: producer
         */
        default JoltEndpointBuilder inputType(String inputType) {
            doSetProperty("inputType", inputType);
            return this;
        }
        /**
         * Specifies if the output should be hydrated JSON or a JSON String.
         * 
         * The option is a:
         * <code>org.apache.camel.component.jolt.JoltInputOutputType</code>
         * type.
         * 
         * Group: producer
         */
        default JoltEndpointBuilder outputType(JoltInputOutputType outputType) {
            doSetProperty("outputType", outputType);
            return this;
        }
        /**
         * Specifies if the output should be hydrated JSON or a JSON String.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.jolt.JoltInputOutputType</code>
         * type.
         * 
         * Group: producer
         */
        default JoltEndpointBuilder outputType(String outputType) {
            doSetProperty("outputType", outputType);
            return this;
        }
        /**
         * Specifies the Transform DSL of the endpoint resource. If none is
         * specified Chainr will be used.
         * 
         * The option is a:
         * <code>org.apache.camel.component.jolt.JoltTransformType</code> type.
         * 
         * Group: producer
         */
        default JoltEndpointBuilder transformDsl(JoltTransformType transformDsl) {
            doSetProperty("transformDsl", transformDsl);
            return this;
        }
        /**
         * Specifies the Transform DSL of the endpoint resource. If none is
         * specified Chainr will be used.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.jolt.JoltTransformType</code> type.
         * 
         * Group: producer
         */
        default JoltEndpointBuilder transformDsl(String transformDsl) {
            doSetProperty("transformDsl", transformDsl);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the JOLT component.
     */
    public interface AdvancedJoltEndpointBuilder
            extends
                EndpointProducerBuilder {
        default JoltEndpointBuilder basic() {
            return (JoltEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedJoltEndpointBuilder basicPropertyBinding(
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
        default AdvancedJoltEndpointBuilder basicPropertyBinding(
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
        default AdvancedJoltEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedJoltEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.jolt.JoltInputOutputType</code> enum.
     */
    enum JoltInputOutputType {
        Hydrated,
        JsonString;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.jolt.JoltTransformType</code> enum.
     */
    enum JoltTransformType {
        Chainr,
        Shiftr,
        Defaultr,
        Removr,
        Sortr;
    }
    /**
     * JOLT (camel-jolt)
     * The jolt component allows you to process a JSON messages using an JOLT
     * specification (such as JSON-JSON transformation).
     * 
     * Category: transformation
     * Available as of version: 2.16
     * Maven coordinates: org.apache.camel:camel-jolt
     * 
     * Syntax: <code>jolt:resourceUri</code>
     * 
     * Path parameter: resourceUri (required)
     * Path to the resource. You can prefix with: classpath, file, http, ref, or
     * bean. classpath, file and http loads the resource using these protocols
     * (classpath is default). ref will lookup the resource in the registry.
     * bean will call a method on a bean to be used as the resource. For bean
     * you can specify the method name after dot, eg bean:myBean.myMethod.
     */
    default JoltEndpointBuilder jolt(String path) {
        class JoltEndpointBuilderImpl extends AbstractEndpointBuilder implements JoltEndpointBuilder, AdvancedJoltEndpointBuilder {
            public JoltEndpointBuilderImpl(String path) {
                super("jolt", path);
            }
        }
        return new JoltEndpointBuilderImpl(path);
    }
}