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
import org.apache.camel.component.zookeepermaster.MasterComponent;

/**
 * Represents an endpoint which only becomes active when it obtains the master
 * lock
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface ZookeeperMasterComponentBuilderFactory {

    /**
     * ZooKeeper Master (camel-zookeeper-master)
     * Represents an endpoint which only becomes active when it obtains the
     * master lock
     * 
     * Category: clustering
     * Since: 2.19
     * Maven coordinates: org.apache.camel:camel-zookeeper-master
     */
    static ZookeeperMasterComponentBuilder zookeeperMaster() {
        return new ZookeeperMasterComponentBuilderImpl();
    }

    /**
     * Builder for the ZooKeeper Master component.
     */
    interface ZookeeperMasterComponentBuilder
            extends
                ComponentBuilder<MasterComponent> {
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
        default ZookeeperMasterComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Timeout in millis to use when connecting to the zookeeper ensemble.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 10000
         * Group: consumer
         */
        default ZookeeperMasterComponentBuilder maximumConnectionTimeout(
                int maximumConnectionTimeout) {
            doSetProperty("maximumConnectionTimeout", maximumConnectionTimeout);
            return this;
        }
        /**
         * The root path to use in zookeeper where information is stored which
         * nodes are master/slave etc. Will by default use:
         * /camel/zookeepermaster/clusters/master.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: /camel/zookeepermaster/clusters/master
         * Group: consumer
         */
        default ZookeeperMasterComponentBuilder zkRoot(java.lang.String zkRoot) {
            doSetProperty("zkRoot", zkRoot);
            return this;
        }
        /**
         * The url for the zookeeper ensemble.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: localhost:2181
         * Group: consumer
         */
        default ZookeeperMasterComponentBuilder zooKeeperUrl(
                java.lang.String zooKeeperUrl) {
            doSetProperty("zooKeeperUrl", zooKeeperUrl);
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
        default ZookeeperMasterComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use a custom ContainerIdFactory for creating container ids.
         * 
         * The option is a:
         * <code>org.apache.camel.component.zookeepermaster.ContainerIdFactory</code> type.
         * 
         * Group: advanced
         */
        default ZookeeperMasterComponentBuilder containerIdFactory(
                org.apache.camel.component.zookeepermaster.ContainerIdFactory containerIdFactory) {
            doSetProperty("containerIdFactory", containerIdFactory);
            return this;
        }
        /**
         * To use a custom configured CuratorFramework as connection to
         * zookeeper ensemble.
         * 
         * The option is a:
         * <code>org.apache.curator.framework.CuratorFramework</code> type.
         * 
         * Group: advanced
         */
        default ZookeeperMasterComponentBuilder curator(
                org.apache.curator.framework.CuratorFramework curator) {
            doSetProperty("curator", curator);
            return this;
        }
        /**
         * The password to use when connecting to the zookeeper ensemble.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ZookeeperMasterComponentBuilder zooKeeperPassword(
                java.lang.String zooKeeperPassword) {
            doSetProperty("zooKeeperPassword", zooKeeperPassword);
            return this;
        }
    }

    class ZookeeperMasterComponentBuilderImpl
            extends
                AbstractComponentBuilder<MasterComponent>
            implements
                ZookeeperMasterComponentBuilder {
        @Override
        protected MasterComponent buildConcreteComponent() {
            return new MasterComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((MasterComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "maximumConnectionTimeout": ((MasterComponent) component).setMaximumConnectionTimeout((int) value); return true;
            case "zkRoot": ((MasterComponent) component).setZkRoot((java.lang.String) value); return true;
            case "zooKeeperUrl": ((MasterComponent) component).setZooKeeperUrl((java.lang.String) value); return true;
            case "basicPropertyBinding": ((MasterComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "containerIdFactory": ((MasterComponent) component).setContainerIdFactory((org.apache.camel.component.zookeepermaster.ContainerIdFactory) value); return true;
            case "curator": ((MasterComponent) component).setCurator((org.apache.curator.framework.CuratorFramework) value); return true;
            case "zooKeeperPassword": ((MasterComponent) component).setZooKeeperPassword((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}