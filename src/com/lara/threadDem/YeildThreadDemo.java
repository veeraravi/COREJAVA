package com.lara.threadDem;


public class YeildThreadDemo implements Runnable {

   Thread t;

   YeildThreadDemo(String str) {

   t = new Thread(this, str);
   // this will call run() function
   t.start();
   }

   public void run() {

   for (int i = 0; i < 5; i++) {
   // yields control to another thread every 5 iterations
   if ((i % 5) == 0) {
   System.out.println(Thread.currentThread().getName() + " yielding control...");
               
   /* causes the currently executing thread object to temporarily 
   pause and allow other threads to execute */
   Thread.yield();
   }
   }

   System.out.println(Thread.currentThread().getName() + " has finished executing.");
   }

   public static void main(String[] args) {
   new YeildThreadDemo("Thread 1");
   new YeildThreadDemo("Thread 2");
   new YeildThreadDemo("Thread 3");
   }
} 
