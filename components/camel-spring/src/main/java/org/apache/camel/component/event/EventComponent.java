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
package org.apache.camel.component.event;

import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultComponent;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Map;

/**
 * An <a href="http://activemq.apache.org/camel/event.html">Event Component</a>
 * for working with Spring ApplicationEvents
 *
 * @version $Revision: 1.1 $
 */
public class EventComponent extends DefaultComponent<Exchange> implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    public EventComponent() {
    }

    public EventComponent(ApplicationContext applicationContext) {
        setApplicationContext(applicationContext);
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public ConfigurableApplicationContext getConfigurableApplicationContext() {
        ApplicationContext applicationContext = getApplicationContext();
        if (applicationContext instanceof ConfigurableApplicationContext) {
            return (ConfigurableApplicationContext) applicationContext;
        }
        else {
            throw new IllegalArgumentException("Not created with a ConfigurableApplicationContext! Was: " + applicationContext);
        }
    }

    protected EventEndpoint createEndpoint(String uri, String remaining, Map parameters) throws Exception {
        EventEndpoint answer = new EventEndpoint(uri, this);
        //getConfigurableApplicationContext().addApplicationListener(answer);
        return answer;
    }
}
