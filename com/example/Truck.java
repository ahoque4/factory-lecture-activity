package com.example;
// DO NOT MODIFY THIS FILE!

public class Truck extends Vehicle {

    public Truck(String region) {
        this.type = "Truck";
        this.region = region;
    }

    protected void printTestingDetails() {
        System.out.println("Testing " + region + " truck for safety and performance...");
    }

    protected String getDetails() {
        return "Robust, rugged, designed for " + region + " utility and durability.";
    }
}
