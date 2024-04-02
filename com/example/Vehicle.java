package com.example;
// DO NOT MODIFY FILE!

public abstract class Vehicle {
    protected String type;
    protected String region;

    public void manufacture() {
        System.out.println("Creating " + region + " " + type + " for " + region + "...");
        printTestingDetails();
        System.out.println("Final Product: " + region + " " + type + " - " + getDetails());
    }

    protected abstract void printTestingDetails();

    protected abstract String getDetails();
}