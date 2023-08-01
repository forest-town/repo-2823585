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

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Manage AWS EC2 instances using AWS SDK version 2.x.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface AWS2EC2EndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS Elastic Compute Cloud (EC2) component.
     */
    public interface AWS2EC2EndpointBuilder extends EndpointProducerBuilder {
        default AdvancedAWS2EC2EndpointBuilder advanced() {
            return (AdvancedAWS2EC2EndpointBuilder) this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default AWS2EC2EndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * To use a existing configured AmazonEC2Client as client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.ec2.Ec2Client&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param amazonEc2Client the value to set
         * @return the dsl builder
         */
        default AWS2EC2EndpointBuilder amazonEc2Client(
                software.amazon.awssdk.services.ec2.Ec2Client amazonEc2Client) {
            doSetProperty("amazonEc2Client", amazonEc2Client);
            return this;
        }
        /**
         * To use a existing configured AmazonEC2Client as client.
         * 
         * The option will be converted to a
         * &lt;code&gt;software.amazon.awssdk.services.ec2.Ec2Client&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param amazonEc2Client the value to set
         * @return the dsl builder
         */
        default AWS2EC2EndpointBuilder amazonEc2Client(String amazonEc2Client) {
            doSetProperty("amazonEc2Client", amazonEc2Client);
            return this;
        }
        /**
         * The operation to perform. It can be createAndRunInstances,
         * startInstances, stopInstances, terminateInstances, describeInstances,
         * describeInstancesStatus, rebootInstances, monitorInstances,
         * unmonitorInstances, createTags or deleteTags.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.ec2.AWS2EC2Operations&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default AWS2EC2EndpointBuilder operation(
                org.apache.camel.component.aws2.ec2.AWS2EC2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to perform. It can be createAndRunInstances,
         * startInstances, stopInstances, terminateInstances, describeInstances,
         * describeInstancesStatus, rebootInstances, monitorInstances,
         * unmonitorInstances, createTags or deleteTags.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.aws2.ec2.AWS2EC2Operations&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default AWS2EC2EndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
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
        default AWS2EC2EndpointBuilder overrideEndpoint(boolean overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * Set the need for overidding the endpoint. This option needs to be
         * used in combination with uriEndpointOverride option.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default AWS2EC2EndpointBuilder overrideEndpoint(String overrideEndpoint) {
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
        default AWS2EC2EndpointBuilder pojoRequest(boolean pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param pojoRequest the value to set
         * @return the dsl builder
         */
        default AWS2EC2EndpointBuilder pojoRequest(String pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * The region in which EC2 client needs to work. When using this
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
        default AWS2EC2EndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default AWS2EC2EndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
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
        default AWS2EC2EndpointBuilder uriEndpointOverride(
                String uriEndpointOverride) {
            doSetProperty("uriEndpointOverride", uriEndpointOverride);
            return this;
        }
        /**
         * To define a proxy host when instantiating the EC2 client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default AWS2EC2EndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the EC2 client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default AWS2EC2EndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the EC2 client.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default AWS2EC2EndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the EC2 client.
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
        default AWS2EC2EndpointBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the EC2 client.
         * 
         * The option will be converted to a
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: proxy
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default AWS2EC2EndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
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
        default AWS2EC2EndpointBuilder profileCredentialsName(
                String profileCredentialsName) {
            doSetProperty("profileCredentialsName", profileCredentialsName);
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
        default AWS2EC2EndpointBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default AWS2EC2EndpointBuilder trustAllCertificates(
                String trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * Set whether the EC2 client should expect to load credentials through
         * a default credentials provider or to expect static credentials to be
         * passed in.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default AWS2EC2EndpointBuilder useDefaultCredentialsProvider(
                boolean useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the EC2 client should expect to load credentials through
         * a default credentials provider or to expect static credentials to be
         * passed in.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default AWS2EC2EndpointBuilder useDefaultCredentialsProvider(
                String useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the EC2 client should expect to load credentials through
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
        default AWS2EC2EndpointBuilder useProfileCredentialsProvider(
                boolean useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
            return this;
        }
        /**
         * Set whether the EC2 client should expect to load credentials through
         * a profile credentials provider.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useProfileCredentialsProvider the value to set
         * @return the dsl builder
         */
        default AWS2EC2EndpointBuilder useProfileCredentialsProvider(
                String useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS Elastic Compute Cloud (EC2)
     * component.
     */
    public interface AdvancedAWS2EC2EndpointBuilder
            extends
                EndpointProducerBuilder {
        default AWS2EC2EndpointBuilder basic() {
            return (AWS2EC2EndpointBuilder) this;
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
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedAWS2EC2EndpointBuilder lazyStartProducer(
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
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedAWS2EC2EndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface AWS2EC2Builders {
        /**
         * AWS Elastic Compute Cloud (EC2) (camel-aws2-ec2)
         * Manage AWS EC2 instances using AWS SDK version 2.x.
         * 
         * Category: cloud,management
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-aws2-ec2
         * 
         * @return the dsl builder for the headers' name.
         */
        default AWS2EC2HeaderNameBuilder aws2Ec2() {
            return AWS2EC2HeaderNameBuilder.INSTANCE;
        }
        /**
         * AWS Elastic Compute Cloud (EC2) (camel-aws2-ec2)
         * Manage AWS EC2 instances using AWS SDK version 2.x.
         * 
         * Category: cloud,management
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-aws2-ec2
         * 
         * Syntax: <code>aws2-ec2:label</code>
         * 
         * Path parameter: label (required)
         * Logical name
         * 
         * @param path label
         * @return the dsl builder
         */
        default AWS2EC2EndpointBuilder aws2Ec2(String path) {
            return AWS2EC2EndpointBuilderFactory.endpointBuilder("aws2-ec2", path);
        }
        /**
         * AWS Elastic Compute Cloud (EC2) (camel-aws2-ec2)
         * Manage AWS EC2 instances using AWS SDK version 2.x.
         * 
         * Category: cloud,management
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-aws2-ec2
         * 
         * Syntax: <code>aws2-ec2:label</code>
         * 
         * Path parameter: label (required)
         * Logical name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path label
         * @return the dsl builder
         */
        default AWS2EC2EndpointBuilder aws2Ec2(String componentName, String path) {
            return AWS2EC2EndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the AWS Elastic Compute Cloud (EC2)
     * component.
     */
    public static class AWS2EC2HeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final AWS2EC2HeaderNameBuilder INSTANCE = new AWS2EC2HeaderNameBuilder();

        /**
         * An image ID of the AWS marketplace.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEC2ImageId}.
         */
        public String awsEC2ImageId() {
            return "AwsEC2ImageId";
        }

        /**
         * The instance type we want to create and run.
         * 
         * The option is a: {@code
         * software.amazon.awssdk.services.ec2.model.InstanceType} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEC2InstanceType}.
         */
        public String awsEC2InstanceType() {
            return "AwsEC2InstanceType";
        }

        /**
         * The operation we want to perform.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEC2Operation}.
         */
        public String awsEC2Operation() {
            return "AwsEC2Operation";
        }

        /**
         * The minimum number of instances we want to run.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEC2InstanceMinCount}.
         */
        public String awsEC2InstanceMinCount() {
            return "AwsEC2InstanceMinCount";
        }

        /**
         * The maximum number of instances we want to run.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEC2InstanceMaxCount}.
         */
        public String awsEC2InstanceMaxCount() {
            return "AwsEC2InstanceMaxCount";
        }

        /**
         * Define if we want the running instances to be monitored.
         * 
         * The option is a: {@code Boolean} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEC2InstanceMonitoring}.
         */
        public String awsEC2InstanceMonitoring() {
            return "AwsEC2InstanceMonitoring";
        }

        /**
         * The ID of the kernel.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEC2InstanceKernelId}.
         */
        public String awsEC2InstanceKernelId() {
            return "AwsEC2InstanceKernelId";
        }

        /**
         * Define if the creating instance is optimized for EBS I/O.
         * 
         * The option is a: {@code Boolean} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEC2InstanceEbsOptimized}.
         */
        public String awsEC2InstanceEbsOptimized() {
            return "AwsEC2InstanceEbsOptimized";
        }

        /**
         * The security groups to associate to the instances.
         * 
         * The option is a: {@code Collection<String>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEC2InstanceSecurityGroups}.
         */
        public String awsEC2InstanceSecurityGroups() {
            return "AwsEC2InstanceSecurityGroups";
        }

        /**
         * A collection of instances IDS to execute start, stop, describe and
         * terminate operations on.
         * 
         * The option is a: {@code Collection<String>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEC2InstancesIds}.
         */
        public String awsEC2InstancesIds() {
            return "AwsEC2InstancesIds";
        }

        /**
         * The name of the key pair.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEC2InstancesKeyPair}.
         */
        public String awsEC2InstancesKeyPair() {
            return "AwsEC2InstancesKeyPair";
        }

        /**
         * Unique, case-sensitive identifier you provide to ensure the
         * idempotency of the request.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEC2InstancesClientToken}.
         */
        public String awsEC2InstancesClientToken() {
            return "AwsEC2InstancesClientToken";
        }

        /**
         * The placement for the instance.
         * 
         * The option is a: {@code
         * software.amazon.awssdk.services.ec2.model.Placement} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEC2InstancesPlacement}.
         */
        public String awsEC2InstancesPlacement() {
            return "AwsEC2InstancesPlacement";
        }

        /**
         * A collection of tags to add or remove from EC2 resources.
         * 
         * The option is a: {@code Collection<Tag>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEC2InstancesTags}.
         */
        public String awsEC2InstancesTags() {
            return "AwsEC2InstancesTags";
        }

        /**
         * The ID of the subnet to launch the instance into.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEC2SubnetId}.
         */
        public String awsEC2SubnetId() {
            return "AwsEC2SubnetId";
        }
    }
    static AWS2EC2EndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class AWS2EC2EndpointBuilderImpl extends AbstractEndpointBuilder implements AWS2EC2EndpointBuilder, AdvancedAWS2EC2EndpointBuilder {
            public AWS2EC2EndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new AWS2EC2EndpointBuilderImpl(path);
    }
}