/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.atomix.client.messaging;

import org.apache.camel.AsyncCallback;
import org.apache.camel.Exchange;
import org.apache.camel.spi.InvokeOnHeaderStrategy;
import org.apache.camel.component.atomix.client.messaging.AtomixMessagingProducer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AtomixMessagingProducerInvokeOnHeaderFactory implements InvokeOnHeaderStrategy {

    @Override
    public Object invoke(Object obj, String key, Exchange exchange, AsyncCallback callback) throws Exception {
        org.apache.camel.component.atomix.client.messaging.AtomixMessagingProducer target = (org.apache.camel.component.atomix.client.messaging.AtomixMessagingProducer) obj;
        switch (key) {
        case "direct":
        case "DIRECT": return target.onDirect(exchange.getMessage(), callback);
        case "broadcast":
        case "BROADCAST": return target.onBroadcast(exchange.getMessage(), callback);
        default: return null;
        }
    }

}

