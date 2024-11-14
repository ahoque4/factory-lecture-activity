package com.example;

public abstract class VehicleFactory {
    public abstract Vehicle createVehicle(String region, VehicleType vehicleType);
}
