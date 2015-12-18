/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.mllp;

public class MllpConstants {
    public static final String MLLP_LOCAL_ADDRESS = "CamelMllpLocalAddress";
    public static final String MLLP_REMOTE_ADDRESS = "CamelMllpRemoteAddress";

    public static final String MLLP_ACKNOWLEDGEMENT = "CamelMllpAcknowledgement";
    public static final String MLLP_ACKNOWLEDGEMENT_TYPE = "CamelMllpAcknowledgementType";

    /*
        Exchange Properties for connections
         - For Consumers, performs the action when the exchange is completing
         - For Producers, performs the action immediately
     */
    public static final String MLLP_CLOSE_CONNECTION = "CamelMllpCloseConnection";
    public static final String MLLP_RESET_CONNECTION = "CamelMllpResetConnection";

    // MSH-3
    public static final String MLLP_SENDING_APPLICATION = "CamelMllpSendingApplication";
    // MSH-4
    public static final String MLLP_SENDING_FACILITY = "CamelMllpSendingFacility";
    // MSH-5
    public static final String MLLP_RECEIVING_APPLICATION = "CamelMllpReceivingApplication";
    // MSH-6
    public static final String MLLP_RECEIVING_FACILITY = "CamelMllpReceivingFacility";
    // MSH-7
    public static final String MLLP_TIMESTAMP = "CamelMllpTimestamp";
    // MSH-8
    public static final String MLLP_SECURITY = "CamelMllpSecurity";
    // MSH-9
    public static final String MLLP_MESSAGE_TYPE = "CamelMllpMessageType";
    // MSH-9.1
    public static final String MLLP_EVENT_TYPE = "CamelMllpEventType";
    // MSH-9.2
    public static final String MLLP_TRIGGER_EVENT = "CamelMllpTriggerEvent";
    // MSH-10
    public static final String MLLP_MESSAGE_CONTROL = "CamelMllpMessageControlId";
    // MSH-11
    public static final String MLLP_PROCESSING_ID = "CamelMllpProcessingId";
    // MSH-12
    public static final String MLLP_VERSION_ID = "CamelMllpVersionId";
    // MSH-18
    public static final String MLLP_CHARSET = "CamelMllpCharset";

}
