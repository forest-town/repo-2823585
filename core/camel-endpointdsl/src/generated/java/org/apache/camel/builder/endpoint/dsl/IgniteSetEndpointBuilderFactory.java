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
 * Interact with .
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface IgniteSetEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Ignite Sets component.
     */
    public interface IgniteSetEndpointBuilder extends EndpointProducerBuilder {
        /**
         * The collection configuration. Default: empty configuration. &lt;p&gt;
         * You can also conveniently set inner properties by using
         * &lt;tt&gt;configuration.xyz=123 options.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.ignite.configuration.CollectionConfiguration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default IgniteSetEndpointBuilder configuration(Object configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * The collection configuration. Default: empty configuration. &lt;p&gt;
         * You can also conveniently set inner properties by using
         * &lt;tt&gt;configuration.xyz=123 options.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.ignite.configuration.CollectionConfiguration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default IgniteSetEndpointBuilder configuration(String configuration) {
            doSetProperty("configuration", configuration);
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
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default IgniteSetEndpointBuilder lazyStartProducer(
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
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default IgniteSetEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to invoke on the Ignite Set. Superseded by the
         * IgniteConstants.IGNITE_SETS_OPERATION header in the IN message.
         * Possible values: CONTAINS, ADD, SIZE, REMOVE, ITERATOR, CLEAR,
         * RETAIN_ALL, ARRAY.The set operation to perform.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.ignite.set.IgniteSetOperation&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default IgniteSetEndpointBuilder operation(IgniteSetOperation operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to invoke on the Ignite Set. Superseded by the
         * IgniteConstants.IGNITE_SETS_OPERATION header in the IN message.
         * Possible values: CONTAINS, ADD, SIZE, REMOVE, ITERATOR, CLEAR,
         * RETAIN_ALL, ARRAY.The set operation to perform.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.ignite.set.IgniteSetOperation&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default IgniteSetEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param propagateIncomingBodyIfNoReturnValue the value to set
         * @return the dsl builder
         */
        default IgniteSetEndpointBuilder propagateIncomingBodyIfNoReturnValue(
                boolean propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param propagateIncomingBodyIfNoReturnValue the value to set
         * @return the dsl builder
         */
        default IgniteSetEndpointBuilder propagateIncomingBodyIfNoReturnValue(
                String propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param treatCollectionsAsCacheObjects the value to set
         * @return the dsl builder
         */
        default IgniteSetEndpointBuilder treatCollectionsAsCacheObjects(
                boolean treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param treatCollectionsAsCacheObjects the value to set
         * @return the dsl builder
         */
        default IgniteSetEndpointBuilder treatCollectionsAsCacheObjects(
                String treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.ignite.set.IgniteSetOperation</code>
     * enum.
     */
    enum IgniteSetOperation {
        CONTAINS,
        ADD,
        SIZE,
        REMOVE,
        ITERATOR,
        CLEAR,
        RETAIN_ALL,
        ARRAY;
    }

    public interface IgniteSetBuilders {
        /**
         * Ignite Sets (camel-ignite)
         * Interact with .
         * 
         * Category: cache,compute
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-ignite
         * 
         * Syntax: <code>ignite-set:name</code>
         * 
         * Path parameter: name (required)
         * The set name.
         * 
         * @param path name
         * @return the dsl builder
         */
        default IgniteSetEndpointBuilder igniteSet(String path) {
            return IgniteSetEndpointBuilderFactory.endpointBuilder("ignite-set", path);
        }
        /**
         * Ignite Sets (camel-ignite)
         * Interact with .
         * 
         * Category: cache,compute
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-ignite
         * 
         * Syntax: <code>ignite-set:name</code>
         * 
         * Path parameter: name (required)
         * The set name.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path name
         * @return the dsl builder
         */
        default IgniteSetEndpointBuilder igniteSet(
                String componentName,
                String path) {
            return IgniteSetEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static IgniteSetEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class IgniteSetEndpointBuilderImpl extends AbstractEndpointBuilder implements IgniteSetEndpointBuilder {
            public IgniteSetEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new IgniteSetEndpointBuilderImpl(path);
    }
}