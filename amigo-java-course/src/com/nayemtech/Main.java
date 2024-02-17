package com.nayemtech;

public class Main {
    public static void main(String[] args) {
        Singleton singleton;
        Singleton singleton1;

        singleton = Singleton.getSingleton();
        singleton1 = Singleton.getSingleton();

        System.out.println(singleton);
        System.out.println(singleton1);
    }
}