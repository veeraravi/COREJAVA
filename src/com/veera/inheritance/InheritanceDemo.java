package com.veera.inheritance;

//InheritanceDemo is child of Parent class

public class InheritanceDemo extends Parent{
	
	double asset;
	
	

	/**
	 * @param asset
	 */
	public InheritanceDemo(double asset) {
		super(101,"JAVA",3948466);
		//this();
		this.asset = asset;
	}

	/**
	 * @param asset
	 */
	public InheritanceDemo() {
		super();
	}

	public double totalAsset(){
		
		return this.asset+super.asset;
	}
	
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		Parent p1 = new Parent(100, "HADOOP");
		
		InheritanceDemo java = new InheritanceDemo(3243456);
		
		java.disp();
		
		System.out.println("My parent asset is "+java.getAssest());
		
		System.out.println("Total asset value "+java.totalAsset());

	}

}
