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
 * The openstack-nova component allows messages to be sent to an OpenStack
 * compute services.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface NovaEndpointBuilderFactory {


    /**
     * Builder for endpoint for the OpenStack Nova component.
     */
    public interface NovaEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedNovaEndpointBuilder advanced() {
            return (AdvancedNovaEndpointBuilder) this;
        }
        /**
         * OpenStack API version.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default NovaEndpointBuilder apiVersion(String apiVersion) {
            doSetProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * OpenStack configuration.
         * 
         * The option is a: <code>org.openstack4j.core.transport.Config</code>
         * type.
         * 
         * Group: producer
         */
        default NovaEndpointBuilder config(Object config) {
            doSetProperty("config", config);
            return this;
        }
        /**
         * OpenStack configuration.
         * 
         * The option will be converted to a
         * <code>org.openstack4j.core.transport.Config</code> type.
         * 
         * Group: producer
         */
        default NovaEndpointBuilder config(String config) {
            doSetProperty("config", config);
            return this;
        }
        /**
         * Authentication domain.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default NovaEndpointBuilder domain(String domain) {
            doSetProperty("domain", domain);
            return this;
        }
        /**
         * The operation to do.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default NovaEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * OpenStack password.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default NovaEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * The project ID.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default NovaEndpointBuilder project(String project) {
            doSetProperty("project", project);
            return this;
        }
        /**
         * OpenStack Nova subsystem.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default NovaEndpointBuilder subsystem(String subsystem) {
            doSetProperty("subsystem", subsystem);
            return this;
        }
        /**
         * OpenStack username.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default NovaEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the OpenStack Nova component.
     */
    public interface AdvancedNovaEndpointBuilder
            extends
                EndpointProducerBuilder {
        default NovaEndpointBuilder basic() {
            return (NovaEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNovaEndpointBuilder basicPropertyBinding(
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
        default AdvancedNovaEndpointBuilder basicPropertyBinding(
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
        default AdvancedNovaEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedNovaEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * OpenStack Nova (camel-openstack)
     * The openstack-nova component allows messages to be sent to an OpenStack
     * compute services.
     * 
     * Category: cloud,paas
     * Available as of version: 2.19
     * Maven coordinates: org.apache.camel:camel-openstack
     * 
     * Syntax: <code>openstack-nova:host</code>
     * 
     * Path parameter: host (required)
     * OpenStack host url
     */
    default NovaEndpointBuilder openstackNova(String path) {
        class NovaEndpointBuilderImpl extends AbstractEndpointBuilder implements NovaEndpointBuilder, AdvancedNovaEndpointBuilder {
            public NovaEndpointBuilderImpl(String path) {
                super("openstack-nova", path);
            }
        }
        return new NovaEndpointBuilderImpl(path);
    }
}