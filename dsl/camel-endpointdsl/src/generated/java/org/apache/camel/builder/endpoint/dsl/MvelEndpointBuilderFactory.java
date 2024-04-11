/* Generated by camel build tools - do NOT edit this file! */
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

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Transform messages using an MVEL template.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MvelEndpointBuilderFactory {

    /**
     * Builder for endpoint for the MVEL component.
     */
    public interface MvelEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedMvelEndpointBuilder advanced() {
            return (AdvancedMvelEndpointBuilder) this;
        }

        /**
         * Sets whether the context map should allow access to all details. By
         * default only the message body and headers can be accessed. This
         * option can be enabled for full access to the current Exchange and
         * CamelContext. Doing so impose a potential security risk as this opens
         * access to the full power of CamelContext API.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param allowContextMapAll the value to set
         * @return the dsl builder
         */
        default MvelEndpointBuilder allowContextMapAll(boolean allowContextMapAll) {
            doSetProperty("allowContextMapAll", allowContextMapAll);
            return this;
        }
        /**
         * Sets whether the context map should allow access to all details. By
         * default only the message body and headers can be accessed. This
         * option can be enabled for full access to the current Exchange and
         * CamelContext. Doing so impose a potential security risk as this opens
         * access to the full power of CamelContext API.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param allowContextMapAll the value to set
         * @return the dsl builder
         */
        default MvelEndpointBuilder allowContextMapAll(String allowContextMapAll) {
            doSetProperty("allowContextMapAll", allowContextMapAll);
            return this;
        }
        /**
         * Whether to allow to use resource template from header or not (default
         * false). Enabling this allows to specify dynamic templates via message
         * header. However this can be seen as a potential security
         * vulnerability if the header is coming from a malicious user, so use
         * this with care.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param allowTemplateFromHeader the value to set
         * @return the dsl builder
         */
        default MvelEndpointBuilder allowTemplateFromHeader(boolean allowTemplateFromHeader) {
            doSetProperty("allowTemplateFromHeader", allowTemplateFromHeader);
            return this;
        }
        /**
         * Whether to allow to use resource template from header or not (default
         * false). Enabling this allows to specify dynamic templates via message
         * header. However this can be seen as a potential security
         * vulnerability if the header is coming from a malicious user, so use
         * this with care.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param allowTemplateFromHeader the value to set
         * @return the dsl builder
         */
        default MvelEndpointBuilder allowTemplateFromHeader(String allowTemplateFromHeader) {
            doSetProperty("allowTemplateFromHeader", allowTemplateFromHeader);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param contentCache the value to set
         * @return the dsl builder
         */
        default MvelEndpointBuilder contentCache(boolean contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param contentCache the value to set
         * @return the dsl builder
         */
        default MvelEndpointBuilder contentCache(String contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Character encoding of the resource content.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param encoding the value to set
         * @return the dsl builder
         */
        default MvelEndpointBuilder encoding(String encoding) {
            doSetProperty("encoding", encoding);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the MVEL component.
     */
    public interface AdvancedMvelEndpointBuilder
            extends
                EndpointProducerBuilder {
        default MvelEndpointBuilder basic() {
            return (MvelEndpointBuilder) this;
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
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedMvelEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedMvelEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface MvelBuilders {
        /**
         * MVEL (camel-mvel)
         * Transform messages using an MVEL template.
         * 
         * Category: transformation,script
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-mvel
         * 
         * @return the dsl builder for the headers' name.
         */
        default MvelHeaderNameBuilder mvel() {
            return MvelHeaderNameBuilder.INSTANCE;
        }
        /**
         * MVEL (camel-mvel)
         * Transform messages using an MVEL template.
         * 
         * Category: transformation,script
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-mvel
         * 
         * Syntax: <code>mvel:resourceUri</code>
         * 
         * Path parameter: resourceUri (required)
         * Path to the resource. You can prefix with: classpath, file, http,
         * ref, or bean. classpath, file and http loads the resource using these
         * protocols (classpath is default). ref will lookup the resource in the
         * registry. bean will call a method on a bean to be used as the
         * resource. For bean you can specify the method name after dot, eg
         * bean:myBean.myMethod.
         * This option can also be loaded from an existing file, by prefixing
         * with file: or classpath: followed by the location of the file.
         * 
         * @param path resourceUri
         * @return the dsl builder
         */
        default MvelEndpointBuilder mvel(String path) {
            return MvelEndpointBuilderFactory.endpointBuilder("mvel", path);
        }
        /**
         * MVEL (camel-mvel)
         * Transform messages using an MVEL template.
         * 
         * Category: transformation,script
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-mvel
         * 
         * Syntax: <code>mvel:resourceUri</code>
         * 
         * Path parameter: resourceUri (required)
         * Path to the resource. You can prefix with: classpath, file, http,
         * ref, or bean. classpath, file and http loads the resource using these
         * protocols (classpath is default). ref will lookup the resource in the
         * registry. bean will call a method on a bean to be used as the
         * resource. For bean you can specify the method name after dot, eg
         * bean:myBean.myMethod.
         * This option can also be loaded from an existing file, by prefixing
         * with file: or classpath: followed by the location of the file.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path resourceUri
         * @return the dsl builder
         */
        default MvelEndpointBuilder mvel(String componentName, String path) {
            return MvelEndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    /**
     * The builder of headers' name for the MVEL component.
     */
    public static class MvelHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final MvelHeaderNameBuilder INSTANCE = new MvelHeaderNameBuilder();

        /**
         * A URI for the template resource to use instead of the endpoint
         * configured.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code MvelResourceUri}.
         */
        public String mvelResourceUri() {
            return "CamelMvelResourceUri";
        }
        /**
         * The template to use instead of the endpoint configured.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code MvelTemplate}.
         */
        public String mvelTemplate() {
            return "CamelMvelTemplate";
        }
    }
    static MvelEndpointBuilder endpointBuilder(String componentName, String path) {
        class MvelEndpointBuilderImpl extends AbstractEndpointBuilder implements MvelEndpointBuilder, AdvancedMvelEndpointBuilder {
            public MvelEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new MvelEndpointBuilderImpl(path);
    }
}