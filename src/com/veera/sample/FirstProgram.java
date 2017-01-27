package com.veera.sample;

public class FirstProgram {
	
	int i=100;
	String name="Java";

	public static void main(String[] args) {
		
		FirstProgram fp = new FirstProgram();
		
		
		int i=10;
		int I=20;
		
		System.out.println("small i "+i);
		System.out.println("Capital I "+I);
		
		System.out.println("WELCOME TO MY FIRST JAVA PROGRAM");
		
		System.out.println(fp.name);
		fp.disp();
		
		
	}
	
	public void disp(){
		
		System.out.println("Started executing disp method");
		System.out.println(i);
		//System.out.println(fp);
		System.out.println("Name "+name);
	}

}

