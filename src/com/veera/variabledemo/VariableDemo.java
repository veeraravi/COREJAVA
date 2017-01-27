package com.veera.variabledemo;

public class VariableDemo {

	//instance variables
	int id =101;
	String name ="JAVA";
	
	//static Variable
	
	static String schoolName = "IIT";
	
	public static void main(String[] args) {
		
		// vd is instance or an object
		VariableDemo vd = new VariableDemo();
		VariableDemo vd2 = new VariableDemo();
		
		System.out.println("==========main Begin=================");
		
		System.out.println("Instance variable vd.id ==before change the values==== "+vd.id);
		
		System.out.println("Instance variable vd.name ==before change the values===="+vd.name);
		
		System.out.println("==Static Varibale from main method  ==before change the values===="+schoolName);
		
		System.out.println("Instance variable vd2.id ==before change the values==== "+vd2.id);
		
		System.out.println("Instance variable vd2.name ==before change the values===="+vd2.name);
		
		System.out.println("==Static Varibale from main method  ==before change the values===="+schoolName);
		
		vd.id=1010;
		vd.name="HADOOP";
		
		vd.schoolName="Bigdata University";
		
		System.out.println("Instance variable vd.id ==after change the values==== "+vd.id);
		
		System.out.println("Instance variable vd.name ==after change the values===="+vd.name);
		
		System.out.println("==Static Varibale from main method  ==after change the values===="+schoolName);
		
		System.out.println("Instance variable vd2.id ==after change the values==== "+vd2.id);
		
		System.out.println("Instance variable vd2.name ==after change the values===="+vd2.name);
		
		System.out.println("==Static Varibale from main method  ==after change the values===="+schoolName);
		
		vd.displayVaribles();		
		vd.dispInstanceVariable();
		System.out.println("==========main End=================");

	}
	
	
	public void dispInstanceVariable(){
		
		System.out.println("==========dispInstanceVariable Begin=================");

		System.out.println("Instance variable id "+id);
		
		System.out.println("Instance variable name "+name);
		
		System.out.println("==Static Varibale from method "+schoolName);
		System.out.println("==========dispInstanceVariable End=================");
	}
	
	public void displayVaribles(){		
		
		System.out.println("==========displayVaribles Begin=================");
		// local variables
		int i =100;
		int j = 200;
		
		System.out.println("I value "+i);
		
		System.out.println("J value "+j);
		
		System.out.println(i+j);
		
		System.out.println("Sum of ( i + j) "+ (i+j));
		
		System.out.println("Sum of  i + j "+ i+j);
		
		
		System.out.println("Instance variable id "+id);
		
		System.out.println("Instance variable name "+name);
		
		System.out.println("==Static Varibale from method "+schoolName);

		
		System.out.println("==========displayVaribles end=================");

	}

}
