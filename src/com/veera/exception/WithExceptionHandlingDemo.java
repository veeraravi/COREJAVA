package com.veera.exception;

public class WithExceptionHandlingDemo {
	static String name ;

	public static void printLength1(){
		System.out.println("LENGTH "+name.length());
	}
	
	public static void printLength(){
		System.out.println("printlength ");
		printLength1();
	}
	
	public static void main(String[] args) {
		System.out.println("MAIN");

		System.out.println("MAIN1");
		System.out.println("MAIN2");
		System.out.println("MAIN3");
		try{
			System.out.println("INSIDE TRY");
			printLength();			
			
			
		}
		catch(Exception e){
			System.out.println("INSIDE CATCH");		
			System.out.println("MAIN");		
			System.out.println("MAIN");
			e.printStackTrace();
	//		new throw ()..
		}
				
		System.out.println("outside catch MAIN");
	}

}
