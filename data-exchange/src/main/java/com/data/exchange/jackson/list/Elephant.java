package com.data.exchange.jackson.list;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

class Elephant extends Animal {

    @JsonCreator
    public Elephant(@JsonProperty("name") String name) {
        super.name = name;
    }

    @Override
    public String toString() {
        return "com.data.exchange.jackson.list.Elephant : " + name;
    }
}
 
