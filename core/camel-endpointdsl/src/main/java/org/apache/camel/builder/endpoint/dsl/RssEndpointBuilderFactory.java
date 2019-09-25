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
package org.apache.camel.builder.endpoint.dsl;

import java.util.Date;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The rss component is used for consuming RSS feeds.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface RssEndpointBuilderFactory {


    /**
     * Builder for endpoint for the RSS component.
     */
    public interface RssEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedRssEndpointBuilder advanced() {
            return (AdvancedRssEndpointBuilder) this;
        }
        /**
         * Sets whether to add the feed object as a header.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder feedHeader(boolean feedHeader) {
            doSetProperty("feedHeader", feedHeader);
            return this;
        }
        /**
         * Sets whether to add the feed object as a header.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder feedHeader(String feedHeader) {
            doSetProperty("feedHeader", feedHeader);
            return this;
        }
        /**
         * Sets whether to use filtering or not of the entries.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder filter(boolean filter) {
            doSetProperty("filter", filter);
            return this;
        }
        /**
         * Sets whether to use filtering or not of the entries.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder filter(String filter) {
            doSetProperty("filter", filter);
            return this;
        }
        /**
         * Sets the timestamp to be used for filtering entries from the atom
         * feeds. This options is only in conjunction with the splitEntries.
         * 
         * The option is a: <code>java.util.Date</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder lastUpdate(Date lastUpdate) {
            doSetProperty("lastUpdate", lastUpdate);
            return this;
        }
        /**
         * Sets the timestamp to be used for filtering entries from the atom
         * feeds. This options is only in conjunction with the splitEntries.
         * 
         * The option will be converted to a <code>java.util.Date</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder lastUpdate(String lastUpdate) {
            doSetProperty("lastUpdate", lastUpdate);
            return this;
        }
        /**
         * Sets the password to be used for basic authentication when polling
         * from a HTTP feed.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Sets whether to sort entries by published date. Only works when
         * splitEntries = true.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder sortEntries(boolean sortEntries) {
            doSetProperty("sortEntries", sortEntries);
            return this;
        }
        /**
         * Sets whether to sort entries by published date. Only works when
         * splitEntries = true.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder sortEntries(String sortEntries) {
            doSetProperty("sortEntries", sortEntries);
            return this;
        }
        /**
         * Sets whether or not entries should be sent individually or whether
         * the entire feed should be sent as a single message.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder splitEntries(boolean splitEntries) {
            doSetProperty("splitEntries", splitEntries);
            return this;
        }
        /**
         * Sets whether or not entries should be sent individually or whether
         * the entire feed should be sent as a single message.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder splitEntries(String splitEntries) {
            doSetProperty("splitEntries", splitEntries);
            return this;
        }
        /**
         * Sets whether all entries identified in a single feed poll should be
         * delivered immediately. If true, only one entry is processed per
         * consumer.delay. Only applicable when splitEntries = true.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder throttleEntries(boolean throttleEntries) {
            doSetProperty("throttleEntries", throttleEntries);
            return this;
        }
        /**
         * Sets whether all entries identified in a single feed poll should be
         * delivered immediately. If true, only one entry is processed per
         * consumer.delay. Only applicable when splitEntries = true.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder throttleEntries(String throttleEntries) {
            doSetProperty("throttleEntries", throttleEntries);
            return this;
        }
        /**
         * Sets the username to be used for basic authentication when polling
         * from a HTTP feed.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the RSS component.
     */
    public interface AdvancedRssEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default RssEndpointBuilder basic() {
            return (RssEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedRssEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedRssEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedRssEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedRssEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * RSS (camel-rss)
     * The rss component is used for consuming RSS feeds.
     * 
     * Category: rss
     * Available as of version: 2.0
     * Maven coordinates: org.apache.camel:camel-rss
     * 
     * Syntax: <code>rss:feedUri</code>
     * 
     * Path parameter: feedUri (required)
     * The URI to the feed to poll.
     */
    default RssEndpointBuilder rss(String path) {
        class RssEndpointBuilderImpl extends AbstractEndpointBuilder implements RssEndpointBuilder, AdvancedRssEndpointBuilder {
            public RssEndpointBuilderImpl(String path) {
                super("rss", path);
            }
        }
        return new RssEndpointBuilderImpl(path);
    }
}