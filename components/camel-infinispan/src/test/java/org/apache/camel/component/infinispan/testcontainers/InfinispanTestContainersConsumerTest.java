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
package org.apache.camel.component.infinispan.testcontainers;

import java.util.concurrent.TimeUnit;

import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.infinispan.InfinispanConstants;
import org.apache.camel.component.mock.MockEndpoint;
import org.infinispan.client.hotrod.RemoteCacheManager;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InfinispanTestContainersConsumerTest extends InfinispanTestContainerSupport {

    private static final String COMMAND_VALUE = "commandValue";
    private static final String COMMAND_KEY = "commandKey1";
    private RemoteCacheManager remoteCacheManager;

    @EndpointInject("mock:result")
    private MockEndpoint result;

    @Before
    public void doPreSetup() {
        remoteCacheManager = createAndGetDefaultCache();
    }

    @Test
    public void testUriCommandOption() throws Exception {
        template.send("direct:put", new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
                exchange.getIn().setHeader(InfinispanConstants.KEY, COMMAND_KEY);
                exchange.getIn().setHeader(InfinispanConstants.VALUE, COMMAND_VALUE);
            }
        });

        assertMockEndpointsSatisfied(5, TimeUnit.SECONDS);
        if (result.getExchanges().size() > 0) {
            assertEquals("CLIENT_CACHE_ENTRY_CREATED",
                    result.getExchanges().get(0).getMessage().getHeader(InfinispanConstants.EVENT_TYPE));
        }
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("direct:put")
                        .delay(5000)
                        .startupOrder(2)
                        .to("infinispan:mycache?hosts=" + getInfispanUrl()
                            + "&operation=PUT&username=admin&password=password&secure=true&saslMechanism=RAW(DIGEST-MD5)&securityRealm=default&securityServerName=infinispan&sync=false");
                from("infinispan:mycache?hosts=" + getInfispanUrl()
                     + "&operation=GET&username=admin&password=password&secure=true&saslMechanism=RAW(DIGEST-MD5)&securityRealm=default&securityServerName=infinispan&eventTypes=CLIENT_CACHE_ENTRY_CREATED&sync=false")
                             .startupOrder(1)
                             .to("mock:result");
            }
        };
    }
}
