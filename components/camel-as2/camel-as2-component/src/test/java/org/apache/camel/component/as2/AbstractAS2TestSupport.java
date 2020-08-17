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
package org.apache.camel.component.as2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelExecutionException;
import org.apache.camel.support.PropertyBindingSupport;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

/**
 * Abstract base class for AS2 Integration tests generated by Camel API component maven plugin.
 */
@TestInstance(Lifecycle.PER_CLASS)
public class AbstractAS2TestSupport extends CamelTestSupport {

    private static final String TEST_OPTIONS_PROPERTIES = "/test-options.properties";

    @Override
    protected CamelContext createCamelContext() throws Exception {

        final CamelContext context = super.createCamelContext();

        // read AS2 component configuration from TEST_OPTIONS_PROPERTIES
        final Properties properties = new Properties();
        try {
            properties.load(getClass().getResourceAsStream(TEST_OPTIONS_PROPERTIES));
        } catch (Exception e) {
            throw new IOException(
                    String.format("%s could not be loaded: %s", TEST_OPTIONS_PROPERTIES, e.getMessage()),
                    e);
        }

        Map<String, Object> options = new HashMap<>();
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            options.put(entry.getKey().toString(), entry.getValue());
        }

        final AS2Configuration configuration = new AS2Configuration();
        PropertyBindingSupport.bindProperties(context, configuration, options);

        // add AS2Component to Camel context
        final AS2Component component = new AS2Component(context);
        component.setConfiguration(configuration);
        context.addComponent("as2", component);

        return context;
    }

    @SuppressWarnings("unchecked")
    protected <T> T requestBodyAndHeaders(String endpointUri, Object body, Map<String, Object> headers)
            throws CamelExecutionException {
        return (T) template().requestBodyAndHeaders(endpointUri, body, headers);
    }

    @SuppressWarnings("unchecked")
    protected <T> T requestBody(String endpoint, Object body) throws CamelExecutionException {
        return (T) template().requestBody(endpoint, body);
    }
}
