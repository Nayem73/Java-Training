package com.nayemtech;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Gender.MALE);
        Gender f = Gender.FEMALE;
        System.out.println(f);

        System.out.println();
        for (Gender gender : Gender.values()) {
            System.out.println(gender);
        }

        System.out.println();
        System.out.println(Arrays.toString(Gender.values()));
    }
}