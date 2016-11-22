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
package org.apache.camel.component.firebase;

import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import static java.util.stream.IntStream.range;
import static junit.framework.TestCase.fail;

import com.google.firebase.database.DatabaseReference;
import org.apache.camel.CamelContext;
import org.apache.camel.Message;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.file.GenericFile;
import org.apache.camel.component.firebase.provider.ConfigurationProvider;
import org.apache.camel.component.firebase.provider.SampleInputProvider;
import org.apache.camel.impl.DefaultCamelContext;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Tests two scenarios: a synchronous and one asynchronous request.
 */
public class FirebaseProducerTest {

    private final ReentrantLock reentrantLock = new ReentrantLock();

    private final Condition wake = reentrantLock.newCondition();

    private SampleInputProvider sampleInputProvider;

    @Before
    public void setUp() throws Exception {
        sampleInputProvider = new SampleInputProvider();
    }

    @Test
    public void whenFirebaseSetShouldReceiveMessageAsDBReference() throws Exception {
        startRoute(true, DatabaseReference.class);
    }

    @Test
    public void whenFirebaseSetShouldReceiveMessageAsDbString() throws Exception {
        startRoute(false, String.class);
    }

    @Test
    public void whenMultipleFirebaseSetShouldReceiveExpectedMessages() {
        range(0, 10).forEach(i -> {
            try {
                startRoute(true, DatabaseReference.class);
                startRoute(false, String.class);
            } catch (Exception e) {
                fail("Multiple test fails: " + e);
            }
        });
    }

    private void startRoute(final boolean reply, final Class<?> expectedBodyClass) throws Exception {
        sampleInputProvider.copySampleFile();
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                String rootReference = URLEncoder.encode(ConfigurationProvider.createRootReference(), "UTF-8");
                String serviceAccountFile = ConfigurationProvider.createFirebaseConfigLink();
                from(sampleInputProvider.getTargetFolder().toUri().toString())
                        .process(exchange -> {
                            GenericFile file = (GenericFile) exchange.getIn().getBody();
                            String content = new String(Files.readAllBytes(Paths.get(file.getAbsoluteFilePath())), "UTF-8");
                            String[] keyValue = content.split("=");
                            final Message out = exchange.getOut();
                            out.setHeader("firebaseKey", keyValue[0]);
                            out.setBody(keyValue[1].trim());
                        })
                        .to(String.format("firebase://%s?rootReference=%s&serviceAccountFile=%s&reply=%b",
                                ConfigurationProvider.createDatabaseUrl(), rootReference, serviceAccountFile, reply))
                        .to("log:whenFirebaseSet?level=WARN")
                        .process(exchange1 -> {
                            assertThat(exchange1.getIn().getBody().getClass()).isEqualTo(expectedBodyClass);
                            if (reply) {
                                assertThat(exchange1.getIn().getHeader("firebaseKey")).isNotNull();
                            }
                            try {
                                reentrantLock.lock();
                                wake.signal();
                            } finally {
                                reentrantLock.unlock();
                            }
                        });
            }
        });
        context.start();
        try {
            reentrantLock.lock();
            wake.await();
        } finally {
            reentrantLock.unlock();
        }
        context.stop();
    }
}