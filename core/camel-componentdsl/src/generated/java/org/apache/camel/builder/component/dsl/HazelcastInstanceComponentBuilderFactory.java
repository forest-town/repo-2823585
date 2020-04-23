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
import org.apache.camel.component.hazelcast.instance.HazelcastInstanceComponent;

/**
 * Consume join/leave events of a cache instance in a Hazelcast cluster.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface HazelcastInstanceComponentBuilderFactory {

    /**
     * Hazelcast Instance (camel-hazelcast)
     * Consume join/leave events of a cache instance in a Hazelcast cluster.
     * 
     * Category: cache,datagrid
     * Since: 2.7
     * Maven coordinates: org.apache.camel:camel-hazelcast
     */
    static HazelcastInstanceComponentBuilder hazelcastInstance() {
        return new HazelcastInstanceComponentBuilderImpl();
    }

    /**
     * Builder for the Hazelcast Instance component.
     */
    interface HazelcastInstanceComponentBuilder
            extends
                ComponentBuilder<HazelcastInstanceComponent> {
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
        default HazelcastInstanceComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
        default HazelcastInstanceComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance.
         * 
         * The option is a: <code>com.hazelcast.core.HazelcastInstance</code>
         * type.
         * 
         * Group: advanced
         */
        default HazelcastInstanceComponentBuilder hazelcastInstance(
                com.hazelcast.core.HazelcastInstance hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast mode reference which kind of instance should be used.
         * If you don't specify the mode, then the node mode will be the
         * default.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: node
         * Group: advanced
         */
        default HazelcastInstanceComponentBuilder hazelcastMode(
                java.lang.String hazelcastMode) {
            doSetProperty("hazelcastMode", hazelcastMode);
            return this;
        }
    }

    class HazelcastInstanceComponentBuilderImpl
            extends
                AbstractComponentBuilder<HazelcastInstanceComponent>
            implements
                HazelcastInstanceComponentBuilder {
        @Override
        protected HazelcastInstanceComponent buildConcreteComponent() {
            return new HazelcastInstanceComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((HazelcastInstanceComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "basicPropertyBinding": ((HazelcastInstanceComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "hazelcastInstance": ((HazelcastInstanceComponent) component).setHazelcastInstance((com.hazelcast.core.HazelcastInstance) value); return true;
            case "hazelcastMode": ((HazelcastInstanceComponent) component).setHazelcastMode((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}