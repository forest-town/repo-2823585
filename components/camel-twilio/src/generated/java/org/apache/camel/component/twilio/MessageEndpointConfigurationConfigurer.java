/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.twilio;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.twilio.MessageEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MessageEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.twilio.MessageEndpointConfiguration target = (org.apache.camel.component.twilio.MessageEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": target.setApiName(property(camelContext, org.apache.camel.component.twilio.internal.TwilioApiName.class, value)); return true;
        case "body":
        case "Body": target.setBody(property(camelContext, java.lang.String.class, value)); return true;
        case "from":
        case "From": target.setFrom(property(camelContext, com.twilio.type.PhoneNumber.class, value)); return true;
        case "mediaurl":
        case "MediaUrl": target.setMediaUrl(property(camelContext, java.util.List.class, value)); return true;
        case "messagingservicesid":
        case "MessagingServiceSid": target.setMessagingServiceSid(property(camelContext, java.lang.String.class, value)); return true;
        case "methodname":
        case "MethodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "pathaccountsid":
        case "PathAccountSid": target.setPathAccountSid(property(camelContext, java.lang.String.class, value)); return true;
        case "pathsid":
        case "PathSid": target.setPathSid(property(camelContext, java.lang.String.class, value)); return true;
        case "to":
        case "To": target.setTo(property(camelContext, com.twilio.type.PhoneNumber.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("ApiName", org.apache.camel.component.twilio.internal.TwilioApiName.class);
        answer.put("Body", java.lang.String.class);
        answer.put("From", com.twilio.type.PhoneNumber.class);
        answer.put("MediaUrl", java.util.List.class);
        answer.put("MessagingServiceSid", java.lang.String.class);
        answer.put("MethodName", java.lang.String.class);
        answer.put("PathAccountSid", java.lang.String.class);
        answer.put("PathSid", java.lang.String.class);
        answer.put("To", com.twilio.type.PhoneNumber.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.twilio.MessageEndpointConfiguration target = (org.apache.camel.component.twilio.MessageEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": return target.getApiName();
        case "body":
        case "Body": return target.getBody();
        case "from":
        case "From": return target.getFrom();
        case "mediaurl":
        case "MediaUrl": return target.getMediaUrl();
        case "messagingservicesid":
        case "MessagingServiceSid": return target.getMessagingServiceSid();
        case "methodname":
        case "MethodName": return target.getMethodName();
        case "pathaccountsid":
        case "PathAccountSid": return target.getPathAccountSid();
        case "pathsid":
        case "PathSid": return target.getPathSid();
        case "to":
        case "To": return target.getTo();
        default: return null;
        }
    }

    @Override
    public Object getOptionNestedType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "mediaurl":
        case "MediaUrl": return java.net.URI.class;
        default: return null;
        }
    }
}

