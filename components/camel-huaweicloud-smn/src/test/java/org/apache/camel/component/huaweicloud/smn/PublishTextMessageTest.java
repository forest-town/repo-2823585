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
package org.apache.camel.component.huaweicloud.smn;

import org.apache.camel.BindToRegistry;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.huaweicloud.smn.constants.SmnProperties;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(MockitoJUnitRunner.class)
public class PublishTextMessageTest extends CamelTestSupport {
    private static final Logger LOGGER = LoggerFactory.getLogger(PublishTextMessageTest.class.getName());

    TestConfiguration testConfiguration = new TestConfiguration();

    @BindToRegistry("smnClient")
    SmnClientMock smnClientMock = new SmnClientMock(null); // creating mock smn client to stub method behavior for unit testing

    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() {
                from("direct:publish_text_message")
                        .setProperty(SmnProperties.NOTIFICATION_SUBJECT, constant("Dummy Subject Line"))
                        .setProperty(SmnProperties.NOTIFICATION_TOPIC_NAME, constant(testConfiguration.getProperty("topic")))
                        .setProperty(SmnProperties.NOTIFICATION_TTL, constant(60))
                        .to("hwcloud-smn:publishMessageService?operation=publishAsTextMessage&authKey="
                                + testConfiguration.getProperty("authKey") + "&secretKey="
                                + testConfiguration.getProperty("secretKey") + "&projectId="
                                + testConfiguration.getProperty("projectId") + "&region=" + testConfiguration.getProperty("region")
                                + "&ignoreSslVerification=true"
                                + "&smnClient=#smnClient")
                        .log("publish message successful")
                        .to("mock:publish_text_message_result");
            }
        };
    }

    @Test
    public void testTextNotificationSend() throws Exception {

        MockEndpoint mock = getMockEndpoint("mock:publish_text_message_result");
        mock.expectedMinimumMessageCount(1);
        template.sendBody("direct:publish_text_message", "message content");
        Exchange responseExchange = mock.getExchanges().get(0);

        mock.assertIsSatisfied();

        Assert.assertNotNull(responseExchange.getProperty(SmnProperties.SERVICE_MESSAGE_ID));
        Assert.assertNotNull(responseExchange.getProperty(SmnProperties.SERVICE_REQUEST_ID));
        Assert.assertTrue(responseExchange.getProperty(SmnProperties.SERVICE_MESSAGE_ID).toString().length() > 0);
        Assert.assertTrue(responseExchange.getProperty(SmnProperties.SERVICE_REQUEST_ID).toString().length() > 0);

        Assert.assertEquals("bf94b63a5dfb475994d3ac34664e24f2", responseExchange.getProperty(SmnProperties.SERVICE_MESSAGE_ID));
        Assert.assertEquals("6a63a18b8bab40ffb71ebd9cb80d0085", responseExchange.getProperty(SmnProperties.SERVICE_REQUEST_ID));
    }


}
