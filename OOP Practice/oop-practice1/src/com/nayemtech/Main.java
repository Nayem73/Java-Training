package com.nayemtech;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank sonaliBank = new Bank(); // ei bank er under e nicher account gulo thakbe tai ei line sobar first e likhlam

        Account nayemAccount = new Account(123, "Nayem", new BigDecimal("12000"));
        Account jimAccount = new Account(129, "Jim", new BigDecimal("30000"));
        Account karimAccount = new Account(391, "Karim", new BigDecimal("0"));

//        nayemAccount.deposit(333); This is how it should have been. so follow this and implement open/closed principle

        sonaliBank.executeOperation(new Deposit(nayemAccount, new BigDecimal("1000.99"))); // executeOperation method ta Bank class e die, ei line er moto korleo hoy
                                                                    // abar direct main class e Bank er instance create kore korleo hoy.

        System.out.println(nayemAccount.getBalance());

    }
}