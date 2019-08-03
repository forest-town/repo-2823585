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
package org.apache.camel.component.jetty.async;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.camel.AsyncCallback;
import org.apache.camel.CamelExchangeException;
import org.apache.camel.Exchange;
import org.apache.camel.support.DefaultAsyncProducer;

public class MyAsyncProducer extends DefaultAsyncProducer {

    private final ExecutorService executor = Executors.newCachedThreadPool();
    private final AtomicInteger counter = new AtomicInteger();

    public MyAsyncProducer(MyAsyncEndpoint endpoint) {
        super(endpoint);
    }

    @Override
    public MyAsyncEndpoint getEndpoint() {
        return (MyAsyncEndpoint) super.getEndpoint();
    }

    @Override
    public boolean process(final Exchange exchange, final AsyncCallback callback) {
        executor.submit(new Callable<Object>() {
            public Object call() throws Exception {
                log.info("Simulating a task which takes " + getEndpoint().getDelay() + " millis to reply");
                Thread.sleep(getEndpoint().getDelay());

                int count = counter.incrementAndGet();
                if (getEndpoint().getFailFirstAttempts() >= count) {
                    log.info("Simulating a failure at attempt " + count);
                    exchange.setException(new CamelExchangeException("Simulated error at attempt " + count, exchange));
                } else {
                    String reply = getEndpoint().getReply();
                    exchange.getOut().setBody(reply);
                    log.info("Setting reply " + reply);
                }

                log.info("Callback done(false)");
                callback.done(false);
                return null;
            }
        });

        // indicate from this point forward its being routed asynchronously
        log.info("Task submitted, now tell Camel routing engine to that this Exchange is being continued asynchronously");
        return false;
    }

}
