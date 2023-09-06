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
package org.apache.camel.builder.component.dsl;

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws2.sns.Sns2Component;

/**
 * Send messages to AWS Simple Notification Topic.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Aws2SnsComponentBuilderFactory {

    /**
     * AWS Simple Notification System (SNS) (camel-aws2-sns)
     * Send messages to AWS Simple Notification Topic.
     * 
     * Category: cloud,messaging,mobile
     * Since: 3.1
     * Maven coordinates: org.apache.camel:camel-aws2-sns
     * 
     * @return the dsl builder
     */
    static Aws2SnsComponentBuilder aws2Sns() {
        return new Aws2SnsComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Simple Notification System (SNS) component.
     */
    interface Aws2SnsComponentBuilder extends ComponentBuilder<Sns2Component> {
        /**
         * Setting the autocreation of the topic.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param autoCreateTopic the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder autoCreateTopic(boolean autoCreateTopic) {
            doSetProperty("autoCreateTopic", autoCreateTopic);
            return this;
        }
        /**
         * Component configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.sns.Sns2Configuration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder configuration(
                org.apache.camel.component.aws2.sns.Sns2Configuration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * The ID of an AWS-managed customer master key (CMK) for Amazon SNS or
         * a custom CMK.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param kmsMasterKeyId the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder kmsMasterKeyId(
                java.lang.String kmsMasterKeyId) {
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
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Only for FIFO Topic. Strategy for setting the messageDeduplicationId
         * on the message. Can be one of the following options: useExchangeId,
         * useContentBasedDeduplication. For the useContentBasedDeduplication
         * option, no messageDeduplicationId will be set on the message.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: useExchangeId
         * Group: producer
         * 
         * @param messageDeduplicationIdStrategy the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder messageDeduplicationIdStrategy(
                java.lang.String messageDeduplicationIdStrategy) {
            doSetProperty("messageDeduplicationIdStrategy", messageDeduplicationIdStrategy);
            return this;
        }
        /**
         * Only for FIFO Topic. Strategy for setting the messageGroupId on the
         * message. Can be one of the following options: useConstant,
         * useExchangeId, usePropertyValue. For the usePropertyValue option, the
         * value of property CamelAwsMessageGroupId will be used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param messageGroupIdStrategy the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder messageGroupIdStrategy(
                java.lang.String messageGroupIdStrategy) {
            doSetProperty("messageGroupIdStrategy", messageGroupIdStrategy);
            return this;
        }
        /**
         * The message structure to use such as json.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param messageStructure the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder messageStructure(
                java.lang.String messageStructure) {
            doSetProperty("messageStructure", messageStructure);
            return this;
        }
        /**
         * Set the need for overidding the endpoint. This option needs to be
         * used in combination with uriEndpointOverride option.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder overrideEndpoint(
                boolean overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * The policy for this topic. Is loaded by default from classpath, but
         * you can prefix with classpath:, file:, or http: to load the resource
         * from different systems.
         * 
         * This option can also be loaded from an existing file, by prefixing
         * with file: or classpath: followed by the location of the file.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param policy the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder policy(java.lang.String policy) {
            doSetProperty("policy", policy);
            return this;
        }
        /**
         * The ARN endpoint to subscribe to.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param queueArn the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder queueArn(java.lang.String queueArn) {
            doSetProperty("queueArn", queueArn);
            return this;
        }
        /**
         * The region in which SNS client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Define if Server Side Encryption is enabled or not on the topic.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param serverSideEncryptionEnabled the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder serverSideEncryptionEnabled(
                boolean serverSideEncryptionEnabled) {
            doSetProperty("serverSideEncryptionEnabled", serverSideEncryptionEnabled);
            return this;
        }
        /**
         * The subject which is used if the message header 'CamelAwsSnsSubject'
         * is not present.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param subject the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder subject(java.lang.String subject) {
            doSetProperty("subject", subject);
            return this;
        }
        /**
         * Define if the subscription between SNS Topic and SQS must be done or
         * not.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param subscribeSNStoSQS the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder subscribeSNStoSQS(
                boolean subscribeSNStoSQS) {
            doSetProperty("subscribeSNStoSQS", subscribeSNStoSQS);
            return this;
        }
        /**
         * Set the overriding uri endpoint. This option needs to be used in
         * combination with overrideEndpoint option.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param uriEndpointOverride the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder uriEndpointOverride(
                java.lang.String uriEndpointOverride) {
            doSetProperty("uriEndpointOverride", uriEndpointOverride);
            return this;
        }
        /**
         * To use the AmazonSNS as the client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.sns.SnsClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param amazonSNSClient the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder amazonSNSClient(
                software.amazon.awssdk.services.sns.SnsClient amazonSNSClient) {
            doSetProperty("amazonSNSClient", amazonSNSClient);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * Used for enabling or disabling all consumer based health checks from
         * this component.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckConsumerEnabled the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder healthCheckConsumerEnabled(
                boolean healthCheckConsumerEnabled) {
            doSetProperty("healthCheckConsumerEnabled", healthCheckConsumerEnabled);
            return this;
        }
        /**
         * Used for enabling or disabling all producer based health checks from
         * this component. Notice: Camel has by default disabled all producer
         * based health-checks. You can turn on producer checks globally by
         * setting camel.health.producersEnabled=true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckProducerEnabled the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder healthCheckProducerEnabled(
                boolean healthCheckProducerEnabled) {
            doSetProperty("healthCheckProducerEnabled", healthCheckProducerEnabled);
            return this;
        }
        /**
         * To define a proxy host when instantiating the SNS client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the SNS client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the SNS client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: proxy
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * If using a profile credentials provider this parameter will set the
         * profile name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param profileCredentialsName the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder profileCredentialsName(
                java.lang.String profileCredentialsName) {
            doSetProperty("profileCredentialsName", profileCredentialsName);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * Set whether the SNS client should expect to load credentials on an
         * AWS infra instance or to expect static credentials to be passed in.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder useDefaultCredentialsProvider(
                boolean useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the SNS client should expect to load credentials through
         * a profile credentials provider.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useProfileCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Aws2SnsComponentBuilder useProfileCredentialsProvider(
                boolean useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
            return this;
        }
    }

    class Aws2SnsComponentBuilderImpl
            extends
                AbstractComponentBuilder<Sns2Component>
            implements
                Aws2SnsComponentBuilder {
        @Override
        protected Sns2Component buildConcreteComponent() {
            return new Sns2Component();
        }
        private org.apache.camel.component.aws2.sns.Sns2Configuration getOrCreateConfiguration(
                org.apache.camel.component.aws2.sns.Sns2Component component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws2.sns.Sns2Configuration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "autoCreateTopic": getOrCreateConfiguration((Sns2Component) component).setAutoCreateTopic((boolean) value); return true;
            case "configuration": ((Sns2Component) component).setConfiguration((org.apache.camel.component.aws2.sns.Sns2Configuration) value); return true;
            case "kmsMasterKeyId": getOrCreateConfiguration((Sns2Component) component).setKmsMasterKeyId((java.lang.String) value); return true;
            case "lazyStartProducer": ((Sns2Component) component).setLazyStartProducer((boolean) value); return true;
            case "messageDeduplicationIdStrategy": getOrCreateConfiguration((Sns2Component) component).setMessageDeduplicationIdStrategy((java.lang.String) value); return true;
            case "messageGroupIdStrategy": getOrCreateConfiguration((Sns2Component) component).setMessageGroupIdStrategy((java.lang.String) value); return true;
            case "messageStructure": getOrCreateConfiguration((Sns2Component) component).setMessageStructure((java.lang.String) value); return true;
            case "overrideEndpoint": getOrCreateConfiguration((Sns2Component) component).setOverrideEndpoint((boolean) value); return true;
            case "policy": getOrCreateConfiguration((Sns2Component) component).setPolicy((java.lang.String) value); return true;
            case "queueArn": getOrCreateConfiguration((Sns2Component) component).setQueueArn((java.lang.String) value); return true;
            case "region": getOrCreateConfiguration((Sns2Component) component).setRegion((java.lang.String) value); return true;
            case "serverSideEncryptionEnabled": getOrCreateConfiguration((Sns2Component) component).setServerSideEncryptionEnabled((boolean) value); return true;
            case "subject": getOrCreateConfiguration((Sns2Component) component).setSubject((java.lang.String) value); return true;
            case "subscribeSNStoSQS": getOrCreateConfiguration((Sns2Component) component).setSubscribeSNStoSQS((boolean) value); return true;
            case "uriEndpointOverride": getOrCreateConfiguration((Sns2Component) component).setUriEndpointOverride((java.lang.String) value); return true;
            case "amazonSNSClient": getOrCreateConfiguration((Sns2Component) component).setAmazonSNSClient((software.amazon.awssdk.services.sns.SnsClient) value); return true;
            case "autowiredEnabled": ((Sns2Component) component).setAutowiredEnabled((boolean) value); return true;
            case "healthCheckConsumerEnabled": ((Sns2Component) component).setHealthCheckConsumerEnabled((boolean) value); return true;
            case "healthCheckProducerEnabled": ((Sns2Component) component).setHealthCheckProducerEnabled((boolean) value); return true;
            case "proxyHost": getOrCreateConfiguration((Sns2Component) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((Sns2Component) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((Sns2Component) component).setProxyProtocol((software.amazon.awssdk.core.Protocol) value); return true;
            case "accessKey": getOrCreateConfiguration((Sns2Component) component).setAccessKey((java.lang.String) value); return true;
            case "profileCredentialsName": getOrCreateConfiguration((Sns2Component) component).setProfileCredentialsName((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((Sns2Component) component).setSecretKey((java.lang.String) value); return true;
            case "trustAllCertificates": getOrCreateConfiguration((Sns2Component) component).setTrustAllCertificates((boolean) value); return true;
            case "useDefaultCredentialsProvider": getOrCreateConfiguration((Sns2Component) component).setUseDefaultCredentialsProvider((boolean) value); return true;
            case "useProfileCredentialsProvider": getOrCreateConfiguration((Sns2Component) component).setUseProfileCredentialsProvider((boolean) value); return true;
            default: return false;
            }
        }
    }
}