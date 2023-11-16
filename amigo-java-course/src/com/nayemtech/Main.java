package com.nayemtech;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Jupyter", "White");
        System.out.println(cat.getName());
        System.out.println(cat);

        Cat cat2 = new Cat("Jupyter", "White");
        System.out.println(cat2);

        System.out.println(cat == cat2);
        System.out.println(cat.equals(cat2));

        int[] a;
        Cat[] cats;
        int arr[] = new int[5];
        Cat[] cats2 = new Cat[5];

        int[] a2 = {5,6};
        System.out.println(Arrays.toString(a2));

    }
}