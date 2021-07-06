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
package org.apache.camel.component.huaweicloud.iam;

import org.apache.camel.BindToRegistry;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.huaweicloud.iam.models.ServiceKeys;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetUserTest extends CamelTestSupport {
    private static final Logger LOG = LoggerFactory.getLogger(GetUserTest.class.getName());

    TestConfiguration testConfiguration = new TestConfiguration();

    @BindToRegistry("iamClient")
    IAMMockClient mockClient = new IAMMockClient(null);

    @BindToRegistry("serviceKeys")
    ServiceKeys serviceKeys = new ServiceKeys(
            testConfiguration.getProperty("authenticationKey"),
            testConfiguration.getProperty("secretKey"));

    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:get_user")
                        .setProperty("CamelHwCloudIamOperation", constant("getUser"))
                        .setProperty("CamelHwCloudIamUserId", constant(testConfiguration.getProperty("userId")))
                        .to("hwcloud-iam:?" +
                            "region=" + testConfiguration.getProperty("region") +
                            "&ignoreSslVerification=true" +
                            "&iamClient=#iamClient" +
                            "&serviceKeys=#serviceKeys")
                        .log("Get user successful")
                        .to("mock:get_user_result");
            }
        };
    }

    @Test
    public void testGetUser() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:get_user_result");
        mock.expectedMinimumMessageCount(1);
        template.sendBody("direct:get_user", "sample_body");
        Exchange responseExchange = mock.getExchanges().get(0);

        mock.assertIsSatisfied();

        assertEquals("{\"domainId\":\"138\",\"name\":\"User 15\",\"email\":\"user15@email.com\"}",
                responseExchange.getIn().getBody(String.class));
    }
}
