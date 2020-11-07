/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jpa;

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
public class JpaComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JpaComponent target = (JpaComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "entitymanagerfactory":
        case "entityManagerFactory": target.setEntityManagerFactory(property(camelContext, javax.persistence.EntityManagerFactory.class, value)); return true;
        case "jointransaction":
        case "joinTransaction": target.setJoinTransaction(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "sharedentitymanager":
        case "sharedEntityManager": target.setSharedEntityManager(property(camelContext, boolean.class, value)); return true;
        case "transactionmanager":
        case "transactionManager": target.setTransactionManager(property(camelContext, org.springframework.transaction.PlatformTransactionManager.class, value)); return true;
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
        case "entitymanagerfactory":
        case "entityManagerFactory": return javax.persistence.EntityManagerFactory.class;
        case "jointransaction":
        case "joinTransaction": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "sharedentitymanager":
        case "sharedEntityManager": return boolean.class;
        case "transactionmanager":
        case "transactionManager": return org.springframework.transaction.PlatformTransactionManager.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        JpaComponent target = (JpaComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "entitymanagerfactory":
        case "entityManagerFactory": return target.getEntityManagerFactory();
        case "jointransaction":
        case "joinTransaction": return target.isJoinTransaction();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "sharedentitymanager":
        case "sharedEntityManager": return target.isSharedEntityManager();
        case "transactionmanager":
        case "transactionManager": return target.getTransactionManager();
        default: return null;
        }
    }
}

