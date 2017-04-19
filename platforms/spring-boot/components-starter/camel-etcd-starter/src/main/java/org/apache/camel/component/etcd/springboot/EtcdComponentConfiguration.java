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
package org.apache.camel.component.etcd.springboot;

import javax.annotation.Generated;
import org.apache.camel.CamelContext;
import org.apache.camel.util.jsse.SSLContextParameters;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * The camel etcd component allows you to work with Etcd a distributed reliable
 * key-value store.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.etcd")
public class EtcdComponentConfiguration {

    /**
     * To set the URIs the client connects.
     */
    private String uris;
    /**
     * To configure security using SSLContextParameters.
     */
    @NestedConfigurationProperty
    private SSLContextParameters sslContextParameters;
    /**
     * The user name to use for basic authentication.
     */
    private String userName;
    /**
     * The password to use for basic authentication.
     */
    private String password;
    /**
     * Sets the common configuration shared among endpoints
     */
    private EtcdConfigurationNestedConfiguration configuration;
    /**
     * Enable usage of global SSL context parameters.
     */
    private Boolean useGlobalSslContextParameters = false;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public String getUris() {
        return uris;
    }

    public void setUris(String uris) {
        this.uris = uris;
    }

    public SSLContextParameters getSslContextParameters() {
        return sslContextParameters;
    }

    public void setSslContextParameters(
            SSLContextParameters sslContextParameters) {
        this.sslContextParameters = sslContextParameters;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EtcdConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            EtcdConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getUseGlobalSslContextParameters() {
        return useGlobalSslContextParameters;
    }

    public void setUseGlobalSslContextParameters(
            Boolean useGlobalSslContextParameters) {
        this.useGlobalSslContextParameters = useGlobalSslContextParameters;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class EtcdConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.etcd.EtcdConfiguration.class;
        private CamelContext camelContext;
        /**
         * To set the URIs the client connects.
         */
        private String uris = "http://localhost:2379,http://localhost:4001";
        /**
         * To configure security using SSLContextParameters.
         */
        @NestedConfigurationProperty
        private SSLContextParameters sslContextParameters;
        /**
         * The user name to use for basic authentication.
         */
        private String userName;
        /**
         * The password to use for basic authentication.
         */
        private String password;
        /**
         * To send an empty message in case of timeout watching for a key.
         */
        private Boolean sendEmptyExchangeOnTimeout = false;
        /**
         * To apply an action recursively.
         */
        private Boolean recursive = false;
        /**
         * To set the lifespan of a key in milliseconds.
         */
        private Integer timeToLive;
        /**
         * To set the maximum time an action could take to complete.
         */
        private Long timeout;
        /**
         * The index to watch from
         */
        private Long fromIndex = 0L;
        /**
         * The path to look for for service discovery
         */
        private String servicePath = "/services/";

        public CamelContext getCamelContext() {
            return camelContext;
        }

        public void setCamelContext(CamelContext camelContext) {
            this.camelContext = camelContext;
        }

        public String getUris() {
            return uris;
        }

        public void setUris(String uris) {
            this.uris = uris;
        }

        public SSLContextParameters getSslContextParameters() {
            return sslContextParameters;
        }

        public void setSslContextParameters(
                SSLContextParameters sslContextParameters) {
            this.sslContextParameters = sslContextParameters;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Boolean getSendEmptyExchangeOnTimeout() {
            return sendEmptyExchangeOnTimeout;
        }

        public void setSendEmptyExchangeOnTimeout(
                Boolean sendEmptyExchangeOnTimeout) {
            this.sendEmptyExchangeOnTimeout = sendEmptyExchangeOnTimeout;
        }

        public Boolean getRecursive() {
            return recursive;
        }

        public void setRecursive(Boolean recursive) {
            this.recursive = recursive;
        }

        public Integer getTimeToLive() {
            return timeToLive;
        }

        public void setTimeToLive(Integer timeToLive) {
            this.timeToLive = timeToLive;
        }

        public Long getTimeout() {
            return timeout;
        }

        public void setTimeout(Long timeout) {
            this.timeout = timeout;
        }

        public Long getFromIndex() {
            return fromIndex;
        }

        public void setFromIndex(Long fromIndex) {
            this.fromIndex = fromIndex;
        }

        public String getServicePath() {
            return servicePath;
        }

        public void setServicePath(String servicePath) {
            this.servicePath = servicePath;
        }
    }
}