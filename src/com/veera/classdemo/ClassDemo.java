package com.veera.classdemo;


public class ClassDemo {
	// properties	
		int id ;
		String name;
		
		// Behaviors
			public void disp(){
				System.out.println("WELCOME");
			}
			
			//constructor
			ClassDemo(){
				System.out.println("I am from constructor");
			}
			
		// Behaviors 
		public static void main(String[] args) {
			
			//creating an Object
			ClassDemo ravi = new ClassDemo();
			
			ravi.id=101;
			ravi.name="JAVA";	
			
			
			ClassDemo veera = new ClassDemo();
			
			veera.id=102;
			veera.name="J2EE";
			
			ClassDemo kumar = new ClassDemo();
			
			kumar.id=1001;
			kumar.name="HADOOP";
			
			//int i 	
			
			//accessing the state of object
			System.out.println("ID = "+ravi.id);
			
			System.out.println("NAME = "+ravi.name);
			
			//behavior of object
			ravi.disp();

		}	
		
		
		//blocks
		
		{
			System.out.println("i am from block ");
			
		}
		
		static{
			System.out.println("I am from static block");
		}

}
