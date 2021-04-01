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
package org.apache.camel.component.azure.cosmosdb;

import java.util.function.Supplier;

import com.azure.cosmos.models.CosmosDatabaseRequestOptions;
import com.azure.cosmos.models.ThroughputProperties;
import org.apache.camel.Exchange;
import org.apache.camel.util.ObjectHelper;

/**
 * A proxy class for {@link CosmosDbConfiguration} and {@link CosmosDbConstants}. Ideally this is responsible to obtain
 * the correct configurations options either from configs or exchange headers
 */
public class CosmosDbConfigurationOptionsProxy {

    private final CosmosDbConfiguration configuration;

    public CosmosDbConfigurationOptionsProxy(final CosmosDbConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getDatabaseName(final Exchange exchange) {
        return getOption(exchange, CosmosDbConstants.DATABASE_NAME, configuration::getDatabase, String.class);
    }

    public ThroughputProperties getThroughputProperties(final Exchange exchange) {
        return getOption(exchange, CosmosDbConstants.THROUGHPUT_PROPERTIES, configuration::getThroughputProperties,
                ThroughputProperties.class);
    }

    public CosmosDatabaseRequestOptions getCosmosDatabaseRequestOptions(final Exchange exchange) {
        return getOption(exchange, CosmosDbConstants.DATABASE_REQUEST_OPTIONS, nullFallback(),
                CosmosDatabaseRequestOptions.class);
    }

    public CosmosDbConfiguration getConfiguration() {
        return configuration;
    }

    public <R> Supplier<R> nullFallback() {
        return () -> null;
    }

    private <R> R getOption(
            final Exchange exchange, final String headerName, final Supplier<R> fallbackFn, final Class<R> type) {
        // we first try to look if our value in exchange otherwise fallback to fallbackFn which could be either a function or constant
        return ObjectHelper.isEmpty(exchange) || ObjectHelper.isEmpty(getObjectFromHeaders(exchange, headerName, type))
                ? fallbackFn.get()
                : getObjectFromHeaders(exchange, headerName, type);
    }

    private static <T> T getObjectFromHeaders(final Exchange exchange, final String headerName, final Class<T> classType) {
        return exchange.getIn().getHeader(headerName, classType);
    }
}
