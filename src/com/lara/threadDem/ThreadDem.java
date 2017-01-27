/**
 * 
 */
package com.lara.threadDem;

/**
 * @author SR
 *
 */
public class ThreadDem
{
    public static void main(String[] args)
    {
        DispThread dt1 = new DispThread("Hello");
        DispThread dt2 = new DispThread("Wold");

        Thread t1 = new Thread(dt1);

        Thread t2 = new Thread(dt2);
        t1.setPriority(10);
        t2.setPriority(8);
        System.out.println("Is alive " + t1.isAlive());
        t1.stop();
        t1.start();
        t2.start();

        // t1.start();
        // t2.setPriority(Thread.MAX_PRIORITY);
        t1.run();
    }

}

class DispThread extends ThreadDem implements Runnable
{
    String message;

    @Override
    public void run() {

        for (int i = 0; i < 10; i++)
        {
            System.out.println(message);
        }
    }

    public DispThread(String m) {
        message = m;
    }
    /*
     * public void start() {
     * 
     * for(int i=0;i<10;i++) { System.out.println("VEERA"); } }
     */
}