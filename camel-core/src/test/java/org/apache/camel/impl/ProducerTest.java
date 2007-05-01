/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.impl;

import junit.framework.TestCase;
import org.apache.camel.TestSupport;
import org.apache.camel.Endpoint;
import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.Exchange;
import org.apache.camel.CamelContext;

/**
 * @version $Revision: 1.1 $
 */
public class ProducerTest extends TestSupport {
    private CamelContext context = new DefaultCamelContext();

    public void testUsingADerivedExchange() throws Exception {
        Endpoint<MyExchange> endpoint = new DefaultEndpoint<MyExchange>("foo", new DefaultComponent()) {
            public Consumer<MyExchange> createConsumer(Processor processor) throws Exception {
                return null;
            }

            public MyExchange createExchange() {
                return new MyExchange(getContext());
            }

            public Producer<MyExchange> createProducer() throws Exception {
                return null;
            }

            public boolean isSingleton() {
                return false;
            }
        };

        DefaultProducer producer = new DefaultProducer(endpoint) {
            public void process(Exchange exchange) throws Exception {
                log.info("Received: " + exchange);
            }
        };

        // now lets try send in a normal exchange
        Exchange exchange = new DefaultExchange(context);
        producer.process(exchange);
    }
}
