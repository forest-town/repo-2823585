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
package org.apache.camel.main;

import org.apache.camel.LoggingLevel;
import org.apache.camel.spi.BootstrapCloseable;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.Metadata;

/**
 * Debugger configuration.
 */
@Configurer(bootstrap = true)
public class DebuggerConfigurationProperties implements BootstrapCloseable {

    private MainConfigurationProperties parent;

    @Metadata
    private boolean enabled;
    @Metadata(label = "advanced")
    private boolean waitForAttach;
    @Metadata(defaultValue = "INFO")
    private LoggingLevel loggingLevel = LoggingLevel.INFO;
    @Metadata
    private String breakpoints;
    @Metadata(label = "advanced")
    private boolean singleStepFirst;
    @Metadata(label = "advanced")
    private boolean singleStepLast;
    @Metadata(defaultValue = "131072")
    private int bodyMaxChars = 128 * 1024;
    @Metadata
    private boolean bodyIncludeStreams;
    @Metadata(defaultValue = "true")
    private boolean bodyIncludeFiles = true;
    @Metadata(defaultValue = "true")
    private boolean includeExchangeProperties = true;
    @Metadata(defaultValue = "true")
    private boolean includeException = true;

    public DebuggerConfigurationProperties(MainConfigurationProperties parent) {
        this.parent = parent;
    }

    public MainConfigurationProperties end() {
        return parent;
    }

    @Override
    public void close() {
        parent = null;
    }

    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Enables Debugger in your Camel application.
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isWaitForAttach() {
        return waitForAttach;
    }

    /**
     * Whether the debugger should suspend on startup, and wait for a remote debugger to attach. This is what the IDEA
     * and VSCode tooling is using.
     */
    public void setWaitForAttach(boolean waitForAttach) {
        this.waitForAttach = waitForAttach;
    }

    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    /**
     * The debugger logging level to use when logging activity.
     */
    public void setLoggingLevel(LoggingLevel loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    public String getBreakpoints() {
        return breakpoints;
    }

    /**
     * Allows to pre-configure breakpoints (node ids) to use with debugger on startup. Multiple ids can be separated by
     * comma. Use special value FIRST_ROUTES to add a breakpoint for the first node for every route, in other words this
     * makes it easy to debug from the beginning of every route without knowing the exact node ids.
     */
    public void setBreakpoints(String breakpoints) {
        this.breakpoints = breakpoints;
    }

    public boolean isSingleStepFirst() {
        return singleStepFirst;
    }

    /**
     * In single step mode, then when the exchange is created, then simulate a breakpoint as first, that allows to
     * suspend and watch the incoming exchange at the route (you can see message body as response, failed exception
     * etc).
     */
    public void setSingleStepFirst(boolean singleStepFirst) {
        this.singleStepFirst = singleStepFirst;
    }

    public boolean isSingleStepLast() {
        return singleStepLast;
    }

    /**
     * In single step mode, then when the exchange is complete, then simulate a breakpoint as last, that allows to
     * suspend and watch the exchange when complete (you can see message body as response, failed exception etc).
     */
    public void setSingleStepLast(boolean singleStepLast) {
        this.singleStepLast = singleStepLast;
    }

    public int getBodyMaxChars() {
        return bodyMaxChars;
    }

    /**
     * To limit the message body to a maximum size in the traced message. Use 0 or negative value to use unlimited size.
     */
    public void setBodyMaxChars(int bodyMaxChars) {
        this.bodyMaxChars = bodyMaxChars;
    }

    public boolean isBodyIncludeStreams() {
        return bodyIncludeStreams;
    }

    /**
     * Whether to include the message body of stream based messages. If enabled then beware the stream may not be
     * re-readable later. See more about Stream Caching.
     */
    public void setBodyIncludeStreams(boolean bodyIncludeStreams) {
        this.bodyIncludeStreams = bodyIncludeStreams;
    }

    public boolean isBodyIncludeFiles() {
        return bodyIncludeFiles;
    }

    /**
     * Whether to include the message body of file based messages. The overhead is that the file content has to be read
     * from the file.
     */
    public void setBodyIncludeFiles(boolean bodyIncludeFiles) {
        this.bodyIncludeFiles = bodyIncludeFiles;
    }

    public boolean isIncludeExchangeProperties() {
        return includeExchangeProperties;
    }

    /**
     * Whether to include the exchange properties in the traced message
     */
    public void setIncludeExchangeProperties(boolean includeExchangeProperties) {
        this.includeExchangeProperties = includeExchangeProperties;
    }

    /**
     * Trace messages to include exception if the message failed
     */
    public boolean isIncludeException() {
        return includeException;
    }

    /**
     * Trace messages to include exception if the message failed
     */
    public void setIncludeException(boolean includeException) {
        this.includeException = includeException;
    }

    /**
     * Enables Debugger in your Camel application.
     */
    public DebuggerConfigurationProperties withEnabled(boolean enabled) {
        this.enabled = enabled;
        return (DebuggerConfigurationProperties) this;
    }

    /**
     * Whether the debugger should suspend on startup, and wait for a remote debugger to attach. This is what the IDEA
     * and VSCode tooling is using.
     */
    public DebuggerConfigurationProperties withWaitForAttach(boolean waitForAttach) {
        this.waitForAttach = waitForAttach;
        return (DebuggerConfigurationProperties) this;
    }

    /**
     * The debugger logging level to use when logging activity.
     */
    public DebuggerConfigurationProperties withLoggingLevel(LoggingLevel loggingLevel) {
        this.loggingLevel = loggingLevel;
        return (DebuggerConfigurationProperties) this;
    }

    /**
     * Allows to pre-configure breakpoints (node ids) to use with debugger on startup. Multiple ids can be separated by
     * comma. Use special value FIRST_ROUTES to add a breakpoint for the first node for every route, in other words this
     * makes it easy to debug from the beginning of every route without knowing the exact node ids.
     */
    public DebuggerConfigurationProperties withBreakpoints(String breakpoints) {
        this.breakpoints = breakpoints;
        return (DebuggerConfigurationProperties) this;
    }

    /**
     * In single step mode, then when the exchange is created, then simulate a breakpoint as first, that allows to
     * suspend and watch the incoming exchange at the route (you can see message body as response, failed exception
     * etc).
     */
    public DebuggerConfigurationProperties withSingleStepFirst(boolean singleStepFirst) {
        this.singleStepFirst = singleStepFirst;
        return (DebuggerConfigurationProperties) this;
    }

    /**
     * In single step mode, then when the exchange is complete, then simulate a breakpoint as last, that allows to
     * suspend and watch the exchange when complete (you can see message body as response, failed exception etc).
     */
    public DebuggerConfigurationProperties withSingleStepLast(boolean singleStepLast) {
        this.singleStepLast = singleStepLast;
        return (DebuggerConfigurationProperties) this;
    }

    /**
     * To limit the message body to a maximum size in the traced message. Use 0 or negative value to use unlimited size.
     */
    public DebuggerConfigurationProperties withBodyMaxChars(int bodyMaxChars) {
        this.bodyMaxChars = bodyMaxChars;
        return (DebuggerConfigurationProperties) this;
    }

    /**
     * Whether to include the message body of stream based messages. If enabled then beware the stream may not be
     * re-readable later. See more about Stream Caching.
     */
    public DebuggerConfigurationProperties withBodyIncludeStreams(boolean bodyIncludeStreams) {
        this.bodyIncludeStreams = bodyIncludeStreams;
        return (DebuggerConfigurationProperties) this;
    }

    /**
     * Whether to include the message body of file based messages. The overhead is that the file content has to be read
     * from the file.
     */
    public DebuggerConfigurationProperties withBodyIncludeFiles(boolean bodyIncludeFiles) {
        this.bodyIncludeFiles = bodyIncludeFiles;
        return (DebuggerConfigurationProperties) this;
    }

    /**
     * Whether to include the exchange properties in the traced message
     */
    public DebuggerConfigurationProperties withIncludeExchangeProperties(boolean includeExchangeProperties) {
        this.includeExchangeProperties = includeExchangeProperties;
        return (DebuggerConfigurationProperties) this;
    }

    /**
     * Trace messages to include exception if the message failed
     */
    public DebuggerConfigurationProperties withIncludeException(boolean includeException) {
        this.includeException = includeException;
        return (DebuggerConfigurationProperties) this;
    }

}
