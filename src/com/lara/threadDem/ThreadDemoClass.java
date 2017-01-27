/**
 * 
 */
package com.lara.threadDem;

/**
 * @author KAMAKSHI THAYI
 *
 */
public class ThreadDemoClass extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++)
        {
            System.out.println(Thread.currentThread().getName() + "  I value " + i);

            System.out.println(Thread.currentThread().getState());
        }

        // Object
        // System.out.println("Name of Thread "+Thread.currentThread().getName());
    }

    /*
     * public void start() {
     * 
     * for(int i=0;i<10;i++) { System.out.println("VEERA");
     * System.out.println(Thread.currentThread().getName()+"  I value "+i); } }
     */

    /**
     * @param args
     */
    public static void main(String[] args) {
        ThreadDemoClass TDC = new ThreadDemoClass();
        ThreadDemoClass TDC1 = new ThreadDemoClass();
        ThreadDemoClass TDC2 = new ThreadDemoClass();
        ThreadDemoClass TDC3 = new ThreadDemoClass();
        ThreadDemoClass TDC4 = new ThreadDemoClass();
        System.out.println(TDC.getState());
        TDC.setName("RAMA");
        TDC.setPriority(10);

        TDC.start();

        System.out.println(TDC.getState());
        /*
         * TDC1.setName("VEERA"); TDC1.setPriority(8); TDC1.start();
         * TDC2.setName("RAVI"); TDC2.setPriority(6); TDC2.start();
         * TDC3.setName("KRISHNA"); TDC3.setPriority(5); TDC3.start();
         * TDC4.setName("SAI"); TDC4.setPriority(1); TDC4.start(); TDC.run();
         */}

}
