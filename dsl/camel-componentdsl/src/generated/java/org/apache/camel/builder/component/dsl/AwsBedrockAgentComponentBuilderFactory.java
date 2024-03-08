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
import org.apache.camel.component.aws2.bedrock.agent.BedrockAgentComponent;

/**
 * Operate on AWS Bedrock through its Agent.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AwsBedrockAgentComponentBuilderFactory {

    /**
     * AWS Bedrock Agent (camel-aws-bedrock)
     * Operate on AWS Bedrock through its Agent.
     * 
     * Category: ai,cloud
     * Since: 4.5
     * Maven coordinates: org.apache.camel:camel-aws-bedrock
     * 
     * @return the dsl builder
     */
    static AwsBedrockAgentComponentBuilder awsBedrockAgent() {
        return new AwsBedrockAgentComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Bedrock Agent component.
     */
    interface AwsBedrockAgentComponentBuilder
            extends
                ComponentBuilder<BedrockAgentComponent> {
        /**
         * Component configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.bedrock.agent.BedrockAgentConfiguration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default AwsBedrockAgentComponentBuilder configuration(
                org.apache.camel.component.aws2.bedrock.agent.BedrockAgentConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Define the Data source Id we are going to use.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param dataSourceId the value to set
         * @return the dsl builder
         */
        default AwsBedrockAgentComponentBuilder dataSourceId(
                java.lang.String dataSourceId) {
            doSetProperty("dataSourceId", dataSourceId);
            return this;
        }
        /**
         * Define the Knowledge Base Id we are going to use.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param knowledgeBaseId the value to set
         * @return the dsl builder
         */
        default AwsBedrockAgentComponentBuilder knowledgeBaseId(
                java.lang.String knowledgeBaseId) {
            doSetProperty("knowledgeBaseId", knowledgeBaseId);
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
        default AwsBedrockAgentComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Define the model Id we are going to use.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param modelId the value to set
         * @return the dsl builder
         */
        default AwsBedrockAgentComponentBuilder modelId(java.lang.String modelId) {
            doSetProperty("modelId", modelId);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.bedrock.agent.BedrockAgentOperations&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default AwsBedrockAgentComponentBuilder operation(
                org.apache.camel.component.aws2.bedrock.agent.BedrockAgentOperations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Set the need for overriding the endpoint. This option needs to be
         * used in combination with the uriEndpointOverride option.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default AwsBedrockAgentComponentBuilder overrideEndpoint(
                boolean overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param pojoRequest the value to set
         * @return the dsl builder
         */
        default AwsBedrockAgentComponentBuilder pojoRequest(boolean pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * If using a profile credentials provider, this parameter will set the
         * profile name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param profileCredentialsName the value to set
         * @return the dsl builder
         */
        default AwsBedrockAgentComponentBuilder profileCredentialsName(
                java.lang.String profileCredentialsName) {
            doSetProperty("profileCredentialsName", profileCredentialsName);
            return this;
        }
        /**
         * The region in which Bedrock Agent client needs to work. When using
         * this parameter, the configuration will expect the lowercase name of
         * the region (for example, ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default AwsBedrockAgentComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
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
        default AwsBedrockAgentComponentBuilder uriEndpointOverride(
                java.lang.String uriEndpointOverride) {
            doSetProperty("uriEndpointOverride", uriEndpointOverride);
            return this;
        }
        /**
         * Set whether the Bedrock Agent client should expect to load
         * credentials through a default credentials provider or to expect
         * static credentials to be passed in.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default AwsBedrockAgentComponentBuilder useDefaultCredentialsProvider(
                boolean useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the Bedrock Agent client should expect to load
         * credentials through a profile credentials provider.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useProfileCredentialsProvider the value to set
         * @return the dsl builder
         */
        default AwsBedrockAgentComponentBuilder useProfileCredentialsProvider(
                boolean useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
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
        default AwsBedrockAgentComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * To use an existing configured AWS Bedrock Agent client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.bedrockagent.BedrockAgentClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param bedrockAgentClient the value to set
         * @return the dsl builder
         */
        default AwsBedrockAgentComponentBuilder bedrockAgentClient(
                software.amazon.awssdk.services.bedrockagent.BedrockAgentClient bedrockAgentClient) {
            doSetProperty("bedrockAgentClient", bedrockAgentClient);
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
        default AwsBedrockAgentComponentBuilder healthCheckConsumerEnabled(
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
        default AwsBedrockAgentComponentBuilder healthCheckProducerEnabled(
                boolean healthCheckProducerEnabled) {
            doSetProperty("healthCheckProducerEnabled", healthCheckProducerEnabled);
            return this;
        }
        /**
         * To define a proxy host when instantiating the Bedrock Agent client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default AwsBedrockAgentComponentBuilder proxyHost(
                java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Bedrock Agent client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default AwsBedrockAgentComponentBuilder proxyPort(
                java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Bedrock Agent
         * client.
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
        default AwsBedrockAgentComponentBuilder proxyProtocol(
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
        default AwsBedrockAgentComponentBuilder accessKey(
                java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
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
        default AwsBedrockAgentComponentBuilder secretKey(
                java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Amazon AWS Session Token used when the user needs to assume an IAM
         * role.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sessionToken the value to set
         * @return the dsl builder
         */
        default AwsBedrockAgentComponentBuilder sessionToken(
                java.lang.String sessionToken) {
            doSetProperty("sessionToken", sessionToken);
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
        default AwsBedrockAgentComponentBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * Set whether the Bedrock Agent client should expect to use Session
         * Credentials. This is useful in a situation in which the user needs to
         * assume an IAM role for doing operations in Bedrock.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useSessionCredentials the value to set
         * @return the dsl builder
         */
        default AwsBedrockAgentComponentBuilder useSessionCredentials(
                boolean useSessionCredentials) {
            doSetProperty("useSessionCredentials", useSessionCredentials);
            return this;
        }
    }

    class AwsBedrockAgentComponentBuilderImpl
            extends
                AbstractComponentBuilder<BedrockAgentComponent>
            implements
                AwsBedrockAgentComponentBuilder {
        @Override
        protected BedrockAgentComponent buildConcreteComponent() {
            return new BedrockAgentComponent();
        }
        private org.apache.camel.component.aws2.bedrock.agent.BedrockAgentConfiguration getOrCreateConfiguration(
                org.apache.camel.component.aws2.bedrock.agent.BedrockAgentComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws2.bedrock.agent.BedrockAgentConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((BedrockAgentComponent) component).setConfiguration((org.apache.camel.component.aws2.bedrock.agent.BedrockAgentConfiguration) value); return true;
            case "dataSourceId": getOrCreateConfiguration((BedrockAgentComponent) component).setDataSourceId((java.lang.String) value); return true;
            case "knowledgeBaseId": getOrCreateConfiguration((BedrockAgentComponent) component).setKnowledgeBaseId((java.lang.String) value); return true;
            case "lazyStartProducer": ((BedrockAgentComponent) component).setLazyStartProducer((boolean) value); return true;
            case "modelId": getOrCreateConfiguration((BedrockAgentComponent) component).setModelId((java.lang.String) value); return true;
            case "operation": getOrCreateConfiguration((BedrockAgentComponent) component).setOperation((org.apache.camel.component.aws2.bedrock.agent.BedrockAgentOperations) value); return true;
            case "overrideEndpoint": getOrCreateConfiguration((BedrockAgentComponent) component).setOverrideEndpoint((boolean) value); return true;
            case "pojoRequest": getOrCreateConfiguration((BedrockAgentComponent) component).setPojoRequest((boolean) value); return true;
            case "profileCredentialsName": getOrCreateConfiguration((BedrockAgentComponent) component).setProfileCredentialsName((java.lang.String) value); return true;
            case "region": getOrCreateConfiguration((BedrockAgentComponent) component).setRegion((java.lang.String) value); return true;
            case "uriEndpointOverride": getOrCreateConfiguration((BedrockAgentComponent) component).setUriEndpointOverride((java.lang.String) value); return true;
            case "useDefaultCredentialsProvider": getOrCreateConfiguration((BedrockAgentComponent) component).setUseDefaultCredentialsProvider((boolean) value); return true;
            case "useProfileCredentialsProvider": getOrCreateConfiguration((BedrockAgentComponent) component).setUseProfileCredentialsProvider((boolean) value); return true;
            case "autowiredEnabled": ((BedrockAgentComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "bedrockAgentClient": getOrCreateConfiguration((BedrockAgentComponent) component).setBedrockAgentClient((software.amazon.awssdk.services.bedrockagent.BedrockAgentClient) value); return true;
            case "healthCheckConsumerEnabled": ((BedrockAgentComponent) component).setHealthCheckConsumerEnabled((boolean) value); return true;
            case "healthCheckProducerEnabled": ((BedrockAgentComponent) component).setHealthCheckProducerEnabled((boolean) value); return true;
            case "proxyHost": getOrCreateConfiguration((BedrockAgentComponent) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((BedrockAgentComponent) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((BedrockAgentComponent) component).setProxyProtocol((software.amazon.awssdk.core.Protocol) value); return true;
            case "accessKey": getOrCreateConfiguration((BedrockAgentComponent) component).setAccessKey((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((BedrockAgentComponent) component).setSecretKey((java.lang.String) value); return true;
            case "sessionToken": getOrCreateConfiguration((BedrockAgentComponent) component).setSessionToken((java.lang.String) value); return true;
            case "trustAllCertificates": getOrCreateConfiguration((BedrockAgentComponent) component).setTrustAllCertificates((boolean) value); return true;
            case "useSessionCredentials": getOrCreateConfiguration((BedrockAgentComponent) component).setUseSessionCredentials((boolean) value); return true;
            default: return false;
            }
        }
    }
}