package com.java.abstracttest;

public abstract class AbstractTest {
	
	// instance variables
	
	int id;
	String name;
	
	//Static variable
	
	public static String schoolName;
	
	// constructor
	/**
	 * @param id
	 * @param name
	 */
	public AbstractTest(int id, String name) {
		System.out.println("===========CONSTRUCTOR in ABSTRACT CLASS START==================");
		this.id = id;
		this.name = name;
		System.out.println("===========CONSTRUCTOR in ABSTRACT CLASS END==================");

	}
// non abstarct method
	
	public void disp(){
		System.out.println("=======PUBLIC METHOD START================");
		System.out.println("ID "+id);
		System.out.println("NAME "+name);
		System.out.println("=======PUBLIC METHOD END================");
		print();
	}
	
	
	private void print(){
		System.out.println("=======PRIVATE METHOD START================");

		System.out.println("PRIVATE ID "+id);
		System.out.println("PRIVATE NAME "+name);
		System.out.println("=======PRIVATE METHOD START================");

	}
	
	// abstract method
	public abstract void add();
	
	public abstract void sub();
	
	public abstract void mul();

	//Blocks
	{
		System.out.println("I AM FROM INSTANCE INITILIZATION BLOCK");
		
	}
	
	static {
		
		System.out.println("I AM FROM STATIC BLOCK");

		schoolName = "BIGDATA UNIVERSITY";
		
	}
	
	
	// main method

	public static void main(String[] args) {

		System.out.println("I am from Main");
		
		//AbstractTest at = new AbstractTest();
	}

}
