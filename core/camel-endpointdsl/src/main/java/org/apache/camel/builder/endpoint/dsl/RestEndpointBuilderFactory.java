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
 * The rest component is used for either hosting REST services (consumer) or
 * calling external REST services (producer).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface RestEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the REST component.
     */
    public interface RestEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedRestEndpointConsumerBuilder advanced() {
            return (AdvancedRestEndpointConsumerBuilder) this;
        }
        /**
         * HTTP method to use.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointConsumerBuilder method(String method) {
            setProperty("method", method);
            return this;
        }
        /**
         * The base path.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointConsumerBuilder path(String path) {
            setProperty("path", path);
            return this;
        }
        /**
         * The uri template.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointConsumerBuilder uriTemplate(String uriTemplate) {
            setProperty("uriTemplate", uriTemplate);
            return this;
        }
        /**
         * Media type such as: 'text/xml', or 'application/json' this REST
         * service accepts. By default we accept all kinds of types.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointConsumerBuilder consumes(String consumes) {
            setProperty("consumes", consumes);
            return this;
        }
        /**
         * To declare the incoming POJO binding type as a FQN class name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointConsumerBuilder inType(String inType) {
            setProperty("inType", inType);
            return this;
        }
        /**
         * To declare the outgoing POJO binding type as a FQN class name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointConsumerBuilder outType(String outType) {
            setProperty("outType", outType);
            return this;
        }
        /**
         * Media type such as: 'text/xml', or 'application/json' this REST
         * service returns.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointConsumerBuilder produces(String produces) {
            setProperty("produces", produces);
            return this;
        }
        /**
         * Name of the route this REST services creates.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointConsumerBuilder routeId(String routeId) {
            setProperty("routeId", routeId);
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
        default RestEndpointConsumerBuilder bridgeErrorHandler(
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
        default RestEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The Camel Rest component to use for (consumer) the REST transport,
         * such as jetty, servlet, undertow. If no component has been explicit
         * configured, then Camel will lookup if there is a Camel component that
         * integrates with the Rest DSL, or if a
         * org.apache.camel.spi.RestConsumerFactory is registered in the
         * registry. If either one is found, then that is being used.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default RestEndpointConsumerBuilder consumerComponentName(
                String consumerComponentName) {
            setProperty("consumerComponentName", consumerComponentName);
            return this;
        }
        /**
         * Human description to document this REST service.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default RestEndpointConsumerBuilder description(String description) {
            setProperty("description", description);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the REST component.
     */
    public interface AdvancedRestEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default RestEndpointConsumerBuilder basic() {
            return (RestEndpointConsumerBuilder) this;
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
        default AdvancedRestEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedRestEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedRestEndpointConsumerBuilder exchangePattern(
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
        default AdvancedRestEndpointConsumerBuilder exchangePattern(
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
        default AdvancedRestEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedRestEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedRestEndpointConsumerBuilder synchronous(
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
        default AdvancedRestEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the REST component.
     */
    public interface RestEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedRestEndpointProducerBuilder advanced() {
            return (AdvancedRestEndpointProducerBuilder) this;
        }
        /**
         * HTTP method to use.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointProducerBuilder method(String method) {
            setProperty("method", method);
            return this;
        }
        /**
         * The base path.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointProducerBuilder path(String path) {
            setProperty("path", path);
            return this;
        }
        /**
         * The uri template.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointProducerBuilder uriTemplate(String uriTemplate) {
            setProperty("uriTemplate", uriTemplate);
            return this;
        }
        /**
         * Media type such as: 'text/xml', or 'application/json' this REST
         * service accepts. By default we accept all kinds of types.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointProducerBuilder consumes(String consumes) {
            setProperty("consumes", consumes);
            return this;
        }
        /**
         * To declare the incoming POJO binding type as a FQN class name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointProducerBuilder inType(String inType) {
            setProperty("inType", inType);
            return this;
        }
        /**
         * To declare the outgoing POJO binding type as a FQN class name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointProducerBuilder outType(String outType) {
            setProperty("outType", outType);
            return this;
        }
        /**
         * Media type such as: 'text/xml', or 'application/json' this REST
         * service returns.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointProducerBuilder produces(String produces) {
            setProperty("produces", produces);
            return this;
        }
        /**
         * Name of the route this REST services creates.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointProducerBuilder routeId(String routeId) {
            setProperty("routeId", routeId);
            return this;
        }
        /**
         * The swagger api doc resource to use. The resource is loaded from
         * classpath by default and must be in JSon format.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default RestEndpointProducerBuilder apiDoc(String apiDoc) {
            setProperty("apiDoc", apiDoc);
            return this;
        }
        /**
         * Configures the binding mode for the producer. If set to anything
         * other than 'off' the producer will try to convert the body of the
         * incoming message from inType to the json or xml, and the response
         * from json or xml to outType.
         * The option is a
         * <code>org.apache.camel.spi.RestConfiguration$RestBindingMode</code>
         * type.
         * @group producer
         */
        default RestEndpointProducerBuilder bindingMode(
                RestBindingMode bindingMode) {
            setProperty("bindingMode", bindingMode);
            return this;
        }
        /**
         * Configures the binding mode for the producer. If set to anything
         * other than 'off' the producer will try to convert the body of the
         * incoming message from inType to the json or xml, and the response
         * from json or xml to outType.
         * The option will be converted to a
         * <code>org.apache.camel.spi.RestConfiguration$RestBindingMode</code>
         * type.
         * @group producer
         */
        default RestEndpointProducerBuilder bindingMode(String bindingMode) {
            setProperty("bindingMode", bindingMode);
            return this;
        }
        /**
         * Host and port of HTTP service to use (override host in swagger
         * schema).
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default RestEndpointProducerBuilder host(String host) {
            setProperty("host", host);
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
        default RestEndpointProducerBuilder lazyStartProducer(
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
        default RestEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The Camel Rest component to use for (producer) the REST transport,
         * such as http, undertow. If no component has been explicit configured,
         * then Camel will lookup if there is a Camel component that integrates
         * with the Rest DSL, or if a org.apache.camel.spi.RestProducerFactory
         * is registered in the registry. If either one is found, then that is
         * being used.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default RestEndpointProducerBuilder producerComponentName(
                String producerComponentName) {
            setProperty("producerComponentName", producerComponentName);
            return this;
        }
        /**
         * Query parameters for the HTTP service to call.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default RestEndpointProducerBuilder queryParameters(
                String queryParameters) {
            setProperty("queryParameters", queryParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the REST component.
     */
    public interface AdvancedRestEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default RestEndpointProducerBuilder basic() {
            return (RestEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedRestEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedRestEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedRestEndpointProducerBuilder synchronous(
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
        default AdvancedRestEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the REST component.
     */
    public interface RestEndpointBuilder
            extends
                RestEndpointConsumerBuilder, RestEndpointProducerBuilder {
        default AdvancedRestEndpointBuilder advanced() {
            return (AdvancedRestEndpointBuilder) this;
        }
        /**
         * HTTP method to use.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointBuilder method(String method) {
            setProperty("method", method);
            return this;
        }
        /**
         * The base path.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointBuilder path(String path) {
            setProperty("path", path);
            return this;
        }
        /**
         * The uri template.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointBuilder uriTemplate(String uriTemplate) {
            setProperty("uriTemplate", uriTemplate);
            return this;
        }
        /**
         * Media type such as: 'text/xml', or 'application/json' this REST
         * service accepts. By default we accept all kinds of types.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointBuilder consumes(String consumes) {
            setProperty("consumes", consumes);
            return this;
        }
        /**
         * To declare the incoming POJO binding type as a FQN class name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointBuilder inType(String inType) {
            setProperty("inType", inType);
            return this;
        }
        /**
         * To declare the outgoing POJO binding type as a FQN class name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointBuilder outType(String outType) {
            setProperty("outType", outType);
            return this;
        }
        /**
         * Media type such as: 'text/xml', or 'application/json' this REST
         * service returns.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointBuilder produces(String produces) {
            setProperty("produces", produces);
            return this;
        }
        /**
         * Name of the route this REST services creates.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default RestEndpointBuilder routeId(String routeId) {
            setProperty("routeId", routeId);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the REST component.
     */
    public interface AdvancedRestEndpointBuilder
            extends
                AdvancedRestEndpointConsumerBuilder, AdvancedRestEndpointProducerBuilder {
        default RestEndpointBuilder basic() {
            return (RestEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedRestEndpointBuilder basicPropertyBinding(
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
        default AdvancedRestEndpointBuilder basicPropertyBinding(
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
        default AdvancedRestEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedRestEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.spi.RestConfiguration$RestBindingMode</code> enum.
     */
    enum RestBindingMode {
        auto,
        off,
        json,
        xml,
        json_xml;
    }
    /**
     * The rest component is used for either hosting REST services (consumer) or
     * calling external REST services (producer).
     * Maven coordinates: org.apache.camel:camel-rest
     */
    default RestEndpointBuilder restEndpoint(String path) {
        class RestEndpointBuilderImpl extends AbstractEndpointBuilder implements RestEndpointBuilder, AdvancedRestEndpointBuilder {
            public RestEndpointBuilderImpl(String path) {
                super("rest", path);
            }
        }
        return new RestEndpointBuilderImpl(path);
    }
}