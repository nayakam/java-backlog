package com.data.exchange.jackson.decouple;

import java.util.List;

public class Bird {

    private String name;
    private String sound;
    private String habitat;
    private String age;
    private Wing wing;
    private List<Nest> nests;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    public List<Nest> getNests() {
        return nests;
    }

    public void setNests(List<Nest> nests) {
        this.nests = nests;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.data.exchange.jackson.example.Bird{");
        sb.append("name='").append(name).append('\'');
        sb.append(", sound='").append(sound).append('\'');
        sb.append(", habitat='").append(habitat).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append(", wing=").append(wing);
        sb.append(", nests=").append(nests);
        sb.append('}');
        return sb.toString();
    }
}