package com.klarna.rest;

import com.klarna.rest.api.ApiException;
import com.klarna.rest.api.ApiResponse;
import com.klarna.rest.api.ProtocolException;

import java.io.IOException;
import java.net.URI;


/**
 * General interface for an HTTP transport.
 */
public interface Transport {
    /**
     * API library client version.
     */
    String VERSION = "3.0.0";

    /**
     * API base URL for Europe.
     */
    URI EU_BASE_URL = URI.create("https://api.klarna.com");

    /**
     * Testing API base URL for Europe.
     */
    URI EU_TEST_BASE_URL = URI.create("https://api.playground.klarna.com");

    /**
     * API base URL for North America.
     */
    URI NA_BASE_URL = URI.create("https://api-na.klarna.com");

    /**
     * Testing API base URL for North America.
     */
    URI NA_TEST_BASE_URL = URI.create("https://api-na.playground.klarna.com");

    ApiResponse get(final String path) throws ApiException, ProtocolException, IOException;

    <T> ApiResponse post(final String path, final T data) throws ApiException, ProtocolException, IOException;

    <T> ApiResponse put(final String path, final T data) throws ApiException, ProtocolException, IOException;

    <T> ApiResponse delete(final String path) throws ApiException, ProtocolException, IOException;
}
