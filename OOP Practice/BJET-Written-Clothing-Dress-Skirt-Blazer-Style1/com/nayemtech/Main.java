package com.nayemtech;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Clothing firstClothing = new Style1(1, "Gents", "Full Sleeve", 52);
        Clothing secondClothing = new Style1(2, "Ladies", "Full Sleeve", 32);

        firstClothing.addSize(5);
        List<Clothing> lists = new ArrayList<>(List.of(firstClothing, secondClothing));
        for (Clothing curClothing : lists) {
            System.out.println(curClothing.getName());
        }
    }
}