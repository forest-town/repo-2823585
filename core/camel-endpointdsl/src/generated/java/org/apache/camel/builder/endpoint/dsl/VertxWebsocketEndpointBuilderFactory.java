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
 * Camel WebSocket support with Vert.x
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface VertxWebsocketEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Vert.x WebSocket component.
     */
    public interface VertxWebsocketEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedVertxWebsocketEndpointConsumerBuilder advanced() {
            return (AdvancedVertxWebsocketEndpointConsumerBuilder) this;
        }
        /**
         * Regex pattern to match the origin header sent by WebSocket clients.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default VertxWebsocketEndpointConsumerBuilder allowedOriginPattern(
                String allowedOriginPattern) {
            doSetProperty("allowedOriginPattern", allowedOriginPattern);
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
        default VertxWebsocketEndpointConsumerBuilder bridgeErrorHandler(
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
        default VertxWebsocketEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To use an existing vertx router for the HTTP server.
         * 
         * The option is a: <code>io.vertx.ext.web.Router</code> type.
         * 
         * Group: consumer
         */
        default VertxWebsocketEndpointConsumerBuilder router(Object router) {
            doSetProperty("router", router);
            return this;
        }
        /**
         * To use an existing vertx router for the HTTP server.
         * 
         * The option will be converted to a
         * <code>io.vertx.ext.web.Router</code> type.
         * 
         * Group: consumer
         */
        default VertxWebsocketEndpointConsumerBuilder router(String router) {
            doSetProperty("router", router);
            return this;
        }
        /**
         * Sets customized options for configuring the HTTP server hosting the
         * WebSocket for the consumer.
         * 
         * The option is a: <code>io.vertx.core.http.HttpServerOptions</code>
         * type.
         * 
         * Group: consumer
         */
        default VertxWebsocketEndpointConsumerBuilder serverOptions(
                Object serverOptions) {
            doSetProperty("serverOptions", serverOptions);
            return this;
        }
        /**
         * Sets customized options for configuring the HTTP server hosting the
         * WebSocket for the consumer.
         * 
         * The option will be converted to a
         * <code>io.vertx.core.http.HttpServerOptions</code> type.
         * 
         * Group: consumer
         */
        default VertxWebsocketEndpointConsumerBuilder serverOptions(
                String serverOptions) {
            doSetProperty("serverOptions", serverOptions);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default VertxWebsocketEndpointConsumerBuilder sslContextParameters(
                Object sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default VertxWebsocketEndpointConsumerBuilder sslContextParameters(
                String sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Vert.x WebSocket
     * component.
     */
    public interface AdvancedVertxWebsocketEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default VertxWebsocketEndpointConsumerBuilder basic() {
            return (VertxWebsocketEndpointConsumerBuilder) this;
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
        default AdvancedVertxWebsocketEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedVertxWebsocketEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedVertxWebsocketEndpointConsumerBuilder exchangePattern(
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
        default AdvancedVertxWebsocketEndpointConsumerBuilder exchangePattern(
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
        default AdvancedVertxWebsocketEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedVertxWebsocketEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedVertxWebsocketEndpointConsumerBuilder synchronous(
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
        default AdvancedVertxWebsocketEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Vert.x WebSocket component.
     */
    public interface VertxWebsocketEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedVertxWebsocketEndpointProducerBuilder advanced() {
            return (AdvancedVertxWebsocketEndpointProducerBuilder) this;
        }
        /**
         * Sets customized options for configuring the WebSocket client used in
         * the producer.
         * 
         * The option is a: <code>io.vertx.core.http.HttpClientOptions</code>
         * type.
         * 
         * Group: producer
         */
        default VertxWebsocketEndpointProducerBuilder clientOptions(
                Object clientOptions) {
            doSetProperty("clientOptions", clientOptions);
            return this;
        }
        /**
         * Sets customized options for configuring the WebSocket client used in
         * the producer.
         * 
         * The option will be converted to a
         * <code>io.vertx.core.http.HttpClientOptions</code> type.
         * 
         * Group: producer
         */
        default VertxWebsocketEndpointProducerBuilder clientOptions(
                String clientOptions) {
            doSetProperty("clientOptions", clientOptions);
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
        default VertxWebsocketEndpointProducerBuilder lazyStartProducer(
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
        default VertxWebsocketEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To send to all websocket subscribers. Can be used to configure on
         * endpoint level, instead of having to use the
         * VertxWebsocketConstants.SEND_TO_ALL header on the message.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VertxWebsocketEndpointProducerBuilder sendToAll(
                boolean sendToAll) {
            doSetProperty("sendToAll", sendToAll);
            return this;
        }
        /**
         * To send to all websocket subscribers. Can be used to configure on
         * endpoint level, instead of having to use the
         * VertxWebsocketConstants.SEND_TO_ALL header on the message.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VertxWebsocketEndpointProducerBuilder sendToAll(String sendToAll) {
            doSetProperty("sendToAll", sendToAll);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default VertxWebsocketEndpointProducerBuilder sslContextParameters(
                Object sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default VertxWebsocketEndpointProducerBuilder sslContextParameters(
                String sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Vert.x WebSocket
     * component.
     */
    public interface AdvancedVertxWebsocketEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default VertxWebsocketEndpointProducerBuilder basic() {
            return (VertxWebsocketEndpointProducerBuilder) this;
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
        default AdvancedVertxWebsocketEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedVertxWebsocketEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedVertxWebsocketEndpointProducerBuilder synchronous(
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
        default AdvancedVertxWebsocketEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Vert.x WebSocket component.
     */
    public interface VertxWebsocketEndpointBuilder
            extends
                VertxWebsocketEndpointConsumerBuilder,
                VertxWebsocketEndpointProducerBuilder {
        default AdvancedVertxWebsocketEndpointBuilder advanced() {
            return (AdvancedVertxWebsocketEndpointBuilder) this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default VertxWebsocketEndpointBuilder sslContextParameters(
                Object sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default VertxWebsocketEndpointBuilder sslContextParameters(
                String sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Vert.x WebSocket component.
     */
    public interface AdvancedVertxWebsocketEndpointBuilder
            extends
                AdvancedVertxWebsocketEndpointConsumerBuilder,
                AdvancedVertxWebsocketEndpointProducerBuilder {
        default VertxWebsocketEndpointBuilder basic() {
            return (VertxWebsocketEndpointBuilder) this;
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
        default AdvancedVertxWebsocketEndpointBuilder basicPropertyBinding(
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
        default AdvancedVertxWebsocketEndpointBuilder basicPropertyBinding(
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
        default AdvancedVertxWebsocketEndpointBuilder synchronous(
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
        default AdvancedVertxWebsocketEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface VertxWebsocketBuilders {
        /**
         * Vert.x WebSocket (camel-vertx-websocket)
         * Camel WebSocket support with Vert.x
         * 
         * Category: websocket
         * Since: 3.5
         * Maven coordinates: org.apache.camel:camel-vertx-websocket
         * 
         * Syntax: <code>vertx-websocket:host:port/path</code>
         * 
         * Path parameter: host
         * The host that the consumer should bind to or the host of the remote
         * websocket destination that the producer should connect to
         * Default value: 0.0.0.0
         * 
         * Path parameter: port
         * The port that the consumer should bind to or port of the remote
         * websocket destination that the producer should connect to
         * Default value: 0
         * 
         * Path parameter: path (required)
         * The path that the consumer should bind to or path of the remote
         * websocket destination that the producer should connect to
         * Default value: /
         * 
         * @param path host:port/path
         */
        default VertxWebsocketEndpointBuilder vertxWebsocket(String path) {
            return VertxWebsocketEndpointBuilderFactory.endpointBuilder("vertx-websocket", path);
        }
        /**
         * Vert.x WebSocket (camel-vertx-websocket)
         * Camel WebSocket support with Vert.x
         * 
         * Category: websocket
         * Since: 3.5
         * Maven coordinates: org.apache.camel:camel-vertx-websocket
         * 
         * Syntax: <code>vertx-websocket:host:port/path</code>
         * 
         * Path parameter: host
         * The host that the consumer should bind to or the host of the remote
         * websocket destination that the producer should connect to
         * Default value: 0.0.0.0
         * 
         * Path parameter: port
         * The port that the consumer should bind to or port of the remote
         * websocket destination that the producer should connect to
         * Default value: 0
         * 
         * Path parameter: path (required)
         * The path that the consumer should bind to or path of the remote
         * websocket destination that the producer should connect to
         * Default value: /
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path host:port/path
         */
        default VertxWebsocketEndpointBuilder vertxWebsocket(
                String componentName,
                String path) {
            return VertxWebsocketEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static VertxWebsocketEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class VertxWebsocketEndpointBuilderImpl extends AbstractEndpointBuilder implements VertxWebsocketEndpointBuilder, AdvancedVertxWebsocketEndpointBuilder {
            public VertxWebsocketEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new VertxWebsocketEndpointBuilderImpl(path);
    }
}