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
import org.apache.camel.component.azure.eventhubs.EventHubsComponent;

/**
 * The azure-eventhubs component that integrates Azure Event Hubs using AMQP
 * protocol. Azure EventHubs is a highly scalable publish-subscribe service that
 * can ingest millions of events per second and stream them to multiple
 * consumers.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AzureEventhubsComponentBuilderFactory {

    /**
     * Azure Event Hubs (camel-azure-eventhubs)
     * The azure-eventhubs component that integrates Azure Event Hubs using AMQP
     * protocol. Azure EventHubs is a highly scalable publish-subscribe service
     * that can ingest millions of events per second and stream them to multiple
     * consumers.
     * 
     * Category: cloud,messaging
     * Since: 3.5
     * Maven coordinates: org.apache.camel:camel-azure-eventhubs
     * 
     * @return the dsl builder
     */
    static AzureEventhubsComponentBuilder azureEventhubs() {
        return new AzureEventhubsComponentBuilderImpl();
    }

    /**
     * Builder for the Azure Event Hubs component.
     */
    interface AzureEventhubsComponentBuilder
            extends
                ComponentBuilder<EventHubsComponent> {
        /**
         * Sets the retry policy for EventHubAsyncClient. If not specified, the
         * default retry options are used.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.core.amqp.AmqpRetryOptions&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param amqpRetryOptions the value to set
         * @return the dsl builder
         */
        default AzureEventhubsComponentBuilder amqpRetryOptions(
                com.azure.core.amqp.AmqpRetryOptions amqpRetryOptions) {
            doSetProperty("amqpRetryOptions", amqpRetryOptions);
            return this;
        }
        /**
         * Sets the transport type by which all the communication with Azure
         * Event Hubs occurs. Default value is AmqpTransportType#AMQP.
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
        default AzureEventhubsComponentBuilder amqpTransportType(
                com.azure.core.amqp.AmqpTransportType amqpTransportType) {
            doSetProperty("amqpTransportType", amqpTransportType);
            return this;
        }
        /**
         * Setting the autoDiscoverClient mechanism, if true, the component will
         * look for a client instance in the registry automatically otherwise it
         * will skip that checking.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param autoDiscoverClient the value to set
         * @return the dsl builder
         */
        default AzureEventhubsComponentBuilder autoDiscoverClient(
                boolean autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
            return this;
        }
        /**
         * The component configurations.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.azure.eventhubs.EventHubsConfiguration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default AzureEventhubsComponentBuilder configuration(
                org.apache.camel.component.azure.eventhubs.EventHubsConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * In case you chose the default BlobCheckpointStore, this sets access
         * key for the associated azure account name to be used for
         * authentication with azure blob services.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param blobAccessKey the value to set
         * @return the dsl builder
         */
        default AzureEventhubsComponentBuilder blobAccessKey(
                java.lang.String blobAccessKey) {
            doSetProperty("blobAccessKey", blobAccessKey);
            return this;
        }
        /**
         * In case you chose the default BlobCheckpointStore, this sets Azure
         * account name to be used for authentication with azure blob services.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param blobAccountName the value to set
         * @return the dsl builder
         */
        default AzureEventhubsComponentBuilder blobAccountName(
                java.lang.String blobAccountName) {
            doSetProperty("blobAccountName", blobAccountName);
            return this;
        }
        /**
         * In case you chose the default BlobCheckpointStore, this sets the blob
         * container that shall be used by the BlobCheckpointStore to store the
         * checkpoint offsets.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param blobContainerName the value to set
         * @return the dsl builder
         */
        default AzureEventhubsComponentBuilder blobContainerName(
                java.lang.String blobContainerName) {
            doSetProperty("blobContainerName", blobContainerName);
            return this;
        }
        /**
         * In case you chose the default BlobCheckpointStore,
         * StorageSharedKeyCredential can be injected to create the azure
         * client, this holds the important authentication information.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.storage.common.StorageSharedKeyCredential&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param blobStorageSharedKeyCredential the value to set
         * @return the dsl builder
         */
        default AzureEventhubsComponentBuilder blobStorageSharedKeyCredential(
                com.azure.storage.common.StorageSharedKeyCredential blobStorageSharedKeyCredential) {
            doSetProperty("blobStorageSharedKeyCredential", blobStorageSharedKeyCredential);
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
        default AzureEventhubsComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Sets the CheckpointStore the EventProcessorClient will use for
         * storing partition ownership and checkpoint information. Users can,
         * optionally, provide their own implementation of CheckpointStore which
         * will store ownership and checkpoint information. By default it set to
         * use
         * com.azure.messaging.eventhubs.checkpointstore.blob.BlobCheckpointStore which stores all checkpoint offsets into Azure Blob Storage.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.messaging.eventhubs.CheckpointStore&lt;/code&gt; type.
         * 
         * Default: BlobCheckpointStore
         * Group: consumer
         * 
         * @param checkpointStore the value to set
         * @return the dsl builder
         */
        default AzureEventhubsComponentBuilder checkpointStore(
                com.azure.messaging.eventhubs.CheckpointStore checkpointStore) {
            doSetProperty("checkpointStore", checkpointStore);
            return this;
        }
        /**
         * Sets the name of the consumer group this consumer is associated with.
         * Events are read in the context of this group. The name of the
         * consumer group that is created by default is {link
         * #DEFAULT_CONSUMER_GROUP_NAME $Default}.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: $Default
         * Group: consumer
         * 
         * @param consumerGroupName the value to set
         * @return the dsl builder
         */
        default AzureEventhubsComponentBuilder consumerGroupName(
                java.lang.String consumerGroupName) {
            doSetProperty("consumerGroupName", consumerGroupName);
            return this;
        }
        /**
         * Sets the map containing the event position to use for each partition
         * if a checkpoint for the partition does not exist in CheckpointStore.
         * This map is keyed off of the partition id. If there is no checkpoint
         * in CheckpointStore and there is no entry in this map, the processing
         * of the partition will start from {link EventPosition#latest() latest}
         * position.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * com.azure.messaging.eventhubs.models.EventPosition&amp;gt;&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param eventPosition the value to set
         * @return the dsl builder
         */
        default AzureEventhubsComponentBuilder eventPosition(
                java.util.Map<java.lang.String, com.azure.messaging.eventhubs.models.EventPosition> eventPosition) {
            doSetProperty("eventPosition", eventPosition);
            return this;
        }
        /**
         * Sets the count used by the receiver to control the number of events
         * the Event Hub consumer will actively receive and queue locally
         * without regard to whether a receive operation is currently active.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 500
         * Group: consumer
         * 
         * @param prefetchCount the value to set
         * @return the dsl builder
         */
        default AzureEventhubsComponentBuilder prefetchCount(int prefetchCount) {
            doSetProperty("prefetchCount", prefetchCount);
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
        default AzureEventhubsComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Sets the identifier of the Event Hub partition that the events will
         * be sent to. If the identifier is not specified, the Event Hubs
         * service will be responsible for routing events that are sent to an
         * available partition.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param partitionId the value to set
         * @return the dsl builder
         */
        default AzureEventhubsComponentBuilder partitionId(
                java.lang.String partitionId) {
            doSetProperty("partitionId", partitionId);
            return this;
        }
        /**
         * Sets a hashing key to be provided for the batch of events, which
         * instructs the Event Hubs service to map this key to a specific
         * partition. The selection of a partition is stable for a given
         * partition hashing key. Should any other batches of events be sent
         * using the same exact partition hashing key, the Event Hubs service
         * will route them all to the same partition. This should be specified
         * only when there is a need to group events by partition, but there is
         * flexibility into which partition they are routed. If ensuring that a
         * batch of events is sent only to a specific partition, it is
         * recommended that the {link #setPartitionId(String) identifier of the
         * position be specified directly} when sending the batch.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param partitionKey the value to set
         * @return the dsl builder
         */
        default AzureEventhubsComponentBuilder partitionKey(
                java.lang.String partitionKey) {
            doSetProperty("partitionKey", partitionKey);
            return this;
        }
        /**
         * Sets the EventHubProducerAsyncClient.An asynchronous producer
         * responsible for transmitting EventData to a specific Event Hub,
         * grouped together in batches. Depending on the options specified when
         * creating an {linkEventDataBatch}, the events may be automatically
         * routed to an available partition or specific to a partition. Use by
         * this component to produce the data in camel producer.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.messaging.eventhubs.EventHubProducerAsyncClient&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param producerAsyncClient the value to set
         * @return the dsl builder
         */
        default AzureEventhubsComponentBuilder producerAsyncClient(
                com.azure.messaging.eventhubs.EventHubProducerAsyncClient producerAsyncClient) {
            doSetProperty("producerAsyncClient", producerAsyncClient);
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
        default AzureEventhubsComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * Instead of supplying namespace, sharedAccessKey, sharedAccessName ...
         * etc, you can just supply the connection string for your eventHub. The
         * connection string for EventHubs already include all the necessary
         * information to connection to your EventHub. To learn on how to
         * generate the connection string, take a look at this documentation:
         * https://docs.microsoft.com/en-us/azure/event-hubs/event-hubs-get-connection-string.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param connectionString the value to set
         * @return the dsl builder
         */
        default AzureEventhubsComponentBuilder connectionString(
                java.lang.String connectionString) {
            doSetProperty("connectionString", connectionString);
            return this;
        }
        /**
         * The generated value for the SharedAccessName.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sharedAccessKey the value to set
         * @return the dsl builder
         */
        default AzureEventhubsComponentBuilder sharedAccessKey(
                java.lang.String sharedAccessKey) {
            doSetProperty("sharedAccessKey", sharedAccessKey);
            return this;
        }
        /**
         * The name you chose for your EventHubs SAS keys.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sharedAccessName the value to set
         * @return the dsl builder
         */
        default AzureEventhubsComponentBuilder sharedAccessName(
                java.lang.String sharedAccessName) {
            doSetProperty("sharedAccessName", sharedAccessName);
            return this;
        }
    }

    class AzureEventhubsComponentBuilderImpl
            extends
                AbstractComponentBuilder<EventHubsComponent>
            implements
                AzureEventhubsComponentBuilder {
        @Override
        protected EventHubsComponent buildConcreteComponent() {
            return new EventHubsComponent();
        }
        private org.apache.camel.component.azure.eventhubs.EventHubsConfiguration getOrCreateConfiguration(
                org.apache.camel.component.azure.eventhubs.EventHubsComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.azure.eventhubs.EventHubsConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "amqpRetryOptions": getOrCreateConfiguration((EventHubsComponent) component).setAmqpRetryOptions((com.azure.core.amqp.AmqpRetryOptions) value); return true;
            case "amqpTransportType": getOrCreateConfiguration((EventHubsComponent) component).setAmqpTransportType((com.azure.core.amqp.AmqpTransportType) value); return true;
            case "autoDiscoverClient": getOrCreateConfiguration((EventHubsComponent) component).setAutoDiscoverClient((boolean) value); return true;
            case "configuration": ((EventHubsComponent) component).setConfiguration((org.apache.camel.component.azure.eventhubs.EventHubsConfiguration) value); return true;
            case "blobAccessKey": getOrCreateConfiguration((EventHubsComponent) component).setBlobAccessKey((java.lang.String) value); return true;
            case "blobAccountName": getOrCreateConfiguration((EventHubsComponent) component).setBlobAccountName((java.lang.String) value); return true;
            case "blobContainerName": getOrCreateConfiguration((EventHubsComponent) component).setBlobContainerName((java.lang.String) value); return true;
            case "blobStorageSharedKeyCredential": getOrCreateConfiguration((EventHubsComponent) component).setBlobStorageSharedKeyCredential((com.azure.storage.common.StorageSharedKeyCredential) value); return true;
            case "bridgeErrorHandler": ((EventHubsComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "checkpointStore": getOrCreateConfiguration((EventHubsComponent) component).setCheckpointStore((com.azure.messaging.eventhubs.CheckpointStore) value); return true;
            case "consumerGroupName": getOrCreateConfiguration((EventHubsComponent) component).setConsumerGroupName((java.lang.String) value); return true;
            case "eventPosition": getOrCreateConfiguration((EventHubsComponent) component).setEventPosition((java.util.Map) value); return true;
            case "prefetchCount": getOrCreateConfiguration((EventHubsComponent) component).setPrefetchCount((int) value); return true;
            case "lazyStartProducer": ((EventHubsComponent) component).setLazyStartProducer((boolean) value); return true;
            case "partitionId": getOrCreateConfiguration((EventHubsComponent) component).setPartitionId((java.lang.String) value); return true;
            case "partitionKey": getOrCreateConfiguration((EventHubsComponent) component).setPartitionKey((java.lang.String) value); return true;
            case "producerAsyncClient": getOrCreateConfiguration((EventHubsComponent) component).setProducerAsyncClient((com.azure.messaging.eventhubs.EventHubProducerAsyncClient) value); return true;
            case "autowiredEnabled": ((EventHubsComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "connectionString": getOrCreateConfiguration((EventHubsComponent) component).setConnectionString((java.lang.String) value); return true;
            case "sharedAccessKey": getOrCreateConfiguration((EventHubsComponent) component).setSharedAccessKey((java.lang.String) value); return true;
            case "sharedAccessName": getOrCreateConfiguration((EventHubsComponent) component).setSharedAccessName((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}