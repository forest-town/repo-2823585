/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.web3j;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Web3jEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Web3jEndpoint target = (Web3jEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "address": target.getConfiguration().setAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "addresses": target.getConfiguration().setAddresses(property(camelContext, java.util.List.class, value)); return true;
        case "atblock":
        case "atBlock": target.getConfiguration().setAtBlock(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "blockhash":
        case "blockHash": target.getConfiguration().setBlockHash(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "clientid":
        case "clientId": target.getConfiguration().setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "data": target.getConfiguration().setData(property(camelContext, java.lang.String.class, value)); return true;
        case "databasename":
        case "databaseName": target.getConfiguration().setDatabaseName(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "filterid":
        case "filterId": target.getConfiguration().setFilterId(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "fromaddress":
        case "fromAddress": target.getConfiguration().setFromAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "fromblock":
        case "fromBlock": target.getConfiguration().setFromBlock(property(camelContext, java.lang.String.class, value)); return true;
        case "fulltransactionobjects":
        case "fullTransactionObjects": target.getConfiguration().setFullTransactionObjects(property(camelContext, boolean.class, value)); return true;
        case "gaslimit":
        case "gasLimit": target.getConfiguration().setGasLimit(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "gasprice":
        case "gasPrice": target.getConfiguration().setGasPrice(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "hashrate": target.getConfiguration().setHashrate(property(camelContext, java.lang.String.class, value)); return true;
        case "headerpowhash":
        case "headerPowHash": target.getConfiguration().setHeaderPowHash(property(camelContext, java.lang.String.class, value)); return true;
        case "index": target.getConfiguration().setIndex(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "keyname":
        case "keyName": target.getConfiguration().setKeyName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mixdigest":
        case "mixDigest": target.getConfiguration().setMixDigest(property(camelContext, java.lang.String.class, value)); return true;
        case "nonce": target.getConfiguration().setNonce(property(camelContext, java.lang.String.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "position": target.getConfiguration().setPosition(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "priority": target.getConfiguration().setPriority(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "privatefor":
        case "privateFor": target.getConfiguration().setPrivateFor(property(camelContext, java.util.List.class, value)); return true;
        case "quorumapi":
        case "quorumAPI": target.getConfiguration().setQuorumAPI(property(camelContext, boolean.class, value)); return true;
        case "sha3hashofdatatosign":
        case "sha3HashOfDataToSign": target.getConfiguration().setSha3HashOfDataToSign(property(camelContext, java.lang.String.class, value)); return true;
        case "signedtransactiondata":
        case "signedTransactionData": target.getConfiguration().setSignedTransactionData(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcecode":
        case "sourceCode": target.getConfiguration().setSourceCode(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "toaddress":
        case "toAddress": target.getConfiguration().setToAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "toblock":
        case "toBlock": target.getConfiguration().setToBlock(property(camelContext, java.lang.String.class, value)); return true;
        case "topics": target.getConfiguration().setTopics(property(camelContext, java.lang.String.class, value)); return true;
        case "transactionhash":
        case "transactionHash": target.getConfiguration().setTransactionHash(property(camelContext, java.lang.String.class, value)); return true;
        case "ttl": target.getConfiguration().setTtl(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "value": target.getConfiguration().setValue(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "web3j": target.getConfiguration().setWeb3j(property(camelContext, org.web3j.protocol.Web3j.class, value)); return true;
        default: return false;
        }
    }

}

