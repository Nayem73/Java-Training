package com.nayemtech;

public interface Vehicle {
    String getVehicleType();
    void setVehicleType(String vehicleType);

    String getVehicleUsed();
    void setVehicleUsed(String vehicleUsed);

    double getVehicleWeight();
    void setVehicleWeight(double vehicleWeight);

    Citizen getCitizen();
    void setCitizen(Citizen citizen);
}