/**
 * 
 */
package com.javaclasses.exceptions;

/**
 * @author KAMAKSHI THAYI
 *
 */
public class ThrowDemo {

    public static void validate(int age) throws Exception
    {
        if (age < 18)
            throw new Exception("Not valid age to vote");
        else
            System.out.println("valid");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        ThrowDemo td = new ThrowDemo();

        // not handling here
        // validate(13);

        // handling the exception which is thrown by validate method
        try {
            validate(16);
        } catch (Exception e) {
            System.out.println("Print error message " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("TEJA JAVA ");
    }

}
