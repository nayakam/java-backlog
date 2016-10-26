package com.data.exchange.jackson.creator;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;


import java.util.List;

class Car {

    private String plateNumber;

    private List<Wheel> wheels;

//    Car(String plateNumber) {
//        this.plateNumber = plateNumber;
//    }


    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append("plateNumber='").append(plateNumber).append('\'');
        sb.append(", wheels=").append(wheels);
        sb.append('}');
        return sb.toString();
    }
}
