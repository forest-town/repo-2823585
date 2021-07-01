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
package org.apache.camel.component.azure.servicebus;

public final class ServiceBusConstants {
    private static final String HEADER_PREFIX = "CamelAzureServiceBus";
    // common headers, set by consumer and evaluated by producer

    // headers set by the consumer only

    // headers evaluated by the producer
    public static final String SERVICE_BUS_TRANSACTION_CONTEXT = HEADER_PREFIX + "ServiceBusTransactionContext";
    public static final String SCHEDULED_ENQUEUE_TIME = HEADER_PREFIX + "ScheduledEnqueueTime";
    public static final String PRODUCER_OPERATION = HEADER_PREFIX + "ProducerOperation";

    private ServiceBusConstants() {
    }
}
