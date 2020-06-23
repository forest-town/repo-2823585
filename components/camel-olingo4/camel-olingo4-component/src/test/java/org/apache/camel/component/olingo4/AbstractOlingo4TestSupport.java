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
package org.apache.camel.component.olingo4;

import java.io.IOException;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelExecutionException;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.apache.http.HttpHost;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;
import org.apache.olingo.client.api.ODataClient;
import org.apache.olingo.client.api.domain.ClientObjectFactory;
import org.apache.olingo.client.core.ODataClientFactory;
import org.junit.jupiter.api.TestInstance;

/**
 * Abstract base class for Olingo 4.0 Integration tests generated by Camel API
 * component maven plugin.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AbstractOlingo4TestSupport extends CamelTestSupport {
    protected static final String TEST_SERVICE_BASE_URL = "http://services.odata.org/TripPinRESTierService";
    protected final ODataClient odataClient = ODataClientFactory.getClient();
    protected final ClientObjectFactory objFactory = odataClient.getObjectFactory();

    @Override
    protected CamelContext createCamelContext() throws Exception {
        final CamelContext context = super.createCamelContext();

        final Olingo4Configuration configuration = new Olingo4Configuration();
        configuration.setServiceUri(getRealServiceUrl(TEST_SERVICE_BASE_URL));
        configuration.setContentType("application/json;charset=utf-8");

        // add OlingoComponent to Camel context
        final Olingo4Component component = new Olingo4Component(context);
        component.setConfiguration(configuration);
        context.addComponent("olingo4", component);

        return context;
    }

    /*
     * Every request to the demo OData 4.0
     * (http://services.odata.org/TripPinRESTierService) generates unique
     * service URL with postfix like (S(tuivu3up5ygvjzo5fszvnwfv)) for each
     * session This method makes request to the base URL and return URL with
     * generated postfix
     */
    @SuppressWarnings("deprecation")
    protected String getRealServiceUrl(String baseUrl) throws ClientProtocolException, IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(baseUrl);
        HttpContext httpContext = new BasicHttpContext();
        httpclient.execute(httpGet, httpContext);
        HttpUriRequest currentReq = (HttpUriRequest)httpContext.getAttribute(ExecutionContext.HTTP_REQUEST);
        HttpHost currentHost = (HttpHost)httpContext.getAttribute(ExecutionContext.HTTP_TARGET_HOST);
        String currentUrl = (currentReq.getURI().isAbsolute()) ? currentReq.getURI().toString() : (currentHost.toURI() + currentReq.getURI());

        return currentUrl;
    }

    @SuppressWarnings("unchecked")
    protected <T> T requestBodyAndHeaders(String endpointUri, Object body, Map<String, Object> headers) throws CamelExecutionException {
        return (T)template().requestBodyAndHeaders(endpointUri, body, headers);
    }

    @SuppressWarnings("unchecked")
    protected <T> T requestBody(String endpoint, Object body) throws CamelExecutionException {
        return (T)template().requestBody(endpoint, body);
    }
}
