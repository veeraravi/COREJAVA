/**
 * 
 */
package com.lara.threadDem;

/**
 * @author KAMAKSHI THAYI
 *
 */
public class JoinThreadDemo extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++)
        {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " ---- I value " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        JoinThreadDemo jtd1 = new JoinThreadDemo();
        JoinThreadDemo jtd2 = new JoinThreadDemo();
        JoinThreadDemo jtd3 = new JoinThreadDemo();

        jtd1.setName("ONE");
        jtd2.setName("TWO");

        System.out.println("MAIN ");
        jtd1.start();
        jtd2.start();
        /*
         * try { jtd1.wait(1000); } catch (InterruptedException e1) { // TODO
         * Auto-generated catch block e1.printStackTrace(); }
         */

        try {
            jtd2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*
         * jtd2.start(); jtd3.start();
         */

        System.out.println("ID " + jtd2.getId());

    }

}
