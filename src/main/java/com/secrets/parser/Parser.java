package com.secrets.parser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class Parser {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static Secret parseSecretFromJson(String responseBody) throws JsonProcessingException {
        return mapper.readValue(responseBody, Secret.class);
    }
}
