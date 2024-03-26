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
package org.apache.camel.component.aws2.bedrock.agent;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.spi.Metadata;
import org.apache.camel.spi.annotations.Component;
import org.apache.camel.support.HealthCheckComponent;

/**
 * For working with Amazon Bedrock Agent SDK v2.
 */
@Component("aws-bedrock-agent")
public class BedrockAgentComponent extends HealthCheckComponent {

    @Metadata
    private BedrockAgentConfiguration configuration = new BedrockAgentConfiguration();

    public BedrockAgentComponent() {
        this(null);
    }

    public BedrockAgentComponent(CamelContext context) {
        super(context);
    }

    @Override
    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        BedrockAgentConfiguration configuration
                = this.configuration != null ? this.configuration.copy() : new BedrockAgentConfiguration();
        BedrockAgentEndpoint endpoint = new BedrockAgentEndpoint(uri, this, configuration);
        setProperties(endpoint, parameters);
        if (Boolean.FALSE.equals(configuration.isUseDefaultCredentialsProvider())
                && Boolean.FALSE.equals(configuration.isUseProfileCredentialsProvider())
                && Boolean.FALSE.equals(configuration.isUseSessionCredentials())
                && configuration.getBedrockAgentClient() == null
                && (configuration.getAccessKey() == null || configuration.getSecretKey() == null)) {
            throw new IllegalArgumentException(
                    "useDefaultCredentialsProvider is set to false, useProfileCredentialsProvider is set to false, useSessionCredentials is set to false, Amazon Bedrock runtime client or accessKey and secretKey must be specified");
        }

        return endpoint;
    }

    public BedrockAgentConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * Component configuration
     */
    public void setConfiguration(BedrockAgentConfiguration configuration) {
        this.configuration = configuration;
    }
}
