package com.veera.blocks;

public class IIBSIBDemo {
	
	int id;
	String name;
	
	static String School;

	/**
	 * 
	 */
	public IIBSIBDemo() {
		System.out.println("CONSTRUCTOR no args");
	}

	/**
	 * @param id
	 * @param name
	 */
	public IIBSIBDemo(int id, String name) {
		System.out.println("CONSTRUCTOR two args");

		this.id = id;
		this.name = name;
	}

	//IIB
	{
		System.out.println("FROM IIB ");
		
		if(this.id == 0){
			this.id = 100;
		}
		if(this.name == null){
			this.name = "HADOOP";
		}
	}
	//SIB
	static{
		System.out.println("FROM SIB ");
		
		School="BIGDATA SOLUTIONS";
	}

	public void print(){
		System.out.println("=====================");
		System.out.println("ID "+id);
		System.out.println("NAME "+name);
		System.out.println("SCHOOL NAME "+School);
		
	}

	public static void main(String[] args) {
		System.out.println("MAIN");
		
		IIBSIBDemo id = new IIBSIBDemo();
		
		id.print();
		
		IIBSIBDemo id2 = new IIBSIBDemo(1000,"SPARK");
		
		id2.print();

	}

}
