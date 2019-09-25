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
 * Transforms the message using a FreeMarker template.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface FreemarkerEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Freemarker component.
     */
    public interface FreemarkerEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedFreemarkerEndpointBuilder advanced() {
            return (AdvancedFreemarkerEndpointBuilder) this;
        }
        /**
         * Sets the Freemarker configuration to use.
         * 
         * The option is a: <code>freemarker.template.Configuration</code> type.
         * 
         * Group: producer
         */
        default FreemarkerEndpointBuilder configuration(Object configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Sets the Freemarker configuration to use.
         * 
         * The option will be converted to a
         * <code>freemarker.template.Configuration</code> type.
         * 
         * Group: producer
         */
        default FreemarkerEndpointBuilder configuration(String configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default FreemarkerEndpointBuilder contentCache(boolean contentCache) {
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
        default FreemarkerEndpointBuilder contentCache(String contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Sets the encoding to be used for loading the template file.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default FreemarkerEndpointBuilder encoding(String encoding) {
            doSetProperty("encoding", encoding);
            return this;
        }
        /**
         * Number of seconds the loaded template resource will remain in the
         * cache.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default FreemarkerEndpointBuilder templateUpdateDelay(
                int templateUpdateDelay) {
            doSetProperty("templateUpdateDelay", templateUpdateDelay);
            return this;
        }
        /**
         * Number of seconds the loaded template resource will remain in the
         * cache.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default FreemarkerEndpointBuilder templateUpdateDelay(
                String templateUpdateDelay) {
            doSetProperty("templateUpdateDelay", templateUpdateDelay);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Freemarker component.
     */
    public interface AdvancedFreemarkerEndpointBuilder
            extends
                EndpointProducerBuilder {
        default FreemarkerEndpointBuilder basic() {
            return (FreemarkerEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedFreemarkerEndpointBuilder basicPropertyBinding(
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
        default AdvancedFreemarkerEndpointBuilder basicPropertyBinding(
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
        default AdvancedFreemarkerEndpointBuilder synchronous(
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
        default AdvancedFreemarkerEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Freemarker (camel-freemarker)
     * Transforms the message using a FreeMarker template.
     * 
     * Category: transformation
     * Available as of version: 2.10
     * Maven coordinates: org.apache.camel:camel-freemarker
     * 
     * Syntax: <code>freemarker:resourceUri</code>
     * 
     * Path parameter: resourceUri (required)
     * Path to the resource. You can prefix with: classpath, file, http, ref, or
     * bean. classpath, file and http loads the resource using these protocols
     * (classpath is default). ref will lookup the resource in the registry.
     * bean will call a method on a bean to be used as the resource. For bean
     * you can specify the method name after dot, eg bean:myBean.myMethod.
     */
    default FreemarkerEndpointBuilder freemarker(String path) {
        class FreemarkerEndpointBuilderImpl extends AbstractEndpointBuilder implements FreemarkerEndpointBuilder, AdvancedFreemarkerEndpointBuilder {
            public FreemarkerEndpointBuilderImpl(String path) {
                super("freemarker", path);
            }
        }
        return new FreemarkerEndpointBuilderImpl(path);
    }
}