package com.lara.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeExample {
    public static void main(String[] args) {
        Student ravi = new Student("VEERA", "NELLORE", 1012102, 7777, "Singiri");

        /*
         * e.name = "VEERA"; e.address = "NELLORE"; e.rollno = 1012102; e.roomNo
         * = 7; e.lastName = "Singiri";
         */
        try {
            System.out.println(ravi);
            FileOutputStream fileOut = new FileOutputStream("Hadoop_serial2.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(ravi);
            out.close();
            fileOut.close();
            System.out.println("Object is serialized & stored in 'hadoop_Serial.txt'");
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}