/**
 * 
 */
package com.lara.threadDem;

/**
 * @author KAMAKSHI THAYI
 *
 */
public class DemoenThreadDemo extends Thread
{

    @Override
    public void run() {
        if (Thread.currentThread().isDaemon())
        {
            for (int i = 0; i < 10; i++)
            {
                System.out.println("Name of Thread " + Thread.currentThread().getId() + "#i == " + i);
            }
        }
        else
        {
            System.out.println("Name of Thread " + Thread.currentThread().getName() + "# I am not Deamon Thread");
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        DemoenThreadDemo dtd1 = new DemoenThreadDemo();
        DemoenThreadDemo dtd2 = new DemoenThreadDemo();
        DemoenThreadDemo dtd3 = new DemoenThreadDemo();
        dtd1.setDaemon(true);
        // dtd1.setName("RAMA");
        // dtd1.setPriority(MAX_PRIORITY); Rama my audio connection lost

        dtd2.setName("Veera");
        dtd2.setPriority(MIN_PRIORITY);
        dtd3.setName("Ravi");
        dtd3.setPriority(MAX_PRIORITY);

        dtd1.start();

        // dtd1.setName("KUSUSMA");
        dtd1.setPriority(MAX_PRIORITY);

        dtd2.start();
        dtd3.start();
        System.out.println(dtd1.getPriority());
        System.out.println(dtd2.getPriority());
        System.out.println(dtd3.getPriority());

    }

}
