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
 * Create, modify or extract content from PDF documents.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface PdfEndpointBuilderFactory {


    /**
     * Builder for endpoint for the PDF component.
     */
    public interface PdfEndpointBuilder extends EndpointProducerBuilder {
        /**
         * Font.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: Helvetica
         * Group: producer
         * 
         * @param font the value to set
         * @return the dsl builder
         */
        default PdfEndpointBuilder font(String font) {
            doSetProperty("font", font);
            return this;
        }
        /**
         * Font size in pixels.
         * 
         * The option is a: &lt;code&gt;float&lt;/code&gt; type.
         * 
         * Default: 14.0
         * Group: producer
         * 
         * @param fontSize the value to set
         * @return the dsl builder
         */
        default PdfEndpointBuilder fontSize(float fontSize) {
            doSetProperty("fontSize", fontSize);
            return this;
        }
        /**
         * Font size in pixels.
         * 
         * The option will be converted to a &lt;code&gt;float&lt;/code&gt;
         * type.
         * 
         * Default: 14.0
         * Group: producer
         * 
         * @param fontSize the value to set
         * @return the dsl builder
         */
        default PdfEndpointBuilder fontSize(String fontSize) {
            doSetProperty("fontSize", fontSize);
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
        default PdfEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default PdfEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Margin bottom in pixels.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 20
         * Group: producer
         * 
         * @param marginBottom the value to set
         * @return the dsl builder
         */
        default PdfEndpointBuilder marginBottom(int marginBottom) {
            doSetProperty("marginBottom", marginBottom);
            return this;
        }
        /**
         * Margin bottom in pixels.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 20
         * Group: producer
         * 
         * @param marginBottom the value to set
         * @return the dsl builder
         */
        default PdfEndpointBuilder marginBottom(String marginBottom) {
            doSetProperty("marginBottom", marginBottom);
            return this;
        }
        /**
         * Margin left in pixels.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 20
         * Group: producer
         * 
         * @param marginLeft the value to set
         * @return the dsl builder
         */
        default PdfEndpointBuilder marginLeft(int marginLeft) {
            doSetProperty("marginLeft", marginLeft);
            return this;
        }
        /**
         * Margin left in pixels.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 20
         * Group: producer
         * 
         * @param marginLeft the value to set
         * @return the dsl builder
         */
        default PdfEndpointBuilder marginLeft(String marginLeft) {
            doSetProperty("marginLeft", marginLeft);
            return this;
        }
        /**
         * Margin right in pixels.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 40
         * Group: producer
         * 
         * @param marginRight the value to set
         * @return the dsl builder
         */
        default PdfEndpointBuilder marginRight(int marginRight) {
            doSetProperty("marginRight", marginRight);
            return this;
        }
        /**
         * Margin right in pixels.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 40
         * Group: producer
         * 
         * @param marginRight the value to set
         * @return the dsl builder
         */
        default PdfEndpointBuilder marginRight(String marginRight) {
            doSetProperty("marginRight", marginRight);
            return this;
        }
        /**
         * Margin top in pixels.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 20
         * Group: producer
         * 
         * @param marginTop the value to set
         * @return the dsl builder
         */
        default PdfEndpointBuilder marginTop(int marginTop) {
            doSetProperty("marginTop", marginTop);
            return this;
        }
        /**
         * Margin top in pixels.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 20
         * Group: producer
         * 
         * @param marginTop the value to set
         * @return the dsl builder
         */
        default PdfEndpointBuilder marginTop(String marginTop) {
            doSetProperty("marginTop", marginTop);
            return this;
        }
        /**
         * Page size.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: A4
         * Group: producer
         * 
         * @param pageSize the value to set
         * @return the dsl builder
         */
        default PdfEndpointBuilder pageSize(String pageSize) {
            doSetProperty("pageSize", pageSize);
            return this;
        }
        /**
         * Text processing to use. &lt;ul&gt; &lt;li&gt;autoFormatting: Text is
         * getting sliced by words, then max amount of words that fits in the
         * line will be written into pdf document. With this strategy all words
         * that doesn't fit in the line will be moved to the new line.
         * &lt;li&gt;lineTermination: Builds set of classes for line-termination
         * writing strategy. Text getting sliced by line termination symbol and
         * then it will be written regardless it fits in the line or not.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.pdf.TextProcessingFactory&lt;/code&gt; type.
         * 
         * Default: lineTermination
         * Group: producer
         * 
         * @param textProcessingFactory the value to set
         * @return the dsl builder
         */
        default PdfEndpointBuilder textProcessingFactory(
                TextProcessingFactory textProcessingFactory) {
            doSetProperty("textProcessingFactory", textProcessingFactory);
            return this;
        }
        /**
         * Text processing to use. &lt;ul&gt; &lt;li&gt;autoFormatting: Text is
         * getting sliced by words, then max amount of words that fits in the
         * line will be written into pdf document. With this strategy all words
         * that doesn't fit in the line will be moved to the new line.
         * &lt;li&gt;lineTermination: Builds set of classes for line-termination
         * writing strategy. Text getting sliced by line termination symbol and
         * then it will be written regardless it fits in the line or not.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.pdf.TextProcessingFactory&lt;/code&gt; type.
         * 
         * Default: lineTermination
         * Group: producer
         * 
         * @param textProcessingFactory the value to set
         * @return the dsl builder
         */
        default PdfEndpointBuilder textProcessingFactory(
                String textProcessingFactory) {
            doSetProperty("textProcessingFactory", textProcessingFactory);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.pdf.TextProcessingFactory</code> enum.
     */
    enum TextProcessingFactory {
        autoFormatting,
        lineTermination;
    }

    public interface PdfBuilders {
        /**
         * PDF (camel-pdf)
         * Create, modify or extract content from PDF documents.
         * 
         * Category: document,transformation,printing
         * Since: 2.16
         * Maven coordinates: org.apache.camel:camel-pdf
         * 
         * Syntax: <code>pdf:operation</code>
         * 
         * Path parameter: operation (required)
         * Operation type
         * There are 3 enums and the value can be one of: create, append,
         * extractText
         * 
         * @param path operation
         * @return the dsl builder
         */
        default PdfEndpointBuilder pdf(String path) {
            return PdfEndpointBuilderFactory.endpointBuilder("pdf", path);
        }
        /**
         * PDF (camel-pdf)
         * Create, modify or extract content from PDF documents.
         * 
         * Category: document,transformation,printing
         * Since: 2.16
         * Maven coordinates: org.apache.camel:camel-pdf
         * 
         * Syntax: <code>pdf:operation</code>
         * 
         * Path parameter: operation (required)
         * Operation type
         * There are 3 enums and the value can be one of: create, append,
         * extractText
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path operation
         * @return the dsl builder
         */
        default PdfEndpointBuilder pdf(String componentName, String path) {
            return PdfEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static PdfEndpointBuilder endpointBuilder(String componentName, String path) {
        class PdfEndpointBuilderImpl extends AbstractEndpointBuilder implements PdfEndpointBuilder {
            public PdfEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new PdfEndpointBuilderImpl(path);
    }
}