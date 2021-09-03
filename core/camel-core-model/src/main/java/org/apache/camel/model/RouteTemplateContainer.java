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
package org.apache.camel.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElementRef;

/**
 * Container to hold {@link RouteTemplateDefinition route templates}.
 */
public interface RouteTemplateContainer {

    /**
     * Returns the route templates
     *
     * @return the route templates
     */
    @XmlElementRef
    List<RouteTemplateDefinition> getRouteTemplates();

    /**
     * Sets the route templates to use
     *
     * @param routes the route templates
     */
    void setRouteTemplates(List<RouteTemplateDefinition> routes);
}
