package com.nayemtech;

interface StringSupplier {
    String get();
}

public class Main {
    public static void main(String[] args) {
        String s = "from main method";

        // Using a lambda expression to access the variable 's'
        StringSupplier supplier = () -> s;
        fnc(supplier);
    }

    public static void fnc(StringSupplier supplier) {
        String value = supplier.get();
        System.out.println(value); // Accessing 's' indirectly in fnc method
    }
}
