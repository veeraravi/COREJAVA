package com.lara.externalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternExample {
    public static void main(String args[]) {
        // create a Car object
        Car car = new Car("AUDI", 2009, 7777);
        Car newCar = null;

        // serialize the car
        try {
            FileOutputStream fo = new FileOutputStream("kusuma_external");
            ObjectOutputStream so = new ObjectOutputStream(fo);
            so.writeObject(car);
            so.flush();
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
        // de-serialize the Car
        try {
            FileInputStream fi = new FileInputStream("kusuma_external");
            ObjectInputStream si = new ObjectInputStream(fi);
            newCar = (Car) si.readObject();
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
        /*
         * Print out the original and new car information
         */
        System.out.println("The original car is ");
        System.out.println(car);
        System.out.println("The new car is ");
        System.out.println(newCar);
    }
}
