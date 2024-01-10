package com.nayemtech;

import java.time.LocalDateTime;

public class John extends Employee {
    double workHours;

    public John() {
    }

    public John(String name, double salary, LocalDateTime hireDate, double workHours) {
        this();
        this.workHours = workHours;
    }

    public final String canYou(String s) {
        System.out.println("overloaded from this john");
        return s;
    }
}
