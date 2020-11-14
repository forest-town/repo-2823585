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
 * Manage AWS MQ instances using AWS SDK version 2.x.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MQ2EndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS 2 MQ component.
     */
    public interface MQ2EndpointBuilder extends EndpointProducerBuilder {
        default AdvancedMQ2EndpointBuilder advanced() {
            return (AdvancedMQ2EndpointBuilder) this;
        }
        /**
         * To use a existing configured AmazonMQClient as client.
         * 
         * The option is a:
         * <code>software.amazon.awssdk.services.mq.MqClient</code> type.
         * 
         * Group: producer
         */
        default MQ2EndpointBuilder amazonMqClient(Object amazonMqClient) {
            doSetProperty("amazonMqClient", amazonMqClient);
            return this;
        }
        /**
         * To use a existing configured AmazonMQClient as client.
         * 
         * The option will be converted to a
         * <code>software.amazon.awssdk.services.mq.MqClient</code> type.
         * 
         * Group: producer
         */
        default MQ2EndpointBuilder amazonMqClient(String amazonMqClient) {
            doSetProperty("amazonMqClient", amazonMqClient);
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
        default MQ2EndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default MQ2EndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to perform. It can be
         * listBrokers,createBroker,deleteBroker.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.mq.MQ2Operations</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default MQ2EndpointBuilder operation(MQ2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to perform. It can be
         * listBrokers,createBroker,deleteBroker.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.aws2.mq.MQ2Operations</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default MQ2EndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MQ2EndpointBuilder pojoRequest(boolean pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MQ2EndpointBuilder pojoRequest(String pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * To define a proxy host when instantiating the MQ client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default MQ2EndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the MQ client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default MQ2EndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the MQ client.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default MQ2EndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the MQ client.
         * 
         * The option is a: <code>software.amazon.awssdk.core.Protocol</code>
         * type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default MQ2EndpointBuilder proxyProtocol(Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the MQ client.
         * 
         * The option will be converted to a
         * <code>software.amazon.awssdk.core.Protocol</code> type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default MQ2EndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which MQ client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default MQ2EndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MQ2EndpointBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MQ2EndpointBuilder trustAllCertificates(
                String trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default MQ2EndpointBuilder accessKey(String accessKey) {
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
        default MQ2EndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS 2 MQ component.
     */
    public interface AdvancedMQ2EndpointBuilder
            extends
                EndpointProducerBuilder {
        default MQ2EndpointBuilder basic() {
            return (MQ2EndpointBuilder) this;
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
        default AdvancedMQ2EndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedMQ2EndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.aws2.mq.MQ2Operations</code> enum.
     */
    enum MQ2Operations {
        listBrokers,
        createBroker,
        deleteBroker,
        rebootBroker,
        updateBroker,
        describeBroker;
    }

    /**
     * Proxy enum for <code>software.amazon.awssdk.core.Protocol</code> enum.
     */
    enum Protocol {
        HTTP,
        HTTPS;
    }

    public interface MQ2Builders {
        /**
         * AWS 2 MQ (camel-aws2-mq)
         * Manage AWS MQ instances using AWS SDK version 2.x.
         * 
         * Category: cloud,messaging
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-aws2-mq
         * 
         * Syntax: <code>aws2-mq:label</code>
         * 
         * Path parameter: label (required)
         * Logical name
         * 
         * @param path label
         */
        default MQ2EndpointBuilder aws2Mq(String path) {
            return MQ2EndpointBuilderFactory.endpointBuilder("aws2-mq", path);
        }
        /**
         * AWS 2 MQ (camel-aws2-mq)
         * Manage AWS MQ instances using AWS SDK version 2.x.
         * 
         * Category: cloud,messaging
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-aws2-mq
         * 
         * Syntax: <code>aws2-mq:label</code>
         * 
         * Path parameter: label (required)
         * Logical name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path label
         */
        default MQ2EndpointBuilder aws2Mq(String componentName, String path) {
            return MQ2EndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static MQ2EndpointBuilder endpointBuilder(String componentName, String path) {
        class MQ2EndpointBuilderImpl extends AbstractEndpointBuilder implements MQ2EndpointBuilder, AdvancedMQ2EndpointBuilder {
            public MQ2EndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new MQ2EndpointBuilderImpl(path);
    }
}