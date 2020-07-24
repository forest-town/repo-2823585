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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws.ses.SesComponent;

/**
 * Send e-mails through AWS SES service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AwsSesComponentBuilderFactory {

    /**
     * AWS Simple Email Service (SES) (camel-aws-ses)
     * Send e-mails through AWS SES service.
     * 
     * Category: cloud,mail
     * Since: 2.9
     * Maven coordinates: org.apache.camel:camel-aws-ses
     */
    static AwsSesComponentBuilder awsSes() {
        return new AwsSesComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Simple Email Service (SES) component.
     */
    interface AwsSesComponentBuilder extends ComponentBuilder<SesComponent> {
        /**
         * To use the AmazonSimpleEmailService as the client.
         * 
         * The option is a:
         * <code>com.amazonaws.services.simpleemail.AmazonSimpleEmailService</code> type.
         * 
         * Group: producer
         */
        default AwsSesComponentBuilder amazonSESClient(
                com.amazonaws.services.simpleemail.AmazonSimpleEmailService amazonSESClient) {
            doSetProperty("amazonSESClient", amazonSESClient);
            return this;
        }
        /**
         * Setting the autoDiscoverClient mechanism, if true, the component will
         * look for a client instance in the registry automatically otherwise it
         * will skip that checking.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default AwsSesComponentBuilder autoDiscoverClient(
                boolean autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
            return this;
        }
        /**
         * The component configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.ses.SesConfiguration</code>
         * type.
         * 
         * Group: producer
         */
        default AwsSesComponentBuilder configuration(
                org.apache.camel.component.aws.ses.SesConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default AwsSesComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To define a proxy host when instantiating the SES client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsSesComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the SES client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default AwsSesComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the SES client.
         * 
         * The option is a: <code>com.amazonaws.Protocol</code> type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default AwsSesComponentBuilder proxyProtocol(
                com.amazonaws.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which SES client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsSesComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * List of reply-to email address(es) for the message, override it using
         * 'CamelAwsSesReplyToAddresses' header.
         * 
         * The option is a: <code>java.util.List<java.lang.String></code> type.
         * 
         * Group: producer
         */
        default AwsSesComponentBuilder replyToAddresses(
                java.util.List<java.lang.String> replyToAddresses) {
            doSetProperty("replyToAddresses", replyToAddresses);
            return this;
        }
        /**
         * The email address to which bounce notifications are to be forwarded,
         * override it using 'CamelAwsSesReturnPath' header.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsSesComponentBuilder returnPath(java.lang.String returnPath) {
            doSetProperty("returnPath", returnPath);
            return this;
        }
        /**
         * The subject which is used if the message header 'CamelAwsSesSubject'
         * is not present.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsSesComponentBuilder subject(java.lang.String subject) {
            doSetProperty("subject", subject);
            return this;
        }
        /**
         * List of destination email address. Can be overriden with
         * 'CamelAwsSesTo' header.
         * 
         * The option is a: <code>java.util.List<java.lang.String></code> type.
         * 
         * Group: producer
         */
        default AwsSesComponentBuilder to(java.util.List<java.lang.String> to) {
            doSetProperty("to", to);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AwsSesComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default AwsSesComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default AwsSesComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    class AwsSesComponentBuilderImpl
            extends
                AbstractComponentBuilder<SesComponent>
            implements
                AwsSesComponentBuilder {
        @Override
        protected SesComponent buildConcreteComponent() {
            return new SesComponent();
        }
        private org.apache.camel.component.aws.ses.SesConfiguration getOrCreateConfiguration(
                org.apache.camel.component.aws.ses.SesComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws.ses.SesConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "amazonSESClient": getOrCreateConfiguration((SesComponent) component).setAmazonSESClient((com.amazonaws.services.simpleemail.AmazonSimpleEmailService) value); return true;
            case "autoDiscoverClient": getOrCreateConfiguration((SesComponent) component).setAutoDiscoverClient((boolean) value); return true;
            case "configuration": ((SesComponent) component).setConfiguration((org.apache.camel.component.aws.ses.SesConfiguration) value); return true;
            case "lazyStartProducer": ((SesComponent) component).setLazyStartProducer((boolean) value); return true;
            case "proxyHost": getOrCreateConfiguration((SesComponent) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((SesComponent) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((SesComponent) component).setProxyProtocol((com.amazonaws.Protocol) value); return true;
            case "region": getOrCreateConfiguration((SesComponent) component).setRegion((java.lang.String) value); return true;
            case "replyToAddresses": getOrCreateConfiguration((SesComponent) component).setReplyToAddresses((java.util.List) value); return true;
            case "returnPath": getOrCreateConfiguration((SesComponent) component).setReturnPath((java.lang.String) value); return true;
            case "subject": getOrCreateConfiguration((SesComponent) component).setSubject((java.lang.String) value); return true;
            case "to": getOrCreateConfiguration((SesComponent) component).setTo((java.util.List) value); return true;
            case "basicPropertyBinding": ((SesComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "accessKey": getOrCreateConfiguration((SesComponent) component).setAccessKey((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((SesComponent) component).setSecretKey((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}