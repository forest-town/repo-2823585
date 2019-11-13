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
package org.apache.camel.component.olingo2.springboot;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.component.olingo2.internal.Olingo2ApiName;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.apache.camel.support.jsse.SSLContextParameters;
import org.apache.http.HttpHost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Communicates with OData 2.0 services using Apache Olingo.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.olingo2")
public class Olingo2ComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the olingo2 component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * To use the shared configuration
     */
    private Olingo2ConfigurationNestedConfiguration configuration;
    /**
     * Enable usage of global SSL context parameters.
     */
    private Boolean useGlobalSslContextParameters = false;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;

    public Olingo2ConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            Olingo2ConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getUseGlobalSslContextParameters() {
        return useGlobalSslContextParameters;
    }

    public void setUseGlobalSslContextParameters(
            Boolean useGlobalSslContextParameters) {
        this.useGlobalSslContextParameters = useGlobalSslContextParameters;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public static class Olingo2ConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.olingo2.Olingo2Configuration.class;
        /**
         * What kind of operation to perform
         */
        private Olingo2ApiName apiName;
        /**
         * What sub operation to use for the selected operation
         */
        private String methodName;
        /**
         * Target OData service base URI, e.g.
         * http://services.odata.org/OData/OData.svc
         */
        private String serviceUri;
        /**
         * Content-Type header value can be used to specify JSON or XML message
         * format, defaults to application/json;charset=utf-8
         */
        private String contentType = "application/json;charset=utf-8";
        /**
         * Custom HTTP headers to inject into every request, this could include
         * OAuth tokens, etc.
         */
        private Map httpHeaders;
        /**
         * HTTP connection creation timeout in milliseconds, defaults to 30,000
         * (30 seconds)
         */
        private Integer connectTimeout = 30000;
        /**
         * HTTP request timeout in milliseconds, defaults to 30,000 (30 seconds)
         */
        private Integer socketTimeout = 30000;
        /**
         * HTTP proxy server configuration
         */
        private HttpHost proxy;
        /**
         * To configure security using SSLContextParameters
         */
        private SSLContextParameters sslContextParameters;
        /**
         * Custom HTTP async client builder for more complex HTTP client
         * configuration, overrides connectionTimeout, socketTimeout, proxy and
         * sslContext. Note that a socketTimeout MUST be specified in the
         * builder, otherwise OData requests could block indefinitely
         */
        private HttpAsyncClientBuilder httpAsyncClientBuilder;
        /**
         * Custom HTTP client builder for more complex HTTP client
         * configuration, overrides connectionTimeout, socketTimeout, proxy and
         * sslContext. Note that a socketTimeout MUST be specified in the
         * builder, otherwise OData requests could block indefinitely
         */
        private HttpClientBuilder httpClientBuilder;
        /**
         * Set this to true to filter out results that have already been
         * communicated by this component.
         */
        private Boolean filterAlreadySeen = false;
        /**
         * For endpoints that return an array or collection, a consumer endpoint
         * will map every element to distinct messages, unless splitResult is
         * set to false.
         */
        private Boolean splitResult = true;

        public Olingo2ApiName getApiName() {
            return apiName;
        }

        public void setApiName(Olingo2ApiName apiName) {
            this.apiName = apiName;
        }

        public String getMethodName() {
            return methodName;
        }

        public void setMethodName(String methodName) {
            this.methodName = methodName;
        }

        public String getServiceUri() {
            return serviceUri;
        }

        public void setServiceUri(String serviceUri) {
            this.serviceUri = serviceUri;
        }

        public String getContentType() {
            return contentType;
        }

        public void setContentType(String contentType) {
            this.contentType = contentType;
        }

        public Map getHttpHeaders() {
            return httpHeaders;
        }

        public void setHttpHeaders(Map httpHeaders) {
            this.httpHeaders = httpHeaders;
        }

        public Integer getConnectTimeout() {
            return connectTimeout;
        }

        public void setConnectTimeout(Integer connectTimeout) {
            this.connectTimeout = connectTimeout;
        }

        public Integer getSocketTimeout() {
            return socketTimeout;
        }

        public void setSocketTimeout(Integer socketTimeout) {
            this.socketTimeout = socketTimeout;
        }

        public HttpHost getProxy() {
            return proxy;
        }

        public void setProxy(HttpHost proxy) {
            this.proxy = proxy;
        }

        public SSLContextParameters getSslContextParameters() {
            return sslContextParameters;
        }

        public void setSslContextParameters(
                SSLContextParameters sslContextParameters) {
            this.sslContextParameters = sslContextParameters;
        }

        public HttpAsyncClientBuilder getHttpAsyncClientBuilder() {
            return httpAsyncClientBuilder;
        }

        public void setHttpAsyncClientBuilder(
                HttpAsyncClientBuilder httpAsyncClientBuilder) {
            this.httpAsyncClientBuilder = httpAsyncClientBuilder;
        }

        public HttpClientBuilder getHttpClientBuilder() {
            return httpClientBuilder;
        }

        public void setHttpClientBuilder(HttpClientBuilder httpClientBuilder) {
            this.httpClientBuilder = httpClientBuilder;
        }

        public Boolean getFilterAlreadySeen() {
            return filterAlreadySeen;
        }

        public void setFilterAlreadySeen(Boolean filterAlreadySeen) {
            this.filterAlreadySeen = filterAlreadySeen;
        }

        public Boolean getSplitResult() {
            return splitResult;
        }

        public void setSplitResult(Boolean splitResult) {
            this.splitResult = splitResult;
        }
    }
}