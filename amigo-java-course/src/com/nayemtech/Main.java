package com.nayemtech;

public class Main {
    public static void main(String[] args) {
        Vehicle toyota = new Car("Car", "Toyota");
        System.out.println(toyota.name);
        System.out.println(toyota.getName());
    }
}