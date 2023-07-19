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
package org.apache.camel.component.caffeine.cache;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.caffeine.CaffeineConstants;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.infra.core.CamelContextExtension;
import org.apache.camel.test.infra.core.DefaultCamelContextExtension;
import org.apache.camel.test.infra.core.annotations.RouteFixture;
import org.apache.camel.test.infra.core.api.CamelTestSupportHelper;
import org.apache.camel.test.infra.core.api.ConfigurableRoute;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CaffeineCacheStatsCounterProducerTest extends CaffeineCacheTestSupport implements ConfigurableRoute, CamelTestSupportHelper {

    @RegisterExtension
    public static CamelContextExtension camelContextExtension = new DefaultCamelContextExtension();

    protected CamelContext context;

    @BeforeEach
    void setupContext(){
        context = camelContextExtension.getContext();
    }

    @Test
    void testStats() {
        final Map<String, String> map = generateRandomMapOfString(3);
        final Set<String> keys = map.keySet().stream().limit(2).collect(Collectors.toSet());

        fluentTemplate().withHeader(CaffeineConstants.ACTION, CaffeineConstants.ACTION_PUT_ALL).withBody(map)
                .to("direct://start").send();

        MockEndpoint mock1 = getMockEndpoint("mock:result");
        mock1.expectedMinimumMessageCount(1);
        mock1.expectedHeaderReceived(CaffeineConstants.ACTION_HAS_RESULT, false);
        mock1.expectedHeaderReceived(CaffeineConstants.ACTION_SUCCEEDED, true);

        final Map<String, String> elements = getTestStatsCounterCache().getAllPresent(keys);
        keys.forEach(k -> {
            assertTrue(elements.containsKey(k));
            assertEquals(map.get(k), elements.get(k));
        });

        assertEquals(2, getMetricRegistry().counter("camelcache.hits").getCount());
    }

    // ****************************
    // Route
    // ****************************

    @Override
    @RouteFixture
    public void createRouteBuilder(CamelContext context) throws Exception {
        final RouteBuilder routeBuilder = createRouteBuilder();

        if (routeBuilder != null) {
            context.addRoutes(routeBuilder);
        }
    }

    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("direct://start")
                        .to("caffeine-cache://cacheSc")
                        .to("log:org.apache.camel.component.caffeine?level=INFO&showAll=true&multiline=true")
                        .to("mock:result");
            }
        };
    }

    @Override
    public CamelContextExtension getCamelContextExtension() {
        return camelContextExtension;
    }
}
