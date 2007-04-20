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
package org.apache.camel.processor;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.Exchange;
import org.apache.camel.Endpoint;
import org.apache.camel.Processor;
import org.apache.camel.Message;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import static org.apache.camel.component.mock.MockEndpoint.assertIsSatisfied;

/**
 * @version $Revision: 1.1 $
 */
public class MulticastTest extends ContextTestSupport {
    protected Endpoint<Exchange> startEndpoint;
    protected MockEndpoint x, y, z;

    public void testSendingAMessageUsingMulticastReceivesItsOwnExchange() throws Exception {
        x.expectedBodiesReceived("input+output");
        y.expectedBodiesReceived("input+output");
        z.expectedBodiesReceived("input+output");

        client.send("direct:a", new Processor<Exchange>() {
            public void process(Exchange exchange) {
                Message in = exchange.getIn();
                in.setBody("input");
                in.setHeader("foo", "bar");
            }
        });

        assertIsSatisfied(x, y, z);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        x = (MockEndpoint) resolveMandatoryEndpoint(context, "mock:x");
        y = (MockEndpoint) resolveMandatoryEndpoint(context, "mock:y");
        z = (MockEndpoint) resolveMandatoryEndpoint(context, "mock:z");
    }

    protected RouteBuilder createRouteBuilder() {
        final Processor<Exchange> processor = new Processor<Exchange>() {
            public void process(Exchange exchange) {
                // lets transform the IN message
                Message in = exchange.getIn();
                String body = in.getBody(String.class);
                in.setBody(body + "+output");
            }
        };

        return new RouteBuilder<Exchange>() {
            public void configure() {
                from("direct:a").to("direct:x", "direct:y", "direct:z");

                from("direct:x").process(processor).to("mock:x");
                from("direct:y").process(processor).to("mock:y");
                from("direct:z").process(processor).to("mock:z");
            }
        };

    }

}
