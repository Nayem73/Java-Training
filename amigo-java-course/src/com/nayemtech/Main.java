package com.nayemtech;

import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 21;
        numbers[1] = 6;
        numbers[2] = 42;

        System.out.println(numbers[0]);
        System.out.println(Arrays.toString(numbers));


        int[] numbers2 = {3,4,6,7};
        System.out.println(Arrays.toString(numbers2));

        int[] numbers3 = new int[12];
        Arrays.fill(numbers3, -1);
        System.out.println(Arrays.toString(numbers3));
    }
}