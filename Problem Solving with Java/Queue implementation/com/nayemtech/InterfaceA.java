package com.nayemtech;

public interface InterfaceA {
    static void staticMethod() {
        System.out.println("static method in interfaceA belongs to the interface itself");
    }

    default void defaultMethod() {
        System.out.println("default method in interfaceA does not force me to override in implemented class. " +
                "I may or may not override it in the implemented class");
    }

    void normalMethod();
}
