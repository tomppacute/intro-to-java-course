package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit=overdraftLimit;
    }
    //- constructor that accepts parameters representing the new account number, starting balance and overdraft limit
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    //- returns the current overdraft limit
    public void setOverdraftLimit(double newOverdraftLimit) {
        this.overdraftLimit=newOverdraftLimit;
    }
    //- sets the overdraft limit
    @Override
    public double getBalance() {
        return balance;

    }
    //- returns the current account balance
    @Override
    public int getAccountNumber() {
        return accountNumber;

    }
}
