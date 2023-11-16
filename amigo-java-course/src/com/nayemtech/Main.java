package com.nayemtech;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person alex = new Person("Alex", "Hunt", 33);
        Person jakir = new Person();
        System.out.println(Person.getAddress());
        System.out.println(jakir.getLastName());
        System.out.println(Person.getAddress());

    }
}