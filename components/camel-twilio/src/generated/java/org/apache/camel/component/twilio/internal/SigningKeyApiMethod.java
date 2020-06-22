
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.twilio.rest.api.v2010.account.SigningKey;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.twilio.rest.api.v2010.account.SigningKey
 */
public enum SigningKeyApiMethod implements ApiMethod {

    DELETER(
        com.twilio.rest.api.v2010.account.SigningKeyDeleter.class,
        "deleter",
        arg("pathSid", String.class)),

    DELETER_1(
        com.twilio.rest.api.v2010.account.SigningKeyDeleter.class,
        "deleter",
        arg("pathAccountSid", String.class),
        arg("pathSid", String.class)),

    FETCHER(
        com.twilio.rest.api.v2010.account.SigningKeyFetcher.class,
        "fetcher",
        arg("pathSid", String.class)),

    FETCHER_1(
        com.twilio.rest.api.v2010.account.SigningKeyFetcher.class,
        "fetcher",
        arg("pathAccountSid", String.class),
        arg("pathSid", String.class)),

    READER(
        com.twilio.rest.api.v2010.account.SigningKeyReader.class,
        "reader"),

    READER_1(
        com.twilio.rest.api.v2010.account.SigningKeyReader.class,
        "reader",
        arg("pathAccountSid", String.class)),

    UPDATER(
        com.twilio.rest.api.v2010.account.SigningKeyUpdater.class,
        "updater",
        arg("pathSid", String.class)),

    UPDATER_1(
        com.twilio.rest.api.v2010.account.SigningKeyUpdater.class,
        "updater",
        arg("pathAccountSid", String.class),
        arg("pathSid", String.class));

    

    private final ApiMethod apiMethod;

    private SigningKeyApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(SigningKey.class, resultType, name, args);
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
