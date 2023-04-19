
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.dhis2.internal;

import java.lang.reflect.Method;
import java.util.List;

import org.apache.camel.component.dhis2.api.Dhis2Put;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for org.apache.camel.component.dhis2.api.Dhis2Put
 */
public enum Dhis2PutApiMethod implements ApiMethod {

    RESOURCE(
        java.io.InputStream.class,
        "resource",
        arg("path", String.class),
        arg("resource", Object.class),
        arg("queryParams", java.util.Map.class));

    private final ApiMethod apiMethod;

    private Dhis2PutApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(Dhis2Put.class, resultType, name, args);
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
