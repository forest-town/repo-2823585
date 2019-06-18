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

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Integrates Camel with Wordpress.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface WordpressEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Wordpress component.
     */
    public interface WordpressEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedWordpressEndpointConsumerBuilder advanced() {
            return (AdvancedWordpressEndpointConsumerBuilder) this;
        }
        /**
         * The endpoint operation.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default WordpressEndpointConsumerBuilder operation(String operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * The second part of an endpoint operation. Needed only when endpoint
         * semantic is not enough, like wordpress:post:delete.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default WordpressEndpointConsumerBuilder operationDetail(
                String operationDetail) {
            setProperty("operationDetail", operationDetail);
            return this;
        }
        /**
         * The Wordpress REST API version.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default WordpressEndpointConsumerBuilder apiVersion(String apiVersion) {
            setProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * The criteria to use with complex searches.
         * The option is a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * @group common
         */
        default WordpressEndpointConsumerBuilder criteria(
                Map<String, Object> criteria) {
            setProperty("criteria", criteria);
            return this;
        }
        /**
         * The criteria to use with complex searches.
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         * @group common
         */
        default WordpressEndpointConsumerBuilder criteria(String criteria) {
            setProperty("criteria", criteria);
            return this;
        }
        /**
         * Whether to bypass trash and force deletion.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group common
         */
        default WordpressEndpointConsumerBuilder force(Boolean force) {
            setProperty("force", force);
            return this;
        }
        /**
         * Whether to bypass trash and force deletion.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group common
         */
        default WordpressEndpointConsumerBuilder force(String force) {
            setProperty("force", force);
            return this;
        }
        /**
         * The entity ID. Should be passed when the operation performed requires
         * a specific entity, e.g. deleting a post.
         * The option is a <code>java.lang.Integer</code> type.
         * @group common
         */
        default WordpressEndpointConsumerBuilder id(Integer id) {
            setProperty("id", id);
            return this;
        }
        /**
         * The entity ID. Should be passed when the operation performed requires
         * a specific entity, e.g. deleting a post.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group common
         */
        default WordpressEndpointConsumerBuilder id(String id) {
            setProperty("id", id);
            return this;
        }
        /**
         * Password from authorized user.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default WordpressEndpointConsumerBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Search criteria.
         * The option is a
         * <code>org.apache.camel.component.wordpress.api.model.SearchCriteria</code> type.
         * @group common
         */
        default WordpressEndpointConsumerBuilder searchCriteria(
                Object searchCriteria) {
            setProperty("searchCriteria", searchCriteria);
            return this;
        }
        /**
         * Search criteria.
         * The option will be converted to a
         * <code>org.apache.camel.component.wordpress.api.model.SearchCriteria</code> type.
         * @group common
         */
        default WordpressEndpointConsumerBuilder searchCriteria(
                String searchCriteria) {
            setProperty("searchCriteria", searchCriteria);
            return this;
        }
        /**
         * The Wordpress API URL from your site, e.g.
         * http://myblog.com/wp-json/.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default WordpressEndpointConsumerBuilder url(String url) {
            setProperty("url", url);
            return this;
        }
        /**
         * Authorized user to perform writing operations.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default WordpressEndpointConsumerBuilder user(String user) {
            setProperty("user", user);
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
        default WordpressEndpointConsumerBuilder bridgeErrorHandler(
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
        default WordpressEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Wordpress component.
     */
    public interface AdvancedWordpressEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default WordpressEndpointConsumerBuilder basic() {
            return (WordpressEndpointConsumerBuilder) this;
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
        default AdvancedWordpressEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedWordpressEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedWordpressEndpointConsumerBuilder exchangePattern(
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
        default AdvancedWordpressEndpointConsumerBuilder exchangePattern(
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
        default AdvancedWordpressEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedWordpressEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedWordpressEndpointConsumerBuilder synchronous(
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
        default AdvancedWordpressEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Wordpress component.
     */
    public interface WordpressEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedWordpressEndpointProducerBuilder advanced() {
            return (AdvancedWordpressEndpointProducerBuilder) this;
        }
        /**
         * The endpoint operation.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default WordpressEndpointProducerBuilder operation(String operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * The second part of an endpoint operation. Needed only when endpoint
         * semantic is not enough, like wordpress:post:delete.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default WordpressEndpointProducerBuilder operationDetail(
                String operationDetail) {
            setProperty("operationDetail", operationDetail);
            return this;
        }
        /**
         * The Wordpress REST API version.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default WordpressEndpointProducerBuilder apiVersion(String apiVersion) {
            setProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * The criteria to use with complex searches.
         * The option is a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * @group common
         */
        default WordpressEndpointProducerBuilder criteria(
                Map<String, Object> criteria) {
            setProperty("criteria", criteria);
            return this;
        }
        /**
         * The criteria to use with complex searches.
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         * @group common
         */
        default WordpressEndpointProducerBuilder criteria(String criteria) {
            setProperty("criteria", criteria);
            return this;
        }
        /**
         * Whether to bypass trash and force deletion.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group common
         */
        default WordpressEndpointProducerBuilder force(Boolean force) {
            setProperty("force", force);
            return this;
        }
        /**
         * Whether to bypass trash and force deletion.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group common
         */
        default WordpressEndpointProducerBuilder force(String force) {
            setProperty("force", force);
            return this;
        }
        /**
         * The entity ID. Should be passed when the operation performed requires
         * a specific entity, e.g. deleting a post.
         * The option is a <code>java.lang.Integer</code> type.
         * @group common
         */
        default WordpressEndpointProducerBuilder id(Integer id) {
            setProperty("id", id);
            return this;
        }
        /**
         * The entity ID. Should be passed when the operation performed requires
         * a specific entity, e.g. deleting a post.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group common
         */
        default WordpressEndpointProducerBuilder id(String id) {
            setProperty("id", id);
            return this;
        }
        /**
         * Password from authorized user.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default WordpressEndpointProducerBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Search criteria.
         * The option is a
         * <code>org.apache.camel.component.wordpress.api.model.SearchCriteria</code> type.
         * @group common
         */
        default WordpressEndpointProducerBuilder searchCriteria(
                Object searchCriteria) {
            setProperty("searchCriteria", searchCriteria);
            return this;
        }
        /**
         * Search criteria.
         * The option will be converted to a
         * <code>org.apache.camel.component.wordpress.api.model.SearchCriteria</code> type.
         * @group common
         */
        default WordpressEndpointProducerBuilder searchCriteria(
                String searchCriteria) {
            setProperty("searchCriteria", searchCriteria);
            return this;
        }
        /**
         * The Wordpress API URL from your site, e.g.
         * http://myblog.com/wp-json/.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default WordpressEndpointProducerBuilder url(String url) {
            setProperty("url", url);
            return this;
        }
        /**
         * Authorized user to perform writing operations.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default WordpressEndpointProducerBuilder user(String user) {
            setProperty("user", user);
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
        default WordpressEndpointProducerBuilder lazyStartProducer(
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
        default WordpressEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Wordpress component.
     */
    public interface AdvancedWordpressEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default WordpressEndpointProducerBuilder basic() {
            return (WordpressEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedWordpressEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedWordpressEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedWordpressEndpointProducerBuilder synchronous(
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
        default AdvancedWordpressEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Wordpress component.
     */
    public interface WordpressEndpointBuilder
            extends
                WordpressEndpointConsumerBuilder, WordpressEndpointProducerBuilder {
        default AdvancedWordpressEndpointBuilder advanced() {
            return (AdvancedWordpressEndpointBuilder) this;
        }
        /**
         * The endpoint operation.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default WordpressEndpointBuilder operation(String operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * The second part of an endpoint operation. Needed only when endpoint
         * semantic is not enough, like wordpress:post:delete.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default WordpressEndpointBuilder operationDetail(String operationDetail) {
            setProperty("operationDetail", operationDetail);
            return this;
        }
        /**
         * The Wordpress REST API version.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default WordpressEndpointBuilder apiVersion(String apiVersion) {
            setProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * The criteria to use with complex searches.
         * The option is a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * @group common
         */
        default WordpressEndpointBuilder criteria(Map<String, Object> criteria) {
            setProperty("criteria", criteria);
            return this;
        }
        /**
         * The criteria to use with complex searches.
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         * @group common
         */
        default WordpressEndpointBuilder criteria(String criteria) {
            setProperty("criteria", criteria);
            return this;
        }
        /**
         * Whether to bypass trash and force deletion.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group common
         */
        default WordpressEndpointBuilder force(Boolean force) {
            setProperty("force", force);
            return this;
        }
        /**
         * Whether to bypass trash and force deletion.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group common
         */
        default WordpressEndpointBuilder force(String force) {
            setProperty("force", force);
            return this;
        }
        /**
         * The entity ID. Should be passed when the operation performed requires
         * a specific entity, e.g. deleting a post.
         * The option is a <code>java.lang.Integer</code> type.
         * @group common
         */
        default WordpressEndpointBuilder id(Integer id) {
            setProperty("id", id);
            return this;
        }
        /**
         * The entity ID. Should be passed when the operation performed requires
         * a specific entity, e.g. deleting a post.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group common
         */
        default WordpressEndpointBuilder id(String id) {
            setProperty("id", id);
            return this;
        }
        /**
         * Password from authorized user.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default WordpressEndpointBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Search criteria.
         * The option is a
         * <code>org.apache.camel.component.wordpress.api.model.SearchCriteria</code> type.
         * @group common
         */
        default WordpressEndpointBuilder searchCriteria(Object searchCriteria) {
            setProperty("searchCriteria", searchCriteria);
            return this;
        }
        /**
         * Search criteria.
         * The option will be converted to a
         * <code>org.apache.camel.component.wordpress.api.model.SearchCriteria</code> type.
         * @group common
         */
        default WordpressEndpointBuilder searchCriteria(String searchCriteria) {
            setProperty("searchCriteria", searchCriteria);
            return this;
        }
        /**
         * The Wordpress API URL from your site, e.g.
         * http://myblog.com/wp-json/.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default WordpressEndpointBuilder url(String url) {
            setProperty("url", url);
            return this;
        }
        /**
         * Authorized user to perform writing operations.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default WordpressEndpointBuilder user(String user) {
            setProperty("user", user);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Wordpress component.
     */
    public interface AdvancedWordpressEndpointBuilder
            extends
                AdvancedWordpressEndpointConsumerBuilder, AdvancedWordpressEndpointProducerBuilder {
        default WordpressEndpointBuilder basic() {
            return (WordpressEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedWordpressEndpointBuilder basicPropertyBinding(
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
        default AdvancedWordpressEndpointBuilder basicPropertyBinding(
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
        default AdvancedWordpressEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedWordpressEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Integrates Camel with Wordpress.
     * Maven coordinates: org.apache.camel:camel-wordpress
     */
    default WordpressEndpointBuilder wordpress(String path) {
        class WordpressEndpointBuilderImpl extends AbstractEndpointBuilder implements WordpressEndpointBuilder, AdvancedWordpressEndpointBuilder {
            public WordpressEndpointBuilderImpl(String path) {
                super("wordpress", path);
            }
        }
        return new WordpressEndpointBuilderImpl(path);
    }
}