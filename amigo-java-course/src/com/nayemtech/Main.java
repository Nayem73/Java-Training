package com.nayemtech;

import java.math.BigDecimal;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        try {
            int y = 5/0;
            int number = Integer.parseInt("18ui");
            //if above try fails, anything under this line will not be executed.
            System.out.println(number);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}