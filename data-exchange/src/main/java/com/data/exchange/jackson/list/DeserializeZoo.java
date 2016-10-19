package com.data.exchange.jackson.list;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class DeserializeZoo {

    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        String json = "{\"name\":\"London com.data.exchange.jackson.list.Zoo\",\"city\":\"London\"," + "\"animals\":[{\"name\":\"Manny\"},{\"name\":\"Simba\"}]}";
        ObjectMapper mapper = new ObjectMapper();
        Zoo zoo =  mapper.readValue(json, Zoo.class);
        System.out.println(zoo);
        for(Animal animal : zoo.animals){
            System.out.println( animal);
        }
    }
}