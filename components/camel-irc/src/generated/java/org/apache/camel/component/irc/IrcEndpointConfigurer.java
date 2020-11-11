/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.irc;

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
public class IrcEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        IrcEndpoint target = (IrcEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autorejoin":
        case "autoRejoin": target.getConfiguration().setAutoRejoin(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "channels": target.getConfiguration().setChannels(property(camelContext, java.lang.String.class, value)); return true;
        case "colors": target.getConfiguration().setColors(property(camelContext, boolean.class, value)); return true;
        case "commandtimeout":
        case "commandTimeout": target.getConfiguration().setCommandTimeout(property(camelContext, long.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "keys": target.getConfiguration().setKeys(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "namesonjoin":
        case "namesOnJoin": target.getConfiguration().setNamesOnJoin(property(camelContext, boolean.class, value)); return true;
        case "nickpassword":
        case "nickPassword": target.getConfiguration().setNickPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "nickname": target.getConfiguration().setNickname(property(camelContext, java.lang.String.class, value)); return true;
        case "onjoin":
        case "onJoin": target.getConfiguration().setOnJoin(property(camelContext, boolean.class, value)); return true;
        case "onkick":
        case "onKick": target.getConfiguration().setOnKick(property(camelContext, boolean.class, value)); return true;
        case "onmode":
        case "onMode": target.getConfiguration().setOnMode(property(camelContext, boolean.class, value)); return true;
        case "onnick":
        case "onNick": target.getConfiguration().setOnNick(property(camelContext, boolean.class, value)); return true;
        case "onpart":
        case "onPart": target.getConfiguration().setOnPart(property(camelContext, boolean.class, value)); return true;
        case "onprivmsg":
        case "onPrivmsg": target.getConfiguration().setOnPrivmsg(property(camelContext, boolean.class, value)); return true;
        case "onquit":
        case "onQuit": target.getConfiguration().setOnQuit(property(camelContext, boolean.class, value)); return true;
        case "onreply":
        case "onReply": target.getConfiguration().setOnReply(property(camelContext, boolean.class, value)); return true;
        case "ontopic":
        case "onTopic": target.getConfiguration().setOnTopic(property(camelContext, boolean.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "persistent": target.getConfiguration().setPersistent(property(camelContext, boolean.class, value)); return true;
        case "realname": target.getConfiguration().setRealname(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "trustmanager":
        case "trustManager": target.getConfiguration().setTrustManager(property(camelContext, org.schwering.irc.lib.ssl.SSLTrustManager.class, value)); return true;
        case "username": target.getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autorejoin":
        case "autoRejoin": return boolean.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "channels": return java.lang.String.class;
        case "colors": return boolean.class;
        case "commandtimeout":
        case "commandTimeout": return long.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "keys": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "namesonjoin":
        case "namesOnJoin": return boolean.class;
        case "nickpassword":
        case "nickPassword": return java.lang.String.class;
        case "nickname": return java.lang.String.class;
        case "onjoin":
        case "onJoin": return boolean.class;
        case "onkick":
        case "onKick": return boolean.class;
        case "onmode":
        case "onMode": return boolean.class;
        case "onnick":
        case "onNick": return boolean.class;
        case "onpart":
        case "onPart": return boolean.class;
        case "onprivmsg":
        case "onPrivmsg": return boolean.class;
        case "onquit":
        case "onQuit": return boolean.class;
        case "onreply":
        case "onReply": return boolean.class;
        case "ontopic":
        case "onTopic": return boolean.class;
        case "password": return java.lang.String.class;
        case "persistent": return boolean.class;
        case "realname": return java.lang.String.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "synchronous": return boolean.class;
        case "trustmanager":
        case "trustManager": return org.schwering.irc.lib.ssl.SSLTrustManager.class;
        case "username": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        IrcEndpoint target = (IrcEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autorejoin":
        case "autoRejoin": return target.getConfiguration().isAutoRejoin();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "channels": return target.getConfiguration().getChannels();
        case "colors": return target.getConfiguration().isColors();
        case "commandtimeout":
        case "commandTimeout": return target.getConfiguration().getCommandTimeout();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "keys": return target.getConfiguration().getKeys();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "namesonjoin":
        case "namesOnJoin": return target.getConfiguration().isNamesOnJoin();
        case "nickpassword":
        case "nickPassword": return target.getConfiguration().getNickPassword();
        case "nickname": return target.getConfiguration().getNickname();
        case "onjoin":
        case "onJoin": return target.getConfiguration().isOnJoin();
        case "onkick":
        case "onKick": return target.getConfiguration().isOnKick();
        case "onmode":
        case "onMode": return target.getConfiguration().isOnMode();
        case "onnick":
        case "onNick": return target.getConfiguration().isOnNick();
        case "onpart":
        case "onPart": return target.getConfiguration().isOnPart();
        case "onprivmsg":
        case "onPrivmsg": return target.getConfiguration().isOnPrivmsg();
        case "onquit":
        case "onQuit": return target.getConfiguration().isOnQuit();
        case "onreply":
        case "onReply": return target.getConfiguration().isOnReply();
        case "ontopic":
        case "onTopic": return target.getConfiguration().isOnTopic();
        case "password": return target.getConfiguration().getPassword();
        case "persistent": return target.getConfiguration().isPersistent();
        case "realname": return target.getConfiguration().getRealname();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getConfiguration().getSslContextParameters();
        case "synchronous": return target.isSynchronous();
        case "trustmanager":
        case "trustManager": return target.getConfiguration().getTrustManager();
        case "username": return target.getConfiguration().getUsername();
        default: return null;
        }
    }
}

