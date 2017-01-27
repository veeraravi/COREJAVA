package com.lara.threadDem;

public class JoinDemo extends Thread {

    public JoinDemo(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " ---- I value " + i);
        }
    }

    public static void main(String[] args) {

        System.out.println("******* MAIN ******* " + Thread.currentThread().getName());
        JoinDemo id = new JoinDemo("Thread 1");
        JoinDemo id2 = new JoinDemo("Thread 2");
        JoinDemo id3 = new JoinDemo("Thread 3");
        JoinDemo id4 = new JoinDemo("Thread 4");
        JoinDemo id5 = new JoinDemo("Thread 5");

        id.start();
        id3.start();
        id4.start();
        try {
            id.join();
            id3.join();
            id4.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        id2.start();
        id5.start();
        System.out.println("******* MAIN 2 ******* ");
        System.out.println("******* MAIN 3 ******* ");

    }

}
