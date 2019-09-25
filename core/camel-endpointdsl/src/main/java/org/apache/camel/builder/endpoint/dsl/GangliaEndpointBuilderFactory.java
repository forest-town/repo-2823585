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

import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The ganglia component is used for sending metrics to the Ganglia monitoring
 * system.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GangliaEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Ganglia component.
     */
    public interface GangliaEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedGangliaEndpointBuilder advanced() {
            return (AdvancedGangliaEndpointBuilder) this;
        }
        /**
         * Minumum time in seconds before Ganglia will purge the metric value if
         * it expires. Set to 0 and the value will remain in Ganglia
         * indefinitely until a gmond agent restart.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default GangliaEndpointBuilder dmax(int dmax) {
            doSetProperty("dmax", dmax);
            return this;
        }
        /**
         * Minumum time in seconds before Ganglia will purge the metric value if
         * it expires. Set to 0 and the value will remain in Ganglia
         * indefinitely until a gmond agent restart.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default GangliaEndpointBuilder dmax(String dmax) {
            doSetProperty("dmax", dmax);
            return this;
        }
        /**
         * The group that the metric belongs to.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default GangliaEndpointBuilder groupName(String groupName) {
            doSetProperty("groupName", groupName);
            return this;
        }
        /**
         * The name to use for the metric.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default GangliaEndpointBuilder metricName(String metricName) {
            doSetProperty("metricName", metricName);
            return this;
        }
        /**
         * Send the UDP metric packets using MULTICAST or UNICAST.
         * 
         * The option is a:
         * <code>info.ganglia.gmetric4j.gmetric.GMetric$UDPAddressingMode</code>
         * type.
         * 
         * Group: producer
         */
        default GangliaEndpointBuilder mode(UDPAddressingMode mode) {
            doSetProperty("mode", mode);
            return this;
        }
        /**
         * Send the UDP metric packets using MULTICAST or UNICAST.
         * 
         * The option will be converted to a
         * <code>info.ganglia.gmetric4j.gmetric.GMetric$UDPAddressingMode</code>
         * type.
         * 
         * Group: producer
         */
        default GangliaEndpointBuilder mode(String mode) {
            doSetProperty("mode", mode);
            return this;
        }
        /**
         * Prefix the metric name with this string and an underscore.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default GangliaEndpointBuilder prefix(String prefix) {
            doSetProperty("prefix", prefix);
            return this;
        }
        /**
         * The slope.
         * 
         * The option is a:
         * <code>info.ganglia.gmetric4j.gmetric.GMetricSlope</code> type.
         * 
         * Group: producer
         */
        default GangliaEndpointBuilder slope(GMetricSlope slope) {
            doSetProperty("slope", slope);
            return this;
        }
        /**
         * The slope.
         * 
         * The option will be converted to a
         * <code>info.ganglia.gmetric4j.gmetric.GMetricSlope</code> type.
         * 
         * Group: producer
         */
        default GangliaEndpointBuilder slope(String slope) {
            doSetProperty("slope", slope);
            return this;
        }
        /**
         * Spoofing information IP:hostname.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default GangliaEndpointBuilder spoofHostname(String spoofHostname) {
            doSetProperty("spoofHostname", spoofHostname);
            return this;
        }
        /**
         * Maximum time in seconds that the value can be considered current.
         * After this, Ganglia considers the value to have expired.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default GangliaEndpointBuilder tmax(int tmax) {
            doSetProperty("tmax", tmax);
            return this;
        }
        /**
         * Maximum time in seconds that the value can be considered current.
         * After this, Ganglia considers the value to have expired.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default GangliaEndpointBuilder tmax(String tmax) {
            doSetProperty("tmax", tmax);
            return this;
        }
        /**
         * If using multicast, set the TTL of the packets.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default GangliaEndpointBuilder ttl(int ttl) {
            doSetProperty("ttl", ttl);
            return this;
        }
        /**
         * If using multicast, set the TTL of the packets.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default GangliaEndpointBuilder ttl(String ttl) {
            doSetProperty("ttl", ttl);
            return this;
        }
        /**
         * The type of value.
         * 
         * The option is a:
         * <code>info.ganglia.gmetric4j.gmetric.GMetricType</code> type.
         * 
         * Group: producer
         */
        default GangliaEndpointBuilder type(GMetricType type) {
            doSetProperty("type", type);
            return this;
        }
        /**
         * The type of value.
         * 
         * The option will be converted to a
         * <code>info.ganglia.gmetric4j.gmetric.GMetricType</code> type.
         * 
         * Group: producer
         */
        default GangliaEndpointBuilder type(String type) {
            doSetProperty("type", type);
            return this;
        }
        /**
         * Any unit of measurement that qualifies the metric, e.g. widgets,
         * litres, bytes. Do not include a prefix such as k (kilo) or m (milli),
         * other tools may scale the units later. The value should be unscaled.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default GangliaEndpointBuilder units(String units) {
            doSetProperty("units", units);
            return this;
        }
        /**
         * Use the wire format of Ganglia 3.1.0 and later versions. Set this to
         * false to use Ganglia 3.0.x or earlier.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default GangliaEndpointBuilder wireFormat31x(boolean wireFormat31x) {
            doSetProperty("wireFormat31x", wireFormat31x);
            return this;
        }
        /**
         * Use the wire format of Ganglia 3.1.0 and later versions. Set this to
         * false to use Ganglia 3.0.x or earlier.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default GangliaEndpointBuilder wireFormat31x(String wireFormat31x) {
            doSetProperty("wireFormat31x", wireFormat31x);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Ganglia component.
     */
    public interface AdvancedGangliaEndpointBuilder
            extends
                EndpointProducerBuilder {
        default GangliaEndpointBuilder basic() {
            return (GangliaEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedGangliaEndpointBuilder basicPropertyBinding(
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
        default AdvancedGangliaEndpointBuilder basicPropertyBinding(
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
        default AdvancedGangliaEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedGangliaEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>info.ganglia.gmetric4j.gmetric.GMetric$UDPAddressingMode</code>
     * enum.
     */
    enum UDPAddressingMode {
        MULTICAST,
        UNICAST;
    }

    /**
     * Proxy enum for <code>info.ganglia.gmetric4j.gmetric.GMetricSlope</code>
     * enum.
     */
    enum GMetricSlope {
        ZERO,
        POSITIVE,
        NEGATIVE,
        BOTH;
    }

    /**
     * Proxy enum for <code>info.ganglia.gmetric4j.gmetric.GMetricType</code>
     * enum.
     */
    enum GMetricType {
        STRING,
        INT8,
        UINT8,
        INT16,
        UINT16,
        INT32,
        UINT32,
        FLOAT,
        DOUBLE;
    }
    /**
     * Ganglia (camel-ganglia)
     * The ganglia component is used for sending metrics to the Ganglia
     * monitoring system.
     * 
     * Category: monitoring
     * Available as of version: 2.15
     * Maven coordinates: org.apache.camel:camel-ganglia
     * 
     * Syntax: <code>ganglia:host:port</code>
     * 
     * Path parameter: host
     * Host name for Ganglia server
     * Default value: 239.2.11.71
     * 
     * Path parameter: port
     * Port for Ganglia server
     * Default value: 8649
     */
    default GangliaEndpointBuilder ganglia(String path) {
        class GangliaEndpointBuilderImpl extends AbstractEndpointBuilder implements GangliaEndpointBuilder, AdvancedGangliaEndpointBuilder {
            public GangliaEndpointBuilderImpl(String path) {
                super("ganglia", path);
            }
        }
        return new GangliaEndpointBuilderImpl(path);
    }
}