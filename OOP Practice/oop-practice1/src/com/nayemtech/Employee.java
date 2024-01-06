package com.nayemtech;

import java.time.Duration;
import java.time.LocalDateTime;

public class Employee {
    private String name;

    private double salary;
    private LocalDateTime hireDate;

    private Employee() {

    }

    public Employee(String name, double salary, LocalDateTime hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }
//    public long calculateYearsOfService() {
////        public long nice() {
//            long x = 4;
//            return x;
//        }
//        LocalDateTime curTime = LocalDateTime.now();
//        Duration duration = Duration.between(hireDate, curTime);
//        return duration.toDays()/365;
//    }

}

