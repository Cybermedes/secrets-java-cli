package com.secrets.network;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientWrapper {

    private final HttpClient client;

    public HttpClientWrapper() {
        this.client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(20L))
                .build();
    }

    public HttpResponse<String> get() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(SecretURL.BASE_URL.getBaseURL() + "random"))
                .GET()
                .build();
        return sendHttpRequest(request);
    }

    public HttpResponse<String> sendHttpRequest(HttpRequest request) throws IOException, InterruptedException {
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() >= 400) {
            throw new RuntimeException("could not complete the request, error: " + response.statusCode());
        }
        return response;
    }
}
