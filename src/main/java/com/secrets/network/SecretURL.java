package com.secrets.network;

public enum SecretURL {
    BASE_URL("https://secrets-api.appbrewery.com/");

    private final String baseURL;

    SecretURL(String baseURL) {
        this.baseURL = baseURL;
    }

    public String getBaseURL() {
        return baseURL;
    }
}
