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
 * The Thrift component allows to call and expose remote procedures (RPC) with
 * Apache Thrift data format and serialization mechanism
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ThriftEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Thrift component.
     */
    public interface ThriftEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedThriftEndpointConsumerBuilder advanced() {
            return (AdvancedThriftEndpointConsumerBuilder) this;
        }
        /**
         * The Thrift server host name. This is localhost or 0.0.0.0 (if not
         * defined) when being a consumer or remote server host name when using
         * producer.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default ThriftEndpointConsumerBuilder host(String host) {
            setProperty("host", host);
            return this;
        }
        /**
         * The Thrift server port.
         * The option is a <code>int</code> type.
         * @group common
         */
        default ThriftEndpointConsumerBuilder port(int port) {
            setProperty("port", port);
            return this;
        }
        /**
         * The Thrift server port.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        default ThriftEndpointConsumerBuilder port(String port) {
            setProperty("port", port);
            return this;
        }
        /**
         * Fully qualified service name from the thrift descriptor file (package
         * dot service definition name).
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default ThriftEndpointConsumerBuilder service(String service) {
            setProperty("service", service);
            return this;
        }
        /**
         * Protocol compression mechanism type.
         * The option is a
         * <code>org.apache.camel.component.thrift.ThriftCompressionType</code>
         * type.
         * @group common
         */
        default ThriftEndpointConsumerBuilder compressionType(
                ThriftCompressionType compressionType) {
            setProperty("compressionType", compressionType);
            return this;
        }
        /**
         * Protocol compression mechanism type.
         * The option will be converted to a
         * <code>org.apache.camel.component.thrift.ThriftCompressionType</code>
         * type.
         * @group common
         */
        default ThriftEndpointConsumerBuilder compressionType(
                String compressionType) {
            setProperty("compressionType", compressionType);
            return this;
        }
        /**
         * Exchange protocol serialization type.
         * The option is a
         * <code>org.apache.camel.component.thrift.ThriftExchangeProtocol</code>
         * type.
         * @group common
         */
        default ThriftEndpointConsumerBuilder exchangeProtocol(
                ThriftExchangeProtocol exchangeProtocol) {
            setProperty("exchangeProtocol", exchangeProtocol);
            return this;
        }
        /**
         * Exchange protocol serialization type.
         * The option will be converted to a
         * <code>org.apache.camel.component.thrift.ThriftExchangeProtocol</code>
         * type.
         * @group common
         */
        default ThriftEndpointConsumerBuilder exchangeProtocol(
                String exchangeProtocol) {
            setProperty("exchangeProtocol", exchangeProtocol);
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
        default ThriftEndpointConsumerBuilder bridgeErrorHandler(
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
        default ThriftEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Client timeout for consumers.
         * The option is a <code>int</code> type.
         * @group consumer
         */
        default ThriftEndpointConsumerBuilder clientTimeout(int clientTimeout) {
            setProperty("clientTimeout", clientTimeout);
            return this;
        }
        /**
         * Client timeout for consumers.
         * The option will be converted to a <code>int</code> type.
         * @group consumer
         */
        default ThriftEndpointConsumerBuilder clientTimeout(String clientTimeout) {
            setProperty("clientTimeout", clientTimeout);
            return this;
        }
        /**
         * The Thrift server consumer max thread pool size.
         * The option is a <code>int</code> type.
         * @group consumer
         */
        default ThriftEndpointConsumerBuilder maxPoolSize(int maxPoolSize) {
            setProperty("maxPoolSize", maxPoolSize);
            return this;
        }
        /**
         * The Thrift server consumer max thread pool size.
         * The option will be converted to a <code>int</code> type.
         * @group consumer
         */
        default ThriftEndpointConsumerBuilder maxPoolSize(String maxPoolSize) {
            setProperty("maxPoolSize", maxPoolSize);
            return this;
        }
        /**
         * The Thrift server consumer initial thread pool size.
         * The option is a <code>int</code> type.
         * @group consumer
         */
        default ThriftEndpointConsumerBuilder poolSize(int poolSize) {
            setProperty("poolSize", poolSize);
            return this;
        }
        /**
         * The Thrift server consumer initial thread pool size.
         * The option will be converted to a <code>int</code> type.
         * @group consumer
         */
        default ThriftEndpointConsumerBuilder poolSize(String poolSize) {
            setProperty("poolSize", poolSize);
            return this;
        }
        /**
         * Security negotiation type.
         * The option is a
         * <code>org.apache.camel.component.thrift.ThriftNegotiationType</code>
         * type.
         * @group security
         */
        default ThriftEndpointConsumerBuilder negotiationType(
                ThriftNegotiationType negotiationType) {
            setProperty("negotiationType", negotiationType);
            return this;
        }
        /**
         * Security negotiation type.
         * The option will be converted to a
         * <code>org.apache.camel.component.thrift.ThriftNegotiationType</code>
         * type.
         * @group security
         */
        default ThriftEndpointConsumerBuilder negotiationType(
                String negotiationType) {
            setProperty("negotiationType", negotiationType);
            return this;
        }
        /**
         * Configuration parameters for SSL/TLS security negotiation.
         * The option is a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * @group security
         */
        default ThriftEndpointConsumerBuilder sslParameters(Object sslParameters) {
            setProperty("sslParameters", sslParameters);
            return this;
        }
        /**
         * Configuration parameters for SSL/TLS security negotiation.
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * @group security
         */
        default ThriftEndpointConsumerBuilder sslParameters(String sslParameters) {
            setProperty("sslParameters", sslParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Thrift component.
     */
    public interface AdvancedThriftEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default ThriftEndpointConsumerBuilder basic() {
            return (ThriftEndpointConsumerBuilder) this;
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
        default AdvancedThriftEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedThriftEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedThriftEndpointConsumerBuilder exchangePattern(
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
        default AdvancedThriftEndpointConsumerBuilder exchangePattern(
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
        default AdvancedThriftEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedThriftEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedThriftEndpointConsumerBuilder synchronous(
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
        default AdvancedThriftEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Thrift component.
     */
    public interface ThriftEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedThriftEndpointProducerBuilder advanced() {
            return (AdvancedThriftEndpointProducerBuilder) this;
        }
        /**
         * The Thrift server host name. This is localhost or 0.0.0.0 (if not
         * defined) when being a consumer or remote server host name when using
         * producer.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default ThriftEndpointProducerBuilder host(String host) {
            setProperty("host", host);
            return this;
        }
        /**
         * The Thrift server port.
         * The option is a <code>int</code> type.
         * @group common
         */
        default ThriftEndpointProducerBuilder port(int port) {
            setProperty("port", port);
            return this;
        }
        /**
         * The Thrift server port.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        default ThriftEndpointProducerBuilder port(String port) {
            setProperty("port", port);
            return this;
        }
        /**
         * Fully qualified service name from the thrift descriptor file (package
         * dot service definition name).
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default ThriftEndpointProducerBuilder service(String service) {
            setProperty("service", service);
            return this;
        }
        /**
         * Protocol compression mechanism type.
         * The option is a
         * <code>org.apache.camel.component.thrift.ThriftCompressionType</code>
         * type.
         * @group common
         */
        default ThriftEndpointProducerBuilder compressionType(
                ThriftCompressionType compressionType) {
            setProperty("compressionType", compressionType);
            return this;
        }
        /**
         * Protocol compression mechanism type.
         * The option will be converted to a
         * <code>org.apache.camel.component.thrift.ThriftCompressionType</code>
         * type.
         * @group common
         */
        default ThriftEndpointProducerBuilder compressionType(
                String compressionType) {
            setProperty("compressionType", compressionType);
            return this;
        }
        /**
         * Exchange protocol serialization type.
         * The option is a
         * <code>org.apache.camel.component.thrift.ThriftExchangeProtocol</code>
         * type.
         * @group common
         */
        default ThriftEndpointProducerBuilder exchangeProtocol(
                ThriftExchangeProtocol exchangeProtocol) {
            setProperty("exchangeProtocol", exchangeProtocol);
            return this;
        }
        /**
         * Exchange protocol serialization type.
         * The option will be converted to a
         * <code>org.apache.camel.component.thrift.ThriftExchangeProtocol</code>
         * type.
         * @group common
         */
        default ThriftEndpointProducerBuilder exchangeProtocol(
                String exchangeProtocol) {
            setProperty("exchangeProtocol", exchangeProtocol);
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
        default ThriftEndpointProducerBuilder lazyStartProducer(
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
        default ThriftEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The Thrift invoked method name.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default ThriftEndpointProducerBuilder method(String method) {
            setProperty("method", method);
            return this;
        }
        /**
         * Security negotiation type.
         * The option is a
         * <code>org.apache.camel.component.thrift.ThriftNegotiationType</code>
         * type.
         * @group security
         */
        default ThriftEndpointProducerBuilder negotiationType(
                ThriftNegotiationType negotiationType) {
            setProperty("negotiationType", negotiationType);
            return this;
        }
        /**
         * Security negotiation type.
         * The option will be converted to a
         * <code>org.apache.camel.component.thrift.ThriftNegotiationType</code>
         * type.
         * @group security
         */
        default ThriftEndpointProducerBuilder negotiationType(
                String negotiationType) {
            setProperty("negotiationType", negotiationType);
            return this;
        }
        /**
         * Configuration parameters for SSL/TLS security negotiation.
         * The option is a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * @group security
         */
        default ThriftEndpointProducerBuilder sslParameters(Object sslParameters) {
            setProperty("sslParameters", sslParameters);
            return this;
        }
        /**
         * Configuration parameters for SSL/TLS security negotiation.
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * @group security
         */
        default ThriftEndpointProducerBuilder sslParameters(String sslParameters) {
            setProperty("sslParameters", sslParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Thrift component.
     */
    public interface AdvancedThriftEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default ThriftEndpointProducerBuilder basic() {
            return (ThriftEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedThriftEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedThriftEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedThriftEndpointProducerBuilder synchronous(
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
        default AdvancedThriftEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Thrift component.
     */
    public interface ThriftEndpointBuilder
            extends
                ThriftEndpointConsumerBuilder, ThriftEndpointProducerBuilder {
        default AdvancedThriftEndpointBuilder advanced() {
            return (AdvancedThriftEndpointBuilder) this;
        }
        /**
         * The Thrift server host name. This is localhost or 0.0.0.0 (if not
         * defined) when being a consumer or remote server host name when using
         * producer.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default ThriftEndpointBuilder host(String host) {
            setProperty("host", host);
            return this;
        }
        /**
         * The Thrift server port.
         * The option is a <code>int</code> type.
         * @group common
         */
        default ThriftEndpointBuilder port(int port) {
            setProperty("port", port);
            return this;
        }
        /**
         * The Thrift server port.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        default ThriftEndpointBuilder port(String port) {
            setProperty("port", port);
            return this;
        }
        /**
         * Fully qualified service name from the thrift descriptor file (package
         * dot service definition name).
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default ThriftEndpointBuilder service(String service) {
            setProperty("service", service);
            return this;
        }
        /**
         * Protocol compression mechanism type.
         * The option is a
         * <code>org.apache.camel.component.thrift.ThriftCompressionType</code>
         * type.
         * @group common
         */
        default ThriftEndpointBuilder compressionType(
                ThriftCompressionType compressionType) {
            setProperty("compressionType", compressionType);
            return this;
        }
        /**
         * Protocol compression mechanism type.
         * The option will be converted to a
         * <code>org.apache.camel.component.thrift.ThriftCompressionType</code>
         * type.
         * @group common
         */
        default ThriftEndpointBuilder compressionType(String compressionType) {
            setProperty("compressionType", compressionType);
            return this;
        }
        /**
         * Exchange protocol serialization type.
         * The option is a
         * <code>org.apache.camel.component.thrift.ThriftExchangeProtocol</code>
         * type.
         * @group common
         */
        default ThriftEndpointBuilder exchangeProtocol(
                ThriftExchangeProtocol exchangeProtocol) {
            setProperty("exchangeProtocol", exchangeProtocol);
            return this;
        }
        /**
         * Exchange protocol serialization type.
         * The option will be converted to a
         * <code>org.apache.camel.component.thrift.ThriftExchangeProtocol</code>
         * type.
         * @group common
         */
        default ThriftEndpointBuilder exchangeProtocol(String exchangeProtocol) {
            setProperty("exchangeProtocol", exchangeProtocol);
            return this;
        }
        /**
         * Security negotiation type.
         * The option is a
         * <code>org.apache.camel.component.thrift.ThriftNegotiationType</code>
         * type.
         * @group security
         */
        default ThriftEndpointBuilder negotiationType(
                ThriftNegotiationType negotiationType) {
            setProperty("negotiationType", negotiationType);
            return this;
        }
        /**
         * Security negotiation type.
         * The option will be converted to a
         * <code>org.apache.camel.component.thrift.ThriftNegotiationType</code>
         * type.
         * @group security
         */
        default ThriftEndpointBuilder negotiationType(String negotiationType) {
            setProperty("negotiationType", negotiationType);
            return this;
        }
        /**
         * Configuration parameters for SSL/TLS security negotiation.
         * The option is a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * @group security
         */
        default ThriftEndpointBuilder sslParameters(Object sslParameters) {
            setProperty("sslParameters", sslParameters);
            return this;
        }
        /**
         * Configuration parameters for SSL/TLS security negotiation.
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * @group security
         */
        default ThriftEndpointBuilder sslParameters(String sslParameters) {
            setProperty("sslParameters", sslParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Thrift component.
     */
    public interface AdvancedThriftEndpointBuilder
            extends
                AdvancedThriftEndpointConsumerBuilder, AdvancedThriftEndpointProducerBuilder {
        default ThriftEndpointBuilder basic() {
            return (ThriftEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedThriftEndpointBuilder basicPropertyBinding(
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
        default AdvancedThriftEndpointBuilder basicPropertyBinding(
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
        default AdvancedThriftEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedThriftEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.thrift.ThriftCompressionType</code>
     * enum.
     */
    enum ThriftCompressionType {
        NONE,
        ZLIB;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.thrift.ThriftExchangeProtocol</code>
     * enum.
     */
    enum ThriftExchangeProtocol {
        BINARY,
        JSON,
        SJSON,
        COMPACT;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.thrift.ThriftNegotiationType</code>
     * enum.
     */
    enum ThriftNegotiationType {
        PLAINTEXT,
        SSL,
        SASL;
    }
    /**
     * The Thrift component allows to call and expose remote procedures (RPC)
     * with Apache Thrift data format and serialization mechanism
     * Maven coordinates: org.apache.camel:camel-thrift
     */
    default ThriftEndpointBuilder thrift(String path) {
        class ThriftEndpointBuilderImpl extends AbstractEndpointBuilder implements ThriftEndpointBuilder, AdvancedThriftEndpointBuilder {
            public ThriftEndpointBuilderImpl(String path) {
                super("thrift", path);
            }
        }
        return new ThriftEndpointBuilderImpl(path);
    }
}