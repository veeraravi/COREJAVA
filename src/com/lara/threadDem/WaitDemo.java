/**
 * 
 */
package com.lara.threadDem;

/**
 * @author KAMAKSHI THAYI
 * 
 */
class Customer {
    int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw...");

        if (this.amount < amount) {

            System.out.println("Less balance; waiting for deposit...");
            try {
                Thread.sleep(10000);
                wait();
            } catch (Exception e) {
            }
        }
        this.amount -= amount;
        System.out.println("withdraw completed...");
        disp();
    }

    synchronized void deposit(int amount) throws InterruptedException {
        System.out.println("going to deposit...");
        this.amount += amount;
        Thread.sleep(1000);
        System.out.println("deposit completed... ");
        notify();
    }

    public synchronized void disp()
    {
        System.out.println("TEJU");
    }
}

class WaitDemo {
    public static void main(String args[]) {

        final Customer c = new Customer();

        new Thread() {
            public void run() {
                c.withdraw(15000);
            }
        }.start();

        // Thread t1 = new Thread();
        // t1.start();

        new Thread() {
            public void run() {
                try {
                    c.deposit(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }
}
