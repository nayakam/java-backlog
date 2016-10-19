package com.data.exchange.jackson.list;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

class Zoo {
    public String name;
    public String city;
    public List<Animal> animals = new ArrayList<>();

    @JsonCreator
    public Zoo(@JsonProperty("name") String name, @JsonProperty("city") String city) {
        this.name = name;
        this.city = city;
    }

    public List<Animal> addAnimal(Animal animal) {
        animals.add(animal);
        return animals;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.data.exchange.jackson.list.Zoo{");
        sb.append("name='").append(name).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", animals=").append(animals);
        sb.append('}');
        return sb.toString();
    }
}