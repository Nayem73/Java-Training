package com.nayemtech;

import java.math.BigDecimal;

public class Deposit implements AccountOperation{
    private Account account;
    private BigDecimal amount;

    public Deposit(Account account, BigDecimal amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.setBalance(account.getBalance().add(amount));
    }
}
