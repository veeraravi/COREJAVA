package com.veera.encapsulation;

class Person{
	
	private int id;
	private String name;
	private double income;
	
		
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Person ravi = new Person();
		
		//JDBC 
		
		ravi.setId(10001);
		ravi.setName("VEERARAVI");
		ravi.setIncome(10495834509098.66);
		
		EncapsulationTest et = new EncapsulationTest();
		et.getPerson(ravi);

	}

}
