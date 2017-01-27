package com.veera.constructor; 

public class StudentDemo {
	int id;
	String name;
	
	public void disp() {
		System.out.println("Student details: id = "+id + " Name = "+name);
	}

	public static void main(String[] args) {
		StudentDemo sd = new StudentDemo();
	}

}
