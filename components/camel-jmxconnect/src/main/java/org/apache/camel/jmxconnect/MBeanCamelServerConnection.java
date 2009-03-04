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
package org.apache.camel.jmxconnect;

import javax.management.MBeanServerConnection;
import javax.management.ObjectName;

import org.apache.camel.Endpoint;

/**
 * @version $Revision$
 */
public interface MBeanCamelServerConnection extends MBeanServerConnection {

    /**
     * Add a Notification listener
     *
     * @param listenerId
     * @param name
     * @param replyToEndpoint
     */
    void addNotificationListener(String listenerId, ObjectName name, Endpoint replyToEndpoint);

    /**
     * Remove a Notification listener
     *
     * @param listenerId
     */
    void removeNotificationListener(String listenerId);

}