/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.cxf;

import junit.framework.TestCase;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.TypeConverter;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.CamelClient;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.cxf.Bus;
import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.endpoint.ServerImpl;
import org.apache.cxf.bus.CXFBusFactory;
import org.apache.cxf.message.Message;
import org.apache.cxf.message.MessageImpl;
import org.apache.cxf.service.model.EndpointInfo;
import org.apache.cxf.transport.Conduit;
import org.apache.cxf.transport.Destination;
import org.apache.cxf.transport.DestinationFactory;
import org.apache.cxf.transport.DestinationFactoryManager;
import org.apache.cxf.transport.MessageObserver;
import org.apache.cxf.transport.local.LocalConduit;
import org.apache.cxf.transport.local.LocalTransportFactory;
import org.xmlsoap.schemas.wsdl.http.AddressType;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.*;

/**
 * @version $Revision$
 */
public class CxfTest extends TestCase {
    private static final transient Log log = LogFactory.getLog(CxfTest.class);
    protected CamelContext camelContext = new DefaultCamelContext();
    protected CamelClient<CxfExchange> client = new CamelClient<CxfExchange>(camelContext);

    final private String transportAddress = "http://localhost:28080/test";
    final private String testMessage = "Hello World!";
    private ServerImpl server;
    
    @Override
    protected void setUp() throws Exception {
        
        // start a service
        ServerFactoryBean svrBean = new ServerFactoryBean();

        svrBean.setAddress(transportAddress);
        svrBean.setServiceClass(HelloServiceImpl.class);
        svrBean.setBus(CXFBusFactory.getDefaultBus());

        server = (ServerImpl)svrBean.create();
        server.start();
    }
    
    @Override
    protected void tearDown() throws Exception {
        if (server != null) {
            server.stop();
        }
    }
    
    public void testInvokeOfServer() throws Exception {

        CxfExchange exchange = (CxfExchange) 
            client.send(getUri(),
                        new Processor() {
                            public void process(final Exchange exchange) {
                                final List<String> params = new ArrayList<String>();
                                params.add(testMessage);
                                exchange.getIn().setBody(params);
                            }
                        });

        org.apache.camel.Message out = exchange.getOut();

        Object[] output = (Object[])out.getBody();
        log.info("Received output text: " + output[0]);
        
        assertEquals("reply body on Camel", testMessage, output[0]);
    }

    private String getUri() {
        return "cxf:" + transportAddress 
            + "?sei=org.apache.camel.component.cxf.HelloService&method=echo";
    }
}
