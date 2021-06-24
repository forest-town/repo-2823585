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

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.azure.servicebus.ServiceBusComponent;

/**
 * The azure-servicebus component that integrates Azure ServiceBus. Azure
 * ServiceBus is a fully managed enterprise integration message broker. Service
 * Bus can decouple applications and services. Service Bus offers a reliable and
 * secure platform for asynchronous transfer of data and state. Data is
 * transferred between different applications and services using messages.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AzureServicebusComponentBuilderFactory {

    /**
     * Azure ServiceBus (camel-azure-servicebus)
     * The azure-servicebus component that integrates Azure ServiceBus. Azure
     * ServiceBus is a fully managed enterprise integration message broker.
     * Service Bus can decouple applications and services. Service Bus offers a
     * reliable and secure platform for asynchronous transfer of data and state.
     * Data is transferred between different applications and services using
     * messages.
     * 
     * Category: cloud,messaging
     * Since: 3.11
     * Maven coordinates: org.apache.camel:camel-azure-servicebus
     * 
     * @return the dsl builder
     */
    static AzureServicebusComponentBuilder azureServicebus() {
        return new AzureServicebusComponentBuilderImpl();
    }

    /**
     * Builder for the Azure ServiceBus component.
     */
    interface AzureServicebusComponentBuilder
            extends
                ComponentBuilder<ServiceBusComponent> {
        /**
         * dd.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.core.amqp.AmqpRetryOptions&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param amqpRetryOptions the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder amqpRetryOptions(
                com.azure.core.amqp.AmqpRetryOptions amqpRetryOptions) {
            doSetProperty("amqpRetryOptions", amqpRetryOptions);
            return this;
        }
        /**
         * dd.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.core.amqp.AmqpTransportType&lt;/code&gt; type.
         * 
         * Default: AMQP
         * Group: common
         * 
         * @param amqpTransportType the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder amqpTransportType(
                com.azure.core.amqp.AmqpTransportType amqpTransportType) {
            doSetProperty("amqpTransportType", amqpTransportType);
            return this;
        }
        /**
         * dd.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.core.util.ClientOptions&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param clientOptions the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder clientOptions(
                com.azure.core.util.ClientOptions clientOptions) {
            doSetProperty("clientOptions", clientOptions);
            return this;
        }
        /**
         * The component configurations.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.azure.servicebus.ServiceBusConfiguration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder configuration(
                org.apache.camel.component.azure.servicebus.ServiceBusConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * dd.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.core.amqp.ProxyOptions&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param proxyOptions the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder proxyOptions(
                com.azure.core.amqp.ProxyOptions proxyOptions) {
            doSetProperty("proxyOptions", proxyOptions);
            return this;
        }
        /**
         * d.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.azure.servicebus.ServiceBusType&lt;/code&gt; type.
         * 
         * Default: queue
         * Group: common
         * 
         * @param serviceBusType the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder serviceBusType(
                org.apache.camel.component.azure.servicebus.ServiceBusType serviceBusType) {
            doSetProperty("serviceBusType", serviceBusType);
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
        default AzureServicebusComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * dd.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param disableAutoComplete the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder disableAutoComplete(
                boolean disableAutoComplete) {
            doSetProperty("disableAutoComplete", disableAutoComplete);
            return this;
        }
        /**
         * dd.
         * 
         * The option is a: &lt;code&gt;java.time.Duration&lt;/code&gt; type.
         * 
         * Default: 5min
         * Group: consumer
         * 
         * @param maxAutoLockRenewDuration the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder maxAutoLockRenewDuration(
                java.time.Duration maxAutoLockRenewDuration) {
            doSetProperty("maxAutoLockRenewDuration", maxAutoLockRenewDuration);
            return this;
        }
        /**
         * dd.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 0
         * Group: consumer
         * 
         * @param prefetchCount the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder prefetchCount(int prefetchCount) {
            doSetProperty("prefetchCount", prefetchCount);
            return this;
        }
        /**
         * dd.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param receiverAsyncClient the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder receiverAsyncClient(
                com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient receiverAsyncClient) {
            doSetProperty("receiverAsyncClient", receiverAsyncClient);
            return this;
        }
        /**
         * dd.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.messaging.servicebus.models.ServiceBusReceiveMode&lt;/code&gt; type.
         * 
         * Default: PEER_LOCK
         * Group: consumer
         * 
         * @param serviceBusReceiveMode the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder serviceBusReceiveMode(
                com.azure.messaging.servicebus.models.ServiceBusReceiveMode serviceBusReceiveMode) {
            doSetProperty("serviceBusReceiveMode", serviceBusReceiveMode);
            return this;
        }
        /**
         * dd.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.messaging.servicebus.models.SubQueue&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param subQueue the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder subQueue(
                com.azure.messaging.servicebus.models.SubQueue subQueue) {
            doSetProperty("subQueue", subQueue);
            return this;
        }
        /**
         * d.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param subscriptionName the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder subscriptionName(
                java.lang.String subscriptionName) {
            doSetProperty("subscriptionName", subscriptionName);
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
        default AzureServicebusComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * dd.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.messaging.servicebus.ServiceBusSenderAsyncClient&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param senderAsyncClient the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder senderAsyncClient(
                com.azure.messaging.servicebus.ServiceBusSenderAsyncClient senderAsyncClient) {
            doSetProperty("senderAsyncClient", senderAsyncClient);
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
        default AzureServicebusComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * d.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param connectionString the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder connectionString(
                java.lang.String connectionString) {
            doSetProperty("connectionString", connectionString);
            return this;
        }
    }

    class AzureServicebusComponentBuilderImpl
            extends
                AbstractComponentBuilder<ServiceBusComponent>
            implements
                AzureServicebusComponentBuilder {
        @Override
        protected ServiceBusComponent buildConcreteComponent() {
            return new ServiceBusComponent();
        }
        private org.apache.camel.component.azure.servicebus.ServiceBusConfiguration getOrCreateConfiguration(
                org.apache.camel.component.azure.servicebus.ServiceBusComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.azure.servicebus.ServiceBusConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "amqpRetryOptions": getOrCreateConfiguration((ServiceBusComponent) component).setAmqpRetryOptions((com.azure.core.amqp.AmqpRetryOptions) value); return true;
            case "amqpTransportType": getOrCreateConfiguration((ServiceBusComponent) component).setAmqpTransportType((com.azure.core.amqp.AmqpTransportType) value); return true;
            case "clientOptions": getOrCreateConfiguration((ServiceBusComponent) component).setClientOptions((com.azure.core.util.ClientOptions) value); return true;
            case "configuration": ((ServiceBusComponent) component).setConfiguration((org.apache.camel.component.azure.servicebus.ServiceBusConfiguration) value); return true;
            case "proxyOptions": getOrCreateConfiguration((ServiceBusComponent) component).setProxyOptions((com.azure.core.amqp.ProxyOptions) value); return true;
            case "serviceBusType": getOrCreateConfiguration((ServiceBusComponent) component).setServiceBusType((org.apache.camel.component.azure.servicebus.ServiceBusType) value); return true;
            case "bridgeErrorHandler": ((ServiceBusComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "disableAutoComplete": getOrCreateConfiguration((ServiceBusComponent) component).setDisableAutoComplete((boolean) value); return true;
            case "maxAutoLockRenewDuration": getOrCreateConfiguration((ServiceBusComponent) component).setMaxAutoLockRenewDuration((java.time.Duration) value); return true;
            case "prefetchCount": getOrCreateConfiguration((ServiceBusComponent) component).setPrefetchCount((int) value); return true;
            case "receiverAsyncClient": getOrCreateConfiguration((ServiceBusComponent) component).setReceiverAsyncClient((com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient) value); return true;
            case "serviceBusReceiveMode": getOrCreateConfiguration((ServiceBusComponent) component).setServiceBusReceiveMode((com.azure.messaging.servicebus.models.ServiceBusReceiveMode) value); return true;
            case "subQueue": getOrCreateConfiguration((ServiceBusComponent) component).setSubQueue((com.azure.messaging.servicebus.models.SubQueue) value); return true;
            case "subscriptionName": getOrCreateConfiguration((ServiceBusComponent) component).setSubscriptionName((java.lang.String) value); return true;
            case "lazyStartProducer": ((ServiceBusComponent) component).setLazyStartProducer((boolean) value); return true;
            case "senderAsyncClient": getOrCreateConfiguration((ServiceBusComponent) component).setSenderAsyncClient((com.azure.messaging.servicebus.ServiceBusSenderAsyncClient) value); return true;
            case "autowiredEnabled": ((ServiceBusComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "connectionString": getOrCreateConfiguration((ServiceBusComponent) component).setConnectionString((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}