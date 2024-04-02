package com.example;
// DO NOT MODIFY THIS FILE!

public class Car extends Vehicle {

    public Car(String region) {
        this.type = "Car";
        this.region = region;
    }

    protected void printTestingDetails() {
        System.out.println("Testing " + region + " car for safety and performance...");
    }

    protected String getDetails() {
        return "Compact size, fuel-efficient, designed for " + region + " roads.";
    }
}
