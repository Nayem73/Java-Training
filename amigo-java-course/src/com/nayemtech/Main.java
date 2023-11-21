package com.nayemtech;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car Mercedes = new Car("Dhk-1238492", new BigDecimal("1217000"));
        Car BMW = new Car("Chatto-1238492", new BigDecimal("2217000"));

        Person alex = new Person("Alex", "Hunt", 33, new Car[]{Mercedes, BMW});
        System.out.println(alex);

        System.out.println();
        Person jakir = new Person();
        System.out.println(Person.getAddress());
        System.out.println(jakir.getLastName());
        System.out.println(Person.getAddress());

        String myName = "Nayem";

    }
}