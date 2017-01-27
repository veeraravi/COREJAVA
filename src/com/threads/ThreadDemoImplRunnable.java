/**
 * 
 */
package com.threads;

/**
 * @author veeraravisingiri
 *
 */
public class ThreadDemoImplRunnable implements Runnable {

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        // System.out.println("Entered into run method");
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

        ThreadDemoImplRunnable tr = new ThreadDemoImplRunnable();
        Thread t1 = new Thread(tr);

        ThreadDemoImplRunnable tr2 = new ThreadDemoImplRunnable();
        Thread t2 = new Thread(tr2);

        t1.setName("Demo");
        t2.setName("Demo2");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();

    }

}
