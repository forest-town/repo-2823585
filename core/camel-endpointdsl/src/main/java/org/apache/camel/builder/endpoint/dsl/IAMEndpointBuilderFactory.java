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
 * The aws-iam is used for managing Amazon IAM
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface IAMEndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS IAM component.
     */
    public interface IAMEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedIAMEndpointBuilder advanced() {
            return (AdvancedIAMEndpointBuilder) this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default IAMEndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * To use a existing configured AWS IAM as client.
         * 
         * The option is a:
         * <code>com.amazonaws.services.identitymanagement.AmazonIdentityManagement</code> type.
         * 
         * Group: producer
         */
        default IAMEndpointBuilder iamClient(Object iamClient) {
            doSetProperty("iamClient", iamClient);
            return this;
        }
        /**
         * To use a existing configured AWS IAM as client.
         * 
         * The option will be converted to a
         * <code>com.amazonaws.services.identitymanagement.AmazonIdentityManagement</code> type.
         * 
         * Group: producer
         */
        default IAMEndpointBuilder iamClient(String iamClient) {
            doSetProperty("iamClient", iamClient);
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
        default IAMEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default IAMEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.iam.IAMOperations</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default IAMEndpointBuilder operation(IAMOperations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.aws.iam.IAMOperations</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default IAMEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * To define a proxy host when instantiating the IAM client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default IAMEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the IAM client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default IAMEndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the IAM client.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default IAMEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the IAM client.
         * 
         * The option is a: <code>com.amazonaws.Protocol</code> type.
         * 
         * Group: producer
         */
        default IAMEndpointBuilder proxyProtocol(Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the IAM client.
         * 
         * The option will be converted to a <code>com.amazonaws.Protocol</code>
         * type.
         * 
         * Group: producer
         */
        default IAMEndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which IAM client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default IAMEndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default IAMEndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS IAM component.
     */
    public interface AdvancedIAMEndpointBuilder
            extends
                EndpointProducerBuilder {
        default IAMEndpointBuilder basic() {
            return (IAMEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedIAMEndpointBuilder basicPropertyBinding(
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
        default AdvancedIAMEndpointBuilder basicPropertyBinding(
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
        default AdvancedIAMEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedIAMEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.aws.iam.IAMOperations</code> enum.
     */
    enum IAMOperations {
        listAccessKeys,
        createUser,
        deleteUser,
        getUser,
        listUsers,
        createAccessKey,
        deleteAccessKey,
        updateAccessKey,
        createGroup,
        deleteGroup,
        listGroups,
        addUserToGroup,
        removeUserFromGroup;
    }

    /**
     * Proxy enum for <code>com.amazonaws.Protocol</code> enum.
     */
    enum Protocol {
        http,
        https;
    }
    /**
     * AWS IAM (camel-aws-iam)
     * The aws-iam is used for managing Amazon IAM
     * 
     * Category: cloud,management
     * Available as of version: 2.23
     * Maven coordinates: org.apache.camel:camel-aws-iam
     * 
     * Syntax: <code>aws-iam:label</code>
     * 
     * Path parameter: label (required)
     * Logical name
     */
    default IAMEndpointBuilder awsIam(String path) {
        class IAMEndpointBuilderImpl extends AbstractEndpointBuilder implements IAMEndpointBuilder, AdvancedIAMEndpointBuilder {
            public IAMEndpointBuilderImpl(String path) {
                super("aws-iam", path);
            }
        }
        return new IAMEndpointBuilderImpl(path);
    }
}