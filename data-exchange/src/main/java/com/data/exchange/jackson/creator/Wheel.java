package com.data.exchange.jackson.creator;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class Wheel {
    private String wheelId;
    private String wheelDescription;


    public Wheel() {
    }
//
//    public Wheel(String wheelId, String wheelDescription) {
//        this.wheelId = wheelId;
//        this.wheelDescription = wheelDescription;
//    }

//    @JsonCreator
//    public Wheel(@JsonProperty("wheelId") String wheelId) {
//        this.wheelId = wheelId;
//    }

    @JsonCreator
    public Wheel(@JsonProperty("wheelId") String wheelId, @JsonProperty("wheelDescription") String wheelDescription) {
        this.wheelId = wheelId;
        this.wheelDescription = wheelDescription;
    }


    @JsonCreator
    public Wheel(Map<String, Object> delegate) {
        this.wheelId = (String) delegate.get("wheelId");
//     this.wheelDescription = (String) delegate.get("wheelDescription");
    }

    public String getWheelId() {
        return wheelId;
    }

    public void setWheelId(String wheelId) {
        this.wheelId = wheelId;
    }

    public String getWheelDescription() {
        return wheelDescription;
    }

    public void setWheelDescription(String wheelDescription) {
        this.wheelDescription = wheelDescription;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Wheel{");
        sb.append("wheelId='").append(wheelId).append('\'');
        sb.append(", wheelDescription='").append(wheelDescription).append('\'');
        sb.append('}');
        return sb.toString();
    }
}