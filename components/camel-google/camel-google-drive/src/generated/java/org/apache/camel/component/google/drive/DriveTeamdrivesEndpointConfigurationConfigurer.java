/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.drive;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.google.drive.DriveTeamdrivesEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DriveTeamdrivesEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("AccessToken", java.lang.String.class);
        map.put("ApiName", org.apache.camel.component.google.drive.internal.GoogleDriveApiName.class);
        map.put("ApplicationName", java.lang.String.class);
        map.put("ClientId", java.lang.String.class);
        map.put("ClientSecret", java.lang.String.class);
        map.put("Content", com.google.api.services.drive.model.TeamDrive.class);
        map.put("Delegate", java.lang.String.class);
        map.put("MethodName", java.lang.String.class);
        map.put("RefreshToken", java.lang.String.class);
        map.put("RequestId", java.lang.String.class);
        map.put("Scopes", java.util.List.class);
        map.put("ServiceAccountKey", java.lang.String.class);
        map.put("TeamDriveId", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.google.drive.DriveTeamdrivesEndpointConfiguration target = (org.apache.camel.component.google.drive.DriveTeamdrivesEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": target.setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "apiname":
        case "apiName": target.setApiName(property(camelContext, org.apache.camel.component.google.drive.internal.GoogleDriveApiName.class, value)); return true;
        case "applicationname":
        case "applicationName": target.setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "clientid":
        case "clientId": target.setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "clientSecret": target.setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "content": target.setContent(property(camelContext, com.google.api.services.drive.model.TeamDrive.class, value)); return true;
        case "delegate": target.setDelegate(property(camelContext, java.lang.String.class, value)); return true;
        case "methodname":
        case "methodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "refreshtoken":
        case "refreshToken": target.setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "requestid":
        case "requestId": target.setRequestId(property(camelContext, java.lang.String.class, value)); return true;
        case "scopes": target.setScopes(property(camelContext, java.util.List.class, value)); return true;
        case "serviceaccountkey":
        case "serviceAccountKey": target.setServiceAccountKey(property(camelContext, java.lang.String.class, value)); return true;
        case "teamdriveid":
        case "teamDriveId": target.setTeamDriveId(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return java.lang.String.class;
        case "apiname":
        case "apiName": return org.apache.camel.component.google.drive.internal.GoogleDriveApiName.class;
        case "applicationname":
        case "applicationName": return java.lang.String.class;
        case "clientid":
        case "clientId": return java.lang.String.class;
        case "clientsecret":
        case "clientSecret": return java.lang.String.class;
        case "content": return com.google.api.services.drive.model.TeamDrive.class;
        case "delegate": return java.lang.String.class;
        case "methodname":
        case "methodName": return java.lang.String.class;
        case "refreshtoken":
        case "refreshToken": return java.lang.String.class;
        case "requestid":
        case "requestId": return java.lang.String.class;
        case "scopes": return java.util.List.class;
        case "serviceaccountkey":
        case "serviceAccountKey": return java.lang.String.class;
        case "teamdriveid":
        case "teamDriveId": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.google.drive.DriveTeamdrivesEndpointConfiguration target = (org.apache.camel.component.google.drive.DriveTeamdrivesEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return target.getAccessToken();
        case "apiname":
        case "apiName": return target.getApiName();
        case "applicationname":
        case "applicationName": return target.getApplicationName();
        case "clientid":
        case "clientId": return target.getClientId();
        case "clientsecret":
        case "clientSecret": return target.getClientSecret();
        case "content": return target.getContent();
        case "delegate": return target.getDelegate();
        case "methodname":
        case "methodName": return target.getMethodName();
        case "refreshtoken":
        case "refreshToken": return target.getRefreshToken();
        case "requestid":
        case "requestId": return target.getRequestId();
        case "scopes": return target.getScopes();
        case "serviceaccountkey":
        case "serviceAccountKey": return target.getServiceAccountKey();
        case "teamdriveid":
        case "teamDriveId": return target.getTeamDriveId();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "scopes": return java.lang.String.class;
        default: return null;
        }
    }
}

