/**
 * 
 */
package com.javaclasses.exceptions;

/**
 * @author veeraravisingiri
 *
 */
public class MultipleCatchDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int i = 10;
        int j = 0;
        int z = 0;
        // String name = null;

        try {
            z = i / j;
            // z = name.length();
        } catch (ArithmeticException ae) {
            System.out.println("Divid by 0");

            System.out.println("Cause " + ae.getCause());
            System.out.println("Message " + ae.getMessage());
            System.out.println("locallized Message " + ae.getLocalizedMessage());
            System.out.println(" Class" + ae.getClass());
            System.out.println("Stack trace Message " + ae.getStackTrace());

            // System.out.println("locallized Message "+ae.getLocalizedMessage());
            ae.printStackTrace();

            try {

            } catch (Exception exc) {
                System.out.println();
            }
        } catch (NullPointerException ne) {
            System.out.println("Null value");
        } catch (Exception ex) {
            System.out.println("Exception occurred ");
        }

    }

}
