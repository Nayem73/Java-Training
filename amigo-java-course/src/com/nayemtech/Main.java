package com.nayemtech;

import java.util.Date;

public class Main {

    public static String str = "string is here";
    public String str2 = "without static";
    public void meth2() {}
    public static void main(String[] args) {
        System.out.println(str);
        Main main = new Main();
        System.out.println(main.str2);
        meth();
        main.meth2();
    }

    public static void meth() {}
}