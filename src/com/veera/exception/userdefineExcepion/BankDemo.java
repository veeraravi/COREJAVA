package com.veera.exception.userdefineExcepion;

//File Name BankDemo.java
public class BankDemo
{
    public static void main(String[] args)
    {
        CheckingAccount c = new CheckingAccount(10012);
        
        System.out.println("Depositing $500...");
        
        try {
			c.deposit(500.00);
		} catch (InvalidAmountToDeposit e1) {
			e1.printStackTrace();
		}

        try
        {
            Thread.currentThread().sleep(10000);
            
            System.out.println("\nWithdrawing $100...");
            
            c.withdraw(100.00);
            
            Thread.currentThread().sleep(10000);
            
            System.out.println("\nWithdrawing $600...");
            
            c.withdraw(600.00);
            
        } catch (InsufficientFundsException ae)
        {
            System.out.println("Sorry, but you are short $"
                    + ae.getAmount());
            ae.printStackTrace();
            System.out.println("Cause " + ae.getCause());
            System.out.println("Message " + ae.getMessage());
            System.out.println("locallized Message " + ae.getLocalizedMessage());
            System.out.println(" Class" + ae.getClass());
            System.out.println("Stack trace Message " + ae.getStackTrace());

        } catch (Exception e) {
            e.printStackTrace();

        }
        
        try {
			c.deposit(-500.00);
		} catch (InvalidAmountToDeposit e1) {
			e1.printStackTrace();
		}

    }
}