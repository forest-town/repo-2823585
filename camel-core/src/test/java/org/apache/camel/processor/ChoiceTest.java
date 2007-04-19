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
package org.apache.camel.processor;

import static org.apache.camel.component.mock.MockEndpoint.assertIsSatisfied;
import static org.apache.camel.component.mock.MockEndpoint.expectsMessageCount;
import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.TestSupport;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.component.queue.QueueEndpoint;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.util.ProducerCache;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.BlockingQueue;

/**
 * @version $Revision: 1.1 $
 */
public class ChoiceTest extends TestSupport {
    protected CamelContext context = new DefaultCamelContext();
    protected ProducerCache<Exchange> client = new ProducerCache<Exchange>();
    protected Endpoint<Exchange> startEndpoint;
    protected MockEndpoint x, y, z;

    public void testSendToFirstWhen() throws Exception {
        x.expectedBodiesReceived("one");
        expectsMessageCount(0, y, z);

        sendMessage("bar", "one");

        assertIsSatisfied(x, y, z);
    }

    public void testSendToSecondWhen() throws Exception {
        y.expectedBodiesReceived("two");
        expectsMessageCount(0, x, z);

        sendMessage("cheese", "two");

        assertIsSatisfied(x, y, z);
    }

    public void testSendToOtherwiseClause() throws Exception {
        z.expectedBodiesReceived("three");
        expectsMessageCount(0, x, y);

        sendMessage("somethingUndefined", "three");

        assertIsSatisfied(x, y, z);
    }

    protected void sendMessage(final Object headerValue, final Object body) throws Exception {
        client.send(startEndpoint, new Processor<Exchange>() {
            public void process(Exchange exchange) {
                // now lets fire in a message
                Message in = exchange.getIn();
                in.setBody(body);
                in.setHeader("foo", headerValue);
            }
        });
    }

    @Override
    protected void setUp() throws Exception {
        context.addRoutes(createRouteBuilder());

        startEndpoint = resolveMandatoryEndpoint(context, "queue:a");

        x = (MockEndpoint) resolveMandatoryEndpoint(context, "mock:x");
        y = (MockEndpoint) resolveMandatoryEndpoint(context, "mock:y");
        z = (MockEndpoint) resolveMandatoryEndpoint(context, "mock:z");

        context.start();
    }

    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder<Exchange>() {
            public void configure() {
                from("queue:a").choice()
                        .when(header("foo").isEqualTo("bar")).to("mock:x")
                        .when(header("foo").isEqualTo("cheese")).to("mock:y")
                        .otherwise().to("mock:z");
            }
        };
    }

    @Override
    protected void tearDown() throws Exception {
        client.stop();
        context.stop();
    }
}
