package com.nayemtech;

public class Vehicle {
    public String vehicleType;
    public String name = "vehicleName";

    public String getName() {
        this.name = "vehicleName";
        return this.name;
    }

    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void printFromCar() {
        System.out.println("from Vehicle");
    }
}
