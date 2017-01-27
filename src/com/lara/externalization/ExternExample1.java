package com.lara.externalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternExample1 {
    public static void main(String args[]) {
	// create a Car object 
	Car1 car1 = new Car1("Mitsubishi", 2009);
	Car1 newCar1 = null;
	
	//serialize the car
	try {
	    FileOutputStream fo = new FileOutputStream("tmp1");
	    ObjectOutputStream so = new ObjectOutputStream(fo);
	    so.writeObject(car1);
	    so.flush();
	} catch (Exception e) {
	    System.out.println(e);
	    System.exit(1);
	}
	// de-serialize the Car
	try {
	    FileInputStream fi = new FileInputStream("tmp1");
	    ObjectInputStream si = new ObjectInputStream(fi);  	    
	    newCar1 = (Car1) si.readObject();
	}
	catch (Exception e) {
	    System.out.println(e);
	    System.exit(1);
	}
	/* 
	 * Print out the original and new car information
	 */
	System.out.println("The original car is ");
	System.out.println(car1);
	System.out.println("The new car is ");
      System.out.println(newCar1);
  }
}

