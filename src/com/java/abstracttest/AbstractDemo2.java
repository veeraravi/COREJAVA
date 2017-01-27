package com.java.abstracttest;

abstract class BANK{
	abstract public int getROI();
}

class ICICI extends BANK{

	@Override
	public int getROI() {
		
		System.out.println("i am from ICICI our ROI is "+10);
		
		return 10;
	}
	
}

class HDFC extends BANK{

	@Override
	public int getROI() {
		
		System.out.println("i am from HDFC our ROI is "+10);
		
		return 10;
	}
	
}


public class AbstractDemo2 {

	public static void main(String[] args) {

	}

}
