package com.nayemtech;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        String s = "whatGives";
        Integer[] s = new Integer[5];
//        Arrays.fill(s, 0);

        String t;
        for (int i = 0; i < 5; i++) {
            if (s[i] == null) {
                System.out.println(i);
            } else {
                System.out.println(i + " " + s[i]);
            }
        }
        System.out.println(s);
    }
}