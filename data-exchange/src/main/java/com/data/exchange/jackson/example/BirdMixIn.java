package com.data.exchange.jackson.example;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public abstract class BirdMixIn {
    //    com.data.exchange.jackson.example.BirdMixIn(@JsonProperty("name") String name) {
//    }
    @JsonSerialize(using = OptimisedSerialiser.class)
    abstract Wing getWing();
//    @JsonProperty("sound")
//    abstract String getSound();
//
//    @JsonProperty("habitat")
//    abstract String getHabitat();

//    @JsonProperty("friend")
//    abstract String getFriend();
}