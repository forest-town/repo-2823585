/**
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
package org.apache.camel.component.properties.springboot;

import java.util.Properties;
import org.apache.camel.component.properties.PropertiesParser;
import org.apache.camel.component.properties.PropertiesResolver;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * The properties component is used for using property placeholders in endpoint
 * uris.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.properties")
public class PropertiesComponentConfiguration {

    /**
     * A list of locations to load properties. You can use comma to separate
     * multiple locations. This option will override any default locations and
     * only use the locations from this option.
     */
    private String[] locations;
    /**
     * A list of locations to load properties. You can use comma to separate
     * multiple locations. This option will override any default locations and
     * only use the locations from this option.
     */
    private String location;
    /**
     * Encoding to use when loading properties file from the file system or
     * classpath. If no encoding has been set then the properties files is
     * loaded using ISO-8859-1 encoding (latin-1) as documented by link
     * java.util.Propertiesload(java.io.InputStream)
     */
    private String encoding;
    /**
     * To use a custom PropertiesResolver
     */
    @NestedConfigurationProperty
    private PropertiesResolver propertiesResolver;
    /**
     * To use a custom PropertiesParser
     */
    @NestedConfigurationProperty
    private PropertiesParser propertiesParser;
    /**
     * Whether or not to cache loaded properties. The default value is true.
     */
    private Boolean cache;
    /**
     * Optional prefix prepended to property names before resolution.
     */
    private String propertyPrefix;
    /**
     * Optional suffix appended to property names before resolution.
     */
    private String propertySuffix;
    /**
     * If true first attempt resolution of property name augmented with
     * propertyPrefix and propertySuffix before falling back the plain property
     * name specified. If false only the augmented property name is searched.
     */
    private Boolean fallbackToUnaugmentedProperty;
    /**
     * If false the component does not attempt to find a default for the key by
     * looking after the colon separator.
     */
    private Boolean defaultFallbackEnabled;
    /**
     * Whether to silently ignore if a location cannot be located such as a
     * properties file not found.
     */
    private Boolean ignoreMissingLocation;
    /**
     * Sets the value of the prefix token used to identify properties to
     * replace. Setting a value of null restores the default token (link link
     * DEFAULT_PREFIX_TOKEN).
     */
    private String prefixToken;
    /**
     * Sets the value of the suffix token used to identify properties to
     * replace. Setting a value of null restores the default token (link link
     * DEFAULT_SUFFIX_TOKEN).
     */
    private String suffixToken;
    /**
     * Sets initial properties which will be used before any locations are
     * resolved.
     */
    private Properties initialProperties;
    /**
     * Sets a special list of override properties that take precedence and will
     * use first if a property exist.
     */
    private Properties overrideProperties;
    /**
     * Sets the system property mode.
     */
    private Integer systemPropertiesMode;

    public String[] getLocations() {
        return locations;
    }

    public void setLocations(String[] locations) {
        this.locations = locations;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public PropertiesResolver getPropertiesResolver() {
        return propertiesResolver;
    }

    public void setPropertiesResolver(PropertiesResolver propertiesResolver) {
        this.propertiesResolver = propertiesResolver;
    }

    public PropertiesParser getPropertiesParser() {
        return propertiesParser;
    }

    public void setPropertiesParser(PropertiesParser propertiesParser) {
        this.propertiesParser = propertiesParser;
    }

    public Boolean getCache() {
        return cache;
    }

    public void setCache(Boolean cache) {
        this.cache = cache;
    }

    public String getPropertyPrefix() {
        return propertyPrefix;
    }

    public void setPropertyPrefix(String propertyPrefix) {
        this.propertyPrefix = propertyPrefix;
    }

    public String getPropertySuffix() {
        return propertySuffix;
    }

    public void setPropertySuffix(String propertySuffix) {
        this.propertySuffix = propertySuffix;
    }

    public Boolean getFallbackToUnaugmentedProperty() {
        return fallbackToUnaugmentedProperty;
    }

    public void setFallbackToUnaugmentedProperty(
            Boolean fallbackToUnaugmentedProperty) {
        this.fallbackToUnaugmentedProperty = fallbackToUnaugmentedProperty;
    }

    public Boolean getDefaultFallbackEnabled() {
        return defaultFallbackEnabled;
    }

    public void setDefaultFallbackEnabled(Boolean defaultFallbackEnabled) {
        this.defaultFallbackEnabled = defaultFallbackEnabled;
    }

    public Boolean getIgnoreMissingLocation() {
        return ignoreMissingLocation;
    }

    public void setIgnoreMissingLocation(Boolean ignoreMissingLocation) {
        this.ignoreMissingLocation = ignoreMissingLocation;
    }

    public String getPrefixToken() {
        return prefixToken;
    }

    public void setPrefixToken(String prefixToken) {
        this.prefixToken = prefixToken;
    }

    public String getSuffixToken() {
        return suffixToken;
    }

    public void setSuffixToken(String suffixToken) {
        this.suffixToken = suffixToken;
    }

    public Properties getInitialProperties() {
        return initialProperties;
    }

    public void setInitialProperties(Properties initialProperties) {
        this.initialProperties = initialProperties;
    }

    public Properties getOverrideProperties() {
        return overrideProperties;
    }

    public void setOverrideProperties(Properties overrideProperties) {
        this.overrideProperties = overrideProperties;
    }

    public Integer getSystemPropertiesMode() {
        return systemPropertiesMode;
    }

    public void setSystemPropertiesMode(Integer systemPropertiesMode) {
        this.systemPropertiesMode = systemPropertiesMode;
    }
}