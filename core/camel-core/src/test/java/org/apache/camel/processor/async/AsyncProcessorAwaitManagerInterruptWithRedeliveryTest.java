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
package org.apache.camel.processor.async;

import java.util.Collection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

import org.apache.camel.CamelExecutionException;
import org.apache.camel.ContextTestSupport;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spi.AsyncProcessorAwaitManager;
import org.apache.camel.spi.Registry;
import org.apache.camel.support.PluginHelper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Isolated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@Isolated
public class AsyncProcessorAwaitManagerInterruptWithRedeliveryTest extends ContextTestSupport {
    private static final Logger LOG = LoggerFactory.getLogger(AsyncProcessorAwaitManagerInterruptWithRedeliveryTest.class);

    private CountDownLatch latch;
    private MyBean bean;

    @Override
    @BeforeEach
    public void setUp() throws Exception {
        latch = new CountDownLatch(2);
        bean = spy(new MyBean(latch));
        super.setUp();
    }

    @Test
    public void testAsyncAwaitInterrupt() throws Exception {
        final AsyncProcessorAwaitManager asyncProcessorAwaitManager = PluginHelper.getAsyncProcessorAwaitManager(context);
        asyncProcessorAwaitManager.getStatistics().setStatisticsEnabled(true);

        assertEquals(0, asyncProcessorAwaitManager.size());

        getMockEndpoint("mock:before").expectedBodiesReceived("Hello Camel");
        getMockEndpoint("mock:result").expectedMessageCount(0);
        getMockEndpoint("mock:error").expectedMessageCount(0);

        createThreadToInterrupt();
        try {
            template.sendBody("direct:start", "Hello Camel");
            fail("Should throw exception");
        } catch (CamelExecutionException e) {
            RejectedExecutionException cause = assertIsInstanceOf(RejectedExecutionException.class, e.getCause());
            assertTrue(cause.getMessage().startsWith("Interrupted while waiting for asynchronous callback"));
        }

        assertMockEndpointsSatisfied();

        // Check we have not reached the full 5 re-deliveries
        verify(bean, atMost(4)).callMe();

        assertEquals(0, asyncProcessorAwaitManager.size());
        assertEquals(1,
                asyncProcessorAwaitManager.getStatistics().getThreadsBlocked());
        assertEquals(1, asyncProcessorAwaitManager.getStatistics()
                .getThreadsInterrupted());
    }

    private void createThreadToInterrupt() {
        new Thread(() -> {
            // Allow some time for camel exchange to enter the re-deliveries
            try {
                latch.await(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                LOG.info("The test execution was interrupted", e);
            }

            // Get our blocked thread
            final AsyncProcessorAwaitManager asyncProcessorAwaitManager = PluginHelper.getAsyncProcessorAwaitManager(context);
            int size = asyncProcessorAwaitManager.size();
            assertEquals(1, size);

            Collection<AsyncProcessorAwaitManager.AwaitThread> threads
                    = asyncProcessorAwaitManager.browse();
            AsyncProcessorAwaitManager.AwaitThread thread = threads.iterator().next();

            // Interrupt it
            String id = thread.getExchange().getExchangeId();
            asyncProcessorAwaitManager.interrupt(id);
        }).start();
    }

    @Override
    protected Registry createRegistry() throws Exception {
        Registry answer = super.createRegistry();
        answer.bind("myBean", bean);
        return answer;
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() {
                // redelivery delay should not be too fast as tested on slower CI servers can cause test to fail
                errorHandler(
                        deadLetterChannel("mock:error").maximumRedeliveries(5).redeliveryDelay(500).asyncDelayedRedelivery());

                from("direct:start").routeId("myRoute").to("mock:before").bean("myBean", "callMe").to("mock:result");
            }
        };
    }

    public static class MyBean {
        private CountDownLatch latch;

        public MyBean(CountDownLatch latch) {
            this.latch = latch;
        }

        public void callMe() throws Exception {
            latch.countDown();
            throw new Exception();
        }
    }
}
