/**
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

import com.microsoft.windowsazure.Configuration;
import com.microsoft.windowsazure.services.servicebus.ServiceBusConfiguration;
import com.microsoft.windowsazure.services.servicebus.ServiceBusContract;
import com.microsoft.windowsazure.services.servicebus.ServiceBusService;
import com.microsoft.windowsazure.services.servicebus.models.BrokeredMessage;
import org.apache.camel.*;
import org.apache.camel.impl.DefaultEndpoint;
import org.apache.camel.spi.UriEndpoint;
import org.apache.camel.spi.UriParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.HashMap;

@UriEndpoint(scheme = "azure-sb", title = "Azure Service Bus", syntax = "azure-sb:", label = "cloud,messaging")
public abstract class AbstractSbEndpoint extends DefaultEndpoint {

    protected static final Logger LOG = LoggerFactory.getLogger(AbstractSbEndpoint.class);

    @UriParam
    protected SbConfiguration configuration;
    protected ServiceBusContract client;

    public AbstractSbEndpoint(String uri, SbComponent component, SbConfiguration configuration) {
        super(uri, component);
        this.configuration = configuration;
    }

    public ServiceBusContract getClient() {
        if (client == null) {
            client = createClient();
        }

        return client;
    }

    public void setClient(ServiceBusContract client) {
        this.client = client;
    }

    /**
     * Provide the possibility to override this method for an mock implementation
     * @return AmazonSQSClient
     */
    ServiceBusContract createClient() {
        Configuration config = ServiceBusConfiguration.configureWithSASAuthentication(configuration.getNamespace(),
                configuration.getSasKeyName(),
                configuration.getSasKey(),
                configuration.getServiceBusRootUri());

        return ServiceBusService.create(config);
    }

    public SbConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(SbConfiguration configuration) {
        this.configuration = configuration;
    }

    public abstract Consumer createConsumer(Processor processor) throws Exception;

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    protected void doStart() throws Exception {
        client = getConfiguration().getServiceBusContract() != null ? getConfiguration().getServiceBusContract() : getClient();
    }

    @Override
    protected void doStop() throws Exception {
        client = null;
    }


    public Exchange createExchange(BrokeredMessage msg) {
        return createExchange(getExchangePattern(), msg);
    }

    private Exchange createExchange(ExchangePattern pattern, BrokeredMessage msg) {
        Exchange exchange = super.createExchange(pattern);
        Message message = exchange.getIn();
        message.setBody(msg.getBody(), InputStream.class);
        message.setHeaders(new HashMap<>(msg.getProperties()));
        message.setHeader(SbConstants.BROKER_PROPERTIES, msg.getBrokerProperties()); //BrokerProperties included every msg properties
        message.setHeader(SbConstants.MESSAGE_ID, msg.getMessageId());
        message.setHeader(SbConstants.CONTENT_TYPE, SbConstants.DEFAULT_CONTENT_TYPE);  // FIXME: just passing through a content_type is dangerous
        message.setHeader(SbConstants.CORRELATION_ID, msg.getCorrelationId());
        message.setHeader(SbConstants.DATE, msg.getDate());
        message.setHeader(SbConstants.DELIVERY_COUNT, msg.getDeliveryCount());
        message.setHeader(SbConstants.LABEL, msg.getLabel());
        message.setHeader(SbConstants.LOCKED_UNTIL_UTC, msg.getLockedUntilUtc());
        message.setHeader(SbConstants.LOCK_LOCATION, msg.getLockLocation());
        message.setHeader(SbConstants.LOCK_TOKEN, msg.getLockToken());
        message.setHeader(SbConstants.MESSAGE_LOCATION, msg.getMessageLocation());
        message.setHeader(SbConstants.PARTITION_KEY, msg.getPartitionKey());
        message.setHeader(SbConstants.REPLY_TO, msg.getReplyTo());
        message.setHeader(SbConstants.REPLY_TO_SESSION_ID, msg.getReplyToSessionId());
        message.setHeader(SbConstants.SCHEDULED_ENQUEUE_TIME_UTC, msg.getScheduledEnqueueTimeUtc());
        message.setHeader(SbConstants.SEQUENCE_NUMBER, msg.getSequenceNumber());
        message.setHeader(SbConstants.TIME_TO_LIVE, msg.getTimeToLive());
        message.setHeader(SbConstants.SESSION_ID, msg.getSessionId());
        message.setHeader(SbConstants.TO, msg.getTo());
        message.setHeader(SbConstants.VIA_PARTITION_KEY, msg.getViaPartitionKey());

        //Need to apply the SqsHeaderFilterStrategy this time
        return exchange;
    }
}
