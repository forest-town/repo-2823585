package org.apache.camel.component.stitch.client;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpHeaderValues;
import io.netty.handler.codec.http.HttpHeaders;
import org.apache.camel.component.stitch.client.models.StitchError;
import org.apache.camel.component.stitch.client.models.StitchException;
import org.apache.camel.component.stitch.client.models.StitchRequestBody;
import org.apache.camel.component.stitch.client.models.StitchResponse;
import reactor.core.publisher.Mono;
import reactor.netty.ByteBufMono;
import reactor.netty.http.client.HttpClient;
import reactor.netty.http.client.HttpClientResponse;

public class StitchClientImpl implements StitchClient {

    private static final String BATCH_API_RESOURCE_URL = "/v2/import/batch";

    private final HttpClient httpClient;
    private final String baseUrl;
    private final String token;

    public StitchClientImpl(HttpClient httpClient, String baseUrl, String token) {
        this.httpClient = httpClient;
        this.baseUrl = baseUrl;
        this.token = token;
    }

    @Override
    public Mono<StitchResponse> batch(final StitchRequestBody requestBody) {
        return sendBatch(convertMapToByteBuf(requestBody.toMap()));
    }

    private Mono<StitchResponse> sendBatch(final ByteBufMono bodyAsByte) {
        return httpClient
                .headers(applyHeaders())
                .baseUrl(baseUrl)
                .post()
                .uri(BATCH_API_RESOURCE_URL)
                .send(bodyAsByte)
                .responseSingle(this::generateStitchResponse);
    }

    private Consumer<? super HttpHeaders> applyHeaders() {
        return h -> {
            h.set(HttpHeaderNames.AUTHORIZATION, "Bearer " + token);
            h.set(HttpHeaderNames.CONTENT_TYPE, HttpHeaderValues.APPLICATION_JSON);
        };
    }

    private ByteBufMono convertMapToByteBuf(final Map<String, Object> bodyAsMap) {
        return ByteBufMono.fromString(Mono.just(convertBodyToJson(bodyAsMap)));
    }

    private String convertBodyToJson(final Map<String, Object> bodyAsMap) {
        try {
            return new ObjectMapper().writeValueAsString(bodyAsMap);
        }
        catch (IOException e) {
            throw new RuntimeException("Error occurred writing data map to JSON.", e);
        }
    }

    private Mono<StitchResponse> generateStitchResponse(final HttpClientResponse clientResponse, final ByteBufMono bufMono) {
        final int code = getStatusCode(clientResponse);
        final Map<String, Object> headers = getHeaders(clientResponse);

        return bufMono.asString()
                .map(JsonUtils::convertJsonToMap)
                // if we get a problem parsing the json, we just return empty map for graceful handling
                .onErrorReturn(Collections.emptyMap())
                .handle((bodyMap, sink) -> {
                    final StitchResponse stitchResponse = getStitchResponse(code, headers, bodyMap);

                    if (code >= 300) {
                        // anything above 300, we treat it as error
                        final StitchError stitchError = getStitchError(bodyMap);

                        sink.error(new StitchException(stitchResponse, stitchError));
                    } else {
                        sink.next(getStitchResponse(code, headers, bodyMap));
                    }
                });
    }

    private int getStatusCode(final HttpClientResponse clientResponse) {
        return clientResponse.status().code();
    }

    private Map<String, Object> getHeaders(final HttpClientResponse clientResponse) {
        return clientResponse.responseHeaders()
                .entries()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private StitchResponse getStitchResponse(final int code, final Map<String, Object> headers, final Map<String, Object> bodyMap) {
        final String status = (String) bodyMap.getOrDefault("status", "");
        final String message = (String) bodyMap.getOrDefault("message", "");

        return new StitchResponse(code, headers, status, message);
    }

    @SuppressWarnings("unchecked")
    private StitchError getStitchError(final Map<String, Object> bodyMap) {
        final String error = (String) bodyMap.getOrDefault("error", "");
        final List<Object> errors = (List<Object>) bodyMap.getOrDefault("errors", Collections.emptyList());

        return new StitchError(error, errors);
    }
}
