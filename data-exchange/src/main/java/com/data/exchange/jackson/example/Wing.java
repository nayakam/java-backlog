package com.data.exchange.jackson.example;

public class Wing {
    public String wingId;
    public Integer count;

    public String getWingId() {
        return wingId;
    }

    public void setWingId(String wingId) {
        this.wingId = wingId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.data.exchange.jackson.example.Wing{");
        sb.append("wingId='").append(wingId).append('\'');
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
