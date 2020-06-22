
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.twilio.rest.api.v2010.account.sip.ipaccesscontrollist.IpAddress;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.twilio.rest.api.v2010.account.sip.ipaccesscontrollist.IpAddress
 */
public enum SipIpAccessControlListIpAddressApiMethod implements ApiMethod {

    CREATOR(
        com.twilio.rest.api.v2010.account.sip.ipaccesscontrollist.IpAddressCreator.class,
        "creator",
        arg("pathIpAccessControlListSid", String.class),
        arg("friendlyName", String.class),
        arg("ipAddress", String.class)),

    CREATOR_1(
        com.twilio.rest.api.v2010.account.sip.ipaccesscontrollist.IpAddressCreator.class,
        "creator",
        arg("pathAccountSid", String.class),
        arg("pathIpAccessControlListSid", String.class),
        arg("friendlyName", String.class),
        arg("ipAddress", String.class)),

    DELETER(
        com.twilio.rest.api.v2010.account.sip.ipaccesscontrollist.IpAddressDeleter.class,
        "deleter",
        arg("pathIpAccessControlListSid", String.class),
        arg("pathSid", String.class)),

    DELETER_1(
        com.twilio.rest.api.v2010.account.sip.ipaccesscontrollist.IpAddressDeleter.class,
        "deleter",
        arg("pathAccountSid", String.class),
        arg("pathIpAccessControlListSid", String.class),
        arg("pathSid", String.class)),

    FETCHER(
        com.twilio.rest.api.v2010.account.sip.ipaccesscontrollist.IpAddressFetcher.class,
        "fetcher",
        arg("pathIpAccessControlListSid", String.class),
        arg("pathSid", String.class)),

    FETCHER_1(
        com.twilio.rest.api.v2010.account.sip.ipaccesscontrollist.IpAddressFetcher.class,
        "fetcher",
        arg("pathAccountSid", String.class),
        arg("pathIpAccessControlListSid", String.class),
        arg("pathSid", String.class)),

    READER(
        com.twilio.rest.api.v2010.account.sip.ipaccesscontrollist.IpAddressReader.class,
        "reader",
        arg("pathIpAccessControlListSid", String.class)),

    READER_1(
        com.twilio.rest.api.v2010.account.sip.ipaccesscontrollist.IpAddressReader.class,
        "reader",
        arg("pathAccountSid", String.class),
        arg("pathIpAccessControlListSid", String.class)),

    UPDATER(
        com.twilio.rest.api.v2010.account.sip.ipaccesscontrollist.IpAddressUpdater.class,
        "updater",
        arg("pathIpAccessControlListSid", String.class),
        arg("pathSid", String.class)),

    UPDATER_1(
        com.twilio.rest.api.v2010.account.sip.ipaccesscontrollist.IpAddressUpdater.class,
        "updater",
        arg("pathAccountSid", String.class),
        arg("pathIpAccessControlListSid", String.class),
        arg("pathSid", String.class));

    

    private final ApiMethod apiMethod;

    private SipIpAccessControlListIpAddressApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(IpAddress.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
