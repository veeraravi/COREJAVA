package com.threads;

class SampleThread extends Thread
{
    int age;
    String name;

    public SampleThread(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public synchronized void print()
    {
        System.out.println("Thread Name " + Thread.currentThread().getName());
        System.out.println("name " + name + " age " + age);

    }

    @Override
    public void run() {
        print();
    }
}

public class ThreadPriorityDemo {

    public static void main(String[] args) {
        SampleThread teja = new SampleThread(25, "Teja");
        SampleThread sri = new SampleThread(23, "sri");

        teja.setName("Teju");
        sri.setName("Sri");
        teja.setPriority(Thread.MAX_PRIORITY);
        sri.setPriority(Thread.NORM_PRIORITY);
        teja.start();
        sri.start();

    }
}
