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
 * component to connect to image recognition service
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ImageRecognitionEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Huawei Cloud Image Recognition component.
     */
    public interface ImageRecognitionEndpointBuilder
            extends
                EndpointProducerBuilder {
        /**
         * Access key for the cloud user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Fully qualified Image Recognition service url. Carries higher
         * precedence than region based configuration.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param endpoint the value to set
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder endpoint(String endpoint) {
            doSetProperty("endpoint", endpoint);
            return this;
        }
        /**
         * Indicates the Base64 character string converted from the image. The
         * size cannot exceed 10 MB. The image resolution of the narrow sides
         * must be greater than 15 pixels, and that of the wide sides cannot
         * exceed 4096 pixels.The supported image formats include JPG, PNG, and
         * BMP. Configure either this parameter or imageUrl, and this one
         * carries higher precedence than imageUrl.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param imageContent the value to set
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder imageContent(String imageContent) {
            doSetProperty("imageContent", imageContent);
            return this;
        }
        /**
         * Indicates the URL of an image. The options are as follows: HTTP/HTTPS
         * URLs on the public network OBS URLs. To use OBS data, authorization
         * is required, including service authorization, temporary
         * authorization, and anonymous public authorization. For details, see
         * Configuring the Access Permission of OBS. Configure either this
         * parameter or imageContent, and this one carries lower precedence than
         * imageContent.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param imageUrl the value to set
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder imageUrl(String imageUrl) {
            doSetProperty("imageUrl", imageUrl);
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
        default ImageRecognitionEndpointBuilder lazyStartProducer(
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
        default ImageRecognitionEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Cloud project ID.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param projectId the value to set
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder projectId(String projectId) {
            doSetProperty("projectId", projectId);
            return this;
        }
        /**
         * Proxy server ip/hostname.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * Proxy authentication password.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPassword the value to set
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder proxyPassword(
                String proxyPassword) {
            doSetProperty("proxyPassword", proxyPassword);
            return this;
        }
        /**
         * Proxy server port.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder proxyPort(int proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * Proxy server port.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * Proxy authentication user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyUser the value to set
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder proxyUser(String proxyUser) {
            doSetProperty("proxyUser", proxyUser);
            return this;
        }
        /**
         * Image Recognition service region. Currently only cn-north-1 and
         * cn-north-4 are supported. This is lower precedence than endpoint
         * based configuration.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Secret key for the cloud user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Configuration object for cloud service authentication.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.huaweicloud.common.models.ServiceKeys&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param serviceKeys the value to set
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder serviceKeys(Object serviceKeys) {
            doSetProperty("serviceKeys", serviceKeys);
            return this;
        }
        /**
         * Configuration object for cloud service authentication.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.huaweicloud.common.models.ServiceKeys&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param serviceKeys the value to set
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder serviceKeys(String serviceKeys) {
            doSetProperty("serviceKeys", serviceKeys);
            return this;
        }
        /**
         * Indicates the language of the returned tags when the operation is
         * tagRecognition, including zh and en.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: zh
         * Group: producer
         * 
         * @param tagLanguage the value to set
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder tagLanguage(String tagLanguage) {
            doSetProperty("tagLanguage", tagLanguage);
            return this;
        }
        /**
         * Indicates the maximum number of the returned tags when the operation
         * is tagRecognition.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 50
         * Group: producer
         * 
         * @param tagLimit the value to set
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder tagLimit(int tagLimit) {
            doSetProperty("tagLimit", tagLimit);
            return this;
        }
        /**
         * Indicates the maximum number of the returned tags when the operation
         * is tagRecognition.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 50
         * Group: producer
         * 
         * @param tagLimit the value to set
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder tagLimit(String tagLimit) {
            doSetProperty("tagLimit", tagLimit);
            return this;
        }
        /**
         * Indicates the threshold of confidence. When the operation is
         * tagRecognition, this parameter ranges from 0 to 100. Tags whose
         * confidence score is lower than the threshold will not be returned.
         * The default value is 60. When the operation is celebrityRecognition,
         * this parameter ranges from 0 to 1. Labels whose confidence score is
         * lower than the threshold will not be returned. The default value is
         * 0.48.
         * 
         * The option is a: &lt;code&gt;float&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param threshold the value to set
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder threshold(float threshold) {
            doSetProperty("threshold", threshold);
            return this;
        }
        /**
         * Indicates the threshold of confidence. When the operation is
         * tagRecognition, this parameter ranges from 0 to 100. Tags whose
         * confidence score is lower than the threshold will not be returned.
         * The default value is 60. When the operation is celebrityRecognition,
         * this parameter ranges from 0 to 1. Labels whose confidence score is
         * lower than the threshold will not be returned. The default value is
         * 0.48.
         * 
         * The option will be converted to a &lt;code&gt;float&lt;/code&gt;
         * type.
         * 
         * Group: producer
         * 
         * @param threshold the value to set
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder threshold(String threshold) {
            doSetProperty("threshold", threshold);
            return this;
        }
        /**
         * Ignore SSL verification.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param ignoreSslVerification the value to set
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder ignoreSslVerification(
                boolean ignoreSslVerification) {
            doSetProperty("ignoreSslVerification", ignoreSslVerification);
            return this;
        }
        /**
         * Ignore SSL verification.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param ignoreSslVerification the value to set
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder ignoreSslVerification(
                String ignoreSslVerification) {
            doSetProperty("ignoreSslVerification", ignoreSslVerification);
            return this;
        }
    }

    public interface ImageRecognitionBuilders {
        /**
         * Huawei Cloud Image Recognition (camel-huaweicloud-imagerecognition)
         * component to connect to image recognition service
         * 
         * Category: cloud,messaging
         * Since: 3.12
         * Maven coordinates:
         * org.apache.camel:camel-huaweicloud-imagerecognition
         * 
         * Syntax: <code>hwcloud-image:operation</code>
         * 
         * Path parameter: operation (required)
         * Name of Image Recognition operation to perform, including
         * celebrityRecognition and tagRecognition
         * 
         * @param path operation
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder hwcloudImage(String path) {
            return ImageRecognitionEndpointBuilderFactory.endpointBuilder("hwcloud-image", path);
        }
        /**
         * Huawei Cloud Image Recognition (camel-huaweicloud-imagerecognition)
         * component to connect to image recognition service
         * 
         * Category: cloud,messaging
         * Since: 3.12
         * Maven coordinates:
         * org.apache.camel:camel-huaweicloud-imagerecognition
         * 
         * Syntax: <code>hwcloud-image:operation</code>
         * 
         * Path parameter: operation (required)
         * Name of Image Recognition operation to perform, including
         * celebrityRecognition and tagRecognition
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path operation
         * @return the dsl builder
         */
        default ImageRecognitionEndpointBuilder hwcloudImage(
                String componentName,
                String path) {
            return ImageRecognitionEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static ImageRecognitionEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class ImageRecognitionEndpointBuilderImpl extends AbstractEndpointBuilder implements ImageRecognitionEndpointBuilder {
            public ImageRecognitionEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new ImageRecognitionEndpointBuilderImpl(path);
    }
}