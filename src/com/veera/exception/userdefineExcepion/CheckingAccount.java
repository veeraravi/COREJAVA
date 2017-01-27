package com.veera.exception.userdefineExcepion;

import java.io.IOException;

//File Name CheckingAccount.java
public class CheckingAccount
{
    private double balance;
    private int number;

    public CheckingAccount(int number)
    {
        this.number = number;
    }

    public void deposit(double amount) throws InvalidAmountToDeposit
    {
    	if(amount > 0){
    		 balance += amount; // balance = balance + amount;
    	        System.out.println(":::Deposit succesful:::::::BALANCE::::::  " + balance);
    	}else{
    		 System.out.println(":::::::DEPOSIT FAIL ---- EXISTING BALANCE::::::  " + balance);
             throw new InvalidAmountToDeposit("Can not deposit negative value");
    	}
       
    }

    public void withdraw(double amount) throws IOException, InsufficientFundsException
    {
        if (amount <= balance)
        {
            balance -= amount;
            System.out.println(":::::::WITHDRAW SUCCESSFUL REMAINING BALANCE::::::  " + balance);
        }
        else
        {
            double needs = amount - balance;
            System.out.println(":::::::WITHDRAW FAIL ---- EXISTING BALANCE::::::  " + balance);
            throw new InsufficientFundsException(needs);
           // throw new FileNotFoundException();
        }
    }

    public double getBalance()
    {
        return balance;
    }

    public int getNumber()
    {
        return number;
    }
}