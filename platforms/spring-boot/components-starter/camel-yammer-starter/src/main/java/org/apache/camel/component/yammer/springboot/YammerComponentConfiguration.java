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
package org.apache.camel.component.yammer.springboot;

import org.apache.camel.component.yammer.ApiRequestor;
import org.apache.camel.component.yammer.YammerFunctionType;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The yammer component allows you to interact with the Yammer enterprise social
 * network.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.yammer")
public class YammerComponentConfiguration {

    /**
     * The consumer key
     */
    private String consumerKey;
    /**
     * The consumer secret
     */
    private String consumerSecret;
    /**
     * The access token
     */
    private String accessToken;
    /**
     * To use a shared yammer configuration
     */
    private YammerConfigurationNestedConfiguration config;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public String getConsumerKey() {
        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    public String getConsumerSecret() {
        return consumerSecret;
    }

    public void setConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public YammerConfigurationNestedConfiguration getConfig() {
        return config;
    }

    public void setConfig(YammerConfigurationNestedConfiguration config) {
        this.config = config;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class YammerConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.yammer.YammerConfiguration.class;
        /**
         * The consumer key
         */
        private String consumerKey;
        /**
         * The consumer secret
         */
        private String consumerSecret;
        /**
         * Delay between polling in millis
         */
        private Long delay;
        /**
         * The access token
         */
        private String accessToken;
        /**
         * The function to use
         */
        private YammerFunctionType functionType;
        /**
         * The function to use
         */
        private String function;
        /**
         * Set to true if you want to use raw JSON rather than converting to
         * POJOs.
         */
        private Boolean useJson;
        private ApiRequestor requestor;
        /**
         * Return only the specified number of messages. Works for threaded=true
         * and threaded=extended.
         */
        private Integer limit;
        /**
         * Returns messages older than the message ID specified as a numeric
         * string. This is useful for paginating messages. For example, if
         * you're currently viewing 20 messages and the oldest is number 2912,
         * you could append "?olderThan=2912″ to your request to get the 20
         * messages prior to those you're seeing.
         */
        private Integer olderThan;
        /**
         * Returns messages newer than the message ID specified as a numeric
         * string. This should be used when polling for new messages. If you're
         * looking at messages, and the most recent message returned is 3516,
         * you can make a request with the parameter "?newerThan=3516″ to ensure
         * that you do not get duplicate copies of messages already on your
         * page.
         */
        private Integer newerThan;
        /**
         * threaded=true will only return the first message in each thread. This
         * parameter is intended for apps which display message threads
         * collapsed. threaded=extended will return the thread starter messages
         * in order of most recently active as well as the two most recent
         * messages, as they are viewed in the default view on the Yammer web
         * interface.
         */
        private String threaded;
        /**
         * The user id
         */
        private String userId;

        public String getConsumerKey() {
            return consumerKey;
        }

        public void setConsumerKey(String consumerKey) {
            this.consumerKey = consumerKey;
        }

        public String getConsumerSecret() {
            return consumerSecret;
        }

        public void setConsumerSecret(String consumerSecret) {
            this.consumerSecret = consumerSecret;
        }

        public Long getDelay() {
            return delay;
        }

        public void setDelay(Long delay) {
            this.delay = delay;
        }

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

        public YammerFunctionType getFunctionType() {
            return functionType;
        }

        public void setFunctionType(YammerFunctionType functionType) {
            this.functionType = functionType;
        }

        public String getFunction() {
            return function;
        }

        public void setFunction(String function) {
            this.function = function;
        }

        public Boolean getUseJson() {
            return useJson;
        }

        public void setUseJson(Boolean useJson) {
            this.useJson = useJson;
        }

        public ApiRequestor getRequestor() {
            return requestor;
        }

        public void setRequestor(ApiRequestor requestor) {
            this.requestor = requestor;
        }

        public Integer getLimit() {
            return limit;
        }

        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        public Integer getOlderThan() {
            return olderThan;
        }

        public void setOlderThan(Integer olderThan) {
            this.olderThan = olderThan;
        }

        public Integer getNewerThan() {
            return newerThan;
        }

        public void setNewerThan(Integer newerThan) {
            this.newerThan = newerThan;
        }

        public String getThreaded() {
            return threaded;
        }

        public void setThreaded(String threaded) {
            this.threaded = threaded;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }
    }
}