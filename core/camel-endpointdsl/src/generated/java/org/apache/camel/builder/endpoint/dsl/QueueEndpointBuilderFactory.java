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

import java.time.Duration;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The azure-storage-queue component is used for storing and retrieving the
 * messages to/from Azure Storage Queue using Azure SDK v12.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface QueueEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Azure Storage Queue Service
     * component.
     */
    public interface QueueEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedQueueEndpointConsumerBuilder advanced() {
            return (AdvancedQueueEndpointConsumerBuilder) this;
        }
        /**
         * Service client to a storage account to interact with the queue
         * service. This client does not hold any state about a particular
         * storage account but is instead a convenient way of sending off
         * appropriate requests to the resource on the service. This client
         * contains all the operations for interacting with a queue account in
         * Azure Storage. Operations allowed by the client are creating,
         * listing, and deleting queues, retrieving and updating properties of
         * the account, and retrieving statistics of the account.
         * 
         * The option is a:
         * <code>com.azure.storage.queue.QueueServiceClient</code> type.
         * 
         * Group: common
         */
        default QueueEndpointConsumerBuilder queueServiceClient(
                Object queueServiceClient) {
            doSetProperty("queueServiceClient", queueServiceClient);
            return this;
        }
        /**
         * Service client to a storage account to interact with the queue
         * service. This client does not hold any state about a particular
         * storage account but is instead a convenient way of sending off
         * appropriate requests to the resource on the service. This client
         * contains all the operations for interacting with a queue account in
         * Azure Storage. Operations allowed by the client are creating,
         * listing, and deleting queues, retrieving and updating properties of
         * the account, and retrieving statistics of the account.
         * 
         * The option will be converted to a
         * <code>com.azure.storage.queue.QueueServiceClient</code> type.
         * 
         * Group: common
         */
        default QueueEndpointConsumerBuilder queueServiceClient(
                String queueServiceClient) {
            doSetProperty("queueServiceClient", queueServiceClient);
            return this;
        }
        /**
         * s.
         * 
         * The option is a:
         * <code>com.azure.storage.queue.QueueServiceClient</code> type.
         * 
         * Group: common
         */
        default QueueEndpointConsumerBuilder serviceClient(Object serviceClient) {
            doSetProperty("serviceClient", serviceClient);
            return this;
        }
        /**
         * s.
         * 
         * The option will be converted to a
         * <code>com.azure.storage.queue.QueueServiceClient</code> type.
         * 
         * Group: common
         */
        default QueueEndpointConsumerBuilder serviceClient(String serviceClient) {
            doSetProperty("serviceClient", serviceClient);
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
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default QueueEndpointConsumerBuilder bridgeErrorHandler(
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
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default QueueEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * as.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 5
         * Group: queue
         */
        default QueueEndpointConsumerBuilder maxMessages(Integer maxMessages) {
            doSetProperty("maxMessages", maxMessages);
            return this;
        }
        /**
         * as.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Default: 5
         * Group: queue
         */
        default QueueEndpointConsumerBuilder maxMessages(String maxMessages) {
            doSetProperty("maxMessages", maxMessages);
            return this;
        }
        /**
         * dd.
         * 
         * The option is a: <code>java.time.Duration</code> type.
         * 
         * Group: queue
         */
        default QueueEndpointConsumerBuilder timeToLive(Duration timeToLive) {
            doSetProperty("timeToLive", timeToLive);
            return this;
        }
        /**
         * dd.
         * 
         * The option will be converted to a <code>java.time.Duration</code>
         * type.
         * 
         * Group: queue
         */
        default QueueEndpointConsumerBuilder timeToLive(String timeToLive) {
            doSetProperty("timeToLive", timeToLive);
            return this;
        }
        /**
         * dd.
         * 
         * The option is a: <code>java.time.Duration</code> type.
         * 
         * Group: queue
         */
        default QueueEndpointConsumerBuilder visibilityTimeout(
                Duration visibilityTimeout) {
            doSetProperty("visibilityTimeout", visibilityTimeout);
            return this;
        }
        /**
         * dd.
         * 
         * The option will be converted to a <code>java.time.Duration</code>
         * type.
         * 
         * Group: queue
         */
        default QueueEndpointConsumerBuilder visibilityTimeout(
                String visibilityTimeout) {
            doSetProperty("visibilityTimeout", visibilityTimeout);
            return this;
        }
        /**
         * Access key for the associated azure account name to be used for
         * authentication with azure queue services.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default QueueEndpointConsumerBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * StorageSharedKeyCredential can be injected to create the azure
         * client, this holds the important authentication information.
         * 
         * The option is a:
         * <code>com.azure.storage.common.StorageSharedKeyCredential</code>
         * type.
         * 
         * Group: security
         */
        default QueueEndpointConsumerBuilder credentials(Object credentials) {
            doSetProperty("credentials", credentials);
            return this;
        }
        /**
         * StorageSharedKeyCredential can be injected to create the azure
         * client, this holds the important authentication information.
         * 
         * The option will be converted to a
         * <code>com.azure.storage.common.StorageSharedKeyCredential</code>
         * type.
         * 
         * Group: security
         */
        default QueueEndpointConsumerBuilder credentials(String credentials) {
            doSetProperty("credentials", credentials);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Azure Storage Queue
     * Service component.
     */
    public interface AdvancedQueueEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default QueueEndpointConsumerBuilder basic() {
            return (QueueEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedQueueEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
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
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedQueueEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedQueueEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedQueueEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
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
        default AdvancedQueueEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedQueueEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedQueueEndpointConsumerBuilder synchronous(
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
         * Default: false
         * Group: advanced
         */
        default AdvancedQueueEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Azure Storage Queue Service
     * component.
     */
    public interface QueueEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedQueueEndpointProducerBuilder advanced() {
            return (AdvancedQueueEndpointProducerBuilder) this;
        }
        /**
         * Service client to a storage account to interact with the queue
         * service. This client does not hold any state about a particular
         * storage account but is instead a convenient way of sending off
         * appropriate requests to the resource on the service. This client
         * contains all the operations for interacting with a queue account in
         * Azure Storage. Operations allowed by the client are creating,
         * listing, and deleting queues, retrieving and updating properties of
         * the account, and retrieving statistics of the account.
         * 
         * The option is a:
         * <code>com.azure.storage.queue.QueueServiceClient</code> type.
         * 
         * Group: common
         */
        default QueueEndpointProducerBuilder queueServiceClient(
                Object queueServiceClient) {
            doSetProperty("queueServiceClient", queueServiceClient);
            return this;
        }
        /**
         * Service client to a storage account to interact with the queue
         * service. This client does not hold any state about a particular
         * storage account but is instead a convenient way of sending off
         * appropriate requests to the resource on the service. This client
         * contains all the operations for interacting with a queue account in
         * Azure Storage. Operations allowed by the client are creating,
         * listing, and deleting queues, retrieving and updating properties of
         * the account, and retrieving statistics of the account.
         * 
         * The option will be converted to a
         * <code>com.azure.storage.queue.QueueServiceClient</code> type.
         * 
         * Group: common
         */
        default QueueEndpointProducerBuilder queueServiceClient(
                String queueServiceClient) {
            doSetProperty("queueServiceClient", queueServiceClient);
            return this;
        }
        /**
         * s.
         * 
         * The option is a:
         * <code>com.azure.storage.queue.QueueServiceClient</code> type.
         * 
         * Group: common
         */
        default QueueEndpointProducerBuilder serviceClient(Object serviceClient) {
            doSetProperty("serviceClient", serviceClient);
            return this;
        }
        /**
         * s.
         * 
         * The option will be converted to a
         * <code>com.azure.storage.queue.QueueServiceClient</code> type.
         * 
         * Group: common
         */
        default QueueEndpointProducerBuilder serviceClient(String serviceClient) {
            doSetProperty("serviceClient", serviceClient);
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
        default QueueEndpointProducerBuilder lazyStartProducer(
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
         * Default: false
         * Group: producer
         */
        default QueueEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * ss.
         * 
         * The option is a:
         * <code>org.apache.camel.component.azure.storage.queue.QueueOperationDefinition</code> type.
         * 
         * Group: producer
         */
        default QueueEndpointProducerBuilder operation(
                QueueOperationDefinition operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * ss.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.azure.storage.queue.QueueOperationDefinition</code> type.
         * 
         * Group: producer
         */
        default QueueEndpointProducerBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * as.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 5
         * Group: queue
         */
        default QueueEndpointProducerBuilder maxMessages(Integer maxMessages) {
            doSetProperty("maxMessages", maxMessages);
            return this;
        }
        /**
         * as.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Default: 5
         * Group: queue
         */
        default QueueEndpointProducerBuilder maxMessages(String maxMessages) {
            doSetProperty("maxMessages", maxMessages);
            return this;
        }
        /**
         * dd.
         * 
         * The option is a: <code>java.time.Duration</code> type.
         * 
         * Group: queue
         */
        default QueueEndpointProducerBuilder timeToLive(Duration timeToLive) {
            doSetProperty("timeToLive", timeToLive);
            return this;
        }
        /**
         * dd.
         * 
         * The option will be converted to a <code>java.time.Duration</code>
         * type.
         * 
         * Group: queue
         */
        default QueueEndpointProducerBuilder timeToLive(String timeToLive) {
            doSetProperty("timeToLive", timeToLive);
            return this;
        }
        /**
         * dd.
         * 
         * The option is a: <code>java.time.Duration</code> type.
         * 
         * Group: queue
         */
        default QueueEndpointProducerBuilder visibilityTimeout(
                Duration visibilityTimeout) {
            doSetProperty("visibilityTimeout", visibilityTimeout);
            return this;
        }
        /**
         * dd.
         * 
         * The option will be converted to a <code>java.time.Duration</code>
         * type.
         * 
         * Group: queue
         */
        default QueueEndpointProducerBuilder visibilityTimeout(
                String visibilityTimeout) {
            doSetProperty("visibilityTimeout", visibilityTimeout);
            return this;
        }
        /**
         * Access key for the associated azure account name to be used for
         * authentication with azure queue services.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default QueueEndpointProducerBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * StorageSharedKeyCredential can be injected to create the azure
         * client, this holds the important authentication information.
         * 
         * The option is a:
         * <code>com.azure.storage.common.StorageSharedKeyCredential</code>
         * type.
         * 
         * Group: security
         */
        default QueueEndpointProducerBuilder credentials(Object credentials) {
            doSetProperty("credentials", credentials);
            return this;
        }
        /**
         * StorageSharedKeyCredential can be injected to create the azure
         * client, this holds the important authentication information.
         * 
         * The option will be converted to a
         * <code>com.azure.storage.common.StorageSharedKeyCredential</code>
         * type.
         * 
         * Group: security
         */
        default QueueEndpointProducerBuilder credentials(String credentials) {
            doSetProperty("credentials", credentials);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Azure Storage Queue
     * Service component.
     */
    public interface AdvancedQueueEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default QueueEndpointProducerBuilder basic() {
            return (QueueEndpointProducerBuilder) this;
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
        default AdvancedQueueEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedQueueEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedQueueEndpointProducerBuilder synchronous(
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
         * Default: false
         * Group: advanced
         */
        default AdvancedQueueEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Azure Storage Queue Service component.
     */
    public interface QueueEndpointBuilder
            extends
                QueueEndpointConsumerBuilder,
                QueueEndpointProducerBuilder {
        default AdvancedQueueEndpointBuilder advanced() {
            return (AdvancedQueueEndpointBuilder) this;
        }
        /**
         * Service client to a storage account to interact with the queue
         * service. This client does not hold any state about a particular
         * storage account but is instead a convenient way of sending off
         * appropriate requests to the resource on the service. This client
         * contains all the operations for interacting with a queue account in
         * Azure Storage. Operations allowed by the client are creating,
         * listing, and deleting queues, retrieving and updating properties of
         * the account, and retrieving statistics of the account.
         * 
         * The option is a:
         * <code>com.azure.storage.queue.QueueServiceClient</code> type.
         * 
         * Group: common
         */
        default QueueEndpointBuilder queueServiceClient(
                Object queueServiceClient) {
            doSetProperty("queueServiceClient", queueServiceClient);
            return this;
        }
        /**
         * Service client to a storage account to interact with the queue
         * service. This client does not hold any state about a particular
         * storage account but is instead a convenient way of sending off
         * appropriate requests to the resource on the service. This client
         * contains all the operations for interacting with a queue account in
         * Azure Storage. Operations allowed by the client are creating,
         * listing, and deleting queues, retrieving and updating properties of
         * the account, and retrieving statistics of the account.
         * 
         * The option will be converted to a
         * <code>com.azure.storage.queue.QueueServiceClient</code> type.
         * 
         * Group: common
         */
        default QueueEndpointBuilder queueServiceClient(
                String queueServiceClient) {
            doSetProperty("queueServiceClient", queueServiceClient);
            return this;
        }
        /**
         * s.
         * 
         * The option is a:
         * <code>com.azure.storage.queue.QueueServiceClient</code> type.
         * 
         * Group: common
         */
        default QueueEndpointBuilder serviceClient(Object serviceClient) {
            doSetProperty("serviceClient", serviceClient);
            return this;
        }
        /**
         * s.
         * 
         * The option will be converted to a
         * <code>com.azure.storage.queue.QueueServiceClient</code> type.
         * 
         * Group: common
         */
        default QueueEndpointBuilder serviceClient(String serviceClient) {
            doSetProperty("serviceClient", serviceClient);
            return this;
        }
        /**
         * as.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 5
         * Group: queue
         */
        default QueueEndpointBuilder maxMessages(Integer maxMessages) {
            doSetProperty("maxMessages", maxMessages);
            return this;
        }
        /**
         * as.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Default: 5
         * Group: queue
         */
        default QueueEndpointBuilder maxMessages(String maxMessages) {
            doSetProperty("maxMessages", maxMessages);
            return this;
        }
        /**
         * dd.
         * 
         * The option is a: <code>java.time.Duration</code> type.
         * 
         * Group: queue
         */
        default QueueEndpointBuilder timeToLive(Duration timeToLive) {
            doSetProperty("timeToLive", timeToLive);
            return this;
        }
        /**
         * dd.
         * 
         * The option will be converted to a <code>java.time.Duration</code>
         * type.
         * 
         * Group: queue
         */
        default QueueEndpointBuilder timeToLive(String timeToLive) {
            doSetProperty("timeToLive", timeToLive);
            return this;
        }
        /**
         * dd.
         * 
         * The option is a: <code>java.time.Duration</code> type.
         * 
         * Group: queue
         */
        default QueueEndpointBuilder visibilityTimeout(
                Duration visibilityTimeout) {
            doSetProperty("visibilityTimeout", visibilityTimeout);
            return this;
        }
        /**
         * dd.
         * 
         * The option will be converted to a <code>java.time.Duration</code>
         * type.
         * 
         * Group: queue
         */
        default QueueEndpointBuilder visibilityTimeout(String visibilityTimeout) {
            doSetProperty("visibilityTimeout", visibilityTimeout);
            return this;
        }
        /**
         * Access key for the associated azure account name to be used for
         * authentication with azure queue services.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default QueueEndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * StorageSharedKeyCredential can be injected to create the azure
         * client, this holds the important authentication information.
         * 
         * The option is a:
         * <code>com.azure.storage.common.StorageSharedKeyCredential</code>
         * type.
         * 
         * Group: security
         */
        default QueueEndpointBuilder credentials(Object credentials) {
            doSetProperty("credentials", credentials);
            return this;
        }
        /**
         * StorageSharedKeyCredential can be injected to create the azure
         * client, this holds the important authentication information.
         * 
         * The option will be converted to a
         * <code>com.azure.storage.common.StorageSharedKeyCredential</code>
         * type.
         * 
         * Group: security
         */
        default QueueEndpointBuilder credentials(String credentials) {
            doSetProperty("credentials", credentials);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Azure Storage Queue Service
     * component.
     */
    public interface AdvancedQueueEndpointBuilder
            extends
                AdvancedQueueEndpointConsumerBuilder,
                AdvancedQueueEndpointProducerBuilder {
        default QueueEndpointBuilder basic() {
            return (QueueEndpointBuilder) this;
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
        default AdvancedQueueEndpointBuilder basicPropertyBinding(
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
        default AdvancedQueueEndpointBuilder basicPropertyBinding(
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
        default AdvancedQueueEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedQueueEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.azure.storage.queue.QueueOperationDefinition</code> enum.
     */
    enum QueueOperationDefinition {
        listQueues,
        createQueue,
        deleteQueue,
        clearQueue,
        sendMessage,
        deleteMessage,
        receiveMessages,
        peekMessages,
        updateMessage;
    }

    public interface QueueBuilders {
        /**
         * Azure Storage Queue Service (camel-azure-storage-queue)
         * The azure-storage-queue component is used for storing and retrieving
         * the messages to/from Azure Storage Queue using Azure SDK v12.
         * 
         * Category: cloud,messaging
         * Since: 3.3
         * Maven coordinates: org.apache.camel:camel-azure-storage-queue
         * 
         * Syntax: <code>azure-storage-queue:queueName</code>
         * 
         * Path parameter: accountName
         * Azure account name to be used for authentication with azure queue
         * services
         * 
         * Path parameter: queueName
         * d
         */
        default QueueEndpointBuilder azureStorageQueue(String path) {
            return QueueEndpointBuilderFactory.azureStorageQueue(path);
        }
    }
    /**
     * Azure Storage Queue Service (camel-azure-storage-queue)
     * The azure-storage-queue component is used for storing and retrieving the
     * messages to/from Azure Storage Queue using Azure SDK v12.
     * 
     * Category: cloud,messaging
     * Since: 3.3
     * Maven coordinates: org.apache.camel:camel-azure-storage-queue
     * 
     * Syntax: <code>azure-storage-queue:queueName</code>
     * 
     * Path parameter: accountName
     * Azure account name to be used for authentication with azure queue
     * services
     * 
     * Path parameter: queueName
     * d
     */
    static QueueEndpointBuilder azureStorageQueue(String path) {
        class QueueEndpointBuilderImpl extends AbstractEndpointBuilder implements QueueEndpointBuilder, AdvancedQueueEndpointBuilder {
            public QueueEndpointBuilderImpl(String path) {
                super("azure-storage-queue", path);
            }
        }
        return new QueueEndpointBuilderImpl(path);
    }
}