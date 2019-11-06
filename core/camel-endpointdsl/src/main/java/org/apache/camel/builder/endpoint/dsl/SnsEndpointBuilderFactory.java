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
import org.apache.camel.spi.HeaderFilterStrategy;

/**
 * The aws-sns component is used for sending messages to an Amazon Simple
 * Notification Topic.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SnsEndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS Simple Notification System component.
     */
    public interface SnsEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedSnsEndpointBuilder advanced() {
            return (AdvancedSnsEndpointBuilder) this;
        }
        /**
         * To use the AmazonSNS as the client.
         * 
         * The option is a: <code>com.amazonaws.services.sns.AmazonSNS</code>
         * type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder amazonSNSClient(Object amazonSNSClient) {
            doSetProperty("amazonSNSClient", amazonSNSClient);
            return this;
        }
        /**
         * To use the AmazonSNS as the client.
         * 
         * The option will be converted to a
         * <code>com.amazonaws.services.sns.AmazonSNS</code> type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder amazonSNSClient(String amazonSNSClient) {
            doSetProperty("amazonSNSClient", amazonSNSClient);
            return this;
        }
        /**
         * An SQS Client to use as bridge between SNS and SQS.
         * 
         * The option is a: <code>com.amazonaws.services.sqs.AmazonSQS</code>
         * type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder amazonSQSClient(Object amazonSQSClient) {
            doSetProperty("amazonSQSClient", amazonSQSClient);
            return this;
        }
        /**
         * An SQS Client to use as bridge between SNS and SQS.
         * 
         * The option will be converted to a
         * <code>com.amazonaws.services.sqs.AmazonSQS</code> type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder amazonSQSClient(String amazonSQSClient) {
            doSetProperty("amazonSQSClient", amazonSQSClient);
            return this;
        }
        /**
         * Setting the autocreation of the topic.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder autoCreateTopic(boolean autoCreateTopic) {
            doSetProperty("autoCreateTopic", autoCreateTopic);
            return this;
        }
        /**
         * Setting the autocreation of the topic.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder autoCreateTopic(String autoCreateTopic) {
            doSetProperty("autoCreateTopic", autoCreateTopic);
            return this;
        }
        /**
         * To use a custom HeaderFilterStrategy to map headers to/from Camel.
         * 
         * The option is a:
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder headerFilterStrategy(
                HeaderFilterStrategy headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * To use a custom HeaderFilterStrategy to map headers to/from Camel.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder headerFilterStrategy(
                String headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * The ID of an AWS-managed customer master key (CMK) for Amazon SNS or
         * a custom CMK.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder kmsMasterKeyId(String kmsMasterKeyId) {
            doSetProperty("kmsMasterKeyId", kmsMasterKeyId);
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
         * Group: producer
         */
        default SnsEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
         * Group: producer
         */
        default SnsEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The message structure to use such as json.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder messageStructure(String messageStructure) {
            doSetProperty("messageStructure", messageStructure);
            return this;
        }
        /**
         * The policy for this queue.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder policy(String policy) {
            doSetProperty("policy", policy);
            return this;
        }
        /**
         * To define a proxy host when instantiating the SNS client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the SNS client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the SNS client.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the SNS client.
         * 
         * The option is a: <code>com.amazonaws.Protocol</code> type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder proxyProtocol(Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the SNS client.
         * 
         * The option will be converted to a <code>com.amazonaws.Protocol</code>
         * type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The queueUrl to subscribe to.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder queueUrl(String queueUrl) {
            doSetProperty("queueUrl", queueUrl);
            return this;
        }
        /**
         * The region in which SNS client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Define if Server Side Encryption is enabled or not on the topic.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder serverSideEncryptionEnabled(
                boolean serverSideEncryptionEnabled) {
            doSetProperty("serverSideEncryptionEnabled", serverSideEncryptionEnabled);
            return this;
        }
        /**
         * Define if Server Side Encryption is enabled or not on the topic.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder serverSideEncryptionEnabled(
                String serverSideEncryptionEnabled) {
            doSetProperty("serverSideEncryptionEnabled", serverSideEncryptionEnabled);
            return this;
        }
        /**
         * The subject which is used if the message header 'CamelAwsSnsSubject'
         * is not present.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder subject(String subject) {
            doSetProperty("subject", subject);
            return this;
        }
        /**
         * Define if the subscription between SNS Topic and SQS must be done or
         * not.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder subscribeSNStoSQS(boolean subscribeSNStoSQS) {
            doSetProperty("subscribeSNStoSQS", subscribeSNStoSQS);
            return this;
        }
        /**
         * Define if the subscription between SNS Topic and SQS must be done or
         * not.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SnsEndpointBuilder subscribeSNStoSQS(String subscribeSNStoSQS) {
            doSetProperty("subscribeSNStoSQS", subscribeSNStoSQS);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SnsEndpointBuilder accessKey(String accessKey) {
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
        default SnsEndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS Simple Notification System
     * component.
     */
    public interface AdvancedSnsEndpointBuilder
            extends
                EndpointProducerBuilder {
        default SnsEndpointBuilder basic() {
            return (SnsEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSnsEndpointBuilder basicPropertyBinding(
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
         * Group: advanced
         */
        default AdvancedSnsEndpointBuilder basicPropertyBinding(
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
         * Group: advanced
         */
        default AdvancedSnsEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSnsEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for <code>com.amazonaws.Protocol</code> enum.
     */
    enum Protocol {
        http,
        https;
    }
    /**
     * AWS Simple Notification System (camel-aws-sns)
     * The aws-sns component is used for sending messages to an Amazon Simple
     * Notification Topic.
     * 
     * Category: cloud,mobile,messaging
     * Available as of version: 2.8
     * Maven coordinates: org.apache.camel:camel-aws-sns
     * 
     * Syntax: <code>aws-sns:topicNameOrArn</code>
     * 
     * Path parameter: topicNameOrArn (required)
     * Topic name or ARN
     */
    default SnsEndpointBuilder awsSns(String path) {
        class SnsEndpointBuilderImpl extends AbstractEndpointBuilder implements SnsEndpointBuilder, AdvancedSnsEndpointBuilder {
            public SnsEndpointBuilderImpl(String path) {
                super("aws-sns", path);
            }
        }
        return new SnsEndpointBuilderImpl(path);
    }
}