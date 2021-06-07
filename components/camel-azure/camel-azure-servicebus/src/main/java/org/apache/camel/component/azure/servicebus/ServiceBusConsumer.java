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
package org.apache.camel.component.azure.servicebus;

import org.apache.camel.Processor;
import org.apache.camel.support.DefaultConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceBusConsumer extends DefaultConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(ServiceBusConsumer.class);

    public ServiceBusConsumer(final ServiceBusEndpoint endpoint, final Processor processor) {
        super(endpoint, processor);
    }

    @Override
    protected void doStart() throws Exception {
        super.doStart();

        // create the client

        // start the client but we will rely on the Azure Client Scheduler for thread management
    }

    @Override
    protected void doStop() throws Exception {
        /*
        if (processorClient != null) {
            // shutdown the client
            processorClient.stop();
        }
         */
        // shutdown camel consumer
        super.doStop();
    }

    public ServiceBusConfiguration getConfiguration() {
        return getEndpoint().getConfiguration();
    }

    @Override
    public ServiceBusEndpoint getEndpoint() {
        return (ServiceBusEndpoint) super.getEndpoint();
    }

    /*
    private Exchange createAzureEventHubExchange(final EventContext eventContext) {
        final Exchange exchange = createExchange(true);
        final Message message = exchange.getIn();
    
        // set body as byte[] and let camel typeConverters do the job to convert
        message.setBody(eventContext.getEventData().getBody());
        // set headers
        message.setHeader(EventHubsConstants.PARTITION_ID, eventContext.getPartitionContext().getPartitionId());
        message.setHeader(EventHubsConstants.PARTITION_KEY, eventContext.getEventData().getPartitionKey());
        message.setHeader(EventHubsConstants.OFFSET, eventContext.getEventData().getOffset());
        message.setHeader(EventHubsConstants.ENQUEUED_TIME, eventContext.getEventData().getEnqueuedTime());
        message.setHeader(EventHubsConstants.SEQUENCE_NUMBER, eventContext.getEventData().getSequenceNumber());
    
        return exchange;
    }
    
    private Exchange createAzureEventHubExchange(final ErrorContext errorContext) {
        final Exchange exchange = createExchange(true);
        final Message message = exchange.getIn();
    
        // set headers
        message.setHeader(EventHubsConstants.PARTITION_ID, errorContext.getPartitionContext().getPartitionId());
    
        // set exception
        exchange.setException(errorContext.getThrowable());
    
        return exchange;
    }
    
    private void onEventListener(final EventContext eventContext) {
        final Exchange exchange = createAzureEventHubExchange(eventContext);
    
        // add exchange callback
        exchange.adapt(ExtendedExchange.class).addOnCompletion(new Synchronization() {
            @Override
            public void onComplete(Exchange exchange) {
                // we update the consumer offsets
                processCommit(exchange, eventContext);
            }
    
            @Override
            public void onFailure(Exchange exchange) {
                // we do nothing here
                processRollback(exchange);
            }
        });
        // use default consumer callback
        AsyncCallback cb = defaultConsumerCallback(exchange, true);
        getAsyncProcessor().process(exchange, cb);
    }
    
    private void onErrorListener(final ErrorContext errorContext) {
        final Exchange exchange = createAzureEventHubExchange(errorContext);
    
        // log exception if an exception occurred and was not handled
        if (exchange.getException() != null) {
            getExceptionHandler().handleException("Error processing exchange", exchange,
                    exchange.getException());
        }
    }
    
     */

    /**
     * Strategy to commit the offset after message being processed successfully.
     *
     * @param exchange the exchange
     */
    /*
    private void processCommit(final Exchange exchange, final EventContext eventContext) {
        try {
            eventContext.updateCheckpoint();
        } catch (Exception ex) {
            getExceptionHandler().handleException("Error occurred during updating the checkpoint. This exception is ignored.",
                    exchange, ex);
        }
    }
     */

    /**
     * Strategy when processing the exchange failed.
     *
     * @param exchange the exchange
     */
    /*
    private void processRollback(Exchange exchange) {
        final Exception cause = exchange.getException();
        if (cause != null) {
            getExceptionHandler().handleException("Error during processing exchange.", exchange, cause);
        }
    }
    
     */
}
