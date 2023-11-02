package com.nayemtech;

public class Main {
    public static void main(String[] args) {
        String numToString = String.valueOf(56); //convert Integer to String
        System.out.println(numToString);

        int num = 23;

        String formattedString = String.format("like printing Strings in C & extra feature: numToString=%s, num=%s\n", numToString, num);
        System.out.println(formattedString);

        String[] s1 = {"cat", "tiger", "elephant"};
        String s2 = String.join(" | ", s1);
        System.out.println(s2);
    }
}