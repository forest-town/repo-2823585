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
package org.apache.camel.component.consul;

import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;
import org.apache.camel.util.ObjectHelper;
import org.apache.camel.util.jsse.SSLContextParameters;

@UriParams
public class ConsulConfiguration {
    @UriParam
    private String url;

    @UriParam(label = "security")
    private SSLContextParameters sslContextParameters;
    @UriParam(label = "security")
    private String aclToken;
    @UriParam(label = "security")
    private String userName;
    @UriParam(label = "security")
    private String password;

    @UriParam
    private Long connectTimeoutMillis;
    @UriParam
    private Long readTimeoutMillis;
    @UriParam
    private Long writeTimeoutMillis;
    @UriParam(defaultValue = "true")
    private boolean pingInstance = true;


    @UriParam(label = "producer")
    private String action;

    @UriParam(label = "producer,kv", defaultValue = "false")
    private boolean valueAsString;

    @UriParam
    private String key;

    @UriParam(label = "consumer,watch", defaultValue = "10")
    private Integer blockSeconds = 10;

    @UriParam(label = "consumer,watch", defaultValue = "0")
    private long firstIndex;

    @UriParam(label = "consumer,watch", defaultValue = "false")
    private boolean recursive;


    public String getUrl() {
        return url;
    }

    /**
     * The Consul agent URL
     */
    public void setUrl(String url) {
        this.url = url;
    }

    public SSLContextParameters getSslContextParameters() {
        return sslContextParameters;
    }

    /**
     * SSL configuration using an org.apache.camel.util.jsse.SSLContextParameters
     * instance.
     */
    public void setSslContextParameters(SSLContextParameters sslContextParameters) {
        this.sslContextParameters = sslContextParameters;
    }

    public String getAclToken() {
        return aclToken;
    }

    /**
     * Sets the ACL token to be used with Consul
     */
    public void setAclToken(String aclToken) {
        this.aclToken = aclToken;
    }

    public String getAction() {
        return action;
    }

    public String getUserName() {
        return userName;
    }

    /**
     * Sets the username to be used for basic authentication
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    /**
     * Sets the password to be used for basic authentication
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean requiresBasicAuthentication() {
        return ObjectHelper.isNotEmpty(userName) && ObjectHelper.isNotEmpty(password);
    }

    public Long getConnectTimeoutMillis() {
        return connectTimeoutMillis;
    }

    /**
     * Connect timeout for OkHttpClient
     */
    public void setConnectTimeoutMillis(Long connectTimeoutMillis) {
        this.connectTimeoutMillis = connectTimeoutMillis;
    }

    public Long getReadTimeoutMillis() {
        return readTimeoutMillis;
    }

    /**
     * Read timeout for OkHttpClient
     */
    public void setReadTimeoutMillis(Long readTimeoutMillis) {
        this.readTimeoutMillis = readTimeoutMillis;
    }

    public Long getWriteTimeoutMillis() {
        return writeTimeoutMillis;
    }

    /**
     * Write timeout for OkHttpClient
     */
    public void setWriteTimeoutMillis(Long writeTimeoutMillis) {
        this.writeTimeoutMillis = writeTimeoutMillis;
    }

    public boolean isPingInstance() {
        return pingInstance;
    }

    /**
     * Configure if the AgentClient should attempt a ping before returning the Consul instance
     */
    public void setPingInstance(boolean pingInstance) {
        this.pingInstance = pingInstance;
    }

    /**
     * The default action. Can be overridden by CamelConsulAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    public boolean isValueAsString() {
        return valueAsString;
    }

    /**
     * Default to transform values retrieved from Consul i.e. on KV endpoint to
     * string.
     */
    public void setValueAsString(boolean valueAsString) {
        this.valueAsString = valueAsString;
    }

    public String getKey() {
        return key;
    }

    /**
     * The default key. Can be overridden by CamelConsulKey
     */
    public void setKey(String key) {
        this.key = key;
    }

    public Integer getBlockSeconds() {
        return blockSeconds;
    }

    /**
     * The second to wait for a watch event, default 10 seconds
     */
    public void setBlockSeconds(Integer blockSeconds) {
        this.blockSeconds = blockSeconds;
    }

    public long getFirstIndex() {
        return firstIndex;
    }

    /**
     * The first index for watch for, default 0
     */
    public void setFirstIndex(long firstIndex) {
        this.firstIndex = firstIndex;
    }

    public boolean isRecursive() {
        return recursive;
    }

    /**
     * Recursively watch, default false
     */
    public void setRecursive(boolean recursive) {
        this.recursive = recursive;
    }
}
