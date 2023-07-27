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

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.pg.replication.slot.PgReplicationSlotComponent;

/**
 * Poll for PostgreSQL Write-Ahead Log (WAL) records using Streaming Replication
 * Slots.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface PgReplicationSlotComponentBuilderFactory {

    /**
     * PostgresSQL Replication Slot (camel-pg-replication-slot)
     * Poll for PostgreSQL Write-Ahead Log (WAL) records using Streaming
     * Replication Slots.
     * 
     * Category: database
     * Since: 3.0
     * Maven coordinates: org.apache.camel:camel-pg-replication-slot
     * 
     * @return the dsl builder
     */
    static PgReplicationSlotComponentBuilder pgReplicationSlot() {
        return new PgReplicationSlotComponentBuilderImpl();
    }

    /**
     * Builder for the PostgresSQL Replication Slot component.
     */
    interface PgReplicationSlotComponentBuilder
            extends
                ComponentBuilder<PgReplicationSlotComponent> {
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
        default PgReplicationSlotComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
        default PgReplicationSlotComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * Used for enabling or disabling all consumer based health checks from
         * this component.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckConsumerEnabled the value to set
         * @return the dsl builder
         */
        default PgReplicationSlotComponentBuilder healthCheckConsumerEnabled(
                boolean healthCheckConsumerEnabled) {
            doSetProperty("healthCheckConsumerEnabled", healthCheckConsumerEnabled);
            return this;
        }
        /**
         * Used for enabling or disabling all health checks from this component.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckEnabled the value to set
         * @return the dsl builder
         */
        default PgReplicationSlotComponentBuilder healthCheckEnabled(
                boolean healthCheckEnabled) {
            doSetProperty("healthCheckEnabled", healthCheckEnabled);
            return this;
        }
        /**
         * Used for enabling or disabling all producer based health checks from
         * this component.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckProducerEnabled the value to set
         * @return the dsl builder
         */
        default PgReplicationSlotComponentBuilder healthCheckProducerEnabled(
                boolean healthCheckProducerEnabled) {
            doSetProperty("healthCheckProducerEnabled", healthCheckProducerEnabled);
            return this;
        }
    }

    class PgReplicationSlotComponentBuilderImpl
            extends
                AbstractComponentBuilder<PgReplicationSlotComponent>
            implements
                PgReplicationSlotComponentBuilder {
        @Override
        protected PgReplicationSlotComponent buildConcreteComponent() {
            return new PgReplicationSlotComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((PgReplicationSlotComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "autowiredEnabled": ((PgReplicationSlotComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "healthCheckConsumerEnabled": ((PgReplicationSlotComponent) component).setHealthCheckConsumerEnabled((boolean) value); return true;
            case "healthCheckEnabled": ((PgReplicationSlotComponent) component).setHealthCheckEnabled((boolean) value); return true;
            case "healthCheckProducerEnabled": ((PgReplicationSlotComponent) component).setHealthCheckProducerEnabled((boolean) value); return true;
            default: return false;
            }
        }
    }
}