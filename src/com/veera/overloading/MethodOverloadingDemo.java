package com.veera.overloading;

public class MethodOverloadingDemo {
	
	public void add(){
		add(100);
		System.out.println("I am from no arg add with void");
	}
	

	public void add(double j){
		System.out.println("I am from one arg add with double");
	}
	
	public int add(int i){
		add(20.00);
		System.out.println("I am from one arg add with int");
		return 10;
	}
	
	public int add(float i,int j){
		System.out.println("I am from two arg add with float int");
		return 10;
	}
	
	public double add(int j,float i){
		System.out.println("I am from two arg add with int float");
		return 10.00;
	}
	
	
	public int add(int i,int j){
		System.out.println("I am from two arg add with int");
		return i+j;
	}
	
	public long add(long i,long j){
		System.out.println("I am from two arg add with long");
		return i+j;
	}
	
	
	public static void main(String[] args) {
		
		MethodOverloadingDemo mod = new MethodOverloadingDemo();
		
		mod.add(20l, 200l);

	}

}
