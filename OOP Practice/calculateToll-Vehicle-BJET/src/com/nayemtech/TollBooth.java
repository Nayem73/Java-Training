package com.nayemtech;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TollBooth {
    private List<Vehicle> vehicles;
    private Map<String, TollInfo> tollPrice;
    private double totalToll;

    public TollBooth() {
        vehicles = new ArrayList<>();
        tollPrice = new HashMap<>();
        totalToll = 0;
    }
    public void addTollPrice(String vehicleType, double price, String unit, double pricePerUnit) {
        TollInfo tollInfo = new TollInfo(price, unit, pricePerUnit);
        tollPrice.put(vehicleType, tollInfo);
    }
    public void removeTollPrice(String vehicleType) {
        tollPrice.remove(vehicleType);
    }

    public double getTotalTollCollected() {
        return totalToll;
    }

    public Double calculateToll(Vehicle vehicle) {
        TollInfo tollinfo = tollPrice.get(vehicle.getVehicleType());
        if (tollinfo == null) return null;

        double price = tollinfo.getTollPrice();
        price += vehicle.getVehicleWeight() * tollinfo.getTollPricePerUnit();
        //now check if the Citizen is a cardHolder or a Govt Official for discount purpose
        if (vehicle.getVehicleUsed().equals("Govt")) {
            price = 0;
        } else if (vehicle.getVehicleUsed().equals("Personal") && vehicle.getCitizen().getCard().equals("null") && vehicle.getCitizen().getOccupation().equals("Govt Official")) {
            price = price - (price*(2.0/100.0));
        } else if (vehicle.getCitizen().getCard().equals("Platinum")) {
            price = price - (price*(10.0/100.0));
        } else if (vehicle.getCitizen().getCard().equals("Gold")) {
            price = price - (price*(8.0/100.0));
        } else if (vehicle.getCitizen().getCard().equals("Silver")) {
            price = price - (price*(5.0/100.0));
        }
        this.totalToll += price;
        this.vehicles.add(vehicle);
        return price;
    }

}
