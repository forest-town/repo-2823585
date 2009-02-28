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
package org.apache.camel.processor;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;

/**
 * Unit test for shutting down whil DLC is sleeping in a redelivery.
 */
public class DeadLetterChannelRedeliveringWhileShutdownTest extends ContextTestSupport {

    public void testDLCRedelivery() throws Exception {
        long start = System.currentTimeMillis();

        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedBodiesReceived("Hello World");

        // send a message that causes redeliveries
        template.sendBody("seda:damm", "Damm World");
        template.sendBody("direct:start", "Hello World");

        assertMockEndpointsSatisfied();

        long delta = System.currentTimeMillis() - start;
        assertTrue("Should be faster than: " + delta, delta < 2500);
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                errorHandler(deadLetterChannel("mock:error").maximumRedeliveries(2).delay(5000));

                from("direct:start").delay(500).to("mock:result");

                from("seda:damm").process(new Processor() {
                    public void process(Exchange exchange) throws Exception {
                        throw new IllegalArgumentException("Damm");
                    }
                });
            }
        };
    }
}