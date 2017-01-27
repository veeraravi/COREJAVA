package com.veera.inheritance;

public class Parent {
	
	int id;
	String name;
	double asset;
	
	/**
	 * @param id
	 * @param name
	 * @param asset
	 */
	public Parent(int id, String name, double asset) {
		this.id = id;
		this.name = name;
		this.asset = asset;
	}


	
	/**
	 * @param id
	 * @param name
	 */
	public Parent(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * @param id
	 * @param name
	 * @param asset
	 */
	public Parent() {
		this.id = 0;
		this.name = "DEFAULT";
		this.asset = 0.0d;
	}

	
	
	public void disp(){
		System.out.println("Parent id "+id);
		System.out.println("Parent Name "+name);
		System.out.println("Parent Asset Value "+asset);
	}

	
	public double getAssest(){
		return asset;
	}
	
	public static void main(String[] args) {
Parent p = new Parent();
System.out.println("parent "+p);
	}

}
