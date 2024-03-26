/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.HashicorpVaultConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class HashicorpVaultConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.HashicorpVaultConfigurationProperties target = (org.apache.camel.main.HashicorpVaultConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "awsvaultconfiguration":
        case "awsVaultConfiguration": target.setAwsVaultConfiguration(property(camelContext, org.apache.camel.vault.AwsVaultConfiguration.class, value)); return true;
        case "azurevaultconfiguration":
        case "azureVaultConfiguration": target.setAzureVaultConfiguration(property(camelContext, org.apache.camel.vault.AzureVaultConfiguration.class, value)); return true;
        case "engine": target.setEngine(property(camelContext, java.lang.String.class, value)); return true;
        case "gcpvaultconfiguration":
        case "gcpVaultConfiguration": target.setGcpVaultConfiguration(property(camelContext, org.apache.camel.vault.GcpVaultConfiguration.class, value)); return true;
        case "hashicorpvaultconfiguration":
        case "hashicorpVaultConfiguration": target.setHashicorpVaultConfiguration(property(camelContext, org.apache.camel.vault.HashicorpVaultConfiguration.class, value)); return true;
        case "host": target.setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "port": target.setPort(property(camelContext, java.lang.String.class, value)); return true;
        case "scheme": target.setScheme(property(camelContext, java.lang.String.class, value)); return true;
        case "token": target.setToken(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "awsvaultconfiguration":
        case "awsVaultConfiguration": return org.apache.camel.vault.AwsVaultConfiguration.class;
        case "azurevaultconfiguration":
        case "azureVaultConfiguration": return org.apache.camel.vault.AzureVaultConfiguration.class;
        case "engine": return java.lang.String.class;
        case "gcpvaultconfiguration":
        case "gcpVaultConfiguration": return org.apache.camel.vault.GcpVaultConfiguration.class;
        case "hashicorpvaultconfiguration":
        case "hashicorpVaultConfiguration": return org.apache.camel.vault.HashicorpVaultConfiguration.class;
        case "host": return java.lang.String.class;
        case "port": return java.lang.String.class;
        case "scheme": return java.lang.String.class;
        case "token": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.HashicorpVaultConfigurationProperties target = (org.apache.camel.main.HashicorpVaultConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "awsvaultconfiguration":
        case "awsVaultConfiguration": return target.getAwsVaultConfiguration();
        case "azurevaultconfiguration":
        case "azureVaultConfiguration": return target.getAzureVaultConfiguration();
        case "engine": return target.getEngine();
        case "gcpvaultconfiguration":
        case "gcpVaultConfiguration": return target.getGcpVaultConfiguration();
        case "hashicorpvaultconfiguration":
        case "hashicorpVaultConfiguration": return target.getHashicorpVaultConfiguration();
        case "host": return target.getHost();
        case "port": return target.getPort();
        case "scheme": return target.getScheme();
        case "token": return target.getToken();
        default: return null;
        }
    }
}

