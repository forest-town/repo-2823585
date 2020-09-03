
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree.internal;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;

import com.braintreegateway.DisputeGateway;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;
import org.apache.camel.util.StringHelper;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.braintreegateway.DisputeGateway
 */
public enum DisputeGatewayApiMethod implements ApiMethod {

    ACCEPT(
        com.braintreegateway.Result.class,
        "accept",
        arg("id", String.class)),

    ADD_FILE_EVIDENCE(
        com.braintreegateway.Result.class,
        "addFileEvidence",
        arg("disputeId", String.class),
        arg("documentId", String.class)),

    ADD_FILE_EVIDENCE_1(
        com.braintreegateway.Result.class,
        "addFileEvidence",
        arg("disputeId", String.class),
        arg("fileEvidenceRequest", com.braintreegateway.FileEvidenceRequest.class)),

    ADD_TEXT_EVIDENCE(
        com.braintreegateway.Result.class,
        "addTextEvidence",
        arg("id", String.class),
        arg("content", String.class)),

    ADD_TEXT_EVIDENCE_1(
        com.braintreegateway.Result.class,
        "addTextEvidence",
        arg("id", String.class),
        arg("textEvidenceRequest", com.braintreegateway.TextEvidenceRequest.class)),

    FINALIZE(
        com.braintreegateway.Result.class,
        "finalize",
        arg("id", String.class)),

    FIND(
        com.braintreegateway.Dispute.class,
        "find",
        arg("id", String.class)),

    REMOVE_EVIDENCE(
        com.braintreegateway.Result.class,
        "removeEvidence",
        arg("disputeId", String.class),
        arg("evidenceId", String.class)),

    SEARCH(
        com.braintreegateway.PaginatedCollection.class,
        "search",
        arg("query", com.braintreegateway.DisputeSearchRequest.class));

    private static final DisputeGatewayApiMethod[] CACHED_ENUM_VALUES = values();

    private final ApiMethod apiMethod;

    private DisputeGatewayApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(DisputeGateway.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    public static DisputeGatewayApiMethod fromValue(String value) throws IllegalArgumentException {
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
