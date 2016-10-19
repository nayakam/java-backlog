package com.data.exchange.jackson.example;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("ignore fields")
public interface OptimiseSerialise {

    String getId();

    void setId(String id);
}

