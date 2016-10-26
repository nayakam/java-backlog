package com.data.exchange.jackson.list;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
@JsonSubTypes({@JsonSubTypes.Type(value = com.data.exchange.jackson.list.Lion.class), @JsonSubTypes.Type(value = com.data.exchange.jackson.list.Elephant.class)})
public class Animal {
    // public String type;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Animal{");
        sb.append("name='").append(name).append('\'');
        //  sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
