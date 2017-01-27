/**
 * 
 */
package com.lara.threadDem;

/**
 * @author KAMAKSHI THAYI
 *
 */
public class ThreadGroupDemo extends Thread {

    public ThreadGroupDemo(String string, ThreadGroup tg1) {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        ThreadGroup tg1 = new ThreadGroup("ReadingThreads");

        ThreadGroupDemo tgd = new ThreadGroupDemo("Teju", tg1);
    }

}
