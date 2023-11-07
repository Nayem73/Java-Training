package com.nayemtech;

public class Main {
    public static void main(String[] args) {
        neg(3, 10);
    }

    public static void neg(int a, int b) throws IllegalArgumentException {
        if (b >= a) {
            throw new IllegalArgumentException("can not subtract b from a because b is bigger than a");
        }

        a -= b;
        System.out.println(a);
    }
}