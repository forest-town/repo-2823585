/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.sns;

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
public class Sns2EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Sns2Endpoint target = (Sns2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonsnsclient":
        case "amazonSNSClient": target.getConfiguration().setAmazonSNSClient(property(camelContext, software.amazon.awssdk.services.sns.SnsClient.class, value)); return true;
        case "autocreatetopic":
        case "autoCreateTopic": target.getConfiguration().setAutoCreateTopic(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "kmsmasterkeyid":
        case "kmsMasterKeyId": target.getConfiguration().setKmsMasterKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "messagestructure":
        case "messageStructure": target.getConfiguration().setMessageStructure(property(camelContext, java.lang.String.class, value)); return true;
        case "policy": target.getConfiguration().setPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": target.getConfiguration().setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "queueurl":
        case "queueUrl": target.getConfiguration().setQueueUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "region": target.getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": target.getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "serversideencryptionenabled":
        case "serverSideEncryptionEnabled": target.getConfiguration().setServerSideEncryptionEnabled(property(camelContext, boolean.class, value)); return true;
        case "subject": target.getConfiguration().setSubject(property(camelContext, java.lang.String.class, value)); return true;
        case "subscribesnstosqs":
        case "subscribeSNStoSQS": target.getConfiguration().setSubscribeSNStoSQS(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "trustallcertificates":
        case "trustAllCertificates": target.getConfiguration().setTrustAllCertificates(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("accessKey", java.lang.String.class);
        answer.put("amazonSNSClient", software.amazon.awssdk.services.sns.SnsClient.class);
        answer.put("autoCreateTopic", boolean.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("headerFilterStrategy", org.apache.camel.spi.HeaderFilterStrategy.class);
        answer.put("kmsMasterKeyId", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("messageStructure", java.lang.String.class);
        answer.put("policy", java.lang.String.class);
        answer.put("proxyHost", java.lang.String.class);
        answer.put("proxyPort", java.lang.Integer.class);
        answer.put("proxyProtocol", software.amazon.awssdk.core.Protocol.class);
        answer.put("queueUrl", java.lang.String.class);
        answer.put("region", java.lang.String.class);
        answer.put("secretKey", java.lang.String.class);
        answer.put("serverSideEncryptionEnabled", boolean.class);
        answer.put("subject", java.lang.String.class);
        answer.put("subscribeSNStoSQS", boolean.class);
        answer.put("synchronous", boolean.class);
        answer.put("trustAllCertificates", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Sns2Endpoint target = (Sns2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return target.getConfiguration().getAccessKey();
        case "amazonsnsclient":
        case "amazonSNSClient": return target.getConfiguration().getAmazonSNSClient();
        case "autocreatetopic":
        case "autoCreateTopic": return target.getConfiguration().isAutoCreateTopic();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getHeaderFilterStrategy();
        case "kmsmasterkeyid":
        case "kmsMasterKeyId": return target.getConfiguration().getKmsMasterKeyId();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "messagestructure":
        case "messageStructure": return target.getConfiguration().getMessageStructure();
        case "policy": return target.getConfiguration().getPolicy();
        case "proxyhost":
        case "proxyHost": return target.getConfiguration().getProxyHost();
        case "proxyport":
        case "proxyPort": return target.getConfiguration().getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return target.getConfiguration().getProxyProtocol();
        case "queueurl":
        case "queueUrl": return target.getConfiguration().getQueueUrl();
        case "region": return target.getConfiguration().getRegion();
        case "secretkey":
        case "secretKey": return target.getConfiguration().getSecretKey();
        case "serversideencryptionenabled":
        case "serverSideEncryptionEnabled": return target.getConfiguration().isServerSideEncryptionEnabled();
        case "subject": return target.getConfiguration().getSubject();
        case "subscribesnstosqs":
        case "subscribeSNStoSQS": return target.getConfiguration().isSubscribeSNStoSQS();
        case "synchronous": return target.isSynchronous();
        case "trustallcertificates":
        case "trustAllCertificates": return target.getConfiguration().isTrustAllCertificates();
        default: return null;
        }
    }
}

