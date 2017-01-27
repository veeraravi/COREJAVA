package com.veera.example;


class ParentClass{
	public ParentClass() {
System.out.println("I am from parent no param");
	}
	
	public ParentClass(int i) {
		System.out.println("I am from parent one param "+i);
			}
}


public  class ThisDemo extends ParentClass{
	
	static class sample{
		
	}
	
	public ThisDemo() {
		//System.out.println("");
		this(100);
	//	super(1000);
		System.out.println("Im from no param");
	}
	
	public ThisDemo(int i){
		this(100,200);
		System.out.println("Im from one param "+i);

	}
	
	public ThisDemo(int i,int j){
		super(1000);
		System.out.println("Im from two param "+i+" "+j);

	}

	public static void main(String[] args) {

		
		ThisDemo td = new ThisDemo();
		//ThisDemo td1 = new ThisDemo(100);

		//ThisDemo td2 = new ThisDemo(100,200);

		
	}

}
