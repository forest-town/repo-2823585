/* Generated by camel build tools - do NOT edit this file! */
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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Receive JMX notifications.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JMXEndpointBuilderFactory {

    /**
     * Builder for endpoint for the JMX component.
     */
    public interface JMXEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedJMXEndpointBuilder advanced() {
            return (AdvancedJMXEndpointBuilder) this;
        }

        /**
         * Format for the message body. Either xml or raw. If xml, the
         * notification is serialized to xml. If raw, then the raw java object
         * is set as the body.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: xml
         * Group: consumer
         * 
         * @param format the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder format(String format) {
            doSetProperty("format", format);
            return this;
        }
        /**
         * The frequency to poll the bean to check the monitor (monitor types
         * only).
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 10000
         * Group: consumer
         * 
         * @param granularityPeriod the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder granularityPeriod(long granularityPeriod) {
            doSetProperty("granularityPeriod", granularityPeriod);
            return this;
        }
        /**
         * The frequency to poll the bean to check the monitor (monitor types
         * only).
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 10000
         * Group: consumer
         * 
         * @param granularityPeriod the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder granularityPeriod(String granularityPeriod) {
            doSetProperty("granularityPeriod", granularityPeriod);
            return this;
        }
        /**
         * The type of monitor to create. One of string, gauge, counter (monitor
         * types only).
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param monitorType the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder monitorType(String monitorType) {
            doSetProperty("monitorType", monitorType);
            return this;
        }
        /**
         * The domain for the mbean you're connecting to.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: consumer
         * 
         * @param objectDomain the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder objectDomain(String objectDomain) {
            doSetProperty("objectDomain", objectDomain);
            return this;
        }
        /**
         * The name key for the mbean you're connecting to. This value is
         * mutually exclusive with the object properties that get passed.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param objectName the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder objectName(String objectName) {
            doSetProperty("objectName", objectName);
            return this;
        }
        /**
         * The attribute to observe for the monitor bean or consumer.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param observedAttribute the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder observedAttribute(String observedAttribute) {
            doSetProperty("observedAttribute", observedAttribute);
            return this;
        }
        /**
         * Initial threshold for the monitor. The value must exceed this before
         * notifications are fired (counter monitor only).
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: counter
         * 
         * @param initThreshold the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder initThreshold(int initThreshold) {
            doSetProperty("initThreshold", initThreshold);
            return this;
        }
        /**
         * Initial threshold for the monitor. The value must exceed this before
         * notifications are fired (counter monitor only).
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: counter
         * 
         * @param initThreshold the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder initThreshold(String initThreshold) {
            doSetProperty("initThreshold", initThreshold);
            return this;
        }
        /**
         * The value at which the counter is reset to zero (counter monitor
         * only).
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: counter
         * 
         * @param modulus the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder modulus(int modulus) {
            doSetProperty("modulus", modulus);
            return this;
        }
        /**
         * The value at which the counter is reset to zero (counter monitor
         * only).
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: counter
         * 
         * @param modulus the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder modulus(String modulus) {
            doSetProperty("modulus", modulus);
            return this;
        }
        /**
         * The amount to increment the threshold after it's been exceeded
         * (counter monitor only).
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: counter
         * 
         * @param offset the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder offset(int offset) {
            doSetProperty("offset", offset);
            return this;
        }
        /**
         * The amount to increment the threshold after it's been exceeded
         * (counter monitor only).
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: counter
         * 
         * @param offset the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder offset(String offset) {
            doSetProperty("offset", offset);
            return this;
        }
        /**
         * If true, then the value reported in the notification is the
         * difference from the threshold as opposed to the value itself (counter
         * and gauge monitor only).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: gauge
         * 
         * @param differenceMode the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder differenceMode(boolean differenceMode) {
            doSetProperty("differenceMode", differenceMode);
            return this;
        }
        /**
         * If true, then the value reported in the notification is the
         * difference from the threshold as opposed to the value itself (counter
         * and gauge monitor only).
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: gauge
         * 
         * @param differenceMode the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder differenceMode(String differenceMode) {
            doSetProperty("differenceMode", differenceMode);
            return this;
        }
        /**
         * If true, the gauge will fire a notification when the high threshold
         * is exceeded (gauge monitor only).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: gauge
         * 
         * @param notifyHigh the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder notifyHigh(boolean notifyHigh) {
            doSetProperty("notifyHigh", notifyHigh);
            return this;
        }
        /**
         * If true, the gauge will fire a notification when the high threshold
         * is exceeded (gauge monitor only).
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: gauge
         * 
         * @param notifyHigh the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder notifyHigh(String notifyHigh) {
            doSetProperty("notifyHigh", notifyHigh);
            return this;
        }
        /**
         * If true, the gauge will fire a notification when the low threshold is
         * exceeded (gauge monitor only).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: gauge
         * 
         * @param notifyLow the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder notifyLow(boolean notifyLow) {
            doSetProperty("notifyLow", notifyLow);
            return this;
        }
        /**
         * If true, the gauge will fire a notification when the low threshold is
         * exceeded (gauge monitor only).
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: gauge
         * 
         * @param notifyLow the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder notifyLow(String notifyLow) {
            doSetProperty("notifyLow", notifyLow);
            return this;
        }
        /**
         * Value for the gauge's high threshold (gauge monitor only).
         * 
         * The option is a: &lt;code&gt;java.lang.Double&lt;/code&gt; type.
         * 
         * Group: gauge
         * 
         * @param thresholdHigh the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder thresholdHigh(Double thresholdHigh) {
            doSetProperty("thresholdHigh", thresholdHigh);
            return this;
        }
        /**
         * Value for the gauge's high threshold (gauge monitor only).
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Double&lt;/code&gt; type.
         * 
         * Group: gauge
         * 
         * @param thresholdHigh the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder thresholdHigh(String thresholdHigh) {
            doSetProperty("thresholdHigh", thresholdHigh);
            return this;
        }
        /**
         * Value for the gauge's low threshold (gauge monitor only).
         * 
         * The option is a: &lt;code&gt;java.lang.Double&lt;/code&gt; type.
         * 
         * Group: gauge
         * 
         * @param thresholdLow the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder thresholdLow(Double thresholdLow) {
            doSetProperty("thresholdLow", thresholdLow);
            return this;
        }
        /**
         * Value for the gauge's low threshold (gauge monitor only).
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Double&lt;/code&gt; type.
         * 
         * Group: gauge
         * 
         * @param thresholdLow the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder thresholdLow(String thresholdLow) {
            doSetProperty("thresholdLow", thresholdLow);
            return this;
        }
        /**
         * Credentials for making a remote connection.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Credentials for making a remote connection.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param user the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder user(String user) {
            doSetProperty("user", user);
            return this;
        }
        /**
         * If true, will fire a notification when the string attribute differs
         * from the string to compare (string monitor or consumer). By default
         * the consumer will notify match if observed attribute and string to
         * compare has been configured.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: string
         * 
         * @param notifyDiffer the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder notifyDiffer(boolean notifyDiffer) {
            doSetProperty("notifyDiffer", notifyDiffer);
            return this;
        }
        /**
         * If true, will fire a notification when the string attribute differs
         * from the string to compare (string monitor or consumer). By default
         * the consumer will notify match if observed attribute and string to
         * compare has been configured.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: string
         * 
         * @param notifyDiffer the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder notifyDiffer(String notifyDiffer) {
            doSetProperty("notifyDiffer", notifyDiffer);
            return this;
        }
        /**
         * If true, will fire a notification when the string attribute matches
         * the string to compare (string monitor or consumer). By default the
         * consumer will notify match if observed attribute and string to
         * compare has been configured.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: string
         * 
         * @param notifyMatch the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder notifyMatch(boolean notifyMatch) {
            doSetProperty("notifyMatch", notifyMatch);
            return this;
        }
        /**
         * If true, will fire a notification when the string attribute matches
         * the string to compare (string monitor or consumer). By default the
         * consumer will notify match if observed attribute and string to
         * compare has been configured.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: string
         * 
         * @param notifyMatch the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder notifyMatch(String notifyMatch) {
            doSetProperty("notifyMatch", notifyMatch);
            return this;
        }
        /**
         * Value for attribute to compare (string monitor or consumer). By
         * default the consumer will notify match if observed attribute and
         * string to compare has been configured.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: string
         * 
         * @param stringToCompare the value to set
         * @return the dsl builder
         */
        default JMXEndpointBuilder stringToCompare(String stringToCompare) {
            doSetProperty("stringToCompare", stringToCompare);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the JMX component.
     */
    public interface AdvancedJMXEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default JMXEndpointBuilder basic() {
            return (JMXEndpointBuilder) this;
        }

        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions (if possible) occurred while the Camel
         * consumer is trying to pickup incoming messages, or the likes, will
         * now be processed as a message and handled by the routing Error
         * Handler. Important: This is only possible if the 3rd party component
         * allows Camel to be alerted if an exception was thrown. Some
         * components handle this internally only, and therefore
         * bridgeErrorHandler is not possible. In other situations we may
         * improve the Camel component to hook into the 3rd party component and
         * make this possible for future releases. By default the consumer will
         * use the org.apache.camel.spi.ExceptionHandler to deal with
         * exceptions, that will be logged at WARN or ERROR level and ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedJMXEndpointBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions (if possible) occurred while the Camel
         * consumer is trying to pickup incoming messages, or the likes, will
         * now be processed as a message and handled by the routing Error
         * Handler. Important: This is only possible if the 3rd party component
         * allows Camel to be alerted if an exception was thrown. Some
         * components handle this internally only, and therefore
         * bridgeErrorHandler is not possible. In other situations we may
         * improve the Camel component to hook into the 3rd party component and
         * make this possible for future releases. By default the consumer will
         * use the org.apache.camel.spi.ExceptionHandler to deal with
         * exceptions, that will be logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedJMXEndpointBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedJMXEndpointBuilder exceptionHandler(org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedJMXEndpointBuilder exceptionHandler(String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedJMXEndpointBuilder exchangePattern(org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedJMXEndpointBuilder exchangePattern(String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * To use a custom shared thread pool for the consumers. By default each
         * consume has their own thread-pool to process and route notifications.
         * 
         * The option is a:
         * &lt;code&gt;java.util.concurrent.ExecutorService&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param executorService the value to set
         * @return the dsl builder
         */
        default AdvancedJMXEndpointBuilder executorService(ExecutorService executorService) {
            doSetProperty("executorService", executorService);
            return this;
        }
        /**
         * To use a custom shared thread pool for the consumers. By default each
         * consume has their own thread-pool to process and route notifications.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.concurrent.ExecutorService&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param executorService the value to set
         * @return the dsl builder
         */
        default AdvancedJMXEndpointBuilder executorService(String executorService) {
            doSetProperty("executorService", executorService);
            return this;
        }
        /**
         * Value to handback to the listener when a notification is received.
         * This value will be put in the message header with the key
         * JMXConstants#JMX_HANDBACK.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param handback the value to set
         * @return the dsl builder
         */
        default AdvancedJMXEndpointBuilder handback(Object handback) {
            doSetProperty("handback", handback);
            return this;
        }
        /**
         * Value to handback to the listener when a notification is received.
         * This value will be put in the message header with the key
         * JMXConstants#JMX_HANDBACK.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param handback the value to set
         * @return the dsl builder
         */
        default AdvancedJMXEndpointBuilder handback(String handback) {
            doSetProperty("handback", handback);
            return this;
        }
        /**
         * Reference to a bean that implements the NotificationFilter.
         * 
         * The option is a:
         * &lt;code&gt;javax.management.NotificationFilter&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param notificationFilter the value to set
         * @return the dsl builder
         */
        default AdvancedJMXEndpointBuilder notificationFilter(javax.management.NotificationFilter notificationFilter) {
            doSetProperty("notificationFilter", notificationFilter);
            return this;
        }
        /**
         * Reference to a bean that implements the NotificationFilter.
         * 
         * The option will be converted to a
         * &lt;code&gt;javax.management.NotificationFilter&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param notificationFilter the value to set
         * @return the dsl builder
         */
        default AdvancedJMXEndpointBuilder notificationFilter(String notificationFilter) {
            doSetProperty("notificationFilter", notificationFilter);
            return this;
        }
        /**
         * Properties for the object name. These values will be used if the
         * objectName param is not set.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.String&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the
         * objectProperties(String, Object) method to add a value (call the
         * method multiple times to set more values).
         * 
         * Group: advanced
         * 
         * @param key the option key
         * @param value the option value
         * @return the dsl builder
         */
        default AdvancedJMXEndpointBuilder objectProperties(String key, Object value) {
            doSetMultiValueProperty("objectProperties", "key." + key, value);
            return this;
        }
        /**
         * Properties for the object name. These values will be used if the
         * objectName param is not set.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.String&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the
         * objectProperties(String, Object) method to add a value (call the
         * method multiple times to set more values).
         * 
         * Group: advanced
         * 
         * @param values the values
         * @return the dsl builder
         */
        default AdvancedJMXEndpointBuilder objectProperties(Map values) {
            doSetMultiValueProperties("objectProperties", "key.", values);
            return this;
        }
        /**
         * The number of seconds to wait before attempting to retry
         * establishment of the initial connection or attempt to reconnect a
         * lost connection.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 10
         * Group: advanced
         * 
         * @param reconnectDelay the value to set
         * @return the dsl builder
         */
        default AdvancedJMXEndpointBuilder reconnectDelay(int reconnectDelay) {
            doSetProperty("reconnectDelay", reconnectDelay);
            return this;
        }
        /**
         * The number of seconds to wait before attempting to retry
         * establishment of the initial connection or attempt to reconnect a
         * lost connection.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 10
         * Group: advanced
         * 
         * @param reconnectDelay the value to set
         * @return the dsl builder
         */
        default AdvancedJMXEndpointBuilder reconnectDelay(String reconnectDelay) {
            doSetProperty("reconnectDelay", reconnectDelay);
            return this;
        }
        /**
         * If true the consumer will attempt to reconnect to the JMX server when
         * any connection failure occurs. The consumer will attempt to
         * re-establish the JMX connection every 'x' seconds until the
         * connection is made-- where 'x' is the configured reconnectionDelay.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param reconnectOnConnectionFailure the value to set
         * @return the dsl builder
         */
        default AdvancedJMXEndpointBuilder reconnectOnConnectionFailure(boolean reconnectOnConnectionFailure) {
            doSetProperty("reconnectOnConnectionFailure", reconnectOnConnectionFailure);
            return this;
        }
        /**
         * If true the consumer will attempt to reconnect to the JMX server when
         * any connection failure occurs. The consumer will attempt to
         * re-establish the JMX connection every 'x' seconds until the
         * connection is made-- where 'x' is the configured reconnectionDelay.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param reconnectOnConnectionFailure the value to set
         * @return the dsl builder
         */
        default AdvancedJMXEndpointBuilder reconnectOnConnectionFailure(String reconnectOnConnectionFailure) {
            doSetProperty("reconnectOnConnectionFailure", reconnectOnConnectionFailure);
            return this;
        }
        /**
         * If true the consumer will throw an exception if unable to establish
         * the JMX connection upon startup. If false, the consumer will attempt
         * to establish the JMX connection every 'x' seconds until the
         * connection is made -- where 'x' is the configured reconnectionDelay.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param testConnectionOnStartup the value to set
         * @return the dsl builder
         */
        default AdvancedJMXEndpointBuilder testConnectionOnStartup(boolean testConnectionOnStartup) {
            doSetProperty("testConnectionOnStartup", testConnectionOnStartup);
            return this;
        }
        /**
         * If true the consumer will throw an exception if unable to establish
         * the JMX connection upon startup. If false, the consumer will attempt
         * to establish the JMX connection every 'x' seconds until the
         * connection is made -- where 'x' is the configured reconnectionDelay.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param testConnectionOnStartup the value to set
         * @return the dsl builder
         */
        default AdvancedJMXEndpointBuilder testConnectionOnStartup(String testConnectionOnStartup) {
            doSetProperty("testConnectionOnStartup", testConnectionOnStartup);
            return this;
        }
    }

    public interface JMXBuilders {
        /**
         * JMX (camel-jmx)
         * Receive JMX notifications.
         * 
         * Category: monitoring
         * Since: 2.6
         * Maven coordinates: org.apache.camel:camel-jmx
         * 
         * @return the dsl builder for the headers' name.
         */
        default JMXHeaderNameBuilder jmx() {
            return JMXHeaderNameBuilder.INSTANCE;
        }
        /**
         * JMX (camel-jmx)
         * Receive JMX notifications.
         * 
         * Category: monitoring
         * Since: 2.6
         * Maven coordinates: org.apache.camel:camel-jmx
         * 
         * Syntax: <code>jmx:serverURL</code>
         * 
         * Path parameter: serverURL
         * Server url comes from the remaining endpoint. Use platform to connect
         * to local JVM.
         * 
         * @param path serverURL
         * @return the dsl builder
         */
        default JMXEndpointBuilder jmx(String path) {
            return JMXEndpointBuilderFactory.endpointBuilder("jmx", path);
        }
        /**
         * JMX (camel-jmx)
         * Receive JMX notifications.
         * 
         * Category: monitoring
         * Since: 2.6
         * Maven coordinates: org.apache.camel:camel-jmx
         * 
         * Syntax: <code>jmx:serverURL</code>
         * 
         * Path parameter: serverURL
         * Server url comes from the remaining endpoint. Use platform to connect
         * to local JVM.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path serverURL
         * @return the dsl builder
         */
        default JMXEndpointBuilder jmx(String componentName, String path) {
            return JMXEndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    /**
     * The builder of headers' name for the JMX component.
     */
    public static class JMXHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final JMXHeaderNameBuilder INSTANCE = new JMXHeaderNameBuilder();

        /**
         * The handback.
         * 
         * The option is a: {@code Object} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code jmx.handback}.
         */
        public String jmxHandback() {
            return "jmx.handback";
        }
    }
    static JMXEndpointBuilder endpointBuilder(String componentName, String path) {
        class JMXEndpointBuilderImpl extends AbstractEndpointBuilder implements JMXEndpointBuilder, AdvancedJMXEndpointBuilder {
            public JMXEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new JMXEndpointBuilderImpl(path);
    }
}