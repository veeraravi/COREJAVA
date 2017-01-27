package com.veera.constructor;

class Student{
	
	int id;
	String name;
	String dob;
	
	public Student(){ //default constructor or no arg constructor
		id=0;
		name="default";
		dob="default 1-1-1";
	}

	/**
	 * @param id
	 * @param name
	 * @param dob
	 */
	public Student(int id, String name, String dob) {  //Parameter constructor
		
		this.id = id;
		this.name = name;
		this.dob = dob;
	}	
	
	/**
	 * @param id
	 * @param name
	 * @param dob
	 */
	public Student(int id, String name) {  //Parameter constructor
		
		this.id = id;
		this.name = name;
	}	
	
	
	/**
	 * @param id
	 * @param name
	 * @param dob
	 */
	public Student(int id) {  //Parameter constructor
		
		this.id = id;
	}
	
	public void print(){
		
		System.out.println("Student ID is "+id);
		System.out.println("Student name is "+name);
		System.out.println("Studnet DOB is "+dob);
	}
	
public void add(int i , int j){
		
		System.out.println("I + J "+(i+j));
	}
}

public class ConstructorDemo {
	
	

	public static void main(String[] args) {
		
		Student default1 = new Student();
		
		default1.print();
		
		Student java = new Student(100,"JAVA","21-10-1990");
		
		java.print();

		Student j2ee = new Student(1010,"J2EE","20-09-1996");
		j2ee.print();

		Student hadoop = new Student(1000,"HADOOP");	
		hadoop.print();
		
		//hadoop.add(10);
		
		

	}

}
