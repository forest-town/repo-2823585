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
 * To provide stable, secure, efficient, and easy-to-use cloud storage service
 * on Huawei Cloud
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface OBSEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Huawei Object Storage Service
     * (OBS) component.
     */
    public interface OBSEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedOBSEndpointConsumerBuilder advanced() {
            return (AdvancedOBSEndpointConsumerBuilder) this;
        }
        /**
         * Authentication key for the cloud user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param authenticationKey the value to set
         * @return the dsl builder
         */
        default OBSEndpointConsumerBuilder authenticationKey(
                String authenticationKey) {
            doSetProperty("authenticationKey", authenticationKey);
            return this;
        }
        /**
         * Location of bucket when creating a new bucket.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param bucketLocation the value to set
         * @return the dsl builder
         */
        default OBSEndpointConsumerBuilder bucketLocation(String bucketLocation) {
            doSetProperty("bucketLocation", bucketLocation);
            return this;
        }
        /**
         * Name of bucket to perform operation on.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param bucketName the value to set
         * @return the dsl builder
         */
        default OBSEndpointConsumerBuilder bucketName(String bucketName) {
            doSetProperty("bucketName", bucketName);
            return this;
        }
        /**
         * OBS url. Carries higher precedence than region parameter based client
         * initialization.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param endpoint the value to set
         * @return the dsl builder
         */
        default OBSEndpointConsumerBuilder endpoint(String endpoint) {
            doSetProperty("endpoint", endpoint);
            return this;
        }
        /**
         * Ignore SSL verification.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param ignoreSslVerification the value to set
         * @return the dsl builder
         */
        default OBSEndpointConsumerBuilder ignoreSslVerification(
                boolean ignoreSslVerification) {
            doSetProperty("ignoreSslVerification", ignoreSslVerification);
            return this;
        }
        /**
         * Ignore SSL verification.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param ignoreSslVerification the value to set
         * @return the dsl builder
         */
        default OBSEndpointConsumerBuilder ignoreSslVerification(
                String ignoreSslVerification) {
            doSetProperty("ignoreSslVerification", ignoreSslVerification);
            return this;
        }
        /**
         * Proxy server ip/hostname.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default OBSEndpointConsumerBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * Proxy authentication password.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param proxyPassword the value to set
         * @return the dsl builder
         */
        default OBSEndpointConsumerBuilder proxyPassword(String proxyPassword) {
            doSetProperty("proxyPassword", proxyPassword);
            return this;
        }
        /**
         * Proxy server port.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default OBSEndpointConsumerBuilder proxyPort(int proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * Proxy server port.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default OBSEndpointConsumerBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * Proxy authentication user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param proxyUser the value to set
         * @return the dsl builder
         */
        default OBSEndpointConsumerBuilder proxyUser(String proxyUser) {
            doSetProperty("proxyUser", proxyUser);
            return this;
        }
        /**
         * OBS service region. This is lower precedence than endpoint based
         * configuration.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default OBSEndpointConsumerBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Secret key for the cloud user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default OBSEndpointConsumerBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Configuration object for cloud service authentication.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.huaweicloud.obs.models.ServiceKeys&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param serviceKeys the value to set
         * @return the dsl builder
         */
        default OBSEndpointConsumerBuilder serviceKeys(Object serviceKeys) {
            doSetProperty("serviceKeys", serviceKeys);
            return this;
        }
        /**
         * Configuration object for cloud service authentication.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.huaweicloud.obs.models.ServiceKeys&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param serviceKeys the value to set
         * @return the dsl builder
         */
        default OBSEndpointConsumerBuilder serviceKeys(String serviceKeys) {
            doSetProperty("serviceKeys", serviceKeys);
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
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default OBSEndpointConsumerBuilder bridgeErrorHandler(
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
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default OBSEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Huawei Object Storage
     * Service (OBS) component.
     */
    public interface AdvancedOBSEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default OBSEndpointConsumerBuilder basic() {
            return (OBSEndpointConsumerBuilder) this;
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
        default AdvancedOBSEndpointConsumerBuilder exceptionHandler(
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
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedOBSEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedOBSEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
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
        default AdvancedOBSEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Huawei Object Storage Service
     * (OBS) component.
     */
    public interface OBSEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedOBSEndpointProducerBuilder advanced() {
            return (AdvancedOBSEndpointProducerBuilder) this;
        }
        /**
         * Authentication key for the cloud user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param authenticationKey the value to set
         * @return the dsl builder
         */
        default OBSEndpointProducerBuilder authenticationKey(
                String authenticationKey) {
            doSetProperty("authenticationKey", authenticationKey);
            return this;
        }
        /**
         * Location of bucket when creating a new bucket.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param bucketLocation the value to set
         * @return the dsl builder
         */
        default OBSEndpointProducerBuilder bucketLocation(String bucketLocation) {
            doSetProperty("bucketLocation", bucketLocation);
            return this;
        }
        /**
         * Name of bucket to perform operation on.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param bucketName the value to set
         * @return the dsl builder
         */
        default OBSEndpointProducerBuilder bucketName(String bucketName) {
            doSetProperty("bucketName", bucketName);
            return this;
        }
        /**
         * OBS url. Carries higher precedence than region parameter based client
         * initialization.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param endpoint the value to set
         * @return the dsl builder
         */
        default OBSEndpointProducerBuilder endpoint(String endpoint) {
            doSetProperty("endpoint", endpoint);
            return this;
        }
        /**
         * Ignore SSL verification.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param ignoreSslVerification the value to set
         * @return the dsl builder
         */
        default OBSEndpointProducerBuilder ignoreSslVerification(
                boolean ignoreSslVerification) {
            doSetProperty("ignoreSslVerification", ignoreSslVerification);
            return this;
        }
        /**
         * Ignore SSL verification.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param ignoreSslVerification the value to set
         * @return the dsl builder
         */
        default OBSEndpointProducerBuilder ignoreSslVerification(
                String ignoreSslVerification) {
            doSetProperty("ignoreSslVerification", ignoreSslVerification);
            return this;
        }
        /**
         * Proxy server ip/hostname.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default OBSEndpointProducerBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * Proxy authentication password.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param proxyPassword the value to set
         * @return the dsl builder
         */
        default OBSEndpointProducerBuilder proxyPassword(String proxyPassword) {
            doSetProperty("proxyPassword", proxyPassword);
            return this;
        }
        /**
         * Proxy server port.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default OBSEndpointProducerBuilder proxyPort(int proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * Proxy server port.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default OBSEndpointProducerBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * Proxy authentication user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param proxyUser the value to set
         * @return the dsl builder
         */
        default OBSEndpointProducerBuilder proxyUser(String proxyUser) {
            doSetProperty("proxyUser", proxyUser);
            return this;
        }
        /**
         * OBS service region. This is lower precedence than endpoint based
         * configuration.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default OBSEndpointProducerBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Secret key for the cloud user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default OBSEndpointProducerBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Configuration object for cloud service authentication.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.huaweicloud.obs.models.ServiceKeys&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param serviceKeys the value to set
         * @return the dsl builder
         */
        default OBSEndpointProducerBuilder serviceKeys(Object serviceKeys) {
            doSetProperty("serviceKeys", serviceKeys);
            return this;
        }
        /**
         * Configuration object for cloud service authentication.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.huaweicloud.obs.models.ServiceKeys&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param serviceKeys the value to set
         * @return the dsl builder
         */
        default OBSEndpointProducerBuilder serviceKeys(String serviceKeys) {
            doSetProperty("serviceKeys", serviceKeys);
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
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default OBSEndpointProducerBuilder lazyStartProducer(
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
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default OBSEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Huawei Object Storage
     * Service (OBS) component.
     */
    public interface AdvancedOBSEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default OBSEndpointProducerBuilder basic() {
            return (OBSEndpointProducerBuilder) this;
        }
    }

    /**
     * Builder for endpoint for the Huawei Object Storage Service (OBS)
     * component.
     */
    public interface OBSEndpointBuilder
            extends
                OBSEndpointConsumerBuilder,
                OBSEndpointProducerBuilder {
        default AdvancedOBSEndpointBuilder advanced() {
            return (AdvancedOBSEndpointBuilder) this;
        }
        /**
         * Authentication key for the cloud user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param authenticationKey the value to set
         * @return the dsl builder
         */
        default OBSEndpointBuilder authenticationKey(String authenticationKey) {
            doSetProperty("authenticationKey", authenticationKey);
            return this;
        }
        /**
         * Location of bucket when creating a new bucket.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param bucketLocation the value to set
         * @return the dsl builder
         */
        default OBSEndpointBuilder bucketLocation(String bucketLocation) {
            doSetProperty("bucketLocation", bucketLocation);
            return this;
        }
        /**
         * Name of bucket to perform operation on.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param bucketName the value to set
         * @return the dsl builder
         */
        default OBSEndpointBuilder bucketName(String bucketName) {
            doSetProperty("bucketName", bucketName);
            return this;
        }
        /**
         * OBS url. Carries higher precedence than region parameter based client
         * initialization.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param endpoint the value to set
         * @return the dsl builder
         */
        default OBSEndpointBuilder endpoint(String endpoint) {
            doSetProperty("endpoint", endpoint);
            return this;
        }
        /**
         * Ignore SSL verification.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param ignoreSslVerification the value to set
         * @return the dsl builder
         */
        default OBSEndpointBuilder ignoreSslVerification(
                boolean ignoreSslVerification) {
            doSetProperty("ignoreSslVerification", ignoreSslVerification);
            return this;
        }
        /**
         * Ignore SSL verification.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param ignoreSslVerification the value to set
         * @return the dsl builder
         */
        default OBSEndpointBuilder ignoreSslVerification(
                String ignoreSslVerification) {
            doSetProperty("ignoreSslVerification", ignoreSslVerification);
            return this;
        }
        /**
         * Proxy server ip/hostname.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default OBSEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * Proxy authentication password.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param proxyPassword the value to set
         * @return the dsl builder
         */
        default OBSEndpointBuilder proxyPassword(String proxyPassword) {
            doSetProperty("proxyPassword", proxyPassword);
            return this;
        }
        /**
         * Proxy server port.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default OBSEndpointBuilder proxyPort(int proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * Proxy server port.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default OBSEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * Proxy authentication user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param proxyUser the value to set
         * @return the dsl builder
         */
        default OBSEndpointBuilder proxyUser(String proxyUser) {
            doSetProperty("proxyUser", proxyUser);
            return this;
        }
        /**
         * OBS service region. This is lower precedence than endpoint based
         * configuration.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default OBSEndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Secret key for the cloud user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default OBSEndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Configuration object for cloud service authentication.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.huaweicloud.obs.models.ServiceKeys&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param serviceKeys the value to set
         * @return the dsl builder
         */
        default OBSEndpointBuilder serviceKeys(Object serviceKeys) {
            doSetProperty("serviceKeys", serviceKeys);
            return this;
        }
        /**
         * Configuration object for cloud service authentication.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.huaweicloud.obs.models.ServiceKeys&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param serviceKeys the value to set
         * @return the dsl builder
         */
        default OBSEndpointBuilder serviceKeys(String serviceKeys) {
            doSetProperty("serviceKeys", serviceKeys);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Huawei Object Storage Service (OBS)
     * component.
     */
    public interface AdvancedOBSEndpointBuilder
            extends
                AdvancedOBSEndpointConsumerBuilder,
                AdvancedOBSEndpointProducerBuilder {
        default OBSEndpointBuilder basic() {
            return (OBSEndpointBuilder) this;
        }
    }

    public interface OBSBuilders {
        /**
         * Huawei Object Storage Service (OBS) (camel-huaweicloud-obs)
         * To provide stable, secure, efficient, and easy-to-use cloud storage
         * service on Huawei Cloud
         * 
         * Category: cloud
         * Since: 3.12
         * Maven coordinates: org.apache.camel:camel-huaweicloud-obs
         * 
         * Syntax: <code>hwcloud-obs:operation</code>
         * 
         * Path parameter: operation (required)
         * Operation to be performed
         * 
         * @param path operation
         * @return the dsl builder
         */
        default OBSEndpointBuilder hwcloudObs(String path) {
            return OBSEndpointBuilderFactory.endpointBuilder("hwcloud-obs", path);
        }
        /**
         * Huawei Object Storage Service (OBS) (camel-huaweicloud-obs)
         * To provide stable, secure, efficient, and easy-to-use cloud storage
         * service on Huawei Cloud
         * 
         * Category: cloud
         * Since: 3.12
         * Maven coordinates: org.apache.camel:camel-huaweicloud-obs
         * 
         * Syntax: <code>hwcloud-obs:operation</code>
         * 
         * Path parameter: operation (required)
         * Operation to be performed
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path operation
         * @return the dsl builder
         */
        default OBSEndpointBuilder hwcloudObs(String componentName, String path) {
            return OBSEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static OBSEndpointBuilder endpointBuilder(String componentName, String path) {
        class OBSEndpointBuilderImpl extends AbstractEndpointBuilder implements OBSEndpointBuilder, AdvancedOBSEndpointBuilder {
            public OBSEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new OBSEndpointBuilderImpl(path);
    }
}