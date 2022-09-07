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
package org.apache.camel.impl.engine;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.ExtendedCamelContext;
import org.apache.camel.spi.PeriodTaskScheduler;
import org.apache.camel.support.TimerListenerManager;
import org.awaitility.Awaitility;
import org.junit.jupiter.api.Test;

public class PeriodTaskSchedulerTest extends ContextTestSupport {

    private final AtomicInteger counter = new AtomicInteger();

    @Override
    public boolean isUseRouteBuilder() {
        return false;
    }

    @Test
    public void testScheduler() throws Exception {
        PeriodTaskScheduler scheduler = context.adapt(ExtendedCamelContext.class).getPeriodTaskScheduler();
        if (scheduler instanceof TimerListenerManager) {
            // speedup unit test
            ((TimerListenerManager) scheduler).setInterval(10);
        }
        scheduler.schedulePeriodTask(counter::incrementAndGet, 10);
        context.start();

        Awaitility.waitAtMost(5, TimeUnit.SECONDS).until(() -> counter.get() > 0);
    }
}
