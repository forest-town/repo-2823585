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
package org.apache.camel.component.kudu;

import java.util.List;
import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.support.ScheduledPollConsumer;

/**
 * The Kudu consumer.
 *
 * @see org.apache.camel.support.ScheduledPollConsumer
 * @see org.apache.camel.component.kudu.KuduEndpoint
 */
public class KuduConsumer extends ScheduledPollConsumer {
    private final KuduEndpoint endpoint;

    public KuduConsumer(KuduEndpoint endpoint, Processor processor) {
        super(endpoint, processor);
        this.endpoint = endpoint;
    }

    @Override
    protected int poll() throws Exception {
        Exchange exchange = endpoint.createExchange();

        // create a message body
        List<Map<String, Object>> body = KuduUtils.doScan(endpoint.getTableName(), endpoint.getKuduClient());
        exchange.getIn().setBody(body);

        // send message to next processor in the route
        getProcessor().process(exchange);
        return 1; // number of messages polled

    }
}
