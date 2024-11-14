package com.example;

public class USAVehicleFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle(String region, VehicleType vehicleType) {
        switch (vehicleType) {
            case CAR:
                return new Car(region);
            case TRUCK:
                return new Truck(region);
            case MOTORCYCLE:
                return new Motorcycle(region);
            default:
                throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}