package com.data.exchange.jackson.example;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BirdMixInSerializeExample {
    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixIn(Bird.class, BirdMixIn.class);
        Bird bird = new Bird();
        bird.setSound("eee");
        bird.setHabitat("water");

        Wing w = new Wing();
        w.setWingId("1");
        w.setCount(5);
        bird.setWing(w);

        final Nest nestOne = new Nest();
        nestOne.setNestId("1");
        nestOne.setNestLocation("One");
        nestOne.setNoOfBed(1);

        final Nest nestTwo = new Nest();
        nestTwo.setNestId("2");
        nestTwo.setNestLocation("Two");
        nestTwo.setNoOfBed(2);

        List<Nest> nests = new ArrayList<Nest>() {
            {
                add(nestOne);
                add(nestTwo);
            }
        };
        bird.setNests(nests);

        System.out.println("Serialise: " + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(bird));

        // mapper.writerWithDefaultPrettyPrinter().writeValue(new File("bird3.json"), bird);

        String json = "{ \"name\" : \"scarlet Ibis\"," +
                " \"age\" : null, " +
                "\"wing\" :  { \"wingId\" : \"1\"  }, " +
                "\"sound\" : \"eee\"," +
                "\"habitat\" : \"water\"}";

        ObjectMapper deObjectMapper = new ObjectMapper();
        deObjectMapper.addMixIn(Bird.class, BirdMixIn.class);
        Bird deBird = mapper.readValue(json, Bird.class);
        System.out.println(deBird);
    }
}