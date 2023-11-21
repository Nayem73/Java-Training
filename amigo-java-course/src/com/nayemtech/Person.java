package com.nayemtech;

import java.util.Arrays;

public class Person {
    private static String address = "Baltic Sea";
    private String firstName;
    private String lastName;
    private int age;
    private Car[] cars;

    public Person(String firstName, String lastName, int age, Car[] cars) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.cars = cars;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public Person() {
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Person.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}
