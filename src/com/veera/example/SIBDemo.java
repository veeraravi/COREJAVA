package com.veera.example;

public class SIBDemo {
	
	String name;
	int rollno;
	static String collegeName;
	
	
	SIBDemo(){
		System.out.println("I am from constructor");
	}
	
		
	/**
	 * @param name
	 * @param rollno
	 */
	public SIBDemo(String name, int rollno) {
		System.out.println("I am from two params constructor ");

		this.name = name;
		this.rollno = rollno;
	}



	//SIB
	static {
		System.out.println("I AM FORM SIB");

		collegeName ="IIT MADRAS";
		
	}

	//IIB
	{
		System.out.println("I AM FORM IIB");
		name="JAVA";
		rollno=100;
		collegeName ="IIT MADRAS";
		
	}
	
	
	public static void main(String[] args) {
		
		SIBDemo sd = new SIBDemo();
		
		SIBDemo sd1 = new SIBDemo("JAVA",100);
		
SIBDemo sd3 = new SIBDemo();
		
		SIBDemo sd4 = new SIBDemo("HADOOP",100);

	}

}
