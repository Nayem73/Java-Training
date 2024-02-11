package com.nayemtech;

public class Car extends Vehicle{
    public String brand;
    public String name = "carName";
    public String getName() {
        this.name = "carName";
        return this.name;
    }

    public Car(String vehicleType, String brand) {
        super(vehicleType);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printFromCar() {
        System.out.println("from Car");
    }
}
