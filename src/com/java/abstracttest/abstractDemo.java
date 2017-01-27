package com.java.abstracttest;

abstract class Bike{
	abstract public void run();
	
}


class PassionBike extends Bike{

	@Override
	public void run() {
		System.out.println("PASSION BIKE RUNNINGGGGGG....");
	
	}
}


class Pulsar extends Bike{

	@Override
	public void run() {
		System.out.println("PULSAR BIKE RUNNINGGGGGG....");
	
	}
}

 abstract class myBike extends Bike{

	
	
}

public class abstractDemo {

	public static void main(String[] args) {
		
		PassionBike pb = new PassionBike();
		pb.run();
		
		Pulsar p = new Pulsar();
		p.run();
	}

	
}
