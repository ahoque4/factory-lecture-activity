package com.example;
// DO NOT MODIFY THIS FILE!

public class Motorcycle extends Vehicle {

    public Motorcycle(String region) {
        this.type = "Motorcycle";
        this.region = region;
    }

    protected void printTestingDetails() {
        System.out.println("Testing " + region + " motorcycle for safety and performance...");
    }

    protected String getDetails() {
        return "Agile, space-efficient, designed for " + region + " speed and flexibility.";
    }
}
