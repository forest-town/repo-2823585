
/*
 * Camel ApiName Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.mail.internal;

import java.util.Locale;
import org.apache.camel.support.component.ApiName;
import org.apache.camel.util.StringHelper;

/**
 * Camel {@link ApiName} Enumeration for Component GoogleMail
 */
public enum GoogleMailApiName implements ApiName {

    THREADS("threads"),

    MESSAGES("messages"),

    ATTACHMENTS("attachments"),

    LABELS("labels"),

    HISTORY("history"),

    DRAFTS("drafts"),

    USERS("users");


    private static final GoogleMailApiName[] CACHED_ENUM_VALUES = values();
    
    private final String name;

    private GoogleMailApiName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public static GoogleMailApiName fromValue(String value) throws IllegalArgumentException {
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

}
