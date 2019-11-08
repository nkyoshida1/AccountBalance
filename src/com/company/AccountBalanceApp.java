package com.company;
import java.util.Scanner;
import java.io.IOException;

public class AccountBalanceApp extends account
{
    public void app()throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the account balance application");
        System.out.println("Starting Balances");
        System.out.println("Checking: $" + Cbalance);
        System.out.println("Savings: $" + Sbalance);
        String cont = " ";
        String accType;
        String tranType;
        double amntWD;
        while(!cont.equals("2"))
        {
            System.out.println("Withdraw or Deposit(w, d)");
            tranType = keyboard.next();
            while(!tranType.equals("w") && !tranType.equals("d"))
            {
                System.out.println("Enter a valid transaction(w, d)");
                tranType = keyboard.next();
            }
            switch (tranType) {
                case "w":
                    System.out.println("Checking or savings(c/s)");
                    accType = keyboard.next();
                    while(!accType.equals("c") && !accType.equals("s"))
                    {
                        System.out.println("Enter a valid account type(c, s)");
                        accType = keyboard.next();
                    }
                    if (accType.equals("c")) {
                        System.out.println("Enter the amount: ");
                        amntWD = keyboard.nextDouble();
                        while(Cbalance < amntWD)
                        {
                            System.out.println("The Amount is greater than your balance enter a lower amount");
                            amntWD = keyboard.nextDouble();

                        }
                        Cbalance -= amntWD;
                    }
                    if (accType.equals("s")) {
                        System.out.println("Enter the amount: ");
                        amntWD = keyboard.nextDouble();
                        while(Sbalance < amntWD)
                        {
                            System.out.println("The Amount is greater than your balance enter a lower amount");
                            amntWD = keyboard.nextDouble();
                        }
                        Sbalance -= amntWD;

                    }
                    break;
                case "d":
                    System.out.println("Checking or Savings(c, s)");
                    accType = keyboard.next();
                    while(!accType.equals("c") && !accType.equals("s"))
                    {
                        System.out.println("Enter a valid account type(c, s)");
                        accType = keyboard.next();
                    }
                    switch(accType)
                    {
                        case "c":
                            System.out.println("Enter the amount: ");
                            amntWD = keyboard.nextDouble();
                            Cbalance += amntWD;
                            break;
                        case "s":
                            System.out.println("Enter the amount: ");
                            amntWD = keyboard.nextDouble();
                            Sbalance += amntWD;
                            break;
                        default:
                    }
            }
            System.out.println("Do you have another transaction(1, 2)");
            cont = keyboard.next();
        }
        System.out.println("Monthly Payments and fees");
        double checkingFee = 1;
        System.out.println("Checking fee: $" + checkingFee);
        System.out.println("Savings interest payment: $" + (Sbalance * .01));
        System.out.println("---------------------------");
        System.out.println("Final Balances");
        System.out.println("Checking: $" + (Cbalance - checkingFee));
        System.out.println("Savings: $" + (Sbalance + (Sbalance * 0.01)));

    }
}
