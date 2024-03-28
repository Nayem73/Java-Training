package com.nayemtech;

public class Bus implements Vehicle {
    private String vehicleType;
    private String vehicleUsed;
    private double vehicleWeight;
    private Citizen citizen;

    public Bus(String vehicleType, String vehicleUsed, double vehicleWeight, Citizen citizen) {
        this.vehicleType = vehicleType;
        this.vehicleUsed = vehicleUsed;
        this.vehicleWeight = vehicleWeight;
        this.citizen = citizen;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleUsed() {
        return vehicleUsed;
    }

    public void setVehicleUsed(String vehicleUsed) {
        this.vehicleUsed = vehicleUsed;
    }

    public double getVehicleWeight() {
        return vehicleWeight;
    }

    public void setVehicleWeight(double vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    public Citizen getCitizen() {
        return citizen;
    }

    public void setCitizen(Citizen citizen) {
        this.citizen = citizen;
    }

}
