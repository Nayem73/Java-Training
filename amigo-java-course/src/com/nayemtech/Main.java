package com.nayemtech;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        double x = 0.03;
        double y = 0.02;
        double z = x - y;
        System.out.println(z);

        BigDecimal num1 = new BigDecimal(0.03);
        BigDecimal num2 = new BigDecimal(0.02);
        BigDecimal num3 = num1.subtract(num2);
        System.out.println(num3);
    }
}