/**
 * 
 */
package com.lara.threadDem;

/**
 * @author KAMAKSHI THAYI
 *
 */
public class WaitThreadDemo extends Thread {
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++)
		{
			try{
				wait();
			}catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(Thread.currentThread().getName()+" ---- I value "+i);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WaitThreadDemo jtd1 = new WaitThreadDemo();
		WaitThreadDemo jtd2 = new WaitThreadDemo();
		WaitThreadDemo jtd3 = new WaitThreadDemo();
		
		jtd1.setName("ONE");
		jtd2.setName("TWO");
		jtd3.setName("THREE");
		
		jtd1.start();
		//System.out.println(" 1 "+jtd1.isAlive());
		//wait(100);
		try {
			jtd1.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jtd1.suspend();
		jtd2.start();
		jtd3.start();
		jtd1.resume();
		jtd1.getId();
		System.out.println(jtd1.getId());
		System.out.println(jtd2.getId());
		System.out.println(jtd3.getId());
	}

}
