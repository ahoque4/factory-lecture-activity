package com.example;

public class Simulator {
    public static void generateOutput() {
        VehicleFactory europeFactory = new EuropeVehicleFactory();
        VehicleFactory usaFactory = new USAVehicleFactory();

        Vehicle europeCar = europeFactory.createVehicle("Europe", VehicleType.CAR);
        europeCar.manufacture();

        Vehicle usaTruck = usaFactory.createVehicle("USA", VehicleType.TRUCK);
        usaTruck.manufacture();

        Vehicle usaMotorcycle = usaFactory.createVehicle("USA", VehicleType.MOTORCYCLE);
        usaMotorcycle.manufacture();
    }

    public static void main(String[] args) {
        generateOutput();
    }
}