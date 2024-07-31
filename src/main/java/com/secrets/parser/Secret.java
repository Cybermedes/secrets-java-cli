package com.secrets.parser;

public record Secret(int id,
                     String secret,
                     int emScore,
                     String username,
                     String timestamp) {

    @Override
    public String toString() {
        return "Secret{" +
               "id= " + id + "," + System.lineSeparator() +
               "secret= '" + secret + "'," + System.lineSeparator() +
               "emScore= " + emScore + System.lineSeparator() +
               "username= '" + username + "'," + System.lineSeparator() +
               "timestamp= '" + timestamp + "'," + System.lineSeparator() +
               "}";
    }
}
