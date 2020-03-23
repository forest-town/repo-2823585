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
package org.apache.camel.component.jcache;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.cache.Cache;

import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Before;
import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class JCacheComponentTestSupport extends CamelTestSupport {
    protected static final Logger LOGGER = LoggerFactory.getLogger(JCacheComponentTestSupport.class);

    protected Cache<Object, Object> getCacheFromEndpoint(String endpoint) throws Exception {
        return resolveMandatoryEndpoint(endpoint, JCacheEndpoint.class)
            .getManager()
            .getCache();
    }

    protected String randomString() {
        return UUID.randomUUID().toString();
    }

    protected Map<Object, Object> generateRandomMap(int size) {
        Map<Object, Object> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            map.put(randomString(), randomString());
        }

        return map;
    }
}
