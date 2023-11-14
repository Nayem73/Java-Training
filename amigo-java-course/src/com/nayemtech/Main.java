package com.nayemtech;

public class Main {
    public static void main(String[] args) {
        System.out.println("before error");
        try {
            int y = 5/0;
            System.out.println("After Error");
        } catch (NumberFormatException e) {
            System.out.println("Nayem printing the error message by e.getMessage(): " + e.getMessage());
        }
    }
}