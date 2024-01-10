package com.nayemtech;

import java.time.Duration;
import java.time.LocalDateTime;

public class Employee {
    private String name;

    private double salary;
    private LocalDateTime hireDate;
    private static int age;


    public Employee() {
    }

    public Employee(String name, double salary, LocalDateTime hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public final String canYou(Integer t) {
        System.out.println("canYou overload?");
        return t.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDateTime getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDateTime hireDate) {
        this.hireDate = hireDate;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Employee.age = age;
    }
}

