package com.nayemtech;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Citizen govtOfficial = new Citizen("govt guy", "Govt Official", "null");
        Citizen regularGuy = new Citizen("Karim", "Software Engineer", "Gold");
        Citizen aBitMoreRegularGuy = new Citizen("Kar", "None", "null");

        Vehicle carPersonal = new Car("Car", "Personal", 788, govtOfficial);
        Vehicle carGovt = new Car("Car", "Govt", 788, govtOfficial);
        Vehicle carRegular = new Car("Car", "Personal", 788, regularGuy);
        Vehicle carABitMoreRegular = new Car("Car", "Personal", 788, aBitMoreRegularGuy);

        TollBooth tollBooth = new TollBooth();
        tollBooth.addTollPrice("Car", 200, "KG", 10);

        List<Vehicle> vehicles = new ArrayList<>(List.of(carPersonal, carGovt, carRegular, carABitMoreRegular));
        for (Vehicle curVehicle : vehicles) {
            System.out.println(tollBooth.calculateToll(curVehicle));
        }
    }
}