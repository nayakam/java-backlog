package com.data.exchange.jackson.creator;


import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserTest {

    public static void main(String[] args) throws IOException {
        Car car = new Car();
        car.setPlateNumber("ABC123");
        final Wheel wheel = new Wheel();
        wheel.setWheelId("wheelID- 1234");
        wheel.setWheelDescription("WheelDescription");
        //final Wheel wheel = new Wheel("whellID", "Desc");

        List<Wheel> wheels = new ArrayList<Wheel>() {{
            add(wheel);
        }};
        car.setWheels(wheels);
        ObjectMapper mapperJSON = new ObjectMapper(new JsonFactory());
        //mapperJSON.writeValue(System.out, zoo);
        System.out.println(mapperJSON.writeValueAsString(car));

        ObjectMapper mapperYAML = new ObjectMapper(new YAMLFactory());
         //mapperYAML.writeValue(System.out, car);
        System.out.println(mapperYAML.writeValueAsString(car));

        String yaml = "plateNumber: \"ABC123\"\n" +
                "wheels:\n" +
                "- wheelId: \"WHELID\"\n";

//        yaml = "plateNumber: \"ABC123\"\n" +
//                "wheels:\n" +
//                "- wheelId: \"wheelID- 1234\"\n" +
//                "  wheelDescription: \"WheelDescription\"";

        Car carDese = mapperYAML.readValue(yaml, Car.class);
        System.out.println(carDese);
    }
}
