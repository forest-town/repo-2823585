package org.apache.camel.component.file.azure;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;

import org.apache.camel.util.URISupport;

/**
 * Helper for Camel endpoint URI strings.
 * <p>
 * In Camel, URIs are most commonly passed as strings and they are flexible e.g. they could contain expressions that
 * prior evaluation could violate URI RFC, ...
 */
final class FilesURIStrings {

    public static final char QUERY_SEPARATOR = '?';

    /**
     * Get the base uri part before the options as they can be non URI valid such as the expression using $ chars and
     * the URI constructor will regard $ as an illegal character and we don't want to enforce end users to to escape the
     * $ for the expression (file language)
     */
    static URI getBaseURI(String uri) throws URISyntaxException {
        String baseUri = uri;
        if (uri.indexOf(QUERY_SEPARATOR) != -1) {
            baseUri = uri.substring(0, uri.indexOf(QUERY_SEPARATOR));
        }
        return new URI(baseUri);
    }

    static String reconstructBase64EncodedValue(String value) {
        // base64 allows + and =, URI encoded as %2B and %3D
        // Camel URI configurers decode both + and %2B to a space
        return value.replace(" ", "+");
    }

    /**
     * Uses encoding style expected by the files service: it preserves time separator ':' and encodes base64 plus '+',
     * slash '/' and padding '='.
     */
    static String encodeTokenValue(String value) throws URISyntaxException {
        return URISupport.createQueryString(Collections.singletonMap("x", value)).substring(2)
                .replace("+", "%2B") // sig is base64
                .replace("%3A", ":"); // se has time separator
    }

}
