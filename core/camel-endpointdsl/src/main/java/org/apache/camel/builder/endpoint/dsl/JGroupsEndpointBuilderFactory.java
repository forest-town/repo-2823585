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
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The jgroups component provides exchange of messages between Camel and JGroups
 * clusters.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JGroupsEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the JGroups component.
     */
    public interface JGroupsEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedJGroupsEndpointConsumerBuilder advanced() {
            return (AdvancedJGroupsEndpointConsumerBuilder) this;
        }
        /**
         * The name of the JGroups cluster the component should connect to.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default JGroupsEndpointConsumerBuilder clusterName(String clusterName) {
            setProperty("clusterName", clusterName);
            return this;
        }
        /**
         * Specifies configuration properties of the JChannel used by the
         * endpoint.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default JGroupsEndpointConsumerBuilder channelProperties(
                String channelProperties) {
            setProperty("channelProperties", channelProperties);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default JGroupsEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        default JGroupsEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * If set to true, the consumer endpoint will receive org.jgroups.View
         * messages as well (not only org.jgroups.Message instances). By default
         * only regular messages are consumed by the endpoint.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default JGroupsEndpointConsumerBuilder enableViewMessages(
                boolean enableViewMessages) {
            setProperty("enableViewMessages", enableViewMessages);
            return this;
        }
        /**
         * If set to true, the consumer endpoint will receive org.jgroups.View
         * messages as well (not only org.jgroups.Message instances). By default
         * only regular messages are consumed by the endpoint.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        default JGroupsEndpointConsumerBuilder enableViewMessages(
                String enableViewMessages) {
            setProperty("enableViewMessages", enableViewMessages);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the JGroups component.
     */
    public interface AdvancedJGroupsEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default JGroupsEndpointConsumerBuilder basic() {
            return (JGroupsEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option is a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * @group consumer (advanced)
         */
        default AdvancedJGroupsEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * @group consumer (advanced)
         */
        default AdvancedJGroupsEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedJGroupsEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedJGroupsEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedJGroupsEndpointConsumerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedJGroupsEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedJGroupsEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedJGroupsEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the JGroups component.
     */
    public interface JGroupsEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedJGroupsEndpointProducerBuilder advanced() {
            return (AdvancedJGroupsEndpointProducerBuilder) this;
        }
        /**
         * The name of the JGroups cluster the component should connect to.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default JGroupsEndpointProducerBuilder clusterName(String clusterName) {
            setProperty("clusterName", clusterName);
            return this;
        }
        /**
         * Specifies configuration properties of the JChannel used by the
         * endpoint.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default JGroupsEndpointProducerBuilder channelProperties(
                String channelProperties) {
            setProperty("channelProperties", channelProperties);
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
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default JGroupsEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
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
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default JGroupsEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the JGroups component.
     */
    public interface AdvancedJGroupsEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default JGroupsEndpointProducerBuilder basic() {
            return (JGroupsEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedJGroupsEndpointProducerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedJGroupsEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedJGroupsEndpointProducerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedJGroupsEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the JGroups component.
     */
    public interface JGroupsEndpointBuilder
            extends
                JGroupsEndpointConsumerBuilder, JGroupsEndpointProducerBuilder {
        default AdvancedJGroupsEndpointBuilder advanced() {
            return (AdvancedJGroupsEndpointBuilder) this;
        }
        /**
         * The name of the JGroups cluster the component should connect to.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default JGroupsEndpointBuilder clusterName(String clusterName) {
            setProperty("clusterName", clusterName);
            return this;
        }
        /**
         * Specifies configuration properties of the JChannel used by the
         * endpoint.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default JGroupsEndpointBuilder channelProperties(
                String channelProperties) {
            setProperty("channelProperties", channelProperties);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the JGroups component.
     */
    public interface AdvancedJGroupsEndpointBuilder
            extends
                AdvancedJGroupsEndpointConsumerBuilder, AdvancedJGroupsEndpointProducerBuilder {
        default JGroupsEndpointBuilder basic() {
            return (JGroupsEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedJGroupsEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedJGroupsEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedJGroupsEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedJGroupsEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The jgroups component provides exchange of messages between Camel and
     * JGroups clusters.
     * Maven coordinates: org.apache.camel:camel-jgroups
     */
    default JGroupsEndpointBuilder jGroups(String path) {
        class JGroupsEndpointBuilderImpl extends AbstractEndpointBuilder implements JGroupsEndpointBuilder, AdvancedJGroupsEndpointBuilder {
            public JGroupsEndpointBuilderImpl(String path) {
                super("jgroups", path);
            }
        }
        return new JGroupsEndpointBuilderImpl(path);
    }
}