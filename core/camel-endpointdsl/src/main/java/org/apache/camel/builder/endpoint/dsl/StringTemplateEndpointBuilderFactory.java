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
 * Transforms the message using a String template.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface StringTemplateEndpointBuilderFactory {


    /**
     * Builder for endpoint for the String Template component.
     */
    public interface StringTemplateEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedStringTemplateEndpointBuilder advanced() {
            return (AdvancedStringTemplateEndpointBuilder) this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default StringTemplateEndpointBuilder contentCache(boolean contentCache) {
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
        default StringTemplateEndpointBuilder contentCache(String contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * The variable start delimiter.
         * 
         * The option is a: <code>char</code> type.
         * 
         * Group: producer
         */
        default StringTemplateEndpointBuilder delimiterStart(char delimiterStart) {
            doSetProperty("delimiterStart", delimiterStart);
            return this;
        }
        /**
         * The variable start delimiter.
         * 
         * The option will be converted to a <code>char</code> type.
         * 
         * Group: producer
         */
        default StringTemplateEndpointBuilder delimiterStart(
                String delimiterStart) {
            doSetProperty("delimiterStart", delimiterStart);
            return this;
        }
        /**
         * The variable end delimiter.
         * 
         * The option is a: <code>char</code> type.
         * 
         * Group: producer
         */
        default StringTemplateEndpointBuilder delimiterStop(char delimiterStop) {
            doSetProperty("delimiterStop", delimiterStop);
            return this;
        }
        /**
         * The variable end delimiter.
         * 
         * The option will be converted to a <code>char</code> type.
         * 
         * Group: producer
         */
        default StringTemplateEndpointBuilder delimiterStop(String delimiterStop) {
            doSetProperty("delimiterStop", delimiterStop);
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
         * Group: producer
         */
        default StringTemplateEndpointBuilder lazyStartProducer(
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
         * Group: producer
         */
        default StringTemplateEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the String Template component.
     */
    public interface AdvancedStringTemplateEndpointBuilder
            extends
                EndpointProducerBuilder {
        default StringTemplateEndpointBuilder basic() {
            return (StringTemplateEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedStringTemplateEndpointBuilder basicPropertyBinding(
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
        default AdvancedStringTemplateEndpointBuilder basicPropertyBinding(
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
        default AdvancedStringTemplateEndpointBuilder synchronous(
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
        default AdvancedStringTemplateEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * String Template (camel-stringtemplate)
     * Transforms the message using a String template.
     * 
     * Category: transformation
     * Available as of version: 1.2
     * Maven coordinates: org.apache.camel:camel-stringtemplate
     * 
     * Syntax: <code>string-template:resourceUri</code>
     * 
     * Path parameter: resourceUri (required)
     * Path to the resource. You can prefix with: classpath, file, http, ref, or
     * bean. classpath, file and http loads the resource using these protocols
     * (classpath is default). ref will lookup the resource in the registry.
     * bean will call a method on a bean to be used as the resource. For bean
     * you can specify the method name after dot, eg bean:myBean.myMethod.
     */
    default StringTemplateEndpointBuilder stringTemplate(String path) {
        class StringTemplateEndpointBuilderImpl extends AbstractEndpointBuilder implements StringTemplateEndpointBuilder, AdvancedStringTemplateEndpointBuilder {
            public StringTemplateEndpointBuilderImpl(String path) {
                super("string-template", path);
            }
        }
        return new StringTemplateEndpointBuilderImpl(path);
    }
}