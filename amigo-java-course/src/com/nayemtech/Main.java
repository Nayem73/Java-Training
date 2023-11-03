package com.nayemtech;

import java.math.BigDecimal;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("18");
            //if above try fails, anything under this line will not be executed.
            System.out.println(number);
            int y = 5/0;
        } catch (NumberFormatException e) {
            System.out.println("Failed to parse");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occured");
        }
    }
}