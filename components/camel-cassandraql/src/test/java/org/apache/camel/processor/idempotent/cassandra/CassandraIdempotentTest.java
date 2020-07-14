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
package org.apache.camel.processor.idempotent.cassandra;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cassandra.BaseCassandraTest;
import org.apache.camel.component.cassandra.CassandraCQLUnit;
import org.apache.camel.component.cassandra.CassandraUnitUtils;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

/**
 * Unite test for {@link CassandraIdempotentRepository}
 */
public class CassandraIdempotentTest extends BaseCassandraTest {

    @RegisterExtension
    static CassandraCQLUnit cassandra = CassandraUnitUtils.cassandraCQLUnit("NamedIdempotentDataSet.cql");

    private CassandraIdempotentRepository idempotentRepository;

    @Override
    protected void doPreSetup() throws Exception {
        idempotentRepository = new NamedCassandraIdempotentRepository(cassandra.session, "ID");
        idempotentRepository.setTable("NAMED_CAMEL_IDEMPOTENT");
        idempotentRepository.start();
        super.doPreSetup();
    }

    @Override
    @AfterEach
    public void tearDown() throws Exception {
        super.tearDown();
        idempotentRepository.stop();
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:input").idempotentConsumer(header("idempotentId"), idempotentRepository).to("mock:output");
            }
        };
    }

    private void send(String idempotentId, String body) {
        super.template.sendBodyAndHeader("direct:input", body, "idempotentId", idempotentId);
    }

    @Test
    public void testIdempotentRoute() throws Exception {
        // Given
        MockEndpoint mockOutput = getMockEndpoint("mock:output");
        mockOutput.expectedMessageCount(2);
        mockOutput.expectedBodiesReceivedInAnyOrder("A", "B");
        // When
        send("1", "A");
        send("2", "B");
        send("1", "A");
        send("2", "B");
        send("1", "A");
        // Then
        mockOutput.assertIsSatisfied();

    }
}
