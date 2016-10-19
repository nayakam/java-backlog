package com.data.exchange.jackson.example;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class OptimisedSerialiser extends JsonSerializer<Wing> {

    @Override
    public void serialize(Wing wing, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        if (wing != null) {
            jsonGenerator.writeString(wing.getWingId());
        }
    }
}