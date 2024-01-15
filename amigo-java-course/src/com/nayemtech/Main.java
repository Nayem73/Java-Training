package com.nayemtech;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Double> numbers = new ArrayList<>(List.of(2.0,3.339,1.205));
       System.out.println(countGreaterThan(numbers, 1.0));

       List<Integer> numbers2 = new ArrayList<>(List.of(2,3,1));
        System.out.println(countGreaterThan(numbers2, 1));

    }



    public static <T extends Number & Comparable<T>> int countGreaterThan(List<T> numbers, T number) {
        int count = 0;
        for (T X: numbers) {
            if (X.compareTo(number) > 0) {
                count++;
            }
        }
        return count;
    }
}