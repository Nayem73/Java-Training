package com.nayemtech;

public class Main implements InterfaceA, InterfaceB, InterfaceC {
    @Override
    public void doSomething() {
        System.out.println("doSomething implementation from Main class");
    }
    public static void main(String[] args) {
        InterfaceA interfaceA = new Main();
        interfaceA.doSomething();


        InterfaceB interfaceB = new TmpMain();
        interfaceB.doSomething();

        Main main = new Main();
        main.doSomething();

        TmpMain tmpMain = new TmpMain();
        tmpMain.doSomething();
    }

}