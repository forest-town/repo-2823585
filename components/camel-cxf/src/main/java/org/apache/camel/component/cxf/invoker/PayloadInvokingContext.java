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
package org.apache.camel.component.cxf.invoker;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.w3c.dom.Element;

import org.apache.camel.component.cxf.interceptors.DOMInInterceptor;
import org.apache.camel.component.cxf.interceptors.DOMOutInterceptor;
import org.apache.camel.component.cxf.interceptors.PayloadContentRedirectInterceptor;
import org.apache.camel.component.cxf.interceptors.PayloadInInterceptor;
import org.apache.camel.component.cxf.phase.FaultPayloadPhaseManagerImpl;
import org.apache.camel.component.cxf.phase.PayloadPhaseManagerImpl;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.endpoint.EndpointImpl;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.message.Exchange;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.phase.PhaseInterceptorChain;
import org.apache.cxf.phase.PhaseManager;
import org.apache.cxf.transport.MessageObserver;

public class PayloadInvokingContext extends AbstractInvokingContext {
    private static final Logger LOG = Logger.getLogger(PayloadInvokingContext.class.getName());


    public PayloadInvokingContext() {

    }

    public void setRequestOutMessageContent(Message message, Object content) {

        PayloadMessage request = (PayloadMessage) content;

        Element header = request.getHeader();
        List<Element> payload = request.getPayload();

        if (LOG.isLoggable(Level.FINEST)) {
            LOG.finest("header = " + header + ", paylaod = " + payload);
        }

        message.put(Element.class, header);
        message.put(List.class, payload);
    }

    @SuppressWarnings("unchecked")
    public Object getResponseObject(Exchange exchange, Map<String, Object> responseContext) {
        PayloadMessage payloadMsg = null;

        Message msg = exchange.getInMessage();
        List<Element> payload = getResponseObject(msg , responseContext, List.class);
        Element header = exchange.getInMessage().get(Element.class);
        payloadMsg = new PayloadMessage(payload, header);

        if (LOG.isLoggable(Level.FINEST)) {
            LOG.finest(payloadMsg.toString());
        }

        return payloadMsg;
    }

    @Override
    protected <T> T getResponseObject(Message inMessage, Map<String, Object> responseContext,
                                      Class <T> clazz) {

        T retval = null;
        if (inMessage != null) {
            if (null != responseContext) {
                responseContext.putAll(inMessage);
                LOG.info("set responseContext to be" + responseContext);
            }
            retval = inMessage.get(clazz);
        }
        return retval;
    }

    public void setResponseContent(Message outMessage, Object resultPayload) {
        if (resultPayload != null) {
            PayloadMessage payloadMessage = (PayloadMessage) resultPayload;
            if (LOG.isLoggable(Level.FINEST)) {
                LOG.finest(payloadMessage.toString());
            }
            outMessage.put(List.class, payloadMessage.getPayload());
            outMessage.put(Element.class, payloadMessage.getHeader());
        }
    }

    @SuppressWarnings("unchecked")
    public Object getRequestContent(Message inMessage) {
        List<Element> payload = inMessage.get(List.class);
        Element header = inMessage.get(Element.class);

        if (LOG.isLoggable(Level.FINEST)) {
            LOG.finest("Header = " + header + ", Payload = " + payload);
        }

        return new PayloadMessage(payload, header);
    }

}
