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
package org.apache.camel.util;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * Bridge class for ActiveMQ component
 */
@Deprecated
public class IntrospectionSupport {

    private IntrospectionSupport() {
        throw new AssertionError("Utility class can't be instantiated or extended");
    }

    /**
     * @deprecated use {@link org.apache.camel.support.IntrospectionSupport#extractProperties} instead
     */
    @Deprecated
    public static Map<String, Object> extractProperties(Map<String, Object> properties, String optionPrefix) {
        try {
            Class<?> clazz = Class.forName("org.apache.camel.support.IntrospectionSupport");
            Method method = clazz.getMethod("extractProperties", Map.class, String.class);
            return (Map) method.invoke(properties, optionPrefix);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }
}
