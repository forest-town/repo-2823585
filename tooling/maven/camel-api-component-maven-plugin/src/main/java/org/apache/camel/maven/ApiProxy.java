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
package org.apache.camel.maven;

import java.util.Collections;
import java.util.List;

import org.apache.maven.plugin.MojoExecutionException;

/**
 * Represents an API to use for generating Camel Component.
 */
public class ApiProxy {

    private String apiName;
    private String apiDescription;
    private boolean consumerOnly;
    private boolean producerOnly;
    private String proxyClass;
    private FromJavasource fromJavasource;
    private Substitution[] substitutions = new Substitution[0];
    private String excludeConfigNames;
    private String excludeConfigTypes;
    private ExtraOption[] extraOptions;
    private String[] nullableOptions;
    private String classPrefix;
    private List<ApiMethodAlias> aliases = Collections.emptyList();

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getApiDescription() {
        return apiDescription;
    }

    public void setApiDescription(String apiDescription) {
        this.apiDescription = apiDescription;
    }

    public boolean isConsumerOnly() {
        return consumerOnly;
    }

    public void setConsumerOnly(boolean consumerOnly) {
        this.consumerOnly = consumerOnly;
    }

    public boolean isProducerOnly() {
        return producerOnly;
    }

    public void setProducerOnly(boolean producerOnly) {
        this.producerOnly = producerOnly;
    }

    public String getProxyClass() {
        return proxyClass;
    }

    public void setProxyClass(String proxyClass) {
        this.proxyClass = proxyClass;
    }

    public FromJavasource getFromJavasource() {
        return fromJavasource;
    }

    public void setFromJavasource(FromJavasource fromJavasource) {
        this.fromJavasource = fromJavasource;
    }

    public Substitution[] getSubstitutions() {
        return substitutions;
    }

    public void setSubstitutions(Substitution[] substitutions) {
        this.substitutions = substitutions;
    }

    public String getExcludeConfigNames() {
        return excludeConfigNames;
    }

    public void setExcludeConfigNames(String excludeConfigNames) {
        this.excludeConfigNames = excludeConfigNames;
    }

    public String getExcludeConfigTypes() {
        return excludeConfigTypes;
    }

    public void setExcludeConfigTypes(String excludeConfigTypes) {
        this.excludeConfigTypes = excludeConfigTypes;
    }

    public ExtraOption[] getExtraOptions() {
        return extraOptions;
    }

    public void setExtraOptions(ExtraOption[] extraOptions) {
        this.extraOptions = extraOptions;
    }

    public String[] getNullableOptions() {
        return nullableOptions;
    }

    public void setNullableOptions(String[] nullableOptions) {
        this.nullableOptions = nullableOptions;
    }

    public List<ApiMethodAlias> getAliases() {
        return aliases;
    }

    public void setAliases(List<ApiMethodAlias> aliases) {
        this.aliases = aliases;
    }

    public String getClassPrefix() {
        return classPrefix;
    }

    public void setClassPrefix(String classPrefix) {
        this.classPrefix = classPrefix;
    }

    public void validate() throws MojoExecutionException {
        if (apiName == null || proxyClass == null) {
            throw new MojoExecutionException("Properties apiName and proxyClass are required");
        }
    }
}
