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
package org.apache.camel.jmxconnect.provider.activemq;

import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.camel.CamelContext;
import org.apache.camel.jmxconnect.CamelJmxConnectorSupport;

/**
 * @version $Revision$
 */
public final class ActiveMQHelper {
    private ActiveMQHelper() {
        // helper class
    }
    public static String getDefaultEndpointUri() {
        return "activemq:" + CamelJmxConnectorSupport.DEFAULT_DESTINATION_PREFIX;
    }

    public static void configureActiveMQComponent(CamelContext camelContext, String brokerUrl) {
        ActiveMQComponent activemqComponent = camelContext.getComponent("activemq", ActiveMQComponent.class);
        activemqComponent.setBrokerURL(brokerUrl);
    }
}
