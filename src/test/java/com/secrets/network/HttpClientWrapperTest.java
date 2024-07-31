package com.secrets.network;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class HttpClientWrapperTest {

    @Test
    @DisplayName("Test Http GET request")
    public void assertGetMethodReturnsStatusCode200AndBody() throws IOException, InterruptedException {
        HttpClientWrapper clientWrapper = new HttpClientWrapper();
        HttpResponse<String> response = clientWrapper.get();
        assertEquals(200, response.statusCode());
        assertNotNull(response.body());
    }
}