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
 * The sap-netweaver component integrates with the SAP NetWeaver Gateway using
 * HTTP transports.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface NetWeaverEndpointBuilderFactory {


    /**
     * Builder for endpoint for the SAP NetWeaver component.
     */
    public interface NetWeaverEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedNetWeaverEndpointBuilder advanced() {
            return (AdvancedNetWeaverEndpointBuilder) this;
        }
        /**
         * If the JSON Map contains only a single entry, then flattern by
         * storing that single entry value as the message body.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default NetWeaverEndpointBuilder flatternMap(boolean flatternMap) {
            doSetProperty("flatternMap", flatternMap);
            return this;
        }
        /**
         * If the JSON Map contains only a single entry, then flattern by
         * storing that single entry value as the message body.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default NetWeaverEndpointBuilder flatternMap(String flatternMap) {
            doSetProperty("flatternMap", flatternMap);
            return this;
        }
        /**
         * Whether to return data in JSON format. If this option is false, then
         * XML is returned in Atom format.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default NetWeaverEndpointBuilder json(boolean json) {
            doSetProperty("json", json);
            return this;
        }
        /**
         * Whether to return data in JSON format. If this option is false, then
         * XML is returned in Atom format.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default NetWeaverEndpointBuilder json(String json) {
            doSetProperty("json", json);
            return this;
        }
        /**
         * To transform the JSON from a String to a Map in the message body.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default NetWeaverEndpointBuilder jsonAsMap(boolean jsonAsMap) {
            doSetProperty("jsonAsMap", jsonAsMap);
            return this;
        }
        /**
         * To transform the JSON from a String to a Map in the message body.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default NetWeaverEndpointBuilder jsonAsMap(String jsonAsMap) {
            doSetProperty("jsonAsMap", jsonAsMap);
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
        default NetWeaverEndpointBuilder lazyStartProducer(
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
        default NetWeaverEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Password for account.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default NetWeaverEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Username for account.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default NetWeaverEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the SAP NetWeaver component.
     */
    public interface AdvancedNetWeaverEndpointBuilder
            extends
                EndpointProducerBuilder {
        default NetWeaverEndpointBuilder basic() {
            return (NetWeaverEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNetWeaverEndpointBuilder basicPropertyBinding(
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
        default AdvancedNetWeaverEndpointBuilder basicPropertyBinding(
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
        default AdvancedNetWeaverEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedNetWeaverEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * SAP NetWeaver (camel-sap-netweaver)
     * The sap-netweaver component integrates with the SAP NetWeaver Gateway
     * using HTTP transports.
     * 
     * Category: sap
     * Available as of version: 2.12
     * Maven coordinates: org.apache.camel:camel-sap-netweaver
     * 
     * Syntax: <code>sap-netweaver:url</code>
     * 
     * Path parameter: url (required)
     * Url to the SAP net-weaver gateway server.
     */
    default NetWeaverEndpointBuilder sapNetweaver(String path) {
        class NetWeaverEndpointBuilderImpl extends AbstractEndpointBuilder implements NetWeaverEndpointBuilder, AdvancedNetWeaverEndpointBuilder {
            public NetWeaverEndpointBuilderImpl(String path) {
                super("sap-netweaver", path);
            }
        }
        return new NetWeaverEndpointBuilderImpl(path);
    }
}