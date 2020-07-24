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

import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Send e-mails through AWS SES service.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SesEndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS Simple Email Service (SES) component.
     */
    public interface SesEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedSesEndpointBuilder advanced() {
            return (AdvancedSesEndpointBuilder) this;
        }
        /**
         * To use the AmazonSimpleEmailService as the client.
         * 
         * The option is a:
         * <code>com.amazonaws.services.simpleemail.AmazonSimpleEmailService</code> type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder amazonSESClient(Object amazonSESClient) {
            doSetProperty("amazonSESClient", amazonSESClient);
            return this;
        }
        /**
         * To use the AmazonSimpleEmailService as the client.
         * 
         * The option will be converted to a
         * <code>com.amazonaws.services.simpleemail.AmazonSimpleEmailService</code> type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder amazonSESClient(String amazonSESClient) {
            doSetProperty("amazonSESClient", amazonSESClient);
            return this;
        }
        /**
         * Setting the autoDiscoverClient mechanism, if true, the component will
         * look for a client instance in the registry automatically otherwise it
         * will skip that checking.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default SesEndpointBuilder autoDiscoverClient(boolean autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
            return this;
        }
        /**
         * Setting the autoDiscoverClient mechanism, if true, the component will
         * look for a client instance in the registry automatically otherwise it
         * will skip that checking.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default SesEndpointBuilder autoDiscoverClient(String autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
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
        default SesEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default SesEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To define a proxy host when instantiating the SES client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the SES client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the SES client.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the SES client.
         * 
         * The option is a: <code>com.amazonaws.Protocol</code> type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default SesEndpointBuilder proxyProtocol(Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the SES client.
         * 
         * The option will be converted to a <code>com.amazonaws.Protocol</code>
         * type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default SesEndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which SES client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * List of reply-to email address(es) for the message, override it using
         * 'CamelAwsSesReplyToAddresses' header.
         * 
         * The option is a: <code>java.util.List&lt;java.lang.String&gt;</code>
         * type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder replyToAddresses(
                List<String> replyToAddresses) {
            doSetProperty("replyToAddresses", replyToAddresses);
            return this;
        }
        /**
         * List of reply-to email address(es) for the message, override it using
         * 'CamelAwsSesReplyToAddresses' header.
         * 
         * The option will be converted to a
         * <code>java.util.List&lt;java.lang.String&gt;</code> type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder replyToAddresses(String replyToAddresses) {
            doSetProperty("replyToAddresses", replyToAddresses);
            return this;
        }
        /**
         * The email address to which bounce notifications are to be forwarded,
         * override it using 'CamelAwsSesReturnPath' header.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder returnPath(String returnPath) {
            doSetProperty("returnPath", returnPath);
            return this;
        }
        /**
         * The subject which is used if the message header 'CamelAwsSesSubject'
         * is not present.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder subject(String subject) {
            doSetProperty("subject", subject);
            return this;
        }
        /**
         * List of destination email address. Can be overriden with
         * 'CamelAwsSesTo' header.
         * 
         * The option is a: <code>java.util.List&lt;java.lang.String&gt;</code>
         * type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder to(List<String> to) {
            doSetProperty("to", to);
            return this;
        }
        /**
         * List of destination email address. Can be overriden with
         * 'CamelAwsSesTo' header.
         * 
         * The option will be converted to a
         * <code>java.util.List&lt;java.lang.String&gt;</code> type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder to(String to) {
            doSetProperty("to", to);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SesEndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SesEndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS Simple Email Service (SES)
     * component.
     */
    public interface AdvancedSesEndpointBuilder
            extends
                EndpointProducerBuilder {
        default SesEndpointBuilder basic() {
            return (SesEndpointBuilder) this;
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
        default AdvancedSesEndpointBuilder basicPropertyBinding(
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
        default AdvancedSesEndpointBuilder basicPropertyBinding(
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
        default AdvancedSesEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedSesEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for <code>com.amazonaws.Protocol</code> enum.
     */
    enum Protocol {
        HTTP,
        HTTPS;
    }

    public interface SesBuilders {
        /**
         * AWS Simple Email Service (SES) (camel-aws-ses)
         * Send e-mails through AWS SES service.
         * 
         * Category: cloud,mail
         * Since: 2.9
         * Maven coordinates: org.apache.camel:camel-aws-ses
         * 
         * Syntax: <code>aws-ses:from</code>
         * 
         * Path parameter: from (required)
         * The sender's email address.
         * 
         * @param path from
         */
        default SesEndpointBuilder awsSes(String path) {
            return SesEndpointBuilderFactory.endpointBuilder("aws-ses", path);
        }
        /**
         * AWS Simple Email Service (SES) (camel-aws-ses)
         * Send e-mails through AWS SES service.
         * 
         * Category: cloud,mail
         * Since: 2.9
         * Maven coordinates: org.apache.camel:camel-aws-ses
         * 
         * Syntax: <code>aws-ses:from</code>
         * 
         * Path parameter: from (required)
         * The sender's email address.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path from
         */
        default SesEndpointBuilder awsSes(String componentName, String path) {
            return SesEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static SesEndpointBuilder endpointBuilder(String componentName, String path) {
        class SesEndpointBuilderImpl extends AbstractEndpointBuilder implements SesEndpointBuilder, AdvancedSesEndpointBuilder {
            public SesEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new SesEndpointBuilderImpl(path);
    }
}