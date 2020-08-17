/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.azure.eventhubs;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class EventHubsEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        EventHubsEndpoint target = (EventHubsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "amqpretryoptions":
        case "amqpRetryOptions": target.getConfiguration().setAmqpRetryOptions(property(camelContext, com.azure.core.amqp.AmqpRetryOptions.class, value)); return true;
        case "amqptransporttype":
        case "amqpTransportType": target.getConfiguration().setAmqpTransportType(property(camelContext, com.azure.core.amqp.AmqpTransportType.class, value)); return true;
        case "autodiscoverclient":
        case "autoDiscoverClient": target.getConfiguration().setAutoDiscoverClient(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "blobaccesskey":
        case "blobAccessKey": target.getConfiguration().setBlobAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "blobaccountname":
        case "blobAccountName": target.getConfiguration().setBlobAccountName(property(camelContext, java.lang.String.class, value)); return true;
        case "blobcontainername":
        case "blobContainerName": target.getConfiguration().setBlobContainerName(property(camelContext, java.lang.String.class, value)); return true;
        case "blobstoragesharedkeycredential":
        case "blobStorageSharedKeyCredential": target.getConfiguration().setBlobStorageSharedKeyCredential(property(camelContext, com.azure.storage.common.StorageSharedKeyCredential.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "checkpointstore":
        case "checkpointStore": target.getConfiguration().setCheckpointStore(property(camelContext, com.azure.messaging.eventhubs.CheckpointStore.class, value)); return true;
        case "connectionstring":
        case "connectionString": target.getConfiguration().setConnectionString(property(camelContext, java.lang.String.class, value)); return true;
        case "consumergroupname":
        case "consumerGroupName": target.getConfiguration().setConsumerGroupName(property(camelContext, java.lang.String.class, value)); return true;
        case "eventposition":
        case "eventPosition": target.getConfiguration().setEventPosition(property(camelContext, java.util.Map.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "partitionid":
        case "partitionId": target.getConfiguration().setPartitionId(property(camelContext, java.lang.String.class, value)); return true;
        case "partitionkey":
        case "partitionKey": target.getConfiguration().setPartitionKey(property(camelContext, java.lang.String.class, value)); return true;
        case "prefetchcount":
        case "prefetchCount": target.getConfiguration().setPrefetchCount(property(camelContext, int.class, value)); return true;
        case "producerasyncclient":
        case "producerAsyncClient": target.getConfiguration().setProducerAsyncClient(property(camelContext, com.azure.messaging.eventhubs.EventHubProducerAsyncClient.class, value)); return true;
        case "sharedaccesskey":
        case "sharedAccessKey": target.getConfiguration().setSharedAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "sharedaccessname":
        case "sharedAccessName": target.getConfiguration().setSharedAccessName(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("amqpRetryOptions", com.azure.core.amqp.AmqpRetryOptions.class);
        answer.put("amqpTransportType", com.azure.core.amqp.AmqpTransportType.class);
        answer.put("autoDiscoverClient", boolean.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("blobAccessKey", java.lang.String.class);
        answer.put("blobAccountName", java.lang.String.class);
        answer.put("blobContainerName", java.lang.String.class);
        answer.put("blobStorageSharedKeyCredential", com.azure.storage.common.StorageSharedKeyCredential.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("checkpointStore", com.azure.messaging.eventhubs.CheckpointStore.class);
        answer.put("connectionString", java.lang.String.class);
        answer.put("consumerGroupName", java.lang.String.class);
        answer.put("eventPosition", java.util.Map.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("partitionId", java.lang.String.class);
        answer.put("partitionKey", java.lang.String.class);
        answer.put("prefetchCount", int.class);
        answer.put("producerAsyncClient", com.azure.messaging.eventhubs.EventHubProducerAsyncClient.class);
        answer.put("sharedAccessKey", java.lang.String.class);
        answer.put("sharedAccessName", java.lang.String.class);
        answer.put("synchronous", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        EventHubsEndpoint target = (EventHubsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "amqpretryoptions":
        case "amqpRetryOptions": return target.getConfiguration().getAmqpRetryOptions();
        case "amqptransporttype":
        case "amqpTransportType": return target.getConfiguration().getAmqpTransportType();
        case "autodiscoverclient":
        case "autoDiscoverClient": return target.getConfiguration().isAutoDiscoverClient();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "blobaccesskey":
        case "blobAccessKey": return target.getConfiguration().getBlobAccessKey();
        case "blobaccountname":
        case "blobAccountName": return target.getConfiguration().getBlobAccountName();
        case "blobcontainername":
        case "blobContainerName": return target.getConfiguration().getBlobContainerName();
        case "blobstoragesharedkeycredential":
        case "blobStorageSharedKeyCredential": return target.getConfiguration().getBlobStorageSharedKeyCredential();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "checkpointstore":
        case "checkpointStore": return target.getConfiguration().getCheckpointStore();
        case "connectionstring":
        case "connectionString": return target.getConfiguration().getConnectionString();
        case "consumergroupname":
        case "consumerGroupName": return target.getConfiguration().getConsumerGroupName();
        case "eventposition":
        case "eventPosition": return target.getConfiguration().getEventPosition();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "partitionid":
        case "partitionId": return target.getConfiguration().getPartitionId();
        case "partitionkey":
        case "partitionKey": return target.getConfiguration().getPartitionKey();
        case "prefetchcount":
        case "prefetchCount": return target.getConfiguration().getPrefetchCount();
        case "producerasyncclient":
        case "producerAsyncClient": return target.getConfiguration().getProducerAsyncClient();
        case "sharedaccesskey":
        case "sharedAccessKey": return target.getConfiguration().getSharedAccessKey();
        case "sharedaccessname":
        case "sharedAccessName": return target.getConfiguration().getSharedAccessName();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}

