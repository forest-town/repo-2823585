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

import java.nio.file.Paths;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.support.PluginHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DumpModelAsYamlUriAsParametersTest extends DumpModelAsYamlTestSupport {

    @Test
    public void testDumpModelAsYaml() throws Exception {
        String out = PluginHelper.getModelToYAMLDumper(context).dumpModelAsYaml(context, context.getRouteDefinition("myRoute"),
                true, true, true);
        assertNotNull(out);
        log.info(out);

        String expected
                = IOHelper.stripLineComments(Paths.get("src/test/resources/org/apache/camel/util/uri-as-parameters.yaml"), "#",
                        true);
        Assertions.assertEquals(expected, out);
    }

    @Test
    public void testDumpModelAsYamlGeneratedIds() throws Exception {
        String out = PluginHelper.getModelToYAMLDumper(context).dumpModelAsYaml(context, context.getRouteDefinition("myRoute"),
                true, true, false);
        assertNotNull(out);
        log.info(out);

        String expected
                = IOHelper.stripLineComments(
                        Paths.get("src/test/resources/org/apache/camel/util/uri-as-parameters-no-ids.yaml"),
                        "#",
                        true);
        Assertions.assertEquals(expected, out);
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("seda:foo?size=1234&multipleConsumers=true").routeId("myRoute")
                        .transform().simple("Hello ${body}")
                        .to("mock:result?retainFirst=5&failFast=true").id("myMock");
            }
        };
    }
}
