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
package org.apache.camel.itest.karaf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ops4j.pax.exam.Option;
import org.ops4j.pax.exam.junit.Configuration;
import org.ops4j.pax.exam.junit.JUnit4TestRunner;

import static org.junit.Assume.assumeTrue;

@RunWith(JUnit4TestRunner.class)
public class CamelVertxTest extends AbstractFeatureTest {

    public static final String COMPONENT = extractName(CamelVertxTest.class);

    @Test
    public void test() throws Exception {
//        Vert.x can be deployed only to Java 7 JVM
        String javaVersion = System.getProperty("java.version");
        assumeTrue(javaVersion.startsWith("1.7"));
        testComponent(COMPONENT);
    }

    @Configuration
    public static Option[] configure() {
        return configure(COMPONENT);
    }

}