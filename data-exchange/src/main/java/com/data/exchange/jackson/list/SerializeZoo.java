package com.data.exchange.jackson.list;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.IOException;


public class SerializeZoo {
    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
        Zoo zoo = new Zoo("Sydney Zoo", "Sydney");
        Lion lion = new Lion("Simba");
        Elephant elephant = new Elephant("Manny");
        zoo.addAnimal(elephant).add(lion);

        //  ObjectMapper mapper = new ObjectMapper();
        // mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        // mapper.writeValue(System.out, zoo);

        ObjectMapper mapperJSON = new ObjectMapper(new JsonFactory());
        //mapperJSON.writeValue(System.out, zoo);
        System.out.println(mapperJSON.writeValueAsString(zoo));

        ObjectMapper mapperYAML = new ObjectMapper(new YAMLFactory());
        mapperYAML.writeValue(System.out, zoo);
    }
}