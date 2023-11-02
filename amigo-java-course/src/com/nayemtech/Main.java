package com.nayemtech;

public class Main {
    public static void main(String[] args) {
        String s = "whatGives";
        String t;
        for (int i = 0; i < (int)s.length(); i++) {
            if (s[i] == 'v') {
                s[i] = '5';
            }
        }
        System.out.println(s);
    }
}