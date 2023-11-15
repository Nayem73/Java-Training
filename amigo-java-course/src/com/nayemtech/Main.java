package com.nayemtech;

public class Main {
    public static void main(String[] args) {
        karim();
    }

    static void karim() {
        try{
            john();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void john() throws Exception {
        divide(10, 0);
    }

    static void divide(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("can not divide by 0");
        }
    }
}