/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.mllp;

import org.apache.camel.EndpointInject;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.impl.DefaultComponentResolver;
import org.apache.camel.spi.ComponentResolver;
import org.apache.camel.test.AvailablePortFinder;
import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.apache.camel.test.junit.rule.mllp.MllpClientResource;
import org.apache.camel.util.KeyValueHolder;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

import java.util.Dictionary;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.apache.camel.test.Hl7MessageGenerator.generateMessage;

public class MllpTcpServerConsumerBlueprintTest extends CamelBlueprintTestSupport {
    // int mllpPort = AvailablePortFinder.getNextAvailable();

    @Rule
    public MllpClientResource mllpClient = new MllpClientResource();

    @EndpointInject(uri = "mock://received")
    MockEndpoint received;

    @EndpointInject(uri = "mock://timeout-ex")
    MockEndpoint timeout;

    @EndpointInject(uri = "mock://frame-ex")
    MockEndpoint frame;


    @Override
    protected String getBlueprintDescriptor() {
        return "OSGI-INF/blueprint/mllp-tcp-server-consumer-test.xml";
    }

    @Override
    protected void addServicesOnStartup(Map<String, KeyValueHolder<Object, Dictionary>> services) {
        ComponentResolver testResolver = new DefaultComponentResolver();

        services.put(ComponentResolver.class.getName(), asService( testResolver, "component", "mllp"));
    }


    @Override
    protected Properties useOverridePropertiesWithPropertiesComponent() {
        mllpClient.setMllpPort(AvailablePortFinder.getNextAvailable());

        Properties props = new Properties();

        props.setProperty( "mllp.port", Integer.toString( mllpClient.getMllpPort() ) );

        return props;
    }

    /*
        This doesn't seem to work
    @Override
    protected String useOverridePropertiesWithConfigAdmin(Dictionary props) throws Exception {
        mllpClient.setMllpPort(AvailablePortFinder.getNextAvailable());

        props.put("mllp.port", mllpClient.getMllpPort() );

        return "MllpTcpServerConsumerBlueprintTest";
    }
    */

    @Test
    public void testReceiveMultipleMessages() throws Exception {
        int sendMessageCount = 5;
        received.expectedMinimumMessageCount(5);

        mllpClient.connect();

        for ( int i=1; i<=sendMessageCount; ++i ) {
            mllpClient.sendMessageAndWaitForAcknowledgement(generateMessage(i));
        }

        mllpClient.close();

        assertMockEndpointsSatisfied(10, TimeUnit.SECONDS);
    }


}
