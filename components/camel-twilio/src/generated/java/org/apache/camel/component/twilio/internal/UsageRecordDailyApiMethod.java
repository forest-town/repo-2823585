
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio.internal;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;

import com.twilio.rest.api.v2010.account.usage.record.Daily;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;
import org.apache.camel.util.StringHelper;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.twilio.rest.api.v2010.account.usage.record.Daily
 */
public enum UsageRecordDailyApiMethod implements ApiMethod {

    READER(
        com.twilio.rest.api.v2010.account.usage.record.DailyReader.class,
        "reader"),

    READER_1(
        com.twilio.rest.api.v2010.account.usage.record.DailyReader.class,
        "reader",
        arg("pathAccountSid", String.class));

    private static final UsageRecordDailyApiMethod[] CACHED_ENUM_VALUES = values();

    private final ApiMethod apiMethod;

    private UsageRecordDailyApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(Daily.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    public static UsageRecordDailyApiMethod fromValue(String value) throws IllegalArgumentException {
        value = getEnumConstant(value);
        for (int i = 0; i < CACHED_ENUM_VALUES.length; i++) {
            if (CACHED_ENUM_VALUES[i].toString().equalsIgnoreCase(value)) {
                return CACHED_ENUM_VALUES[i];
            }
        }
        throw new IllegalArgumentException("Invalid value " + value);
    }

    private static String getEnumConstant(String enumValue) {
        if (enumValue == null || enumValue.isEmpty()) {
            return "DEFAULT";
        }
        String value = StringHelper.camelCaseToDash(enumValue);
        // replace dash with underscore and upper case
        value = value.replace('-', '_');
        value = value.toUpperCase(Locale.ENGLISH);
        return value;
    }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
