package com.company;

public class account implements balanceable, depositable, withdrawable
{
    public static double amount;
    double Cbalance = 2000.0;
    double Sbalance = 2000.0;

    @Override
    public double getBalance() {
        return 0;
    }
    public void setBalance(double amount) {
        account.amount = amount;
    }
    public void deposit(double amount) {
        account.amount = account.amount + amount;
    }
    public void withdraw(double amount)
    {
        account.amount = account.amount - amount;
    }
    public static void deposit (depositable account, double amount) {
        account.deposit(amount);
    }
    public static void withdraw (withdrawable account, double amount) {
        account.withdraw(amount);
    }
}
