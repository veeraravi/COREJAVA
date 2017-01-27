/**
 * 
 */
package com.lara.threadDem;

/**
 * @author KAMAKSHI THAYI
 *
 */
public class SleepDemo extends Thread {

    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            try {
                Thread.sleep(1000);// hold lock and go will go to sleep.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("I value " + i);
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        SleepDemo sd = new SleepDemo();
        SleepDemo sd1 = new SleepDemo();
        sd.start();
        System.out.println("ID " + sd.getId());
    }

}
