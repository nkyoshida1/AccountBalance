package com.company;

public class SavingsAccount extends account
{
    private double interestPay = 0.01;
    private double interestgain;
    public void interestTotal()
    {
        interestgain = getBalance() * interestPay;

    }


}
