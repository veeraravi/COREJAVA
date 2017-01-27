package com.veera.example;

class Bike{
	int speed =100;
	public void run(){
		System.out.println("I am from BIKE");
	}
}
class Passion extends Bike{
	
	public void run(){
		int speed =120;
		System.out.println("I am from PASSION BIKE"+speed);
	}
}

public class PloymorphismDemo {

	public static void main(String[] args) {
		int speed =130;
		
		Bike b = new Passion();
		b.run();//child method
		System.out.println("Speed "+b.speed);
		
	}

}
