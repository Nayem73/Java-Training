package com.nayemtech;

public class Vehicle {
    int X = 55;
    public static void m1() {
        System.out.println("from parent Vehicle class");
    }

    private void m2() {
        System.out.println("this is private method from parent class Vehicle");
    }
    public void m3() {
        System.out.println("this is public method from parent class Vehicle");
    }
}
