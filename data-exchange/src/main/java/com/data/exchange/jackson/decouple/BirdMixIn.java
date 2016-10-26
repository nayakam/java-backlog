package com.data.exchange.jackson.decouple;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public abstract class BirdMixIn {
    BirdMixIn(@JsonProperty("name") String name) {
    }

    @JsonSerialize(using = OptimisedSerialiser.class)
    abstract Wing getWing();

//    @JsonProperty("sound")
//    abstract String getSound();
//
//    @JsonProperty("habitat")
//    abstract String getHabitat();
//
//    @JsonProperty("friend")
//    abstract String getFriend();
//
//    @JsonProperty("nests")
//    abstract String getNestTests();
}