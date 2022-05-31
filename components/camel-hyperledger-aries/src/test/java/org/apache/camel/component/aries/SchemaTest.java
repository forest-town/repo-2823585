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
package org.apache.camel.component.aries;

import java.util.Arrays;
import java.util.Map;

import io.nessus.aries.wallet.NessusWallet;
import org.apache.camel.builder.RouteBuilder;
import org.hyperledger.acy_py.generated.model.DID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

import static org.hyperledger.aries.api.ledger.IndyLedgerRoles.ENDORSER;

/**
 * docker compose up --detach && docker compose logs -f acapy
 */
@EnabledIfSystemProperty(named = "enable.hyperledger.aries.itests", matches = "true",
                         disabledReason = "Requires distributed ledger (i.e. blockchain)")
public class SchemaTest extends AbstractCamelAriesTest {

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {

                from("direct:transscript-schema")
                        .to("hyperledger-aries:faber?service=/schemas&schemaName=Transscript")
                        .transform(simple("${body.schemaId}"));
            }
        };
    }

    @Test
    public void testWorkflow() throws Exception {

        setRemoveWalletsOnShutdown(true);

        NessusWallet faberWallet = onboardWallet(FABER, ENDORSER);
        DID publicDid = faberWallet.getPublicDid();
        Assertions.assertNotNull(publicDid, "No public DID");

        // Faber creates the Transcript Schema and sends it to the Ledger
        // It can do so with it's Endorser role

        Map<String, Object> reqBody = Map.of(
                "attributes", Arrays.asList("first_name", "last_name", "ssn", "degree", "status", "year", "average"),
                "schema_version", "1.2");

        String schemaId = template.requestBody("direct:transscript-schema", reqBody, String.class);
        log.info("{}", schemaId);

        Assertions.assertTrue(schemaId.startsWith(publicDid.getDid()));
        Assertions.assertTrue(schemaId.endsWith(":Transscript:1.2"));
    }
}
