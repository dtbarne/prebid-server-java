package org.prebid.server.cache.model;

import lombok.Builder;
import lombok.Value;

/**
 * Holds HTTP interaction related data.
 */
@Value
@Builder
public class DebugHttpCall {

    private static final DebugHttpCall EMPTY = DebugHttpCall.builder().build();

    String endpoint;

    String requestUri;

    String requestBody;

    Integer responseStatus;

    String responseBody;

    Integer responseTimeMillis;

    public static DebugHttpCall empty() {
        return EMPTY;
    }
}
