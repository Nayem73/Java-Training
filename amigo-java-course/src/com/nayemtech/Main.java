package com.nayemtech;

public class Main {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = s1;

        s1 = s1.replace('c', '6');
        System.out.println(s1);
        System.out.println(s2);

        String s3 = new String("This String is not in String pool, it is in heap memory");

    }
}