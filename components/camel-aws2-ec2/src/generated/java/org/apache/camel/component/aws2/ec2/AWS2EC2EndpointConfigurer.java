/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.ec2;

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
public class AWS2EC2EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        AWS2EC2Endpoint target = (AWS2EC2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonec2client":
        case "amazonEc2Client": target.getConfiguration().setAmazonEc2Client(property(camelContext, software.amazon.awssdk.services.ec2.Ec2Client.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, org.apache.camel.component.aws2.ec2.AWS2EC2Operations.class, value)); return true;
        case "pojorequest":
        case "pojoRequest": target.getConfiguration().setPojoRequest(property(camelContext, boolean.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": target.getConfiguration().setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "region": target.getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": target.getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
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
        answer.put("amazonEc2Client", software.amazon.awssdk.services.ec2.Ec2Client.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("operation", org.apache.camel.component.aws2.ec2.AWS2EC2Operations.class);
        answer.put("pojoRequest", boolean.class);
        answer.put("proxyHost", java.lang.String.class);
        answer.put("proxyPort", java.lang.Integer.class);
        answer.put("proxyProtocol", software.amazon.awssdk.core.Protocol.class);
        answer.put("region", java.lang.String.class);
        answer.put("secretKey", java.lang.String.class);
        answer.put("synchronous", boolean.class);
        answer.put("trustAllCertificates", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        AWS2EC2Endpoint target = (AWS2EC2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return target.getConfiguration().getAccessKey();
        case "amazonec2client":
        case "amazonEc2Client": return target.getConfiguration().getAmazonEc2Client();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "operation": return target.getConfiguration().getOperation();
        case "pojorequest":
        case "pojoRequest": return target.getConfiguration().isPojoRequest();
        case "proxyhost":
        case "proxyHost": return target.getConfiguration().getProxyHost();
        case "proxyport":
        case "proxyPort": return target.getConfiguration().getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return target.getConfiguration().getProxyProtocol();
        case "region": return target.getConfiguration().getRegion();
        case "secretkey":
        case "secretKey": return target.getConfiguration().getSecretKey();
        case "synchronous": return target.isSynchronous();
        case "trustallcertificates":
        case "trustAllCertificates": return target.getConfiguration().isTrustAllCertificates();
        default: return null;
        }
    }
}

