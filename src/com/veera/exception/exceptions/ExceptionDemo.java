/**
 * 
 */
package com.javaclasses.exceptions;

import com.javaclasses.inheritance.Address;

/**
 * @author veeraravisingiri
 *
 */
public class ExceptionDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Address add = new Address(171, "Gandhi nagar", 524138, "India");
        int i = 10;
        int j = 10;
        int z = 0;

        try {
            int k = 0;
            System.out.println("Entered into TRY block");
            z = i / j;
            System.out.println("from try");
            System.out.println("Java classes");
        } catch (Exception e) {
            System.out.println("Welcome to catch block");
            System.out.println("JAVA CLASSES ");
            // j = 10;
            z = i * j;
            System.out.println("Z value " + z);

            add.displyAddress();
            // System.exit(0);

        } finally {
            System.out.println("I am from finally");
        }

        System.out.println("====OUT SIDE TRY-CATCH====");

    }

}
