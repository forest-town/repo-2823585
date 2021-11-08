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

package org.apache.camel.component.mllp;

import java.util.function.Consumer;

import org.apache.camel.Endpoint;
import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.ServiceStatus;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.AvailablePortFinder;
import org.apache.camel.test.junit.rule.mllp.MllpServerResource;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.apache.camel.test.mllp.Hl7TestMessageGenerator;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.apache.camel.ExchangePattern.InOut;
import static org.apache.camel.component.mllp.MllpExceptionTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(OrderAnnotation.class)
public class LogPhiTest extends CamelTestSupport {

    static final int SERVER_ACKNOWLEDGEMENT_DELAY = 10000;

    @RegisterExtension
    public MllpServerResource mllpServer = new MllpServerResource();

    @EndpointInject("direct:startNoLogPhi")
    private Endpoint startNoLogPhi;

    @EndpointInject("direct:startLogPhi")
    private Endpoint startLogPhi;

    @EndpointInject("direct:start")
    private Endpoint startDefaultPhi;

    private MllpComponent mllpComponentNoLogPhi = new MllpComponent();

    private MllpComponent mllpComponentLogPhi = new MllpComponent();

    private MllpComponent mllpComponentLogPhiDefault = new MllpComponent();

    @Override
    protected void doPreSetup() throws Exception {
        mllpServer.setListenHost("localhost");
        mllpServer.setListenPort(AvailablePortFinder.getNextAvailable());
        mllpServer.setDelayDuringAcknowledgement(SERVER_ACKNOWLEDGEMENT_DELAY);
        mllpServer.startup();
        assertTrue(mllpServer.isActive());
        super.doPreSetup();
    }

    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {

            @Override
            public void configure() {

                getContext().addComponent("mllpnologphi", mllpComponentNoLogPhi);
                getContext().addComponent("mllplogphi", mllpComponentLogPhi);
                getContext().addComponent("mllpdefault", mllpComponentLogPhiDefault);
                from(startNoLogPhi)
                        .toF("mllpnologphi://%s:%d?receiveTimeout=%d",
                                mllpServer.getListenHost(), mllpServer.getListenPort(),
                                SERVER_ACKNOWLEDGEMENT_DELAY / 2);

                from(startLogPhi)
                        .toF("mllplogphi://%s:%d?receiveTimeout=%d",
                                mllpServer.getListenHost(), mllpServer.getListenPort(),
                                SERVER_ACKNOWLEDGEMENT_DELAY / 2);

                from(startDefaultPhi)
                        .toF("mllpdefault://%s:%d?receiveTimeout=%d",
                                mllpServer.getListenHost(), mllpServer.getListenPort(),
                                SERVER_ACKNOWLEDGEMENT_DELAY / 2);
            }
        };
    }

    @Test
    @Order(1)
    public void testLogPhiDefault() throws Exception {
        testLogPhi(startDefaultPhi, exceptionMessage -> assertTrue(exceptionMessage.contains("hl7Message")));
    }

    @Test
    @Order(3)
    public void testLogPhiFalse() throws Exception {
        mllpComponentNoLogPhi.setLogPhi(LOG_PHI_FALSE);
        testLogPhi(startNoLogPhi, exceptionMessage -> assertFalse(exceptionMessage.contains("hl7Message")));
    }

    @Test
    @Order(3)
    public void testLogPhiTrue() throws Exception {
        mllpComponentLogPhi.setLogPhi(LOG_PHI_TRUE);
        testLogPhi(startLogPhi, exceptionMessage -> assertTrue(exceptionMessage.contains("hl7Message")));
    }

    private void testLogPhi(Endpoint endpoint, Consumer<String> contains) throws Exception {
        Exchange exchange = endpoint.createExchange(InOut);
        String message = Hl7TestMessageGenerator.generateMessage();
        exchange.getIn().setBody(message);
        assertEquals(ServiceStatus.Started, context.getStatus());
        Exchange out = template.send(endpoint, exchange);
        assertTrue(exchange.isFailed(), "Should be failed");
        contains.accept(exchange.getException().getMessage());
    }
}
