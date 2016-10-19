package com.data.exchange.jackson.list;

//@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
//@JsonSubTypes({@JsonSubTypes.Type(value = com.data.exchange.jackson.list.Lion.class, name = "lion"), @JsonSubTypes.Type(value = com.data.exchange.jackson.list.Elephant.class, name = "elephant")})
public class Animal {
    public String type;
    public String name;


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.data.exchange.jackson.list.Animal{");
        sb.append("name='").append(name).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
