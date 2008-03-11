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
package org.apache.camel.component.swing;

import java.util.Date;

import org.apache.camel.ProducerTemplate;
import org.apache.camel.EndpointInject;
import org.springframework.beans.factory.InitializingBean;

/**
 * @version $Revision$
 */
public class ExampleSender implements InitializingBean {
    private int counter;
    private int messageCount = 10;

    @EndpointInject(uri = "swing:a")
    private ProducerTemplate template;

    public String ping() {
        return "Message " + (++counter) + " at: " + new Date();
    }

    public void afterPropertiesSet() throws Exception {
        // lets send a bunch of messages...
        for (int i = 0; i < messageCount; i++) {
            template.sendBodyAndHeader(ping(), "messageCounter", i);
        }
    }

    public int getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(int messageCount) {
        this.messageCount = messageCount;
    }
}
