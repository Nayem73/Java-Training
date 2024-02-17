package com.nayemtech;

public class Vehicle {
    public String vehicleType;

    Vehicle() {
    }

    Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void RealVehicle() {
        System.out.println("Vehicle should Have different types.");
    }
}
