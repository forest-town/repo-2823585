/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.sns;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SnsComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.aws.sns.SnsConfiguration getOrCreateConfiguration(SnsComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.aws.sns.SnsConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SnsComponent target = (SnsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": getOrCreateConfiguration(target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonsnsclient":
        case "amazonSNSClient": getOrCreateConfiguration(target).setAmazonSNSClient(property(camelContext, com.amazonaws.services.sns.AmazonSNS.class, value)); return true;
        case "amazonsqsclient":
        case "amazonSQSClient": getOrCreateConfiguration(target).setAmazonSQSClient(property(camelContext, com.amazonaws.services.sqs.AmazonSQS.class, value)); return true;
        case "autocreatetopic":
        case "autoCreateTopic": getOrCreateConfiguration(target).setAutoCreateTopic(property(camelContext, boolean.class, value)); return true;
        case "autodiscoverclient":
        case "autoDiscoverClient": getOrCreateConfiguration(target).setAutoDiscoverClient(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.aws.sns.SnsConfiguration.class, value)); return true;
        case "kmsmasterkeyid":
        case "kmsMasterKeyId": getOrCreateConfiguration(target).setKmsMasterKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "messagestructure":
        case "messageStructure": getOrCreateConfiguration(target).setMessageStructure(property(camelContext, java.lang.String.class, value)); return true;
        case "policy": getOrCreateConfiguration(target).setPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": getOrCreateConfiguration(target).setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": getOrCreateConfiguration(target).setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": getOrCreateConfiguration(target).setProxyProtocol(property(camelContext, com.amazonaws.Protocol.class, value)); return true;
        case "queueurl":
        case "queueUrl": getOrCreateConfiguration(target).setQueueUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "region": getOrCreateConfiguration(target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": getOrCreateConfiguration(target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "serversideencryptionenabled":
        case "serverSideEncryptionEnabled": getOrCreateConfiguration(target).setServerSideEncryptionEnabled(property(camelContext, boolean.class, value)); return true;
        case "subject": getOrCreateConfiguration(target).setSubject(property(camelContext, java.lang.String.class, value)); return true;
        case "subscribesnstosqs":
        case "subscribeSNStoSQS": getOrCreateConfiguration(target).setSubscribeSNStoSQS(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("accessKey", java.lang.String.class);
        answer.put("amazonSNSClient", com.amazonaws.services.sns.AmazonSNS.class);
        answer.put("amazonSQSClient", com.amazonaws.services.sqs.AmazonSQS.class);
        answer.put("autoCreateTopic", boolean.class);
        answer.put("autoDiscoverClient", boolean.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("configuration", org.apache.camel.component.aws.sns.SnsConfiguration.class);
        answer.put("kmsMasterKeyId", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("messageStructure", java.lang.String.class);
        answer.put("policy", java.lang.String.class);
        answer.put("proxyHost", java.lang.String.class);
        answer.put("proxyPort", java.lang.Integer.class);
        answer.put("proxyProtocol", com.amazonaws.Protocol.class);
        answer.put("queueUrl", java.lang.String.class);
        answer.put("region", java.lang.String.class);
        answer.put("secretKey", java.lang.String.class);
        answer.put("serverSideEncryptionEnabled", boolean.class);
        answer.put("subject", java.lang.String.class);
        answer.put("subscribeSNStoSQS", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SnsComponent target = (SnsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return getOrCreateConfiguration(target).getAccessKey();
        case "amazonsnsclient":
        case "amazonSNSClient": return getOrCreateConfiguration(target).getAmazonSNSClient();
        case "amazonsqsclient":
        case "amazonSQSClient": return getOrCreateConfiguration(target).getAmazonSQSClient();
        case "autocreatetopic":
        case "autoCreateTopic": return getOrCreateConfiguration(target).isAutoCreateTopic();
        case "autodiscoverclient":
        case "autoDiscoverClient": return getOrCreateConfiguration(target).isAutoDiscoverClient();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "configuration": return target.getConfiguration();
        case "kmsmasterkeyid":
        case "kmsMasterKeyId": return getOrCreateConfiguration(target).getKmsMasterKeyId();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "messagestructure":
        case "messageStructure": return getOrCreateConfiguration(target).getMessageStructure();
        case "policy": return getOrCreateConfiguration(target).getPolicy();
        case "proxyhost":
        case "proxyHost": return getOrCreateConfiguration(target).getProxyHost();
        case "proxyport":
        case "proxyPort": return getOrCreateConfiguration(target).getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return getOrCreateConfiguration(target).getProxyProtocol();
        case "queueurl":
        case "queueUrl": return getOrCreateConfiguration(target).getQueueUrl();
        case "region": return getOrCreateConfiguration(target).getRegion();
        case "secretkey":
        case "secretKey": return getOrCreateConfiguration(target).getSecretKey();
        case "serversideencryptionenabled":
        case "serverSideEncryptionEnabled": return getOrCreateConfiguration(target).isServerSideEncryptionEnabled();
        case "subject": return getOrCreateConfiguration(target).getSubject();
        case "subscribesnstosqs":
        case "subscribeSNStoSQS": return getOrCreateConfiguration(target).isSubscribeSNStoSQS();
        default: return null;
        }
    }
}

