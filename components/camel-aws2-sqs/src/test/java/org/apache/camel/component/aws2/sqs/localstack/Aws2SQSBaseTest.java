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
package org.apache.camel.component.aws2.sqs.localstack;

import java.net.URI;

import org.apache.camel.CamelContext;
import org.apache.camel.component.aws2.sqs.Sqs2Component;
import org.apache.camel.test.testcontainers.junit5.ContainerAwareTestSupport;
import org.apache.camel.test.testcontainers.junit5.Wait;
import org.junit.jupiter.api.TestInstance;
import org.testcontainers.containers.GenericContainer;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sqs.SqsClient;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Aws2SQSBaseTest extends ContainerAwareTestSupport {

    public static final String CONTAINER_IMAGE = "localstack/localstack:0.11.4";
    public static final String CONTAINER_NAME = "sqs";

    @Override
    protected GenericContainer<?> createContainer() {
        return localstackContainer();
    }

    public static GenericContainer localstackContainer() {
        return new GenericContainer(CONTAINER_IMAGE)
                .withNetworkAliases(CONTAINER_NAME)
                .withEnv("SERVICES", "sqs")
                .withExposedPorts(4566)
                .waitingFor(Wait.forListeningPort())
                .waitingFor(Wait.forLogMessageContaining("Ready.", 1));
    }

    public String getS3Url() {
        return String.format(
                "%s:%d",
                getContainerHost(CONTAINER_NAME),
                getContainerPort(CONTAINER_NAME, 4566));
    }

    public SqsClient getSQSClient() {
        SqsClient sqsClient = SqsClient
                .builder()
                .endpointOverride(URI.create("http://" + getS3Url()))
                .credentialsProvider(StaticCredentialsProvider.create(AwsBasicCredentials.create("xxx", "yyy")))
                .region(Region.EU_WEST_1)
                .build();
        return sqsClient;
    }

    @Override
    protected CamelContext createCamelContext() throws Exception {
        CamelContext context = super.createCamelContext();
        Sqs2Component sqs = context.getComponent("aws2-sqs", Sqs2Component.class);
        sqs.getConfiguration().setAmazonSQSClient(getSQSClient());
        return context;
    }
}
