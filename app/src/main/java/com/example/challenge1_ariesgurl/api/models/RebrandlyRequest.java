package com.example.challenge1_ariesgurl.api.models;

public class RebrandlyRequest {
    String destination;

    public RebrandlyRequest(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
