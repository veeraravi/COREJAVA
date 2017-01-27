package com.threads;

public class ThreadDemoClass extends Thread {

    public ThreadDemoClass(String name) {
        super(name);
    }

    public void run()
    {
        System.out.println("************* RUN METHOD ************* ");

        for (int i = 0; i <= 10; i++)
        {
            try {
                Thread.currentThread().sleep(1000);
                System.out.println("I value " + i + " ThreadName  " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {

        System.out.println(" MAIN  " + Thread.currentThread().getName());

        ThreadDemoClass t1 = new ThreadDemoClass("Thread1");
        ThreadDemoClass t2 = new ThreadDemoClass("Thread2");

        t1.setName("Teju");
        t2.setName("Sri");
        t1.setPriority(10);
        t2.setPriority(10);

        t1.start();
        t2.start();
        // t2.start();
        Thread.currentThread().stop();

        System.out.println("*************** MAIN END ******************" +
                Thread.currentThread().isAlive());

        System.out.println("*************** T1 END ******************" + t1.isAlive());

        System.out.println("*************** T2 END ******************" + t2.isAlive());

    }
}
