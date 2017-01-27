package com.lara.threadDem;

public class CallingRunMathodDemo extends Thread {

    @Override
    public void run() {
        System.out.println("Name of child the thread " + Thread.currentThread().getName() + " Child Thread Priority "
                + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        System.out.println("Thread Name " + Thread.currentThread().getName() + "main Thread Priority "
                + Thread.currentThread().getPriority());
        CallingRunMathodDemo t1 = new CallingRunMathodDemo();
        t1.setName("Teju");
        t1.setPriority(6);
        // t1.start();
        t1.run();
    }
}
