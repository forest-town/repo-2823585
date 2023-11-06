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
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Send and receive messages to/from Google Cloud Platform PubSub Service.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GooglePubsubEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Google Pubsub component.
     */
    public interface GooglePubsubEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedGooglePubsubEndpointConsumerBuilder advanced() {
            return (AdvancedGooglePubsubEndpointConsumerBuilder) this;
        }
        /**
         * Use Credentials when interacting with PubSub service (no
         * authentication is required when using emulator).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param authenticate the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder authenticate(
                boolean authenticate) {
            doSetProperty("authenticate", authenticate);
            return this;
        }
        /**
         * Use Credentials when interacting with PubSub service (no
         * authentication is required when using emulator).
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: common
         * 
         * @param authenticate the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder authenticate(
                String authenticate) {
            doSetProperty("authenticate", authenticate);
            return this;
        }
        /**
         * Logger ID to use when a match to the parent route required.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param loggerId the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder loggerId(String loggerId) {
            doSetProperty("loggerId", loggerId);
            return this;
        }
        /**
         * The Service account key that can be used as credentials for the
         * PubSub publisher/subscriber. It can be loaded by default from
         * classpath, but you can prefix with classpath:, file:, or http: to
         * load the resource from different systems.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param serviceAccountKey the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder serviceAccountKey(
                String serviceAccountKey) {
            doSetProperty("serviceAccountKey", serviceAccountKey);
            return this;
        }
        /**
         * AUTO = exchange gets ack'ed/nack'ed on completion. NONE = downstream
         * process has to ack/nack explicitly.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.google.pubsub.GooglePubsubConstants.AckMode&lt;/code&gt; type.
         * 
         * Default: AUTO
         * Group: consumer
         * 
         * @param ackMode the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder ackMode(
                org.apache.camel.component.google.pubsub.GooglePubsubConstants.AckMode ackMode) {
            doSetProperty("ackMode", ackMode);
            return this;
        }
        /**
         * AUTO = exchange gets ack'ed/nack'ed on completion. NONE = downstream
         * process has to ack/nack explicitly.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.google.pubsub.GooglePubsubConstants.AckMode&lt;/code&gt; type.
         * 
         * Default: AUTO
         * Group: consumer
         * 
         * @param ackMode the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder ackMode(String ackMode) {
            doSetProperty("ackMode", ackMode);
            return this;
        }
        /**
         * The number of parallel streams consuming from the subscription.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: consumer
         * 
         * @param concurrentConsumers the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder concurrentConsumers(
                Integer concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * The number of parallel streams consuming from the subscription.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: consumer
         * 
         * @param concurrentConsumers the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder concurrentConsumers(
                String concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Set the maximum period a message ack deadline will be extended. Value
         * in seconds.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 3600
         * Group: consumer
         * 
         * @param maxAckExtensionPeriod the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder maxAckExtensionPeriod(
                int maxAckExtensionPeriod) {
            doSetProperty("maxAckExtensionPeriod", maxAckExtensionPeriod);
            return this;
        }
        /**
         * Set the maximum period a message ack deadline will be extended. Value
         * in seconds.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 3600
         * Group: consumer
         * 
         * @param maxAckExtensionPeriod the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder maxAckExtensionPeriod(
                String maxAckExtensionPeriod) {
            doSetProperty("maxAckExtensionPeriod", maxAckExtensionPeriod);
            return this;
        }
        /**
         * The max number of messages to receive from the server in a single API
         * call.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: consumer
         * 
         * @param maxMessagesPerPoll the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder maxMessagesPerPoll(
                Integer maxMessagesPerPoll) {
            doSetProperty("maxMessagesPerPoll", maxMessagesPerPoll);
            return this;
        }
        /**
         * The max number of messages to receive from the server in a single API
         * call.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: consumer
         * 
         * @param maxMessagesPerPoll the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder maxMessagesPerPoll(
                String maxMessagesPerPoll) {
            doSetProperty("maxMessagesPerPoll", maxMessagesPerPoll);
            return this;
        }
        /**
         * Synchronously pull batches of messages.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param synchronousPull the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder synchronousPull(
                boolean synchronousPull) {
            doSetProperty("synchronousPull", synchronousPull);
            return this;
        }
        /**
         * Synchronously pull batches of messages.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param synchronousPull the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder synchronousPull(
                String synchronousPull) {
            doSetProperty("synchronousPull", synchronousPull);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Google Pubsub component.
     */
    public interface AdvancedGooglePubsubEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default GooglePubsubEndpointConsumerBuilder basic() {
            return (GooglePubsubEndpointConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedGooglePubsubEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedGooglePubsubEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedGooglePubsubEndpointConsumerBuilder exceptionHandler(
                org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedGooglePubsubEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedGooglePubsubEndpointConsumerBuilder exchangePattern(
                org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedGooglePubsubEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Google Pubsub component.
     */
    public interface GooglePubsubEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedGooglePubsubEndpointProducerBuilder advanced() {
            return (AdvancedGooglePubsubEndpointProducerBuilder) this;
        }
        /**
         * Use Credentials when interacting with PubSub service (no
         * authentication is required when using emulator).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param authenticate the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointProducerBuilder authenticate(
                boolean authenticate) {
            doSetProperty("authenticate", authenticate);
            return this;
        }
        /**
         * Use Credentials when interacting with PubSub service (no
         * authentication is required when using emulator).
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: common
         * 
         * @param authenticate the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointProducerBuilder authenticate(
                String authenticate) {
            doSetProperty("authenticate", authenticate);
            return this;
        }
        /**
         * Logger ID to use when a match to the parent route required.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param loggerId the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointProducerBuilder loggerId(String loggerId) {
            doSetProperty("loggerId", loggerId);
            return this;
        }
        /**
         * The Service account key that can be used as credentials for the
         * PubSub publisher/subscriber. It can be loaded by default from
         * classpath, but you can prefix with classpath:, file:, or http: to
         * load the resource from different systems.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param serviceAccountKey the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointProducerBuilder serviceAccountKey(
                String serviceAccountKey) {
            doSetProperty("serviceAccountKey", serviceAccountKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Google Pubsub component.
     */
    public interface AdvancedGooglePubsubEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default GooglePubsubEndpointProducerBuilder basic() {
            return (GooglePubsubEndpointProducerBuilder) this;
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
        default AdvancedGooglePubsubEndpointProducerBuilder lazyStartProducer(
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
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedGooglePubsubEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Should message ordering be enabled.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param messageOrderingEnabled the value to set
         * @return the dsl builder
         */
        default AdvancedGooglePubsubEndpointProducerBuilder messageOrderingEnabled(
                boolean messageOrderingEnabled) {
            doSetProperty("messageOrderingEnabled", messageOrderingEnabled);
            return this;
        }
        /**
         * Should message ordering be enabled.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param messageOrderingEnabled the value to set
         * @return the dsl builder
         */
        default AdvancedGooglePubsubEndpointProducerBuilder messageOrderingEnabled(
                String messageOrderingEnabled) {
            doSetProperty("messageOrderingEnabled", messageOrderingEnabled);
            return this;
        }
        /**
         * Pub/Sub endpoint to use. Required when using message ordering, and
         * ensures that messages are received in order even when multiple
         * publishers are used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer (advanced)
         * 
         * @param pubsubEndpoint the value to set
         * @return the dsl builder
         */
        default AdvancedGooglePubsubEndpointProducerBuilder pubsubEndpoint(
                String pubsubEndpoint) {
            doSetProperty("pubsubEndpoint", pubsubEndpoint);
            return this;
        }
        /**
         * A custom GooglePubsubSerializer to use for serializing message
         * payloads in the producer.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.google.pubsub.serializer.GooglePubsubSerializer&lt;/code&gt; type.
         * 
         * Group: producer (advanced)
         * 
         * @param serializer the value to set
         * @return the dsl builder
         */
        default AdvancedGooglePubsubEndpointProducerBuilder serializer(
                org.apache.camel.component.google.pubsub.serializer.GooglePubsubSerializer serializer) {
            doSetProperty("serializer", serializer);
            return this;
        }
        /**
         * A custom GooglePubsubSerializer to use for serializing message
         * payloads in the producer.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.google.pubsub.serializer.GooglePubsubSerializer&lt;/code&gt; type.
         * 
         * Group: producer (advanced)
         * 
         * @param serializer the value to set
         * @return the dsl builder
         */
        default AdvancedGooglePubsubEndpointProducerBuilder serializer(
                String serializer) {
            doSetProperty("serializer", serializer);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Google Pubsub component.
     */
    public interface GooglePubsubEndpointBuilder
            extends
                GooglePubsubEndpointConsumerBuilder,
                GooglePubsubEndpointProducerBuilder {
        default AdvancedGooglePubsubEndpointBuilder advanced() {
            return (AdvancedGooglePubsubEndpointBuilder) this;
        }
        /**
         * Use Credentials when interacting with PubSub service (no
         * authentication is required when using emulator).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param authenticate the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointBuilder authenticate(boolean authenticate) {
            doSetProperty("authenticate", authenticate);
            return this;
        }
        /**
         * Use Credentials when interacting with PubSub service (no
         * authentication is required when using emulator).
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: common
         * 
         * @param authenticate the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointBuilder authenticate(String authenticate) {
            doSetProperty("authenticate", authenticate);
            return this;
        }
        /**
         * Logger ID to use when a match to the parent route required.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param loggerId the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointBuilder loggerId(String loggerId) {
            doSetProperty("loggerId", loggerId);
            return this;
        }
        /**
         * The Service account key that can be used as credentials for the
         * PubSub publisher/subscriber. It can be loaded by default from
         * classpath, but you can prefix with classpath:, file:, or http: to
         * load the resource from different systems.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param serviceAccountKey the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointBuilder serviceAccountKey(
                String serviceAccountKey) {
            doSetProperty("serviceAccountKey", serviceAccountKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Google Pubsub component.
     */
    public interface AdvancedGooglePubsubEndpointBuilder
            extends
                AdvancedGooglePubsubEndpointConsumerBuilder,
                AdvancedGooglePubsubEndpointProducerBuilder {
        default GooglePubsubEndpointBuilder basic() {
            return (GooglePubsubEndpointBuilder) this;
        }
    }

    public interface GooglePubsubBuilders {
        /**
         * Google Pubsub (camel-google-pubsub)
         * Send and receive messages to/from Google Cloud Platform PubSub
         * Service.
         * 
         * Category: cloud,messaging
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-google-pubsub
         * 
         * @return the dsl builder for the headers' name.
         */
        default GooglePubsubHeaderNameBuilder googlePubsub() {
            return GooglePubsubHeaderNameBuilder.INSTANCE;
        }
        /**
         * Google Pubsub (camel-google-pubsub)
         * Send and receive messages to/from Google Cloud Platform PubSub
         * Service.
         * 
         * Category: cloud,messaging
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-google-pubsub
         * 
         * Syntax: <code>google-pubsub:projectId:destinationName</code>
         * 
         * Path parameter: projectId (required)
         * The Google Cloud PubSub Project Id
         * 
         * Path parameter: destinationName (required)
         * The Destination Name. For the consumer this will be the subscription
         * name, while for the producer this will be the topic name.
         * 
         * @param path projectId:destinationName
         * @return the dsl builder
         */
        default GooglePubsubEndpointBuilder googlePubsub(String path) {
            return GooglePubsubEndpointBuilderFactory.endpointBuilder("google-pubsub", path);
        }
        /**
         * Google Pubsub (camel-google-pubsub)
         * Send and receive messages to/from Google Cloud Platform PubSub
         * Service.
         * 
         * Category: cloud,messaging
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-google-pubsub
         * 
         * Syntax: <code>google-pubsub:projectId:destinationName</code>
         * 
         * Path parameter: projectId (required)
         * The Google Cloud PubSub Project Id
         * 
         * Path parameter: destinationName (required)
         * The Destination Name. For the consumer this will be the subscription
         * name, while for the producer this will be the topic name.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path projectId:destinationName
         * @return the dsl builder
         */
        default GooglePubsubEndpointBuilder googlePubsub(
                String componentName,
                String path) {
            return GooglePubsubEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Google Pubsub component.
     */
    public static class GooglePubsubHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final GooglePubsubHeaderNameBuilder INSTANCE = new GooglePubsubHeaderNameBuilder();

        /**
         * The ID of the message, assigned by the server when the message is
         * published.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: common
         * 
         * @return the name of the header {@code GooglePubsubMessageId}.
         */
        public String googlePubsubMessageId() {
            return "CamelGooglePubsubMessageId";
        }

        /**
         * The ID used to acknowledge the received message.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code GooglePubsubMsgAckId}.
         */
        public String googlePubsubMsgAckId() {
            return "CamelGooglePubsubMsgAckId";
        }

        /**
         * The time at which the message was published.
         * 
         * The option is a: {@code com.google.protobuf.Timestamp} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code GooglePubsubPublishTime}.
         */
        public String googlePubsubPublishTime() {
            return "CamelGooglePubsubPublishTime";
        }

        /**
         * The attributes of the message.
         * 
         * The option is a: {@code Map<String, String>} type.
         * 
         * Group: common
         * 
         * @return the name of the header {@code GooglePubsubAttributes}.
         */
        public String googlePubsubAttributes() {
            return "CamelGooglePubsubAttributes";
        }

        /**
         * If non-empty, identifies related messages for which publish order
         * should be respected.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code GooglePubsubOrderingKey}.
         */
        public String googlePubsubOrderingKey() {
            return "CamelGooglePubsubOrderingKey";
        }
    }
    static GooglePubsubEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class GooglePubsubEndpointBuilderImpl extends AbstractEndpointBuilder implements GooglePubsubEndpointBuilder, AdvancedGooglePubsubEndpointBuilder {
            public GooglePubsubEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new GooglePubsubEndpointBuilderImpl(path);
    }
}