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
package org.apache.camel.component.pojo;

import org.apache.camel.CamelContext;
import org.apache.camel.Component;

import java.util.HashMap;

/**
 * Represents the component that manages {@link PojoEndpoint}.  It holds the
 * list of named pojos that queue endpoints reference.
 *
 * @version $Revision: 519973 $
 */
public class PojoComponent implements Component<PojoExchange> {
	
    protected final HashMap<String, Object> services = new HashMap<String, Object>();
    protected final HashMap<String, PojoConsumer> consumers = new HashMap<String, PojoConsumer>();
    
    private CamelContext container;

    public void addService(String uri, Object pojo) {
        services.put(uri, pojo);
    }
    public void removeService(String uri) {
        services.remove(uri);
        removeConsumer(uri);
    }
    public Object getService(String uri) {
        return services.get(uri);
    }

    void addConsumer(String uri, PojoConsumer endpoint) {
        consumers.put(uri, endpoint);
    }
    void removeConsumer(String uri) {
        consumers.remove(uri);
    }
    public PojoConsumer getConsumer(String uri) {
        return consumers.get(uri);
    }

    public void setCamelContext(CamelContext container) {
        this.container = container;
    }
    public CamelContext getContainer() {
        return container;
    }
}
