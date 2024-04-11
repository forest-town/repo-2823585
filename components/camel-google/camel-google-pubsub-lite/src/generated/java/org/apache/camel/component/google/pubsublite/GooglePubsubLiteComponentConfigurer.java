/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.pubsublite;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointSchemaGeneratorMojo")
@SuppressWarnings("unchecked")
public class GooglePubsubLiteComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GooglePubsubLiteComponent target = (GooglePubsubLiteComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumerbytesoutstanding":
        case "consumerBytesOutstanding": target.setConsumerBytesOutstanding(property(camelContext, long.class, value)); return true;
        case "consumermessagesoutstanding":
        case "consumerMessagesOutstanding": target.setConsumerMessagesOutstanding(property(camelContext, long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "publishercachesize":
        case "publisherCacheSize": target.setPublisherCacheSize(property(camelContext, int.class, value)); return true;
        case "publishercachetimeout":
        case "publisherCacheTimeout": target.setPublisherCacheTimeout(property(camelContext, int.class, value)); return true;
        case "publisherterminationtimeout":
        case "publisherTerminationTimeout": target.setPublisherTerminationTimeout(property(camelContext, int.class, value)); return true;
        case "serviceaccountkey":
        case "serviceAccountKey": target.setServiceAccountKey(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "consumerbytesoutstanding":
        case "consumerBytesOutstanding": return long.class;
        case "consumermessagesoutstanding":
        case "consumerMessagesOutstanding": return long.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "publishercachesize":
        case "publisherCacheSize": return int.class;
        case "publishercachetimeout":
        case "publisherCacheTimeout": return int.class;
        case "publisherterminationtimeout":
        case "publisherTerminationTimeout": return int.class;
        case "serviceaccountkey":
        case "serviceAccountKey": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        GooglePubsubLiteComponent target = (GooglePubsubLiteComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "consumerbytesoutstanding":
        case "consumerBytesOutstanding": return target.getConsumerBytesOutstanding();
        case "consumermessagesoutstanding":
        case "consumerMessagesOutstanding": return target.getConsumerMessagesOutstanding();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "publishercachesize":
        case "publisherCacheSize": return target.getPublisherCacheSize();
        case "publishercachetimeout":
        case "publisherCacheTimeout": return target.getPublisherCacheTimeout();
        case "publisherterminationtimeout":
        case "publisherTerminationTimeout": return target.getPublisherTerminationTimeout();
        case "serviceaccountkey":
        case "serviceAccountKey": return target.getServiceAccountKey();
        default: return null;
        }
    }
}

