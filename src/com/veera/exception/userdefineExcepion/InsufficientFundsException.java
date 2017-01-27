package com.veera.exception.userdefineExcepion;

//File Name InsufficientFundsException.java

public class InsufficientFundsException extends Exception
{
    private double amount;

    public InsufficientFundsException(double amount)
    {
        this.amount = amount;
    }

    public double getAmount()
    {
        return amount;
    }

    public InsufficientFundsException(double amount, String cause)
    {
        this.amount = amount;
    }

}