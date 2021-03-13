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
package org.apache.camel.component.file;

import org.apache.camel.Consumer;
import org.apache.camel.ContextTestSupport;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.spi.PollingConsumerPollStrategy;
import org.apache.camel.spi.Registry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for poll strategy
 */
public class FileConsumerPollStrategyTest extends ContextTestSupport {

    private static int counter;
    private static String event = "";

    @Override
    protected Registry createRegistry() throws Exception {
        Registry jndi = super.createRegistry();
        jndi.bind("myPoll", new MyPollStrategy());
        return jndi;
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() throws Exception {
                from(fileUri("?pollStrategy=#myPoll&noop=true&initialDelay=0&delay=10")).convertBodyTo(String.class)
                        .to("mock:result");
            }
        };
    }

    @Test
    public void testFirstPollRollbackThenCommit() throws Exception {
        template.sendBodyAndHeader(fileUri(), "Hello World", Exchange.FILE_NAME, "hello.txt");

        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedMessageCount(1);

        assertMockEndpointsSatisfied();

        oneExchangeDone.matchesWaitTime();

        // give file consumer a bit time
        Thread.sleep(20);

        assertTrue(event.startsWith("rollbackcommit"));
    }

    private static class MyPollStrategy implements PollingConsumerPollStrategy {

        @Override
        public boolean begin(Consumer consumer, Endpoint endpoint) {
            if (counter++ == 0) {
                // simulate an error on first poll
                throw new IllegalArgumentException("Damn I cannot do this");
            }
            return true;
        }

        @Override
        public void commit(Consumer consumer, Endpoint endpoint, int polledMessages) {
            event += "commit";
        }

        @Override
        public boolean rollback(Consumer consumer, Endpoint endpoint, int retryCounter, Exception cause) throws Exception {
            if (cause.getMessage().equals("Damn I cannot do this")) {
                event += "rollback";
            }
            return false;
        }
    }

}
