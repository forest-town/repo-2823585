
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.sheets.internal;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;

import com.google.api.services.sheets.v4.Sheets.Spreadsheets;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;
import org.apache.camel.util.StringHelper;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.google.api.services.sheets.v4.Sheets$Spreadsheets
 */
public enum SheetsSpreadsheetsApiMethod implements ApiMethod {

    BATCHUPDATE(
        com.google.api.services.sheets.v4.Sheets.Spreadsheets.BatchUpdate.class,
        "batchUpdate",
        arg("spreadsheetId", String.class),
        arg("batchUpdateSpreadsheetRequest", com.google.api.services.sheets.v4.model.BatchUpdateSpreadsheetRequest.class)),

    CREATE(
        com.google.api.services.sheets.v4.Sheets.Spreadsheets.Create.class,
        "create",
        arg("content", com.google.api.services.sheets.v4.model.Spreadsheet.class)),

    DEVELOPERMETADATA(
        com.google.api.services.sheets.v4.Sheets.Spreadsheets.DeveloperMetadata.class,
        "developerMetadata"),

    GET(
        com.google.api.services.sheets.v4.Sheets.Spreadsheets.Get.class,
        "get",
        arg("spreadsheetId", String.class)),

    GETBYDATAFILTER(
        com.google.api.services.sheets.v4.Sheets.Spreadsheets.GetByDataFilter.class,
        "getByDataFilter",
        arg("spreadsheetId", String.class),
        arg("getSpreadsheetByDataFilterRequest", com.google.api.services.sheets.v4.model.GetSpreadsheetByDataFilterRequest.class)),

    SHEETS(
        com.google.api.services.sheets.v4.Sheets.Spreadsheets.SheetsOperations.class,
        "sheets"),

    VALUES(
        com.google.api.services.sheets.v4.Sheets.Spreadsheets.Values.class,
        "values");

    private static final SheetsSpreadsheetsApiMethod[] CACHED_ENUM_VALUES = values();

    private final ApiMethod apiMethod;

    private SheetsSpreadsheetsApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(Spreadsheets.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    public static SheetsSpreadsheetsApiMethod fromValue(String value) throws IllegalArgumentException {
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
