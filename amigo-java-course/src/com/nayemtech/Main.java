package com.nayemtech;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("18");
        } catch (NumberFormatException e) {
            System.out.println("Failed to parse");
        }

        System.out.println("number can not be printed though! cz it is inside try block");
        //System.out.println(number); can't
    }
}