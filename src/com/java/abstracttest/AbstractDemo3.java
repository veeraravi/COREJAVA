package com.java.abstracttest;

public class AbstractDemo3 extends AbstractTest {

	public AbstractDemo3(int id, String name) {
		
		super(id, name);
	}

	@Override
	public void add() {
		System.out.println("=====ADD===============");
	}

	@Override
	public void sub() {
		System.out.println("=====SUB===============");

	}

	@Override
	public void mul() {
		System.out.println("=====MUL===============");

	}
	
	
	public void myMethod(){
		System.out.println("=====MYMETHOD===============");		
	}
	

	public static void main(String[] args) {
		
		AbstractDemo3 ad = new AbstractDemo3(100, "JAVA");
		
		ad.disp();
		 
		//System.out.println(ad.id);
		//System.out.println(ad.name);
		
		
		AbstractDemo3 ad2 = new AbstractDemo3(101, "HADOOP");
		
		ad2.disp();
		
		//ad2.print();
		

	}

}
