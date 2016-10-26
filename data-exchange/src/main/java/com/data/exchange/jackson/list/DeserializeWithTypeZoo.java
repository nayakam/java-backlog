package com.data.exchange.jackson.list;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class DeserializeWithTypeZoo {

    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        String json = "{\"name\":\"Sydney Zoo\",\"city\":\"Sydney\"," + "\"animals\":[{ \"@class\":\"com.data.exchange.jackson.list.Elephant\",\"name\":\"Manny\"},{\"@class\":\"com.data.exchange.jackson.list.Lion\",\"name\":\"Simba\"}]}";
        ObjectMapper mapper = new ObjectMapper();
        Zoo zoo = mapper.readValue(json, Zoo.class);
        System.out.println(zoo);
        for (Animal animal : zoo.getAnimals()) {
            System.out.println(animal);
        }
    }
}