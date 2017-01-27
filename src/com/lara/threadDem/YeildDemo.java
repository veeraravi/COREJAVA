/**
 * 
 */
package com.lara.threadDem;

/**
 * @author KAMAKSHI THAYI
 *
 */
public class YeildDemo extends Thread {

    private Thread t;
    private String threadName;

    public YeildDemo(String name) {
        threadName = name;
    }

    public void display()
    {
        try {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 5; i++)
            {
                if (i == 2)
                {
                    yield();
                }
                System.out.println(Thread.currentThread().getName() + " -- " + i);
            }
        } catch (Exception e) {
        }

    }

    @Override
    public void run() {
        display();
    }

    public void start()
    {
        System.out.println("Starting " + threadName);
        if (t == null)
        {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        YeildDemo yd1 = new YeildDemo("Thread 1");
        YeildDemo yd2 = new YeildDemo("Thread 2");
        YeildDemo yd3 = new YeildDemo("Thread 3");

        yd1.setPriority(MIN_PRIORITY);
        yd2.setPriority(NORM_PRIORITY);
        yd3.setPriority(MAX_PRIORITY);

        yd1.start();
        yield();
        yd2.start();
        yd3.start();

        // yd.yield();
    }

}
