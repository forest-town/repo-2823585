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
package org.apache.camel.component.jsonvalidator;

import java.io.InputStream;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.ValidationMessage;
import org.apache.camel.Category;
import org.apache.camel.Component;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.StreamCache;
import org.apache.camel.ValidationException;
import org.apache.camel.api.management.ManagedResource;
import org.apache.camel.component.ResourceEndpoint;
import org.apache.camel.spi.UriEndpoint;
import org.apache.camel.spi.UriParam;

/**
 * Validate JSON payloads using NetworkNT JSON Schema.
 */
@ManagedResource(description = "Managed JsonValidatorEndpoint")
@UriEndpoint(scheme = "json-validator", firstVersion = "2.20.0", title = "JSON Schema Validator",
             syntax = "json-validator:resourceUri",
             producerOnly = true, category = { Category.VALIDATION })
public class JsonValidatorEndpoint extends ResourceEndpoint {

    private volatile JsonSchema schema;

    private final ObjectMapper mapper = new ObjectMapper();

    @UriParam(defaultValue = "true")
    private boolean failOnNullBody = true;
    @UriParam(defaultValue = "true")
    private boolean failOnNullHeader = true;
    @UriParam(description = "To validate against a header instead of the message body.")
    private String headerName;
    @UriParam(label = "advanced")
    private JsonValidatorErrorHandler errorHandler = new DefaultJsonValidationErrorHandler();
    private JsonSchemaLoader schemaLoader;
    @UriParam(label = "advanced")
    private JsonUriSchemaLoader uriSchemaLoader = new DefaultJsonUriSchemaLoader();

    public JsonValidatorEndpoint(String endpointUri, Component component, String resourceUri) {
        super(endpointUri, component, resourceUri);
    }

    @Override
    public void clearContentCache() {
        this.schema = null;
        super.clearContentCache();
    }

    @Override
    public ExchangePattern getExchangePattern() {
        return ExchangePattern.InOut;
    }

    @Override
    protected void onExchange(Exchange exchange) throws Exception {
        StreamCache cache = null;

        // if the content is an input stream then its likely not re-readable so we need to make it stream cached
        Object content = getContentToValidate(exchange);
        if (!(content instanceof StreamCache) && content instanceof InputStream) {
            cache = exchange.getContext().getTypeConverter().convertTo(StreamCache.class, exchange, content);
            if (cache != null) {
                if (shouldUseHeader()) {
                    exchange.getIn().setHeader(headerName, cache);
                } else {
                    exchange.getIn().setBody(cache);
                }
            }
        }

        // Get a local copy of the current schema to improve concurrency.
        JsonSchema localSchema = this.schema;
        if (localSchema == null) {
            localSchema = getOrCreateSchema();
        }
        try {
            if (shouldUseHeader()) {
                if (content == null && isFailOnNullHeader()) {
                    throw new NoJsonHeaderValidationException(exchange, headerName);
                }
            } else {
                if (content == null && isFailOnNullBody()) {
                    throw new NoJsonBodyValidationException(exchange);
                }
            }
            if (content != null) {
                // favour using stream caching
                if (cache == null) {
                    cache = exchange.getContext().getTypeConverter().convertTo(StreamCache.class, exchange, content);
                }
                try (InputStream is = exchange.getContext().getTypeConverter().mandatoryConvertTo(InputStream.class, exchange,
                        cache != null ? cache : content)) {
                    JsonNode node = mapper.readTree(is);
                    if (node == null) {
                        throw new NoJsonBodyValidationException(exchange);
                    }
                    Set<ValidationMessage> errors = localSchema.validate(node);

                    if (!errors.isEmpty()) {
                        this.log.debug("Validated JSON has {} errors", errors.size());
                        this.errorHandler.handleErrors(exchange, schema, errors);
                    } else {
                        this.log.debug("Validated JSON success");
                    }
                }
            }
        } catch (Exception e) {
            if (e instanceof ValidationException) {
                // already as validation error
                throw e;
            } else {
                // general error
                this.errorHandler.handleErrors(exchange, schema, e);
            }
        } finally {
            if (cache != null) {
                cache.reset();
            }
        }
    }

    private Object getContentToValidate(Exchange exchange) {
        if (shouldUseHeader()) {
            return exchange.getIn().getHeader(headerName);
        } else {
            return exchange.getIn().getBody();
        }
    }

    private boolean shouldUseHeader() {
        return headerName != null;
    }

    /**
     * Synchronized method to create a schema if is does not already exist.
     *
     * @return The currently loaded schema
     */
    private JsonSchema getOrCreateSchema() throws Exception {
        synchronized (this) {
            if (this.schema == null) {
                if (this.schemaLoader == null) {
                    this.schema = this.uriSchemaLoader.createSchema(getCamelContext(), getResourceUri());
                } else {
                    // for backwards compatility, will continue to use the old schema loader if one was provided
                    this.schema = this.schemaLoader.createSchema(getCamelContext(), this.getResourceAsInputStream());
                }
            }
        }
        return this.schema;
    }

    @Override
    protected String createEndpointUri() {
        return "json-validator:" + getResourceUri();
    }

    public JsonValidatorErrorHandler getErrorHandler() {
        return errorHandler;
    }

    /**
     * To use a custom ValidatorErrorHandler.
     * <p/>
     * The default error handler captures the errors and throws an exception.
     */
    public void setErrorHandler(JsonValidatorErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

    @Deprecated
    public JsonSchemaLoader getSchemaLoader() {
        return schemaLoader;
    }

    /**
     * To use a custom schema loader allowing for adding custom format validation. The default implementation will
     * create a schema loader with draft v4 support.
     *
     * @deprecated Use {@link #setUriSchemaLoader(JsonUriSchemaLoader)} instead
     */
    @Deprecated
    public void setSchemaLoader(JsonSchemaLoader schemaLoader) {
        this.schemaLoader = schemaLoader;
    }

    public JsonUriSchemaLoader getUriSchemaLoader() {
        return uriSchemaLoader;
    }

    /**
     * To use a custom schema loader allowing for adding custom format validation. The default implementation will
     * create a schema loader with draft 2019-09 support.
     */
    public void setUriSchemaLoader(JsonUriSchemaLoader uriSchemaLoader) {
        this.uriSchemaLoader = uriSchemaLoader;
    }

    public boolean isFailOnNullBody() {
        return failOnNullBody;
    }

    /**
     * Whether to fail if no body exists.
     */
    public void setFailOnNullBody(boolean failOnNullBody) {
        this.failOnNullBody = failOnNullBody;
    }

    public boolean isFailOnNullHeader() {
        return failOnNullHeader;
    }

    /**
     * Whether to fail if no header exists when validating against a header.
     */
    public void setFailOnNullHeader(boolean failOnNullHeader) {
        this.failOnNullHeader = failOnNullHeader;
    }

    public String getHeaderName() {
        return headerName;
    }

    /**
     * To validate against a header instead of the message body.
     */
    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }
}
