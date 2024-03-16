package com.nayemtech;

public class TmpMain implements InterfaceA {


    @Override
    public void normalMethod() {
        System.out.println("normal method in the implemented class forced me to override");
    }


    static void staticMethod() {
//        super();
    }
}
