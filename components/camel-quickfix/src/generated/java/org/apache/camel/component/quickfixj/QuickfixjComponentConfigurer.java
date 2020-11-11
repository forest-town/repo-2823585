/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.quickfixj;

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
@SuppressWarnings("unchecked")
public class QuickfixjComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        QuickfixjComponent target = (QuickfixjComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "lazycreateengines":
        case "lazyCreateEngines": target.setLazyCreateEngines(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "logfactory":
        case "logFactory": target.setLogFactory(property(camelContext, quickfix.LogFactory.class, value)); return true;
        case "messagefactory":
        case "messageFactory": target.setMessageFactory(property(camelContext, quickfix.MessageFactory.class, value)); return true;
        case "messagestorefactory":
        case "messageStoreFactory": target.setMessageStoreFactory(property(camelContext, quickfix.MessageStoreFactory.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "lazycreateengines":
        case "lazyCreateEngines": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "logfactory":
        case "logFactory": return quickfix.LogFactory.class;
        case "messagefactory":
        case "messageFactory": return quickfix.MessageFactory.class;
        case "messagestorefactory":
        case "messageStoreFactory": return quickfix.MessageStoreFactory.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        QuickfixjComponent target = (QuickfixjComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "lazycreateengines":
        case "lazyCreateEngines": return target.isLazyCreateEngines();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "logfactory":
        case "logFactory": return target.getLogFactory();
        case "messagefactory":
        case "messageFactory": return target.getMessageFactory();
        case "messagestorefactory":
        case "messageStoreFactory": return target.getMessageStoreFactory();
        default: return null;
        }
    }
}

