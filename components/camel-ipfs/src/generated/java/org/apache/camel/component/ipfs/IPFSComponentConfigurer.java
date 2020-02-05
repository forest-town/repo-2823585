/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ipfs;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class IPFSComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        IPFSComponent target = (IPFSComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "ipfshost":
        case "ipfsHost": target.setIpfsHost(property(camelContext, java.lang.String.class, value)); return true;
        case "ipfsport":
        case "ipfsPort": target.setIpfsPort(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

