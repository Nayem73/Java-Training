package com.nayemtech;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accountList;

    public Bank() {
        List<Account> accountList = new ArrayList<>();
    }

    public void executeOperation(AccountOperation accountOperation) {
//        deposit.execute() //this is how it should have been before.
        accountOperation.execute();
    }
}
