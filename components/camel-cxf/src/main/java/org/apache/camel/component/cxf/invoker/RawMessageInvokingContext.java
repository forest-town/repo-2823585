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

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.camel.component.cxf.interceptors.RawMessageContentRedirectInterceptor;
import org.apache.camel.component.cxf.interceptors.RawMessageInInterceptor;
import org.apache.camel.component.cxf.phase.RawMessagePhaseManagerImpl;


import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.message.Exchange;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.phase.PhaseInterceptorChain;
import org.apache.cxf.phase.PhaseManager;

public class RawMessageInvokingContext extends AbstractInvokingContext {
    private static final Logger LOG = Logger.getLogger(RawMessageInvokingContext.class.getName());

    public RawMessageInvokingContext() {

    }

    public void setRequestOutMessageContent(Message message, Object content) {
        message.setContent(InputStream.class, content);
    }

    public Object getResponseObject(Exchange exchange, Map<String, Object> responseContext) {

        return getResponseObject(exchange.getInMessage(), responseContext, InputStream.class);
    }

    public void setResponseContent(Message outMessage, Object resultPayload) {
        LOG.info("Set content: " + resultPayload);
        outMessage.setContent(InputStream.class, resultPayload);
        //loggerTheMessage(outMessage, "Out Message");
    }

    public Object getRequestContent(Message inMessage) {
        //loggerTheMessage(inMessage, "In Message");
        return inMessage.getContent(InputStream.class);
    }

}
