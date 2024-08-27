package com.cbfacademy.accounts;

public class SavingsAccount extends Account{
    double interestRate;

    public SavingsAccount (int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interestApplied = balance * interestRate;

    }//applies interest to the account
    public double getInterestRate() {
        return interestRate;
    }//- returns the current interest rate
    public void setInterestRate(double newInterestRate) {
        this.interestRate = newInterestRate;
    }//- sets the interest rate

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
