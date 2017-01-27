package com.veera.constructor;



class Student1{
	
	int id;
	String name;
	String dob;
	
	
	public void Student1(){
		
	}
	
	public Student1(){ //default constructor or no arg constructor
		this(1020);		
		id=0;
		name="default";
		dob="default 1-1-1";
	}

	/**
	 * @param id
	 * @param name
	 * @param dob
	 */
	public Student1(int id1, String name1, String dob1) {  //Parameter constructor
		//this(1000,"SPARK");
		id = id1;
		name = name1;
		dob = dob1;
	}	
	
	/**
	 * @param id
	 * @param name
	 * @param dob
	 */
	public Student1(int id, String name) {  //Parameter constructor
		
		this.id = id;
		this.name = name;
	}	
	
	
	/**
	 * @param id
	 * @param name
	 * @param dob
	 */
	public Student1(int id) {  //Parameter constructor
		
		this.id = id;
	}
	
	public void print(){
		
		add(100, 1000);
		
		System.out.println("Student ID is "+id);
		System.out.println("Student name is "+name);
		System.out.println("Studnet DOB is "+dob);
	}
	
public void add(int i , int j){
		
		System.out.println("I + J "+(i+j));
	}
}

public class ConstructorChaining {

public static void main(String[] args) {
		/*
		Student1 default1 = new Student1();
		
		default1.print();*/
		
		Student1 java = new Student1(100,"JAVA","21-10-1990");
		
		java.print();

		/*Student1 j2ee = new Student1(1010,"J2EE","20-09-1996");
		j2ee.print();

		Student1 hadoop = new Student1(1000,"HADOOP");	
		hadoop.print();*/
		
		//hadoop.add(10);
		
		

	}

}
