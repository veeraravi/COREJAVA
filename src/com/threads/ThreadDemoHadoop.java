/**
 * 
 */
package com.threads;

/**
 * @author veeraravisingiri
 *
 */
public class ThreadDemoHadoop extends Thread {

    @Override
    public void run() {
        System.out.println("Entered into RUN method");
        for (int i = 0; i <= 5; i++) {
            // System.out.println("Thread name  " +
            // Thread.currentThread().getName());

            try {
                Thread.currentThread();
                Thread.sleep(500); // blocked state, (wait, waiting for lock,
                                   // suspend ) : its get moved from running
                                   // state to runnable
                System.out.println(Thread.currentThread().getName() + " I Value == " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void startMethod() {

        System.out.println("Entered into START method");
        for (int i = 0; i <= 5; i++) {
            // System.out.println("Thread name  " +
            // Thread.currentThread().getName());

            try {
                Thread.currentThread();
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + " I Value == " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Main " + Thread.currentThread().getName());

        ThreadDemoHadoop t1 = new ThreadDemoHadoop();// new born state
        ThreadDemoHadoop t2 = new ThreadDemoHadoop();

        t1.setName("Thread 1");
        t1.setPriority(10);
        t2.setName("Thread 2");
        t2.setPriority(1);

        t1.start(); // runnable/running
        t2.start();

        // t1.run();
        // t2.run();

        // t1.stop();// dead state
        // t1.start();

    }

}
