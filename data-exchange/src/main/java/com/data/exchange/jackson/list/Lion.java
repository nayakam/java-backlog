package com.data.exchange.jackson.list;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

class Lion extends Animal {
    @JsonCreator
    public Lion(@JsonProperty("name") String name) {
        this.setName(name);
    }

    @Override
    public String toString() {
        return "Lion: " + this.getName();
    }
}