package com.nayemtech;

public class Car extends Vehicle{
    public String brand;

    public Car(String vehicleType, String brand) {
        super(vehicleType);
        this.brand = brand;
    }

    public Car() {
    }

    @Override
    public void RealVehicle() {
        //super.RealVehicle();
        System.out.println("ok from Car");
        System.out.println("ok from Car");
        RealVehicle();
    }
}
