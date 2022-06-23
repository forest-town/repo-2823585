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
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Manage Droplets and resources within the DigitalOcean cloud.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DigitalOceanEndpointBuilderFactory {


    /**
     * Builder for endpoint for the DigitalOcean component.
     */
    public interface DigitalOceanEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedDigitalOceanEndpointBuilder advanced() {
            return (AdvancedDigitalOceanEndpointBuilder) this;
        }
        /**
         * Use for pagination. Force the page number.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: producer
         * 
         * @param page the value to set
         * @return the dsl builder
         */
        default DigitalOceanEndpointBuilder page(Integer page) {
            doSetProperty("page", page);
            return this;
        }
        /**
         * Use for pagination. Force the page number.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: producer
         * 
         * @param page the value to set
         * @return the dsl builder
         */
        default DigitalOceanEndpointBuilder page(String page) {
            doSetProperty("page", page);
            return this;
        }
        /**
         * Use for pagination. Set the number of item per request. The maximum
         * number of results per page is 200.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 25
         * Group: producer
         * 
         * @param perPage the value to set
         * @return the dsl builder
         */
        default DigitalOceanEndpointBuilder perPage(Integer perPage) {
            doSetProperty("perPage", perPage);
            return this;
        }
        /**
         * Use for pagination. Set the number of item per request. The maximum
         * number of results per page is 200.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 25
         * Group: producer
         * 
         * @param perPage the value to set
         * @return the dsl builder
         */
        default DigitalOceanEndpointBuilder perPage(String perPage) {
            doSetProperty("perPage", perPage);
            return this;
        }
        /**
         * The DigitalOcean resource type on which perform the operation.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.digitalocean.constants.DigitalOceanResources&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param resource the value to set
         * @return the dsl builder
         */
        default DigitalOceanEndpointBuilder resource(
                org.apache.camel.component.digitalocean.constants.DigitalOceanResources resource) {
            doSetProperty("resource", resource);
            return this;
        }
        /**
         * The DigitalOcean resource type on which perform the operation.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.digitalocean.constants.DigitalOceanResources&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param resource the value to set
         * @return the dsl builder
         */
        default DigitalOceanEndpointBuilder resource(String resource) {
            doSetProperty("resource", resource);
            return this;
        }
        /**
         * Set a proxy host if needed.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param httpProxyHost the value to set
         * @return the dsl builder
         */
        default DigitalOceanEndpointBuilder httpProxyHost(String httpProxyHost) {
            doSetProperty("httpProxyHost", httpProxyHost);
            return this;
        }
        /**
         * Set a proxy password if needed.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param httpProxyPassword the value to set
         * @return the dsl builder
         */
        default DigitalOceanEndpointBuilder httpProxyPassword(
                String httpProxyPassword) {
            doSetProperty("httpProxyPassword", httpProxyPassword);
            return this;
        }
        /**
         * Set a proxy port if needed.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param httpProxyPort the value to set
         * @return the dsl builder
         */
        default DigitalOceanEndpointBuilder httpProxyPort(Integer httpProxyPort) {
            doSetProperty("httpProxyPort", httpProxyPort);
            return this;
        }
        /**
         * Set a proxy port if needed.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param httpProxyPort the value to set
         * @return the dsl builder
         */
        default DigitalOceanEndpointBuilder httpProxyPort(String httpProxyPort) {
            doSetProperty("httpProxyPort", httpProxyPort);
            return this;
        }
        /**
         * Set a proxy host if needed.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param httpProxyUser the value to set
         * @return the dsl builder
         */
        default DigitalOceanEndpointBuilder httpProxyUser(String httpProxyUser) {
            doSetProperty("httpProxyUser", httpProxyUser);
            return this;
        }
        /**
         * DigitalOcean OAuth Token.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param oAuthToken the value to set
         * @return the dsl builder
         */
        default DigitalOceanEndpointBuilder oAuthToken(String oAuthToken) {
            doSetProperty("oAuthToken", oAuthToken);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the DigitalOcean component.
     */
    public interface AdvancedDigitalOceanEndpointBuilder
            extends
                EndpointProducerBuilder {
        default DigitalOceanEndpointBuilder basic() {
            return (DigitalOceanEndpointBuilder) this;
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
        default AdvancedDigitalOceanEndpointBuilder lazyStartProducer(
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
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedDigitalOceanEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To use a existing configured DigitalOceanClient as client.
         * 
         * The option is a:
         * &lt;code&gt;com.myjeeva.digitalocean.impl.DigitalOceanClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param digitalOceanClient the value to set
         * @return the dsl builder
         */
        default AdvancedDigitalOceanEndpointBuilder digitalOceanClient(
                com.myjeeva.digitalocean.impl.DigitalOceanClient digitalOceanClient) {
            doSetProperty("digitalOceanClient", digitalOceanClient);
            return this;
        }
        /**
         * To use a existing configured DigitalOceanClient as client.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.myjeeva.digitalocean.impl.DigitalOceanClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param digitalOceanClient the value to set
         * @return the dsl builder
         */
        default AdvancedDigitalOceanEndpointBuilder digitalOceanClient(
                String digitalOceanClient) {
            doSetProperty("digitalOceanClient", digitalOceanClient);
            return this;
        }
    }

    public interface DigitalOceanBuilders {
        /**
         * DigitalOcean (camel-digitalocean)
         * Manage Droplets and resources within the DigitalOcean cloud.
         * 
         * Category: cloud,management
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-digitalocean
         * 
         * @return the dsl builder for the headers' name.
         */
        default DigitalOceanHeaderNameBuilder digitalocean() {
            return DigitalOceanHeaderNameBuilder.INSTANCE;
        }
        /**
         * DigitalOcean (camel-digitalocean)
         * Manage Droplets and resources within the DigitalOcean cloud.
         * 
         * Category: cloud,management
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-digitalocean
         * 
         * Syntax: <code>digitalocean:operation</code>
         * 
         * Path parameter: operation
         * The operation to perform to the given resource.
         * There are 36 enums and the value can be one of: create, update,
         * delete, list, ownList, get, listBackups, listActions, listNeighbors,
         * listSnapshots, listKernels, listAllNeighbors, enableBackups,
         * disableBackups, reboot, powerCycle, shutdown, powerOn, powerOff,
         * restore, resetPassword, resize, rebuild, rename, changeKernel,
         * enableIpv6, enablePrivateNetworking, takeSnapshot, transfer, convert,
         * attach, detach, assign, unassign, tag, untag
         * 
         * @param path operation
         * @return the dsl builder
         */
        default DigitalOceanEndpointBuilder digitalocean(String path) {
            return DigitalOceanEndpointBuilderFactory.endpointBuilder("digitalocean", path);
        }
        /**
         * DigitalOcean (camel-digitalocean)
         * Manage Droplets and resources within the DigitalOcean cloud.
         * 
         * Category: cloud,management
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-digitalocean
         * 
         * Syntax: <code>digitalocean:operation</code>
         * 
         * Path parameter: operation
         * The operation to perform to the given resource.
         * There are 36 enums and the value can be one of: create, update,
         * delete, list, ownList, get, listBackups, listActions, listNeighbors,
         * listSnapshots, listKernels, listAllNeighbors, enableBackups,
         * disableBackups, reboot, powerCycle, shutdown, powerOn, powerOff,
         * restore, resetPassword, resize, rebuild, rename, changeKernel,
         * enableIpv6, enablePrivateNetworking, takeSnapshot, transfer, convert,
         * attach, detach, assign, unassign, tag, untag
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path operation
         * @return the dsl builder
         */
        default DigitalOceanEndpointBuilder digitalocean(
                String componentName,
                String path) {
            return DigitalOceanEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the DigitalOcean component.
     */
    public static class DigitalOceanHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final DigitalOceanHeaderNameBuilder INSTANCE = new DigitalOceanHeaderNameBuilder();

        /**
         * The operation to perform.
         * 
         * The option is a: {@code
         * org.apache.camel.component.digitalocean.constants.DigitalOceanOperations} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DigitalOceanOperation}.
         */
        public String digitalOceanOperation() {
            return "DigitalOceanOperation";
        }

        /**
         * The id.
         * 
         * The option is a: {@code Integer or String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DigitalOceanId}.
         */
        public String digitalOceanId() {
            return "DigitalOceanId";
        }

        /**
         * The type.
         * 
         * The option is a: {@code
         * org.apache.camel.component.digitalocean.constants.DigitalOceanImageTypes} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DigitalOceanType}.
         */
        public String digitalOceanType() {
            return "DigitalOceanType";
        }

        /**
         * The name.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DigitalOceanName}.
         */
        public String digitalOceanName() {
            return "DigitalOceanName";
        }

        /**
         * The names of the droplet.
         * 
         * The option is a: {@code List<String>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DigitalOceanNames}.
         */
        public String digitalOceanNames() {
            return "DigitalOceanNames";
        }

        /**
         * The code name of the region aka DigitalOcean data centers.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DigitalOceanRegion}.
         */
        public String digitalOceanRegion() {
            return "DigitalOceanRegion";
        }

        /**
         * The description.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DigitalOceanDescription}.
         */
        public String digitalOceanDescription() {
            return "DigitalOceanDescription";
        }

        /**
         * The size of the droplet.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DigitalOceanDropletSize}.
         */
        public String digitalOceanDropletSize() {
            return "DigitalOceanDropletSize";
        }

        /**
         * The image of the droplet.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DigitalOceanDropletImage}.
         */
        public String digitalOceanDropletImage() {
            return "DigitalOceanDropletImage";
        }

        /**
         * The keys of the droplet.
         * 
         * The option is a: {@code List<String>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DigitalOceanDropletSSHKeys}.
         */
        public String digitalOceanDropletSSHKeys() {
            return "DigitalOceanDropletSSHKeys";
        }

        /**
         * The flag to enable backups.
         * 
         * The option is a: {@code Boolean} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * DigitalOceanDropletEnableBackups}.
         */
        public String digitalOceanDropletEnableBackups() {
            return "DigitalOceanDropletEnableBackups";
        }

        /**
         * The flag to enable ipv6.
         * 
         * The option is a: {@code Boolean} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DigitalOceanDropletEnableIpv6}.
         */
        public String digitalOceanDropletEnableIpv6() {
            return "DigitalOceanDropletEnableIpv6";
        }

        /**
         * The flag to enable private networking.
         * 
         * The option is a: {@code Boolean} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * DigitalOceanDropletEnablePrivateNetworking}.
         */
        public String digitalOceanDropletEnablePrivateNetworking() {
            return "DigitalOceanDropletEnablePrivateNetworking";
        }

        /**
         * The user data of the droplet.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DigitalOceanDropletUserData}.
         */
        public String digitalOceanDropletUserData() {
            return "DigitalOceanDropletUserData";
        }

        /**
         * The volumes' identifier of the droplet.
         * 
         * The option is a: {@code List<String>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DigitalOceanDropletVolumes}.
         */
        public String digitalOceanDropletVolumes() {
            return "DigitalOceanDropletVolumes";
        }

        /**
         * The tags of the droplet.
         * 
         * The option is a: {@code List<String>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DigitalOceanDropletTags}.
         */
        public String digitalOceanDropletTags() {
            return "DigitalOceanDropletTags";
        }

        /**
         * The droplet identifier.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DigitalOceanDropletId}.
         */
        public String digitalOceanDropletId() {
            return "DigitalOceanDropletId";
        }

        /**
         * The id of the DigitalOcean public image or your private image.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DigitalOceanImageId}.
         */
        public String digitalOceanImageId() {
            return "DigitalOceanImageId";
        }

        /**
         * The kernel id to be changed for droplet.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DigitalOceanKernelId}.
         */
        public String digitalOceanKernelId() {
            return "DigitalOceanKernelId";
        }

        /**
         * The name of the volume.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DigitalOceanVolumeName}.
         */
        public String digitalOceanVolumeName() {
            return "DigitalOceanVolumeName";
        }

        /**
         * The size value in GB.
         * 
         * The option is a: {@code Integer or Double} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * DigitalOceanVolumeSizeGigabytes}.
         */
        public String digitalOceanVolumeSizeGigabytes() {
            return "DigitalOceanVolumeSizeGigabytes";
        }

        /**
         * The floating IP address.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DigitalOceanFloatingIPAddress}.
         */
        public String digitalOceanFloatingIPAddress() {
            return "DigitalOceanFloatingIPAddress";
        }

        /**
         * The SSH key fingerprint.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DigitalOceanKeyFingerprint}.
         */
        public String digitalOceanKeyFingerprint() {
            return "DigitalOceanKeyFingerprint";
        }

        /**
         * The public key.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DigitalOceanKeyPublicKey}.
         */
        public String digitalOceanKeyPublicKey() {
            return "DigitalOceanKeyPublicKey";
        }
    }
    static DigitalOceanEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class DigitalOceanEndpointBuilderImpl extends AbstractEndpointBuilder implements DigitalOceanEndpointBuilder, AdvancedDigitalOceanEndpointBuilder {
            public DigitalOceanEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new DigitalOceanEndpointBuilderImpl(path);
    }
}