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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.pubnub.PubNubComponent;

/**
 * Send and receive messages to/from PubNub data stream network for connected
 * devices.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface PubnubComponentBuilderFactory {

    /**
     * PubNub (camel-pubnub)
     * Send and receive messages to/from PubNub data stream network for
     * connected devices.
     * 
     * Category: cloud,iot,messaging
     * Since: 2.19
     * Maven coordinates: org.apache.camel:camel-pubnub
     * 
     * @return the dsl builder
     */
    static PubnubComponentBuilder pubnub() {
        return new PubnubComponentBuilderImpl();
    }

    /**
     * Builder for the PubNub component.
     */
    interface PubnubComponentBuilder
            extends
                ComponentBuilder<PubNubComponent> {
        /**
         * The component configurations.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.pubnub.PubNubConfiguration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default PubnubComponentBuilder configuration(
                org.apache.camel.component.pubnub.PubNubConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * UUID to be used as a device identifier, a default UUID is generated
         * if not passed.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param uuid the value to set
         * @return the dsl builder
         */
        default PubnubComponentBuilder uuid(java.lang.String uuid) {
            doSetProperty("uuid", uuid);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default PubnubComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Also subscribe to related presence information.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param withPresence the value to set
         * @return the dsl builder
         */
        default PubnubComponentBuilder withPresence(boolean withPresence) {
            doSetProperty("withPresence", withPresence);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default PubnubComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to perform. PUBLISH: Default. Send a message to all
         * subscribers of a channel. FIRE: allows the client to send a message
         * to BLOCKS Event Handlers. These messages will go directly to any
         * Event Handlers registered on the channel. HERENOW: Obtain information
         * about the current state of a channel including a list of unique
         * user-ids currently subscribed to the channel and the total occupancy
         * count. WHERENOW: Obtain information about the current list of
         * channels to which a uuid is subscribed to. GETSTATE: Used to get
         * key/value pairs specific to a subscriber uuid. State information is
         * supplied as a JSON object of key/value pairs SETSTATE: Used to set
         * key/value pairs specific to a subscriber uuid GETHISTORY: Fetches
         * historical messages of a channel.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default PubnubComponentBuilder operation(java.lang.String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default PubnubComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * If Access Manager is utilized, client will use this authKey in all
         * restricted requests.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param authKey the value to set
         * @return the dsl builder
         */
        default PubnubComponentBuilder authKey(java.lang.String authKey) {
            doSetProperty("authKey", authKey);
            return this;
        }
        /**
         * If cipher is passed, all communications to/from PubNub will be
         * encrypted.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param cipherKey the value to set
         * @return the dsl builder
         */
        default PubnubComponentBuilder cipherKey(java.lang.String cipherKey) {
            doSetProperty("cipherKey", cipherKey);
            return this;
        }
        /**
         * The publish key obtained from your PubNub account. Required when
         * publishing messages.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param publishKey the value to set
         * @return the dsl builder
         */
        default PubnubComponentBuilder publishKey(java.lang.String publishKey) {
            doSetProperty("publishKey", publishKey);
            return this;
        }
        /**
         * The secret key used for message signing.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default PubnubComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Use SSL for secure transmission.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: security
         * 
         * @param secure the value to set
         * @return the dsl builder
         */
        default PubnubComponentBuilder secure(boolean secure) {
            doSetProperty("secure", secure);
            return this;
        }
        /**
         * The subscribe key obtained from your PubNub account. Required when
         * subscribing to channels or listening for presence events.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param subscribeKey the value to set
         * @return the dsl builder
         */
        default PubnubComponentBuilder subscribeKey(
                java.lang.String subscribeKey) {
            doSetProperty("subscribeKey", subscribeKey);
            return this;
        }
    }

    class PubnubComponentBuilderImpl
            extends
                AbstractComponentBuilder<PubNubComponent>
            implements
                PubnubComponentBuilder {
        @Override
        protected PubNubComponent buildConcreteComponent() {
            return new PubNubComponent();
        }
        private org.apache.camel.component.pubnub.PubNubConfiguration getOrCreateConfiguration(
                org.apache.camel.component.pubnub.PubNubComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.pubnub.PubNubConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((PubNubComponent) component).setConfiguration((org.apache.camel.component.pubnub.PubNubConfiguration) value); return true;
            case "uuid": getOrCreateConfiguration((PubNubComponent) component).setUuid((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((PubNubComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "withPresence": getOrCreateConfiguration((PubNubComponent) component).setWithPresence((boolean) value); return true;
            case "lazyStartProducer": ((PubNubComponent) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((PubNubComponent) component).setOperation((java.lang.String) value); return true;
            case "autowiredEnabled": ((PubNubComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "authKey": getOrCreateConfiguration((PubNubComponent) component).setAuthKey((java.lang.String) value); return true;
            case "cipherKey": getOrCreateConfiguration((PubNubComponent) component).setCipherKey((java.lang.String) value); return true;
            case "publishKey": getOrCreateConfiguration((PubNubComponent) component).setPublishKey((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((PubNubComponent) component).setSecretKey((java.lang.String) value); return true;
            case "secure": getOrCreateConfiguration((PubNubComponent) component).setSecure((boolean) value); return true;
            case "subscribeKey": getOrCreateConfiguration((PubNubComponent) component).setSubscribeKey((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}