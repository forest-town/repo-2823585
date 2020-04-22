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

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Perform caching operations using Caffeine Cache with an attached CacheLoader.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CaffeineLoadCacheEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Caffeine LoadCache component.
     */
    public interface CaffeineLoadCacheEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedCaffeineLoadCacheEndpointBuilder advanced() {
            return (AdvancedCaffeineLoadCacheEndpointBuilder) this;
        }
        /**
         * To configure the default cache action. If an action is set in the
         * message header, then the operation from the header takes precedence.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder action(String action) {
            doSetProperty("action", action);
            return this;
        }
        /**
         * To configure an already instantiated cache to be used.
         * 
         * The option is a:
         * <code>com.github.benmanes.caffeine.cache.LoadingCache</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder cache(Object cache) {
            doSetProperty("cache", cache);
            return this;
        }
        /**
         * To configure an already instantiated cache to be used.
         * 
         * The option will be converted to a
         * <code>com.github.benmanes.caffeine.cache.LoadingCache</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder cache(String cache) {
            doSetProperty("cache", cache);
            return this;
        }
        /**
         * To configure a CacheLoader in case of a LoadCache use.
         * 
         * The option is a:
         * <code>com.github.benmanes.caffeine.cache.CacheLoader</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder cacheLoader(Object cacheLoader) {
            doSetProperty("cacheLoader", cacheLoader);
            return this;
        }
        /**
         * To configure a CacheLoader in case of a LoadCache use.
         * 
         * The option will be converted to a
         * <code>com.github.benmanes.caffeine.cache.CacheLoader</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder cacheLoader(String cacheLoader) {
            doSetProperty("cacheLoader", cacheLoader);
            return this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder createCacheIfNotExist(
                boolean createCacheIfNotExist) {
            doSetProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder createCacheIfNotExist(
                String createCacheIfNotExist) {
            doSetProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
        /**
         * Set the eviction Type for this cache.
         * 
         * The option is a:
         * <code>org.apache.camel.component.caffeine.EvictionType</code> type.
         * 
         * Default: SIZE_BASED
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder evictionType(
                EvictionType evictionType) {
            doSetProperty("evictionType", evictionType);
            return this;
        }
        /**
         * Set the eviction Type for this cache.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.caffeine.EvictionType</code> type.
         * 
         * Default: SIZE_BASED
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder evictionType(
                String evictionType) {
            doSetProperty("evictionType", evictionType);
            return this;
        }
        /**
         * Set the expire After Access Time in case of time based Eviction (in
         * seconds).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 300
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder expireAfterAccessTime(
                int expireAfterAccessTime) {
            doSetProperty("expireAfterAccessTime", expireAfterAccessTime);
            return this;
        }
        /**
         * Set the expire After Access Time in case of time based Eviction (in
         * seconds).
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 300
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder expireAfterAccessTime(
                String expireAfterAccessTime) {
            doSetProperty("expireAfterAccessTime", expireAfterAccessTime);
            return this;
        }
        /**
         * Set the expire After Access Write in case of time based Eviction (in
         * seconds).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 300
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder expireAfterWriteTime(
                int expireAfterWriteTime) {
            doSetProperty("expireAfterWriteTime", expireAfterWriteTime);
            return this;
        }
        /**
         * Set the expire After Access Write in case of time based Eviction (in
         * seconds).
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 300
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder expireAfterWriteTime(
                String expireAfterWriteTime) {
            doSetProperty("expireAfterWriteTime", expireAfterWriteTime);
            return this;
        }
        /**
         * Set the initial Capacity for the cache.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 10000
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder initialCapacity(
                int initialCapacity) {
            doSetProperty("initialCapacity", initialCapacity);
            return this;
        }
        /**
         * Set the initial Capacity for the cache.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 10000
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder initialCapacity(
                String initialCapacity) {
            doSetProperty("initialCapacity", initialCapacity);
            return this;
        }
        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence.
         * 
         * The option is a: <code>java.lang.Object</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder key(Object key) {
            doSetProperty("key", key);
            return this;
        }
        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence.
         * 
         * The option will be converted to a <code>java.lang.Object</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder key(String key) {
            doSetProperty("key", key);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Set the maximum size for the cache.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 10000
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder maximumSize(int maximumSize) {
            doSetProperty("maximumSize", maximumSize);
            return this;
        }
        /**
         * Set the maximum size for the cache.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 10000
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder maximumSize(String maximumSize) {
            doSetProperty("maximumSize", maximumSize);
            return this;
        }
        /**
         * Set a specific removal Listener for the cache.
         * 
         * The option is a:
         * <code>com.github.benmanes.caffeine.cache.RemovalListener</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder removalListener(
                Object removalListener) {
            doSetProperty("removalListener", removalListener);
            return this;
        }
        /**
         * Set a specific removal Listener for the cache.
         * 
         * The option will be converted to a
         * <code>com.github.benmanes.caffeine.cache.RemovalListener</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder removalListener(
                String removalListener) {
            doSetProperty("removalListener", removalListener);
            return this;
        }
        /**
         * Set a specific Stats Counter for the cache stats.
         * 
         * The option is a:
         * <code>com.github.benmanes.caffeine.cache.stats.StatsCounter</code>
         * type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder statsCounter(
                Object statsCounter) {
            doSetProperty("statsCounter", statsCounter);
            return this;
        }
        /**
         * Set a specific Stats Counter for the cache stats.
         * 
         * The option will be converted to a
         * <code>com.github.benmanes.caffeine.cache.stats.StatsCounter</code>
         * type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder statsCounter(
                String statsCounter) {
            doSetProperty("statsCounter", statsCounter);
            return this;
        }
        /**
         * To enable stats on the cache.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder statsEnabled(
                boolean statsEnabled) {
            doSetProperty("statsEnabled", statsEnabled);
            return this;
        }
        /**
         * To enable stats on the cache.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default CaffeineLoadCacheEndpointBuilder statsEnabled(
                String statsEnabled) {
            doSetProperty("statsEnabled", statsEnabled);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Caffeine LoadCache component.
     */
    public interface AdvancedCaffeineLoadCacheEndpointBuilder
            extends
                EndpointProducerBuilder {
        default CaffeineLoadCacheEndpointBuilder basic() {
            return (CaffeineLoadCacheEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedCaffeineLoadCacheEndpointBuilder basicPropertyBinding(
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
         * Default: false
         * Group: advanced
         */
        default AdvancedCaffeineLoadCacheEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The cache key type, default java.lang.Object.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AdvancedCaffeineLoadCacheEndpointBuilder keyType(String keyType) {
            doSetProperty("keyType", keyType);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedCaffeineLoadCacheEndpointBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedCaffeineLoadCacheEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * The cache value type, default java.lang.Object.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AdvancedCaffeineLoadCacheEndpointBuilder valueType(
                String valueType) {
            doSetProperty("valueType", valueType);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.caffeine.EvictionType</code> enum.
     */
    enum EvictionType {
        SIZE_BASED,
        TIME_BASED;
    }

    public interface CaffeineLoadCacheBuilders {
        /**
         * Caffeine LoadCache (camel-caffeine)
         * Perform caching operations using Caffeine Cache with an attached
         * CacheLoader.
         * 
         * Category: cache,datagrid,clustering
         * Since: 2.20
         * Maven coordinates: org.apache.camel:camel-caffeine
         * 
         * Syntax: <code>caffeine-loadcache:cacheName</code>
         * 
         * Path parameter: cacheName (required)
         * the cache name
         */
        default CaffeineLoadCacheEndpointBuilder caffeineLoadcache(String path) {
            return CaffeineLoadCacheEndpointBuilderFactory.caffeineLoadcache(path);
        }
    }
    /**
     * Caffeine LoadCache (camel-caffeine)
     * Perform caching operations using Caffeine Cache with an attached
     * CacheLoader.
     * 
     * Category: cache,datagrid,clustering
     * Since: 2.20
     * Maven coordinates: org.apache.camel:camel-caffeine
     * 
     * Syntax: <code>caffeine-loadcache:cacheName</code>
     * 
     * Path parameter: cacheName (required)
     * the cache name
     */
    static CaffeineLoadCacheEndpointBuilder caffeineLoadcache(String path) {
        class CaffeineLoadCacheEndpointBuilderImpl extends AbstractEndpointBuilder implements CaffeineLoadCacheEndpointBuilder, AdvancedCaffeineLoadCacheEndpointBuilder {
            public CaffeineLoadCacheEndpointBuilderImpl(String path) {
                super("caffeine-loadcache", path);
            }
        }
        return new CaffeineLoadCacheEndpointBuilderImpl(path);
    }
}