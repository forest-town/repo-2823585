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
 * To broadcast messages and connect cloud services through notifications on
 * Huawei Cloud
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SimpleNotificationEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Huawei Simple Message Notification (SMN)
     * component.
     */
    public interface SimpleNotificationEndpointBuilder
            extends
                EndpointProducerBuilder {
        /**
         * Authentication key for the cloud user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param authKey the value to set
         * @return the dsl builder
         */
        default SimpleNotificationEndpointBuilder authKey(String authKey) {
            doSetProperty("authKey", authKey);
            return this;
        }
        /**
         * Fully qualified smn service url. Carries higher precedence than
         * region parameter based client initialization.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param endpoint the value to set
         * @return the dsl builder
         */
        default SimpleNotificationEndpointBuilder endpoint(String endpoint) {
            doSetProperty("endpoint", endpoint);
            return this;
        }
        /**
         * Ignore SSL verification.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param ignoreSslVerification the value to set
         * @return the dsl builder
         */
        default SimpleNotificationEndpointBuilder ignoreSslVerification(
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
         * Group: producer
         * 
         * @param ignoreSslVerification the value to set
         * @return the dsl builder
         */
        default SimpleNotificationEndpointBuilder ignoreSslVerification(
                String ignoreSslVerification) {
            doSetProperty("ignoreSslVerification", ignoreSslVerification);
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
        default SimpleNotificationEndpointBuilder lazyStartProducer(
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
        default SimpleNotificationEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * TTL for published message.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 3600
         * Group: producer
         * 
         * @param messageTtl the value to set
         * @return the dsl builder
         */
        default SimpleNotificationEndpointBuilder messageTtl(int messageTtl) {
            doSetProperty("messageTtl", messageTtl);
            return this;
        }
        /**
         * TTL for published message.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 3600
         * Group: producer
         * 
         * @param messageTtl the value to set
         * @return the dsl builder
         */
        default SimpleNotificationEndpointBuilder messageTtl(String messageTtl) {
            doSetProperty("messageTtl", messageTtl);
            return this;
        }
        /**
         * Name of operation to perform.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default SimpleNotificationEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Cloud project ID.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param projectId the value to set
         * @return the dsl builder
         */
        default SimpleNotificationEndpointBuilder projectId(String projectId) {
            doSetProperty("projectId", projectId);
            return this;
        }
        /**
         * Proxy server ip/hostname.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default SimpleNotificationEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * Proxy authentication password.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPassword the value to set
         * @return the dsl builder
         */
        default SimpleNotificationEndpointBuilder proxyPassword(
                String proxyPassword) {
            doSetProperty("proxyPassword", proxyPassword);
            return this;
        }
        /**
         * Proxy server port.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default SimpleNotificationEndpointBuilder proxyPort(int proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * Proxy server port.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default SimpleNotificationEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * Proxy authentication user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyUser the value to set
         * @return the dsl builder
         */
        default SimpleNotificationEndpointBuilder proxyUser(String proxyUser) {
            doSetProperty("proxyUser", proxyUser);
            return this;
        }
        /**
         * SMN service region. This is lower precedence than endpoint based
         * configuration.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default SimpleNotificationEndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Secret key for the cloud user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default SimpleNotificationEndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Configuration object for cloud service authentication.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.huaweicloud.common.models.ServiceKeys&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param serviceKeys the value to set
         * @return the dsl builder
         */
        default SimpleNotificationEndpointBuilder serviceKeys(Object serviceKeys) {
            doSetProperty("serviceKeys", serviceKeys);
            return this;
        }
        /**
         * Configuration object for cloud service authentication.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.huaweicloud.common.models.ServiceKeys&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param serviceKeys the value to set
         * @return the dsl builder
         */
        default SimpleNotificationEndpointBuilder serviceKeys(String serviceKeys) {
            doSetProperty("serviceKeys", serviceKeys);
            return this;
        }
    }

    public interface SimpleNotificationBuilders {
        /**
         * Huawei Simple Message Notification (SMN) (camel-huaweicloud-smn)
         * To broadcast messages and connect cloud services through
         * notifications on Huawei Cloud
         * 
         * Category: cloud,messaging
         * Since: 3.8
         * Maven coordinates: org.apache.camel:camel-huaweicloud-smn
         * 
         * Syntax: <code>hwcloud-smn:smnService</code>
         * 
         * Path parameter: smnService (required)
         * Name of SMN service to invoke
         * 
         * @param path smnService
         * @return the dsl builder
         */
        default SimpleNotificationEndpointBuilder hwcloudSmn(String path) {
            return SimpleNotificationEndpointBuilderFactory.endpointBuilder("hwcloud-smn", path);
        }
        /**
         * Huawei Simple Message Notification (SMN) (camel-huaweicloud-smn)
         * To broadcast messages and connect cloud services through
         * notifications on Huawei Cloud
         * 
         * Category: cloud,messaging
         * Since: 3.8
         * Maven coordinates: org.apache.camel:camel-huaweicloud-smn
         * 
         * Syntax: <code>hwcloud-smn:smnService</code>
         * 
         * Path parameter: smnService (required)
         * Name of SMN service to invoke
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path smnService
         * @return the dsl builder
         */
        default SimpleNotificationEndpointBuilder hwcloudSmn(
                String componentName,
                String path) {
            return SimpleNotificationEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static SimpleNotificationEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class SimpleNotificationEndpointBuilderImpl extends AbstractEndpointBuilder implements SimpleNotificationEndpointBuilder {
            public SimpleNotificationEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new SimpleNotificationEndpointBuilderImpl(path);
    }
}