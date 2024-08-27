package com.cbfacademy.accounts;

public class Account {
    int accountNumber;
    double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
    //- constructor that accepts parameters representing the new account number and starting balance
    public double getBalance() {
        return balance;

    }
    //- returns the current account balance
    public int getAccountNumber() {
        return accountNumber;

    }
    //- returns the account number
    public double deposit(double amount) {
        double newBalance = balance + amount;
        return newBalance;

    }
    //- deposits funds to the account and returns the new balance
    public double withdraw(double requested) {
        double newBalance = balance - requested;
        if (newBalance <0){
            return 0;
        }
        else if (requested <0){
            return 0;
        }
        else {
            return requested;
        }
    }
    //- withdraws funds from the account and returns the requested amount or 0 if the account has an insufficient balance
}
