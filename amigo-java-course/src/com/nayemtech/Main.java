package com.nayemtech;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<BigDecimal> list = new ArrayList<>(List.of( new BigDecimal("4444444932"))); //class BigDecimal extends abstract class Number
        List<Integer> list2 = new ArrayList<>(List.of(4,2,1)); // class Integer extends abstract class Number
        List<Number> list3 = new ArrayList<>();

//        print(list);
        print(list2);
        print(list3);
    }

    public static void print(List<? super Integer> list) {
        for (var X : list) {
            System.out.println(X);
        }
    }
}