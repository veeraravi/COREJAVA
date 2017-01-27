package com.veera.inheritance;


class Bank{
	
	int branchId =100;
	
	public int getInterest(){
		System.out.println("I am from Bank class");
		return 5;
	}
	
}


class YesBank extends Bank{
	int branchId =110;

	
	@Override
	public int getInterest(){
		System.out.println("I am from YESBank class");
		return 10;
	}
}


class CitiBank extends Bank{
	
	int branchId =120;

	
	@Override
	public int getInterest(){
		System.out.println("I am from CITI Bank class");
		return 9;
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		YesBank yb = new YesBank();
		System.out.println("rate of Interest in YesBank = "+yb.getInterest());
		
		CitiBank cb = new CitiBank();
		System.out.println("rate of Interest in CitiBank = "+cb.getInterest());
		
		//dynamic polymorphsim
		
		Bank b = new YesBank();
		b.getInterest();//10
		
		System.out.println("BRANCH ID "+b.branchId); //

	}

}
