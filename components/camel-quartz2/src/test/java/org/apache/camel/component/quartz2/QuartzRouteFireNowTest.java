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
package org.apache.camel.component.quartz2;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.Test;

/**
 * @version 
 */
public class QuartzRouteFireNowTest extends BaseQuartzTest {

    protected MockEndpoint resultEndpoint;

    @Test
    public void testQuartzRoute() throws Exception {
        resultEndpoint = getMockEndpoint("mock:result");
        resultEndpoint.expectedMessageCount(2);
        resultEndpoint.message(0).header("triggerName").isEqualTo("myTimerName");
        resultEndpoint.message(0).header("triggerGroup").isEqualTo("myGroup");

        // lets test the receive worked
        resultEndpoint.assertIsSatisfied();
    }
    
    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                // START SNIPPET: example
                from("quartz2://myGroup/myTimerName?fireNow=true&trigger.repeatInterval=2000&trigger.repeatCount=2")
                        .to("log:quartz")
                        .to("mock:result");
                // END SNIPPET: example
            }
        };
    }
}