package com.veera.interfacedemo;


interface Shape{
	public void draw();
}

class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("I am CIRCLE");
	}
	
}


class Squre implements Shape{

	@Override
	public void draw() {
		System.out.println("I am SQURE");
	}
	
}

class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("I am Rectangle");
	}
	
}

class Triangle implements Shape{

	@Override
	public void draw() {
		System.out.println("I am Triangle");
	}
	
}

public class LooseCouplingUsingInterface {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.draw();
		
		Squre sq = new  Squre();
		sq.draw();
		
		Rectangle rc = new Rectangle();
		rc.draw();
		
		Triangle t = new Triangle();
		t.draw();
				
		//c =sq;
		
		Shape sh = new Circle();
		sh.draw();//I am CIRCLE
		
		sh = new Squre();
		
		sh.draw();
		
		Shape sc = new Circle();
		Shape ssq = new Squre();
		
		sc = ssq;
		sc.draw();
		
		
		
		
		
		
		
	}

}
