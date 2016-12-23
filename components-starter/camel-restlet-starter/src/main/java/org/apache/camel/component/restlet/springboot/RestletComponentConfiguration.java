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
package org.apache.camel.component.restlet.springboot;

import java.util.List;
import org.apache.camel.spi.HeaderFilterStrategy;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * Component for consuming and producing Restful resources using Restlet.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.restlet")
public class RestletComponentConfiguration {

    /**
     * Indicates if the controller thread should be a daemon (not blocking JVM
     * exit).
     */
    private Boolean controllerDaemon;
    /**
     * Time for the controller thread to sleep between each control.
     */
    private Integer controllerSleepTimeMs;
    /**
     * The size of the buffer when reading messages.
     */
    private Integer inboundBufferSize;
    /**
     * Maximum number of concurrent connections per host (IP address).
     */
    private Integer maxConnectionsPerHost;
    /**
     * Maximum threads that will service requests.
     */
    private Integer maxThreads;
    /**
     * Number of worker threads determining when the connector is considered
     * overloaded.
     */
    private Integer lowThreads;
    /**
     * Maximum number of concurrent connections in total.
     */
    private Integer maxTotalConnections;
    /**
     * Minimum threads waiting to service requests.
     */
    private Integer minThreads;
    /**
     * The size of the buffer when writing messages.
     */
    private Integer outboundBufferSize;
    /**
     * Indicates if connections should be kept alive after a call.
     */
    private Boolean persistingConnections;
    /**
     * Indicates if pipelining connections are supported.
     */
    private Boolean pipeliningConnections;
    /**
     * Time for an idle thread to wait for an operation before being collected.
     */
    private Integer threadMaxIdleTimeMs;
    /**
     * Lookup the X-Forwarded-For header supported by popular proxies and caches
     * and uses it to populate the Request.getClientAddresses() method result.
     * This information is only safe for intermediary components within your
     * local network. Other addresses could easily be changed by setting a fake
     * header and should not be trusted for serious security checks.
     */
    private Boolean useForwardedForHeader;
    /**
     * Enable/disable the SO_REUSEADDR socket option. See
     * java.io.ServerSocketreuseAddress property for additional details.
     */
    private Boolean reuseAddress;
    /**
     * Maximum number of calls that can be queued if there aren't any worker
     * thread available to service them. If the value is '0' then no queue is
     * used and calls are rejected if no worker thread is immediately available.
     * If the value is '-1' then an unbounded queue is used and calls are never
     * rejected.
     */
    private Integer maxQueued;
    /**
     * Determines whether or not the raw input stream from Restlet is cached or
     * not (Camel will read the stream into a in memory/overflow to file Stream
     * caching) cache. By default Camel will cache the Restlet input stream to
     * support reading it multiple times to ensure Camel can retrieve all data
     * from the stream. However you can set this option to true when you for
     * example need to access the raw stream such as streaming it directly to a
     * file or other persistent store. DefaultRestletBinding will copy the
     * request input stream into a stream cache and put it into message body if
     * this option is false to support reading the stream multiple times.
     */
    private Boolean disableStreamCache = false;
    /**
     * To configure the port number for the restlet consumer routes. This allows
     * to configure this once to reuse the same port for these consumers.
     */
    private Integer port;
    /**
     * Whether to use synchronous Restlet Client for the producer. Setting this
     * option to true can yield faster performance as it seems the Restlet
     * synchronous Client works better.
     */
    private Boolean synchronous;
    /**
     * A list of converters to enable as full class name or simple class name.
     * All the converters automatically registered are enabled if empty or null
     */
    private List<String> enabledConverters;
    /**
     * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
     * header to and from Camel message.
     */
    @NestedConfigurationProperty
    private HeaderFilterStrategy headerFilterStrategy;

    public Boolean getControllerDaemon() {
        return controllerDaemon;
    }

    public void setControllerDaemon(Boolean controllerDaemon) {
        this.controllerDaemon = controllerDaemon;
    }

    public Integer getControllerSleepTimeMs() {
        return controllerSleepTimeMs;
    }

    public void setControllerSleepTimeMs(Integer controllerSleepTimeMs) {
        this.controllerSleepTimeMs = controllerSleepTimeMs;
    }

    public Integer getInboundBufferSize() {
        return inboundBufferSize;
    }

    public void setInboundBufferSize(Integer inboundBufferSize) {
        this.inboundBufferSize = inboundBufferSize;
    }

    public Integer getMaxConnectionsPerHost() {
        return maxConnectionsPerHost;
    }

    public void setMaxConnectionsPerHost(Integer maxConnectionsPerHost) {
        this.maxConnectionsPerHost = maxConnectionsPerHost;
    }

    public Integer getMaxThreads() {
        return maxThreads;
    }

    public void setMaxThreads(Integer maxThreads) {
        this.maxThreads = maxThreads;
    }

    public Integer getLowThreads() {
        return lowThreads;
    }

    public void setLowThreads(Integer lowThreads) {
        this.lowThreads = lowThreads;
    }

    public Integer getMaxTotalConnections() {
        return maxTotalConnections;
    }

    public void setMaxTotalConnections(Integer maxTotalConnections) {
        this.maxTotalConnections = maxTotalConnections;
    }

    public Integer getMinThreads() {
        return minThreads;
    }

    public void setMinThreads(Integer minThreads) {
        this.minThreads = minThreads;
    }

    public Integer getOutboundBufferSize() {
        return outboundBufferSize;
    }

    public void setOutboundBufferSize(Integer outboundBufferSize) {
        this.outboundBufferSize = outboundBufferSize;
    }

    public Boolean getPersistingConnections() {
        return persistingConnections;
    }

    public void setPersistingConnections(Boolean persistingConnections) {
        this.persistingConnections = persistingConnections;
    }

    public Boolean getPipeliningConnections() {
        return pipeliningConnections;
    }

    public void setPipeliningConnections(Boolean pipeliningConnections) {
        this.pipeliningConnections = pipeliningConnections;
    }

    public Integer getThreadMaxIdleTimeMs() {
        return threadMaxIdleTimeMs;
    }

    public void setThreadMaxIdleTimeMs(Integer threadMaxIdleTimeMs) {
        this.threadMaxIdleTimeMs = threadMaxIdleTimeMs;
    }

    public Boolean getUseForwardedForHeader() {
        return useForwardedForHeader;
    }

    public void setUseForwardedForHeader(Boolean useForwardedForHeader) {
        this.useForwardedForHeader = useForwardedForHeader;
    }

    public Boolean getReuseAddress() {
        return reuseAddress;
    }

    public void setReuseAddress(Boolean reuseAddress) {
        this.reuseAddress = reuseAddress;
    }

    public Integer getMaxQueued() {
        return maxQueued;
    }

    public void setMaxQueued(Integer maxQueued) {
        this.maxQueued = maxQueued;
    }

    public Boolean getDisableStreamCache() {
        return disableStreamCache;
    }

    public void setDisableStreamCache(Boolean disableStreamCache) {
        this.disableStreamCache = disableStreamCache;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Boolean getSynchronous() {
        return synchronous;
    }

    public void setSynchronous(Boolean synchronous) {
        this.synchronous = synchronous;
    }

    public List<String> getEnabledConverters() {
        return enabledConverters;
    }

    public void setEnabledConverters(List<String> enabledConverters) {
        this.enabledConverters = enabledConverters;
    }

    public HeaderFilterStrategy getHeaderFilterStrategy() {
        return headerFilterStrategy;
    }

    public void setHeaderFilterStrategy(
            HeaderFilterStrategy headerFilterStrategy) {
        this.headerFilterStrategy = headerFilterStrategy;
    }
}