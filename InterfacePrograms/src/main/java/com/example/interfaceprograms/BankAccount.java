package com.example.interfaceprograms;

public class BankAccount {
    private double balence;
    private  int accountNumber;
    private static int lastAssignedNumber=1000;

    public BankAccount(double balence) {
        this.balence = balence;
        lastAssignedNumber++;
        accountNumber = lastAssignedNumber;
    }

    public double getBalence() {
        return balence;
    }
}
