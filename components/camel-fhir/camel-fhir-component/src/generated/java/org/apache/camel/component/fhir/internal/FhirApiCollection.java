
/*
 * Camel ApiCollection generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.fhir.internal;

import java.util.*;

import org.apache.camel.component.fhir.FhirConfiguration;
import org.apache.camel.component.fhir.FhirCapabilitiesEndpointConfiguration;
import org.apache.camel.component.fhir.FhirCreateEndpointConfiguration;
import org.apache.camel.component.fhir.FhirDeleteEndpointConfiguration;
import org.apache.camel.component.fhir.FhirHistoryEndpointConfiguration;
import org.apache.camel.component.fhir.FhirLoadPageEndpointConfiguration;
import org.apache.camel.component.fhir.FhirMetaEndpointConfiguration;
import org.apache.camel.component.fhir.FhirOperationEndpointConfiguration;
import org.apache.camel.component.fhir.FhirPatchEndpointConfiguration;
import org.apache.camel.component.fhir.FhirReadEndpointConfiguration;
import org.apache.camel.component.fhir.FhirSearchEndpointConfiguration;
import org.apache.camel.component.fhir.FhirTransactionEndpointConfiguration;
import org.apache.camel.component.fhir.FhirUpdateEndpointConfiguration;
import org.apache.camel.component.fhir.FhirValidateEndpointConfiguration;

import org.apache.camel.support.component.ApiCollection;
import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodHelper;

/**
 * Camel {@link ApiCollection} for Fhir
 */
public final class FhirApiCollection extends ApiCollection<FhirApiName, FhirConfiguration> {

    private static FhirApiCollection collection;

    private FhirApiCollection() {
        final Map<String, String> aliases = new HashMap<>();
        final Map<FhirApiName, ApiMethodHelper<? extends ApiMethod>> apiHelpers = new EnumMap<>(FhirApiName.class);
        final Map<Class<? extends ApiMethod>, FhirApiName> apiMethods = new HashMap<>();

        List<String> nullableArgs;

        nullableArgs = Arrays.asList("extraParameters");
        apiHelpers.put(FhirApiName.CAPABILITIES, new ApiMethodHelper<FhirCapabilitiesApiMethod>(FhirCapabilitiesApiMethod.class, aliases, nullableArgs));
        apiMethods.put(FhirCapabilitiesApiMethod.class, FhirApiName.CAPABILITIES);

        aliases.clear();
        nullableArgs = Arrays.asList("url", "preferReturn", "extraParameters");
        apiHelpers.put(FhirApiName.CREATE, new ApiMethodHelper<FhirCreateApiMethod>(FhirCreateApiMethod.class, aliases, nullableArgs));
        apiMethods.put(FhirCreateApiMethod.class, FhirApiName.CREATE);

        aliases.clear();
        nullableArgs = Arrays.asList("extraParameters");
        apiHelpers.put(FhirApiName.DELETE, new ApiMethodHelper<FhirDeleteApiMethod>(FhirDeleteApiMethod.class, aliases, nullableArgs));
        apiMethods.put(FhirDeleteApiMethod.class, FhirApiName.DELETE);

        aliases.clear();
        nullableArgs = Arrays.asList("count", "cutoff", "iCutoff", "extraParameters");
        apiHelpers.put(FhirApiName.HISTORY, new ApiMethodHelper<FhirHistoryApiMethod>(FhirHistoryApiMethod.class, aliases, nullableArgs));
        apiMethods.put(FhirHistoryApiMethod.class, FhirApiName.HISTORY);

        aliases.clear();
        nullableArgs = Arrays.asList("extraParameters");
        apiHelpers.put(FhirApiName.LOAD_PAGE, new ApiMethodHelper<FhirLoadPageApiMethod>(FhirLoadPageApiMethod.class, aliases, nullableArgs));
        apiMethods.put(FhirLoadPageApiMethod.class, FhirApiName.LOAD_PAGE);

        aliases.clear();
        nullableArgs = Arrays.asList("extraParameters");
        apiHelpers.put(FhirApiName.META, new ApiMethodHelper<FhirMetaApiMethod>(FhirMetaApiMethod.class, aliases, nullableArgs));
        apiMethods.put(FhirMetaApiMethod.class, FhirApiName.META);

        aliases.clear();
        nullableArgs = Arrays.asList("extraParameters", "parameters", "outputParameterType", "returnType", "respondToUri");
        apiHelpers.put(FhirApiName.OPERATION, new ApiMethodHelper<FhirOperationApiMethod>(FhirOperationApiMethod.class, aliases, nullableArgs));
        apiMethods.put(FhirOperationApiMethod.class, FhirApiName.OPERATION);

        aliases.clear();
        nullableArgs = Arrays.asList("preferReturn", "extraParameters");
        apiHelpers.put(FhirApiName.PATCH, new ApiMethodHelper<FhirPatchApiMethod>(FhirPatchApiMethod.class, aliases, nullableArgs));
        apiMethods.put(FhirPatchApiMethod.class, FhirApiName.PATCH);

        aliases.clear();
        nullableArgs = Arrays.asList("ifVersionMatches", "returnNull", "returnResource", "throwError", "extraParameters", "version");
        apiHelpers.put(FhirApiName.READ, new ApiMethodHelper<FhirReadApiMethod>(FhirReadApiMethod.class, aliases, nullableArgs));
        apiMethods.put(FhirReadApiMethod.class, FhirApiName.READ);

        aliases.clear();
        nullableArgs = Arrays.asList("extraParameters");
        apiHelpers.put(FhirApiName.SEARCH, new ApiMethodHelper<FhirSearchApiMethod>(FhirSearchApiMethod.class, aliases, nullableArgs));
        apiMethods.put(FhirSearchApiMethod.class, FhirApiName.SEARCH);

        aliases.clear();
        nullableArgs = Arrays.asList("extraParameters");
        apiHelpers.put(FhirApiName.TRANSACTION, new ApiMethodHelper<FhirTransactionApiMethod>(FhirTransactionApiMethod.class, aliases, nullableArgs));
        apiMethods.put(FhirTransactionApiMethod.class, FhirApiName.TRANSACTION);

        aliases.clear();
        nullableArgs = Arrays.asList("id", "stringId", "preferReturn", "extraParameters");
        apiHelpers.put(FhirApiName.UPDATE, new ApiMethodHelper<FhirUpdateApiMethod>(FhirUpdateApiMethod.class, aliases, nullableArgs));
        apiMethods.put(FhirUpdateApiMethod.class, FhirApiName.UPDATE);

        aliases.clear();
        nullableArgs = Arrays.asList("extraParameters");
        apiHelpers.put(FhirApiName.VALIDATE, new ApiMethodHelper<FhirValidateApiMethod>(FhirValidateApiMethod.class, aliases, nullableArgs));
        apiMethods.put(FhirValidateApiMethod.class, FhirApiName.VALIDATE);

        setApiHelpers(apiHelpers);
        setApiMethods(apiMethods);
    }

    public FhirConfiguration getEndpointConfiguration(FhirApiName apiName) {
        FhirConfiguration result = null;
        switch (apiName) {
            case CAPABILITIES:
                result = new FhirCapabilitiesEndpointConfiguration();
                break;
            case CREATE:
                result = new FhirCreateEndpointConfiguration();
                break;
            case DELETE:
                result = new FhirDeleteEndpointConfiguration();
                break;
            case HISTORY:
                result = new FhirHistoryEndpointConfiguration();
                break;
            case LOAD_PAGE:
                result = new FhirLoadPageEndpointConfiguration();
                break;
            case META:
                result = new FhirMetaEndpointConfiguration();
                break;
            case OPERATION:
                result = new FhirOperationEndpointConfiguration();
                break;
            case PATCH:
                result = new FhirPatchEndpointConfiguration();
                break;
            case READ:
                result = new FhirReadEndpointConfiguration();
                break;
            case SEARCH:
                result = new FhirSearchEndpointConfiguration();
                break;
            case TRANSACTION:
                result = new FhirTransactionEndpointConfiguration();
                break;
            case UPDATE:
                result = new FhirUpdateEndpointConfiguration();
                break;
            case VALIDATE:
                result = new FhirValidateEndpointConfiguration();
                break;
        }
        return result;
    }

    public static synchronized FhirApiCollection getCollection() {
        if (collection == null) {
            collection = new FhirApiCollection();
        }
        return collection;
    }
}
