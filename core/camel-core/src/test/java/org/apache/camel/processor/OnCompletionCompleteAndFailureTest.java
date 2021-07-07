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
package org.apache.camel.processor;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.builder.RouteBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class OnCompletionCompleteAndFailureTest extends ContextTestSupport {

    @Override
    public boolean isUseRouteBuilder() {
        return false;
    }

    @Test
    public void testInvalid() throws Exception {
        try {
            context.addRoutes(new RouteBuilder() {
                @Override
                public void configure() throws Exception {
                    from("direct:start")
                            .onCompletion().onCompleteOnly().to("mock:ok").end()
                            .onCompletion().onFailureOnly().to("mock:error").end()
                            .to("mock:result");
                }
            });
            fail("Should throw exception");
        } catch (IllegalArgumentException e) {
            assertEquals("Only 1 onCompletion is allowed per route.", e.getMessage());
        }
    }

    @Test
    public void testValid() {
        try {
            context.addRoutes(new RouteBuilder() {
                @Override
                public void configure() throws Exception {
                    from("direct:start")
                    .onCompletion()
                    .onSuccess().to("mock:ok")
                    .onFailure().to("mock:error")
                    .end()
                    .to("mock:result");
                }
            });
        } catch (Exception e) {
            fail("Should not throw exception");
        }
    }

}
