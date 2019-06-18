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
 * The aws-ddbstream component is used for working with Amazon DynamoDB Streams.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DdbStreamEndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS DynamoDB Streams component.
     */
    public interface DdbStreamEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedDdbStreamEndpointBuilder advanced() {
            return (AdvancedDdbStreamEndpointBuilder) this;
        }
        /**
         * To define a proxy host when instantiating the DDBStreams client.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default DdbStreamEndpointBuilder proxyHost(String proxyHost) {
            setProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the DDBStreams client.
         * The option is a <code>java.lang.Integer</code> type.
         * @group consumer
         */
        default DdbStreamEndpointBuilder proxyPort(Integer proxyPort) {
            setProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the DDBStreams client.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group consumer
         */
        default DdbStreamEndpointBuilder proxyPort(String proxyPort) {
            setProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The region in which DDBStreams client needs to work.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default DdbStreamEndpointBuilder region(String region) {
            setProperty("region", region);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default DdbStreamEndpointBuilder accessKey(String accessKey) {
            setProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default DdbStreamEndpointBuilder secretKey(String secretKey) {
            setProperty("secretKey", secretKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS DynamoDB Streams component.
     */
    public interface AdvancedDdbStreamEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default DdbStreamEndpointBuilder basic() {
            return (DdbStreamEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDdbStreamEndpointBuilder basicPropertyBinding(
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
        default AdvancedDdbStreamEndpointBuilder basicPropertyBinding(
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
        default AdvancedDdbStreamEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDdbStreamEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>com.amazonaws.services.dynamodbv2.model.ShardIteratorType</code>
     * enum.
     */
    enum ShardIteratorType {
        TRIM_HORIZON,
        LATEST,
        AT_SEQUENCE_NUMBER,
        AFTER_SEQUENCE_NUMBER;
    }
    /**
     * The aws-ddbstream component is used for working with Amazon DynamoDB
     * Streams.
     * Maven coordinates: org.apache.camel:camel-aws-ddb
     */
    default DdbStreamEndpointBuilder ddbStream(String path) {
        class DdbStreamEndpointBuilderImpl extends AbstractEndpointBuilder implements DdbStreamEndpointBuilder, AdvancedDdbStreamEndpointBuilder {
            public DdbStreamEndpointBuilderImpl(String path) {
                super("aws-ddbstream", path);
            }
        }
        return new DdbStreamEndpointBuilderImpl(path);
    }
}