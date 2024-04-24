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
package org.apache.camel.management;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import org.apache.camel.ManagementStatisticsLevel;
import org.apache.camel.builder.RouteBuilder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.apache.camel.management.DefaultManagementObjectNameStrategy.TYPE_ROUTE;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisabledOnOs(OS.AIX)
public class ManagedRedeliverRouteOnlyTest extends ManagementTestSupport {

    @Test
    public void testRedeliver() throws Exception {
        MBeanServer mbeanServer = getMBeanServer();

        getMockEndpoint("mock:foo").expectedMessageCount(1);

        Object out = template.requestBody("direct:start", "Hello World");
        assertEquals("Error", out);

        assertMockEndpointsSatisfied();

        ObjectName on = getCamelObjectName(TYPE_ROUTE, "route1");

        Long num = (Long) mbeanServer.getAttribute(on, "ExchangesCompleted");
        assertEquals(1, num.longValue());

        num = (Long) mbeanServer.getAttribute(on, "ExchangesFailed");
        assertEquals(0, num.longValue());

        num = (Long) mbeanServer.getAttribute(on, "FailuresHandled");
        assertEquals(1, num.longValue());
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                context.getManagementStrategy().getManagementAgent().setStatisticsLevel(ManagementStatisticsLevel.RoutesOnly);

                onException(Exception.class).handled(true)
                        .redeliveryDelay(0)
                        .maximumRedeliveries(4).logStackTrace(false)
                        .setBody().constant("Error");

                from("direct:start")
                        .to("mock:foo")
                        .process(exchange -> {
                            log.info("Invoking me");

                            throw new IllegalArgumentException("Damn");
                        }).id("myprocessor");
            }
        };
    }
}
