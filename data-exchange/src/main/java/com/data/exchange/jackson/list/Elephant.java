package com.data.exchange.jackson.list;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

class Elephant extends Animal {

    @JsonCreator
    public Elephant(@JsonProperty("name") String name) {
        this.setName(name);
    }

    @Override
    public String toString() {
        return "Elephant : " + this.getName();
    }
}
 
