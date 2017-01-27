/**
 * 
 */
package com.lara.threadDem;

class Parent
{
    public void disp()
    {
        System.out.println("I am from Parent");
    }
}

/**
 * @author KAMAKSHI THAYI
 *
 */
public class ThreadDemoRunnable extends Parent implements Runnable {

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Main Thread " + Thread.currentThread().getName());

        ThreadDemoRunnable tr = new ThreadDemoRunnable();
        Thread t1 = new Thread(tr);

        t1.setName("Rama");
        t1.start();
        System.out.println(t1.isDaemon());
        /*
         * t1.setDaemon(true); System.out.println(t1.isDaemon());
         */
        // Thread.currentThread().stop();

        System.out.println("Status of Child thread " + t1.getState());
        System.out.println(t1.isAlive());

    }

    @Override
    public void run() {
        System.out.println("Child Thread " + Thread.currentThread().getName());
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("I value " + i);
            disp();
        }

    }

}
