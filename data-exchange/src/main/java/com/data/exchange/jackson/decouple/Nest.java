package com.data.exchange.jackson.decouple;

public class Nest {

    private String nestId;
    private String nestLocation;
    private Integer noOfBed;

    public String getNestId() {
        return nestId;
    }

    public void setNestId(String nestId) {
        this.nestId = nestId;
    }

    public String getNestLocation() {
        return nestLocation;
    }

    public void setNestLocation(String nestLocation) {
        this.nestLocation = nestLocation;
    }

    public Integer getNoOfBed() {
        return noOfBed;
    }

    public void setNoOfBed(Integer noOfBed) {
        this.noOfBed = noOfBed;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.data.exchange.jackson.example.Nest{");
        sb.append("nestId='").append(nestId).append('\'');
        sb.append(", nestLocation='").append(nestLocation).append('\'');
        sb.append(", noOfBed=").append(noOfBed);
        sb.append('}');
        return sb.toString();
    }
}
