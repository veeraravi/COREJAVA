package com.veera.sample;

public class FirstJavaProgram {
	
	// properties	
	int id ;
	String name;
	
	// Behaviors
		public void disp(){
			System.out.println("WELCOME");
		}
	
	// Behaviors 
	public static void main(String[] args) {
		
		//creating an Object
		FirstJavaProgram ravi = new FirstJavaProgram();
		
		ravi.id=101;
		ravi.name="JAVA";	
		
		
		FirstJavaProgram veera = new FirstJavaProgram();
		
		veera.id=102;
		veera.name="J2EE";
		
		FirstJavaProgram kumar = new FirstJavaProgram();
		
		kumar.id=1001;
		kumar.name="HADOOP";
		
		//int i 	
		
		//accessing the state of object
		System.out.println("ID = "+ravi.id);
		
		System.out.println("NAME = "+ravi.name);
		
		//behavior of object
		ravi.disp();

	}	
	
}
