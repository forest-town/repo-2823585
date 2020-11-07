/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.smpp;

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
public class SmppComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.smpp.SmppConfiguration getOrCreateConfiguration(SmppComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.smpp.SmppConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SmppComponent target = (SmppComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "addressrange":
        case "addressRange": getOrCreateConfiguration(target).setAddressRange(property(camelContext, java.lang.String.class, value)); return true;
        case "alphabet": getOrCreateConfiguration(target).setAlphabet(property(camelContext, byte.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.smpp.SmppConfiguration.class, value)); return true;
        case "datacoding":
        case "dataCoding": getOrCreateConfiguration(target).setDataCoding(property(camelContext, byte.class, value)); return true;
        case "destaddr":
        case "destAddr": getOrCreateConfiguration(target).setDestAddr(property(camelContext, java.lang.String.class, value)); return true;
        case "destaddrnpi":
        case "destAddrNpi": getOrCreateConfiguration(target).setDestAddrNpi(property(camelContext, byte.class, value)); return true;
        case "destaddrton":
        case "destAddrTon": getOrCreateConfiguration(target).setDestAddrTon(property(camelContext, byte.class, value)); return true;
        case "encoding": getOrCreateConfiguration(target).setEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "enquirelinktimer":
        case "enquireLinkTimer": getOrCreateConfiguration(target).setEnquireLinkTimer(property(camelContext, java.lang.Integer.class, value)); return true;
        case "httpproxyhost":
        case "httpProxyHost": getOrCreateConfiguration(target).setHttpProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxypassword":
        case "httpProxyPassword": getOrCreateConfiguration(target).setHttpProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyport":
        case "httpProxyPort": getOrCreateConfiguration(target).setHttpProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "httpproxyusername":
        case "httpProxyUsername": getOrCreateConfiguration(target).setHttpProxyUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "initialreconnectdelay":
        case "initialReconnectDelay": getOrCreateConfiguration(target).setInitialReconnectDelay(property(camelContext, long.class, value)); return true;
        case "lazysessioncreation":
        case "lazySessionCreation": getOrCreateConfiguration(target).setLazySessionCreation(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxreconnect":
        case "maxReconnect": getOrCreateConfiguration(target).setMaxReconnect(property(camelContext, int.class, value)); return true;
        case "numberingplanindicator":
        case "numberingPlanIndicator": getOrCreateConfiguration(target).setNumberingPlanIndicator(property(camelContext, byte.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "priorityflag":
        case "priorityFlag": getOrCreateConfiguration(target).setPriorityFlag(property(camelContext, byte.class, value)); return true;
        case "protocolid":
        case "protocolId": getOrCreateConfiguration(target).setProtocolId(property(camelContext, byte.class, value)); return true;
        case "proxyheaders":
        case "proxyHeaders": getOrCreateConfiguration(target).setProxyHeaders(property(camelContext, java.util.Map.class, value)); return true;
        case "reconnectdelay":
        case "reconnectDelay": getOrCreateConfiguration(target).setReconnectDelay(property(camelContext, long.class, value)); return true;
        case "registereddelivery":
        case "registeredDelivery": getOrCreateConfiguration(target).setRegisteredDelivery(property(camelContext, byte.class, value)); return true;
        case "replaceifpresentflag":
        case "replaceIfPresentFlag": getOrCreateConfiguration(target).setReplaceIfPresentFlag(property(camelContext, byte.class, value)); return true;
        case "servicetype":
        case "serviceType": getOrCreateConfiguration(target).setServiceType(property(camelContext, java.lang.String.class, value)); return true;
        case "sessionstatelistener":
        case "sessionStateListener": getOrCreateConfiguration(target).setSessionStateListener(property(camelContext, org.jsmpp.session.SessionStateListener.class, value)); return true;
        case "sourceaddr":
        case "sourceAddr": getOrCreateConfiguration(target).setSourceAddr(property(camelContext, java.lang.String.class, value)); return true;
        case "sourceaddrnpi":
        case "sourceAddrNpi": getOrCreateConfiguration(target).setSourceAddrNpi(property(camelContext, byte.class, value)); return true;
        case "sourceaddrton":
        case "sourceAddrTon": getOrCreateConfiguration(target).setSourceAddrTon(property(camelContext, byte.class, value)); return true;
        case "splittingpolicy":
        case "splittingPolicy": getOrCreateConfiguration(target).setSplittingPolicy(property(camelContext, org.apache.camel.component.smpp.SmppSplittingPolicy.class, value)); return true;
        case "systemid":
        case "systemId": getOrCreateConfiguration(target).setSystemId(property(camelContext, java.lang.String.class, value)); return true;
        case "systemtype":
        case "systemType": getOrCreateConfiguration(target).setSystemType(property(camelContext, java.lang.String.class, value)); return true;
        case "transactiontimer":
        case "transactionTimer": getOrCreateConfiguration(target).setTransactionTimer(property(camelContext, java.lang.Integer.class, value)); return true;
        case "typeofnumber":
        case "typeOfNumber": getOrCreateConfiguration(target).setTypeOfNumber(property(camelContext, byte.class, value)); return true;
        case "usingssl":
        case "usingSSL": getOrCreateConfiguration(target).setUsingSSL(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "addressrange":
        case "addressRange": return java.lang.String.class;
        case "alphabet": return byte.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "configuration": return org.apache.camel.component.smpp.SmppConfiguration.class;
        case "datacoding":
        case "dataCoding": return byte.class;
        case "destaddr":
        case "destAddr": return java.lang.String.class;
        case "destaddrnpi":
        case "destAddrNpi": return byte.class;
        case "destaddrton":
        case "destAddrTon": return byte.class;
        case "encoding": return java.lang.String.class;
        case "enquirelinktimer":
        case "enquireLinkTimer": return java.lang.Integer.class;
        case "httpproxyhost":
        case "httpProxyHost": return java.lang.String.class;
        case "httpproxypassword":
        case "httpProxyPassword": return java.lang.String.class;
        case "httpproxyport":
        case "httpProxyPort": return java.lang.Integer.class;
        case "httpproxyusername":
        case "httpProxyUsername": return java.lang.String.class;
        case "initialreconnectdelay":
        case "initialReconnectDelay": return long.class;
        case "lazysessioncreation":
        case "lazySessionCreation": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxreconnect":
        case "maxReconnect": return int.class;
        case "numberingplanindicator":
        case "numberingPlanIndicator": return byte.class;
        case "password": return java.lang.String.class;
        case "priorityflag":
        case "priorityFlag": return byte.class;
        case "protocolid":
        case "protocolId": return byte.class;
        case "proxyheaders":
        case "proxyHeaders": return java.util.Map.class;
        case "reconnectdelay":
        case "reconnectDelay": return long.class;
        case "registereddelivery":
        case "registeredDelivery": return byte.class;
        case "replaceifpresentflag":
        case "replaceIfPresentFlag": return byte.class;
        case "servicetype":
        case "serviceType": return java.lang.String.class;
        case "sessionstatelistener":
        case "sessionStateListener": return org.jsmpp.session.SessionStateListener.class;
        case "sourceaddr":
        case "sourceAddr": return java.lang.String.class;
        case "sourceaddrnpi":
        case "sourceAddrNpi": return byte.class;
        case "sourceaddrton":
        case "sourceAddrTon": return byte.class;
        case "splittingpolicy":
        case "splittingPolicy": return org.apache.camel.component.smpp.SmppSplittingPolicy.class;
        case "systemid":
        case "systemId": return java.lang.String.class;
        case "systemtype":
        case "systemType": return java.lang.String.class;
        case "transactiontimer":
        case "transactionTimer": return java.lang.Integer.class;
        case "typeofnumber":
        case "typeOfNumber": return byte.class;
        case "usingssl":
        case "usingSSL": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SmppComponent target = (SmppComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "addressrange":
        case "addressRange": return getOrCreateConfiguration(target).getAddressRange();
        case "alphabet": return getOrCreateConfiguration(target).getAlphabet();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configuration": return target.getConfiguration();
        case "datacoding":
        case "dataCoding": return getOrCreateConfiguration(target).getDataCoding();
        case "destaddr":
        case "destAddr": return getOrCreateConfiguration(target).getDestAddr();
        case "destaddrnpi":
        case "destAddrNpi": return getOrCreateConfiguration(target).getDestAddrNpi();
        case "destaddrton":
        case "destAddrTon": return getOrCreateConfiguration(target).getDestAddrTon();
        case "encoding": return getOrCreateConfiguration(target).getEncoding();
        case "enquirelinktimer":
        case "enquireLinkTimer": return getOrCreateConfiguration(target).getEnquireLinkTimer();
        case "httpproxyhost":
        case "httpProxyHost": return getOrCreateConfiguration(target).getHttpProxyHost();
        case "httpproxypassword":
        case "httpProxyPassword": return getOrCreateConfiguration(target).getHttpProxyPassword();
        case "httpproxyport":
        case "httpProxyPort": return getOrCreateConfiguration(target).getHttpProxyPort();
        case "httpproxyusername":
        case "httpProxyUsername": return getOrCreateConfiguration(target).getHttpProxyUsername();
        case "initialreconnectdelay":
        case "initialReconnectDelay": return getOrCreateConfiguration(target).getInitialReconnectDelay();
        case "lazysessioncreation":
        case "lazySessionCreation": return getOrCreateConfiguration(target).isLazySessionCreation();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxreconnect":
        case "maxReconnect": return getOrCreateConfiguration(target).getMaxReconnect();
        case "numberingplanindicator":
        case "numberingPlanIndicator": return getOrCreateConfiguration(target).getNumberingPlanIndicator();
        case "password": return getOrCreateConfiguration(target).getPassword();
        case "priorityflag":
        case "priorityFlag": return getOrCreateConfiguration(target).getPriorityFlag();
        case "protocolid":
        case "protocolId": return getOrCreateConfiguration(target).getProtocolId();
        case "proxyheaders":
        case "proxyHeaders": return getOrCreateConfiguration(target).getProxyHeaders();
        case "reconnectdelay":
        case "reconnectDelay": return getOrCreateConfiguration(target).getReconnectDelay();
        case "registereddelivery":
        case "registeredDelivery": return getOrCreateConfiguration(target).getRegisteredDelivery();
        case "replaceifpresentflag":
        case "replaceIfPresentFlag": return getOrCreateConfiguration(target).getReplaceIfPresentFlag();
        case "servicetype":
        case "serviceType": return getOrCreateConfiguration(target).getServiceType();
        case "sessionstatelistener":
        case "sessionStateListener": return getOrCreateConfiguration(target).getSessionStateListener();
        case "sourceaddr":
        case "sourceAddr": return getOrCreateConfiguration(target).getSourceAddr();
        case "sourceaddrnpi":
        case "sourceAddrNpi": return getOrCreateConfiguration(target).getSourceAddrNpi();
        case "sourceaddrton":
        case "sourceAddrTon": return getOrCreateConfiguration(target).getSourceAddrTon();
        case "splittingpolicy":
        case "splittingPolicy": return getOrCreateConfiguration(target).getSplittingPolicy();
        case "systemid":
        case "systemId": return getOrCreateConfiguration(target).getSystemId();
        case "systemtype":
        case "systemType": return getOrCreateConfiguration(target).getSystemType();
        case "transactiontimer":
        case "transactionTimer": return getOrCreateConfiguration(target).getTransactionTimer();
        case "typeofnumber":
        case "typeOfNumber": return getOrCreateConfiguration(target).getTypeOfNumber();
        case "usingssl":
        case "usingSSL": return getOrCreateConfiguration(target).isUsingSSL();
        default: return null;
        }
    }
}

