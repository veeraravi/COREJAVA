/**
 * 
 */
package com.javaclasses.exceptions;

import java.io.IOException;

/**
 * @author KAMAKSHI THAYI
 *
 */
public class ThrowableDemo {

    public void checkAge(int age) throws IOException
    {
        if (age < 18)
            throw new ArithmeticException("Not valid");
        else {
            System.out.println("Welcome to vote");
        }

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        ThrowableDemo td = new ThrowableDemo();
        /*
         * try { td.checkAge(20); } catch (IOException e) { e.printStackTrace();
         * }
         */

        // td.checkAge(10);

        try {
            td.checkAge(10);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
