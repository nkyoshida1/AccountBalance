package com.company;

public class CheckingAccount extends account
{
    private double checkFee = 1.0;
    CheckingAccount()
    {
        super();
        checkFee = 1.0;
    }

    public void checkFee()
    {
        CheckingAccount.amount = CheckingAccount.amount - checkFee;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }


    public void deposit(double amount) {
        super.deposit(amount);
    }
}

