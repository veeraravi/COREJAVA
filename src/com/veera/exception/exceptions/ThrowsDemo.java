package com.javaclasses.exceptions;


public class ThrowsDemo {

    public void checkArithematicExpression() throws ArithmeticException {

        int i = 10, j = 0;

        int result = i / j;
        // throw new IOException("device error");// checked exception
    }

    public void display() throws ArithmeticException
    {
        checkArithematicExpression();
    }

    public static void main(String[] args) {

        ThrowsDemo td = new ThrowsDemo();
        /*
         * try { td.checkArithematicExpression(); } catch (ArithmeticException
         * ae) { ae.printStackTrace(); }
         */

        // td.checkArithematicExpression();

        try {
            td.checkArithematicExpression();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
