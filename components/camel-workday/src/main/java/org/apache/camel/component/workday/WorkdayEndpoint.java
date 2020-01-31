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
package org.apache.camel.component.workday;

import java.util.Map;

import org.apache.camel.Consumer;
import org.apache.camel.NoSuchEndpointException;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.spi.Metadata;
import org.apache.camel.spi.UriEndpoint;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriPath;
import org.apache.camel.support.DefaultEndpoint;
import org.apache.camel.support.PropertyBindingSupport;

/**
 * Represents a camel-workday endpoint.
 */

@UriEndpoint(firstVersion = "3.1.0-SNAPSHOT", scheme = "workday-raas", title = "Workday", syntax = "workday-raas:uri", label = "hcm")
public class WorkdayEndpoint extends DefaultEndpoint {

    @UriPath(description = "The partial URL for RAAS report.")
    @Metadata(required = true)
    private String uri;

    @UriParam
    private WorkdayConfiguration workdayConfiguration;

    public WorkdayEndpoint() {
    }

    public WorkdayEndpoint(String uri, WorkdayComponent component) {
        super(uri, component);
    }

    public Producer createProducer() throws Exception {

        return new WorkdayProducer(this, uri);
    }

    public Consumer createConsumer(Processor processor) throws Exception {

        throw new NoSuchEndpointException("Workday consumer is not implemented.");
    }

    @Override
    public void configureProperties(Map<String, Object> options) {
        super.configureProperties(options);

        try {
            if (this.workdayConfiguration == null) {
                this.workdayConfiguration = new WorkdayConfiguration();
            }

            PropertyBindingSupport.bindProperties(getCamelContext(), this.workdayConfiguration, options);
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    @Override
    public boolean isLenientProperties() {
        return true;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public WorkdayConfiguration getWorkdayConfiguration() {
        return workdayConfiguration;
    }

    public void setWorkdayConfiguration(WorkdayConfiguration workdayConfiguration) {
        this.workdayConfiguration = workdayConfiguration;
    }
}
