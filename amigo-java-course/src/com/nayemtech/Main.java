package com.nayemtech;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Jupyter", "White");
        System.out.println(cat.getName());
        System.out.println(cat);

        Cat cat2 = cat;
        System.out.println(cat2);

        System.out.println(cat==cat2);
    }
}