package com.secrets.parser;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParserTest {

    @Test
    @DisplayName("Test parsing JSON to Secret object")
    void assertReceivingAJsonString_returnASecretObject() throws JsonProcessingException {
        //language=JSON
        String jsonInput = """
                    {
                        "id": 1,
                        "secret": "This is a random secret.",
                        "emScore": 3,
                        "username": "user123",
                        "timestamp": "2022-10-01T12:34:56Z"
                    }
                """;

        Secret expected = new Secret(1,
                "This is a random secret.",
                3,
                "user123",
                "2022-10-01T12:34:56Z");

        assertEquals(expected, Parser.parseSecretFromJson(jsonInput));
    }
}