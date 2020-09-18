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
        default AdvancedPdfEndpointBuilder advanced() {
            return (AdvancedPdfEndpointBuilder) this;
        }
        /**
         * Font.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: Helvetica
         * Group: producer
         */
        default PdfEndpointBuilder font(String font) {
            doSetProperty("font", font);
            return this;
        }
        /**
         * Font size in pixels.
         * 
         * The option is a: <code>float</code> type.
         * 
         * Default: 14
         * Group: producer
         */
        default PdfEndpointBuilder fontSize(float fontSize) {
            doSetProperty("fontSize", fontSize);
            return this;
        }
        /**
         * Font size in pixels.
         * 
         * The option will be converted to a <code>float</code> type.
         * 
         * Default: 14
         * Group: producer
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
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
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
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default PdfEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Margin bottom in pixels.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 20
         * Group: producer
         */
        default PdfEndpointBuilder marginBottom(int marginBottom) {
            doSetProperty("marginBottom", marginBottom);
            return this;
        }
        /**
         * Margin bottom in pixels.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 20
         * Group: producer
         */
        default PdfEndpointBuilder marginBottom(String marginBottom) {
            doSetProperty("marginBottom", marginBottom);
            return this;
        }
        /**
         * Margin left in pixels.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 20
         * Group: producer
         */
        default PdfEndpointBuilder marginLeft(int marginLeft) {
            doSetProperty("marginLeft", marginLeft);
            return this;
        }
        /**
         * Margin left in pixels.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 20
         * Group: producer
         */
        default PdfEndpointBuilder marginLeft(String marginLeft) {
            doSetProperty("marginLeft", marginLeft);
            return this;
        }
        /**
         * Margin right in pixels.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 40
         * Group: producer
         */
        default PdfEndpointBuilder marginRight(int marginRight) {
            doSetProperty("marginRight", marginRight);
            return this;
        }
        /**
         * Margin right in pixels.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 40
         * Group: producer
         */
        default PdfEndpointBuilder marginRight(String marginRight) {
            doSetProperty("marginRight", marginRight);
            return this;
        }
        /**
         * Margin top in pixels.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 20
         * Group: producer
         */
        default PdfEndpointBuilder marginTop(int marginTop) {
            doSetProperty("marginTop", marginTop);
            return this;
        }
        /**
         * Margin top in pixels.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 20
         * Group: producer
         */
        default PdfEndpointBuilder marginTop(String marginTop) {
            doSetProperty("marginTop", marginTop);
            return this;
        }
        /**
         * Page size.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: A4
         * Group: producer
         */
        default PdfEndpointBuilder pageSize(String pageSize) {
            doSetProperty("pageSize", pageSize);
            return this;
        }
        /**
         * Text processing to use. autoFormatting: Text is getting sliced by
         * words, then max amount of words that fits in the line will be written
         * into pdf document. With this strategy all words that doesn't fit in
         * the line will be moved to the new line. lineTermination: Builds set
         * of classes for line-termination writing strategy. Text getting sliced
         * by line termination symbol and then it will be written regardless it
         * fits in the line or not.
         * 
         * The option is a:
         * <code>org.apache.camel.component.pdf.TextProcessingFactory</code>
         * type.
         * 
         * Default: lineTermination
         * Group: producer
         */
        default PdfEndpointBuilder textProcessingFactory(
                TextProcessingFactory textProcessingFactory) {
            doSetProperty("textProcessingFactory", textProcessingFactory);
            return this;
        }
        /**
         * Text processing to use. autoFormatting: Text is getting sliced by
         * words, then max amount of words that fits in the line will be written
         * into pdf document. With this strategy all words that doesn't fit in
         * the line will be moved to the new line. lineTermination: Builds set
         * of classes for line-termination writing strategy. Text getting sliced
         * by line termination symbol and then it will be written regardless it
         * fits in the line or not.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.pdf.TextProcessingFactory</code>
         * type.
         * 
         * Default: lineTermination
         * Group: producer
         */
        default PdfEndpointBuilder textProcessingFactory(
                String textProcessingFactory) {
            doSetProperty("textProcessingFactory", textProcessingFactory);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the PDF component.
     */
    public interface AdvancedPdfEndpointBuilder
            extends
                EndpointProducerBuilder {
        default PdfEndpointBuilder basic() {
            return (PdfEndpointBuilder) this;
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
        default AdvancedPdfEndpointBuilder basicPropertyBinding(
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
        default AdvancedPdfEndpointBuilder basicPropertyBinding(
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
         * Default: false
         * Group: advanced
         */
        default AdvancedPdfEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedPdfEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
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
         */
        default PdfEndpointBuilder pdf(String componentName, String path) {
            return PdfEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static PdfEndpointBuilder endpointBuilder(String componentName, String path) {
        class PdfEndpointBuilderImpl extends AbstractEndpointBuilder implements PdfEndpointBuilder, AdvancedPdfEndpointBuilder {
            public PdfEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new PdfEndpointBuilderImpl(path);
    }
}