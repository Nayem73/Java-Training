package com.nayemtech;

public class Main {
    public static void main(String[] args) {
        neg(3, 10);
    }

    public static void neg(int a, int b) throws Exception {
        if (b >= a) {
            throw new Exception("can not subtract b from a because b is bigger than a");
        }

        a -= b;
        System.out.println(a);
    }
}