package com.nayemtech;

public class Vehicle {
    public String vehicleType;
    public static String vehicleCode;

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

    public static void printInfo() {
        System.out.println(Vehicle.vehicleCode);
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.vehicleType);
//        System.out.println(vehicle.vehicleCode);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
