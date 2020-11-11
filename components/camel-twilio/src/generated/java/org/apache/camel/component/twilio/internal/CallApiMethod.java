
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.twilio.rest.api.v2010.account.Call;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.twilio.rest.api.v2010.account.Call
 */
public enum CallApiMethod implements ApiMethod {

    CREATOR(
        com.twilio.rest.api.v2010.account.CallCreator.class,
        "creator",
        arg("to", com.twilio.type.Endpoint.class),
        arg("from", com.twilio.type.Endpoint.class),
        arg("applicationSid", String.class)),

    CREATOR_1(
        com.twilio.rest.api.v2010.account.CallCreator.class,
        "creator",
        arg("to", com.twilio.type.Endpoint.class),
        arg("from", com.twilio.type.Endpoint.class),
        arg("twiml", com.twilio.type.Twiml.class)),

    CREATOR_2(
        com.twilio.rest.api.v2010.account.CallCreator.class,
        "creator",
        arg("to", com.twilio.type.Endpoint.class),
        arg("from", com.twilio.type.Endpoint.class),
        arg("url", java.net.URI.class)),

    CREATOR_3(
        com.twilio.rest.api.v2010.account.CallCreator.class,
        "creator",
        arg("pathAccountSid", String.class),
        arg("to", com.twilio.type.Endpoint.class),
        arg("from", com.twilio.type.Endpoint.class),
        arg("applicationSid", String.class)),

    CREATOR_4(
        com.twilio.rest.api.v2010.account.CallCreator.class,
        "creator",
        arg("pathAccountSid", String.class),
        arg("to", com.twilio.type.Endpoint.class),
        arg("from", com.twilio.type.Endpoint.class),
        arg("twiml", com.twilio.type.Twiml.class)),

    CREATOR_5(
        com.twilio.rest.api.v2010.account.CallCreator.class,
        "creator",
        arg("pathAccountSid", String.class),
        arg("to", com.twilio.type.Endpoint.class),
        arg("from", com.twilio.type.Endpoint.class),
        arg("url", java.net.URI.class)),

    DELETER(
        com.twilio.rest.api.v2010.account.CallDeleter.class,
        "deleter",
        arg("pathSid", String.class)),

    DELETER_1(
        com.twilio.rest.api.v2010.account.CallDeleter.class,
        "deleter",
        arg("pathAccountSid", String.class),
        arg("pathSid", String.class)),

    FETCHER(
        com.twilio.rest.api.v2010.account.CallFetcher.class,
        "fetcher",
        arg("pathSid", String.class)),

    FETCHER_1(
        com.twilio.rest.api.v2010.account.CallFetcher.class,
        "fetcher",
        arg("pathAccountSid", String.class),
        arg("pathSid", String.class)),

    READER(
        com.twilio.rest.api.v2010.account.CallReader.class,
        "reader"),

    READER_1(
        com.twilio.rest.api.v2010.account.CallReader.class,
        "reader",
        arg("pathAccountSid", String.class)),

    UPDATER(
        com.twilio.rest.api.v2010.account.CallUpdater.class,
        "updater",
        arg("pathSid", String.class)),

    UPDATER_1(
        com.twilio.rest.api.v2010.account.CallUpdater.class,
        "updater",
        arg("pathAccountSid", String.class),
        arg("pathSid", String.class));

    private final ApiMethod apiMethod;

    private CallApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(Call.class, resultType, name, args);
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
