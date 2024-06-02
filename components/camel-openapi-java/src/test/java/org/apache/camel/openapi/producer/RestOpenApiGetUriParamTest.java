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
package org.apache.camel.openapi.producer;

import org.apache.camel.BindToRegistry;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.component.platform.http.spi.PlatformHttpEngine;
import org.apache.camel.openapi.DummyHttpEngine;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;

public class RestOpenApiGetUriParamTest extends CamelTestSupport {

    @BindToRegistry("dummy")
    private DummyRestProducerFactory factory = new DummyRestProducerFactory();

    @BindToRegistry("platform-http-engine")
    private PlatformHttpEngine engine = new DummyHttpEngine();

    @Test
    public void testOpenApiGet() throws Exception {
        getMockEndpoint("mock:result").expectedBodiesReceived("Bye Donald+Duck");

        template.sendBodyAndHeader("direct:start", null, "name", "Donald Duck");

        MockEndpoint.assertIsSatisfied(context);
    }

    @Override
    protected RoutesBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                restConfiguration().host("camelhost").producerComponent("dummy").producerApiDoc("hello-api.json");

                from("direct:start").to("rest:get:bye?name={name}").to("mock:result");
            }
        };
    }
}
