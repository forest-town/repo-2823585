/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jgroups.raft;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JGroupsRaftComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JGroupsRaftComponent target = (JGroupsRaftComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "channelproperties":
        case "channelProperties": target.setChannelProperties(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "rafthandle":
        case "raftHandle": target.setRaftHandle(property(camelContext, org.jgroups.raft.RaftHandle.class, value)); return true;
        case "raftid":
        case "raftId": target.setRaftId(property(camelContext, java.lang.String.class, value)); return true;
        case "statemachine":
        case "stateMachine": target.setStateMachine(property(camelContext, org.jgroups.protocols.raft.StateMachine.class, value)); return true;
        default: return false;
        }
    }

}

