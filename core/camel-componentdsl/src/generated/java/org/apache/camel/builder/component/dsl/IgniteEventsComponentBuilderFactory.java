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
import org.apache.camel.component.ignite.events.IgniteEventsComponent;

/**
 * Receive events from an Ignite cluster by creating a local event listener.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface IgniteEventsComponentBuilderFactory {

    /**
     * Ignite Events (camel-ignite)
     * Receive events from an Ignite cluster by creating a local event listener.
     * 
     * Category: messaging,eventbus
     * Since: 2.17
     * Maven coordinates: org.apache.camel:camel-ignite
     */
    static IgniteEventsComponentBuilder igniteEvents() {
        return new IgniteEventsComponentBuilderImpl();
    }

    /**
     * Builder for the Ignite Events component.
     */
    interface IgniteEventsComponentBuilder
            extends
                ComponentBuilder<IgniteEventsComponent> {
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default IgniteEventsComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The resource from where to load the configuration. It can be a: URL,
         * String or InputStream type.
         * 
         * The option is a: <code>java.lang.Object</code> type.
         * 
         * Group: consumer
         */
        default IgniteEventsComponentBuilder configurationResource(
                java.lang.Object configurationResource) {
            doSetProperty("configurationResource", configurationResource);
            return this;
        }
        /**
         * To use an existing Ignite instance.
         * 
         * The option is a: <code>org.apache.ignite.Ignite</code> type.
         * 
         * Group: consumer
         */
        default IgniteEventsComponentBuilder ignite(
                org.apache.ignite.Ignite ignite) {
            doSetProperty("ignite", ignite);
            return this;
        }
        /**
         * Allows the user to set a programmatic ignite configuration.
         * 
         * The option is a:
         * <code>org.apache.ignite.configuration.IgniteConfiguration</code>
         * type.
         * 
         * Group: consumer
         */
        default IgniteEventsComponentBuilder igniteConfiguration(
                org.apache.ignite.configuration.IgniteConfiguration igniteConfiguration) {
            doSetProperty("igniteConfiguration", igniteConfiguration);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        @Deprecated
        default IgniteEventsComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
    }

    class IgniteEventsComponentBuilderImpl
            extends
                AbstractComponentBuilder<IgniteEventsComponent>
            implements
                IgniteEventsComponentBuilder {
        @Override
        protected IgniteEventsComponent buildConcreteComponent() {
            return new IgniteEventsComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((IgniteEventsComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "configurationResource": ((IgniteEventsComponent) component).setConfigurationResource((java.lang.Object) value); return true;
            case "ignite": ((IgniteEventsComponent) component).setIgnite((org.apache.ignite.Ignite) value); return true;
            case "igniteConfiguration": ((IgniteEventsComponent) component).setIgniteConfiguration((org.apache.ignite.configuration.IgniteConfiguration) value); return true;
            case "basicPropertyBinding": ((IgniteEventsComponent) component).setBasicPropertyBinding((boolean) value); return true;
            default: return false;
            }
        }
    }
}