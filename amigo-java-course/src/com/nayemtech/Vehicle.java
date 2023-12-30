package com.nayemtech;

public abstract class Vehicle {
    protected String brand;
    private int price;

    public Vehicle() {
        System.out.println("Constructor of abstract class Vehicle is getting called!");
    }

    public Vehicle(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
