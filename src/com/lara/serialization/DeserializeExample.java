package com.lara.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeExample {
    public static void main(String[] args) {
        Student student = null;
        try {
            FileInputStream fileIn = new FileInputStream("Hadoop_serial2.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            student = (Student) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Student class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Student...");
        System.out.println("Name: " + student.name);
        System.out.println("Address: " + student.address);
        System.out.println("Roll no: " + student.rollno);
        System.out.println("Room No: " + student.roomNo);
        System.out.println("Last Name:  " + student.lastName);
    }
}