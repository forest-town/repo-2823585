/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.salesforce.internal.client;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.camel.component.salesforce.SalesforceHttpClient;
import org.apache.camel.component.salesforce.SalesforceLoginConfig;
import org.apache.camel.component.salesforce.api.SalesforceException;
import org.apache.camel.component.salesforce.internal.SalesforceSession;
import org.apache.camel.util.ObjectHelper;
import org.apache.camel.util.URISupport;
import org.eclipse.jetty.client.InputStreamRequestContent;
import org.eclipse.jetty.client.Request;
import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.http.HttpMethod;

public class DefaultRestClient extends AbstractClientBase implements RestClient {

    private static final String SERVICES_DATA = "/services/data/";
    private static final String TOKEN_HEADER = "Authorization";
    private static final String TOKEN_PREFIX = "Bearer ";
    private static final String SERVICES_APEXREST = "/services/apexrest/";

    public DefaultRestClient(final SalesforceHttpClient httpClient, final String version,
                             final SalesforceSession session,
                             final SalesforceLoginConfig loginConfig) throws SalesforceException {
        super(version, session, httpClient, loginConfig);
    }

    @Override
    protected void doHttpRequest(Request request, ClientResponseCallback callback) {
        // set standard headers for all requests
        request.headers(h -> h.add(HttpHeader.ACCEPT, APPLICATION_JSON_UTF8));
        request.headers(h -> h.add(HttpHeader.ACCEPT_CHARSET, StandardCharsets.UTF_8.name()));
        // request content type and charset is set by the request entity

        super.doHttpRequest(request, callback);
    }

    @Override
    public void approval(final InputStream request, Map<String, List<String>> headers, final ResponseCallback callback) {
        final Request post = getRequest(HttpMethod.POST, versionUrl() + "process/approvals/", headers);

        // authorization
        setAccessToken(post);

        // input stream as entity content
        post.body(new InputStreamRequestContent(request));
        post.headers(h -> h.add(HttpHeader.CONTENT_TYPE, APPLICATION_JSON_UTF8));

        doHttpRequest(post, new DelegatingClientCallback(callback));
    }

    @Override
    public void approvals(Map<String, List<String>> headers, final ResponseCallback callback) {
        final Request get = getRequest(HttpMethod.GET, versionUrl() + "process/approvals/", headers);

        doHttpRequest(get, new DelegatingClientCallback(callback));
    }

    @Override
    public void getVersions(Map<String, List<String>> headers, final ResponseCallback callback) {
        Request get = getRequest(HttpMethod.GET, servicesDataUrl(), headers);
        // does not require authorization token

        doHttpRequest(get, new DelegatingClientCallback(callback));
    }

    @Override
    public void getResources(Map<String, List<String>> headers, ResponseCallback callback) {
        Request get = getRequest(HttpMethod.GET, versionUrl(), headers);
        // requires authorization token
        setAccessToken(get);

        doHttpRequest(get, new DelegatingClientCallback(callback));
    }

    @Override
    public void getGlobalObjects(Map<String, List<String>> headers, ResponseCallback callback) {
        Request get = getRequest(HttpMethod.GET, sobjectsUrl(""), headers);
        // requires authorization token
        setAccessToken(get);

        doHttpRequest(get, new DelegatingClientCallback(callback));
    }

    @Override
    public void getBasicInfo(String sObjectName, Map<String, List<String>> headers, ResponseCallback callback) {
        Request get = getRequest(HttpMethod.GET, sobjectsUrl(sObjectName + "/"), headers);
        // requires authorization token
        setAccessToken(get);

        doHttpRequest(get, new DelegatingClientCallback(callback));
    }

    @Override
    public void getDescription(String sObjectName, Map<String, List<String>> headers, ResponseCallback callback) {
        Request get = getRequest(HttpMethod.GET, sobjectsUrl(sObjectName + "/describe/"), headers);
        // requires authorization token
        setAccessToken(get);

        doHttpRequest(get, new DelegatingClientCallback(callback));
    }

    @Override
    public void getSObject(
            String sObjectName, String id, String[] fields, Map<String, List<String>> headers, ResponseCallback callback) {

        // parse fields if set
        String params = "";
        if (fields != null && fields.length > 0) {
            StringBuilder fieldsValue = new StringBuilder("?fields=");
            for (int i = 0; i < fields.length; i++) {
                fieldsValue.append(fields[i]);
                if (i < (fields.length - 1)) {
                    fieldsValue.append(',');
                }
            }
            params = fieldsValue.toString();
        }
        Request get = getRequest(HttpMethod.GET, sobjectsUrl(sObjectName + "/" + id + params), headers);
        // requires authorization token
        setAccessToken(get);

        doHttpRequest(get, new DelegatingClientCallback(callback));
    }

    @Override
    public void createSObject(
            String sObjectName, InputStream sObject, Map<String, List<String>> headers, ResponseCallback callback) {
        // post the sObject
        final Request post = getRequest(HttpMethod.POST, sobjectsUrl(sObjectName), headers);

        // authorization
        setAccessToken(post);

        // input stream as entity content
        post.body(new InputStreamRequestContent(sObject));
        post.headers(h -> h.add(HttpHeader.CONTENT_TYPE, APPLICATION_JSON_UTF8));

        doHttpRequest(post, new DelegatingClientCallback(callback));
    }

    @Override
    public void updateSObject(
            String sObjectName, String id, InputStream sObject, Map<String, List<String>> headers, ResponseCallback callback) {
        final Request patch = getRequest("PATCH", sobjectsUrl(sObjectName + "/" + id), headers);
        // requires authorization token
        setAccessToken(patch);

        // input stream as entity content
        patch.body(new InputStreamRequestContent(sObject));
        patch.headers(h -> h.add(HttpHeader.CONTENT_TYPE, APPLICATION_JSON_UTF8));

        doHttpRequest(patch, new DelegatingClientCallback(callback));
    }

    @Override
    public void deleteSObject(String sObjectName, String id, Map<String, List<String>> headers, ResponseCallback callback) {
        final Request delete = getRequest(HttpMethod.DELETE, sobjectsUrl(sObjectName + "/" + id), headers);

        // requires authorization token
        setAccessToken(delete);

        doHttpRequest(delete, new DelegatingClientCallback(callback));
    }

    @Override
    public void getSObjectWithId(
            String sObjectName, String fieldName, String fieldValue, Map<String, List<String>> headers,
            ResponseCallback callback) {
        final Request get = getRequest(HttpMethod.GET, sobjectsExternalIdUrl(sObjectName, fieldName, fieldValue), headers);

        // requires authorization token
        setAccessToken(get);

        doHttpRequest(get, new DelegatingClientCallback(callback));
    }

    @Override
    public void upsertSObject(
            String sObjectName, String fieldName, String fieldValue, Map<String, List<String>> headers, InputStream sObject,
            ResponseCallback callback) {
        final Request patch = getRequest("PATCH", sobjectsExternalIdUrl(sObjectName, fieldName, fieldValue), headers);

        // requires authorization token
        setAccessToken(patch);

        // input stream as entity content
        patch.body(new InputStreamRequestContent(sObject));
        // TODO will the encoding always be UTF-8??
        patch.headers(h -> h.add(HttpHeader.CONTENT_TYPE, APPLICATION_JSON_UTF8));

        doHttpRequest(patch, new DelegatingClientCallback(callback));
    }

    @Override
    public void deleteSObjectWithId(
            String sObjectName, String fieldName, String fieldValue, Map<String, List<String>> headers,
            ResponseCallback callback) {
        final Request delete
                = getRequest(HttpMethod.DELETE, sobjectsExternalIdUrl(sObjectName, fieldName, fieldValue), headers);

        // requires authorization token
        setAccessToken(delete);

        doHttpRequest(delete, new DelegatingClientCallback(callback));
    }

    @Override
    public void getBlobField(
            String sObjectName, String id, String blobFieldName, Map<String, List<String>> headers, ResponseCallback callback) {
        final Request get = getRequest(HttpMethod.GET, sobjectsUrl(sObjectName + "/" + id + "/" + blobFieldName), headers);
        // TODO this doesn't seem to be required, the response is always the
        // content binary stream
        // get.header(HttpHeader.ACCEPT_ENCODING, "base64");

        // requires authorization token
        setAccessToken(get);

        doHttpRequest(get, new DelegatingClientCallback(callback));
    }

    @Override
    public void query(String soqlQuery, Map<String, List<String>> headers, ResponseCallback callback) {
        try {

            String encodedQuery = urlEncode(soqlQuery);
            final Request get = getRequest(HttpMethod.GET, versionUrl() + "query/?q=" + encodedQuery, headers);

            // requires authorization token
            setAccessToken(get);

            doHttpRequest(get, new DelegatingClientCallback(callback));

        } catch (UnsupportedEncodingException e) {
            String msg = "Unexpected error: " + e.getMessage();
            callback.onResponse(null, Collections.emptyMap(), new SalesforceException(msg, e));
        }
    }

    @Override
    public void queryMore(String nextRecordsUrl, Map<String, List<String>> headers, ResponseCallback callback) {
        final Request get = getRequest(HttpMethod.GET, instanceUrl + nextRecordsUrl, headers);

        // requires authorization token
        setAccessToken(get);

        doHttpRequest(get, new DelegatingClientCallback(callback));
    }

    @Override
    public void queryAll(String soqlQuery, Map<String, List<String>> headers, ResponseCallback callback) {
        try {

            String encodedQuery = urlEncode(soqlQuery);
            final Request get = getRequest(HttpMethod.GET, versionUrl() + "queryAll/?q=" + encodedQuery, headers);

            // requires authorization token
            setAccessToken(get);

            doHttpRequest(get, new DelegatingClientCallback(callback));

        } catch (UnsupportedEncodingException e) {
            String msg = "Unexpected error: " + e.getMessage();
            callback.onResponse(null, Collections.emptyMap(), new SalesforceException(msg, e));
        }
    }

    @Override
    public void search(String soslQuery, Map<String, List<String>> headers, ResponseCallback callback) {
        try {

            String encodedQuery = urlEncode(soslQuery);
            final Request get = getRequest(HttpMethod.GET, versionUrl() + "search/?q=" + encodedQuery, headers);

            // requires authorization token
            setAccessToken(get);

            doHttpRequest(get, new DelegatingClientCallback(callback));

        } catch (UnsupportedEncodingException e) {
            String msg = "Unexpected error: " + e.getMessage();
            callback.onResponse(null, Collections.emptyMap(), new SalesforceException(msg, e));
        }
    }

    @Override
    public void apexCall(
            String httpMethod, String apexUrl, Map<String, Object> queryParams, InputStream requestDto,
            Map<String, List<String>> headers, ResponseCallback callback) {
        // create APEX call request
        final Request request;
        try {
            request = getRequest(httpMethod, apexCallUrl(apexUrl, queryParams), headers);
            // set request SObject and content type
            if (requestDto != null) {
                // guard against requests that do not support bodies
                switch (request.getMethod()) {
                    case "PUT":
                    case "PATCH":
                    case "POST":
                        request.body(new InputStreamRequestContent(requestDto));
                        request.headers(h -> h.add(HttpHeader.CONTENT_TYPE, APPLICATION_JSON_UTF8));
                        break;
                    default:
                        // ignore body for other methods
                }
            }

            // requires authorization token
            setAccessToken(request);

            doHttpRequest(request, new DelegatingClientCallback(callback));
        } catch (UnsupportedEncodingException | URISyntaxException e) {
            String msg = "Unexpected error: " + e.getMessage();
            callback.onResponse(null, Collections.emptyMap(), new SalesforceException(msg, e));
        }
    }

    private String apexCallUrl(String apexUrl, Map<String, Object> queryParams)
            throws UnsupportedEncodingException, URISyntaxException {

        if (queryParams != null && !queryParams.isEmpty()) {
            apexUrl = URISupport.appendParametersToURI(apexUrl, queryParams);
        }

        return instanceUrl + SERVICES_APEXREST + apexUrl;
    }

    @Override
    public void recent(final Integer limit, Map<String, List<String>> headers, final ResponseCallback responseCallback) {
        final String param = Optional.ofNullable(limit).map(v -> "?limit=" + v).orElse("");

        final Request get = getRequest(HttpMethod.GET, versionUrl() + "recent/" + param, headers);

        // requires authorization token
        setAccessToken(get);

        doHttpRequest(get, new DelegatingClientCallback(responseCallback));
    }

    @Override
    public void limits(Map<String, List<String>> headers, final ResponseCallback responseCallback) {
        final Request get = getRequest(HttpMethod.GET, versionUrl() + "limits/", headers);

        // requires authorization token
        setAccessToken(get);

        doHttpRequest(get, new DelegatingClientCallback(responseCallback));
    }

    private String servicesDataUrl() {
        return instanceUrl + SERVICES_DATA;
    }

    private String versionUrl() {
        ObjectHelper.notNull(version, "version");
        return servicesDataUrl() + "v" + version + "/";
    }

    private String sobjectsUrl(String sObjectName) {
        ObjectHelper.notNull(sObjectName, "sObjectName");
        return versionUrl() + "sobjects/" + sObjectName;
    }

    private String sobjectsExternalIdUrl(String sObjectName, String fieldName, String fieldValue) {
        if (fieldName == null || fieldValue == null) {
            throw new IllegalArgumentException("External field name and value cannot be NULL");
        }
        try {
            String encodedValue = urlEncode(fieldValue);
            return sobjectsUrl(sObjectName + "/" + fieldName + "/" + encodedValue);
        } catch (UnsupportedEncodingException e) {
            String msg = "Unexpected error: " + e.getMessage();
            throw new IllegalArgumentException(msg, e);
        }
    }

    @Override
    protected void setAccessToken(Request request) {
        // replace old token
        request.headers(h -> h.add(TOKEN_HEADER, null));
        request.headers(h -> h.add(TOKEN_HEADER, TOKEN_PREFIX + accessToken));
    }

    private String urlEncode(String query) throws UnsupportedEncodingException {
        String encodedQuery = URLEncoder.encode(query, StandardCharsets.UTF_8);
        // URLEncoder likes to use '+' for spaces
        encodedQuery = encodedQuery.replace("+", "%20");
        return encodedQuery;
    }

    private static class DelegatingClientCallback implements ClientResponseCallback {
        private final ResponseCallback callback;

        DelegatingClientCallback(ResponseCallback callback) {
            this.callback = callback;
        }

        @Override
        public void onResponse(InputStream response, Map<String, String> headers, SalesforceException ex) {
            callback.onResponse(response, headers, ex);
        }
    }
}
