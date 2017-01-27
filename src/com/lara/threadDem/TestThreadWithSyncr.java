package com.lara.threadDem;
class PrintDemoWithSyn {
	   public  void printCount(){
		   
	    try {
	    	synchronized(this){
	         for(int i = 5; i > 0; i--) {
	        	 System.out.println("Counter   ---   "+Thread.currentThread().getName()+"  -- "  + i );
	         }
	    	}
	     } catch (Exception e) {
	         System.out.println("Thread  interrupted.");
	     }
	   
	   }

	}

	class ThreadDemoWithSync extends Thread {
	   private Thread t;
	   private String threadName;
	   PrintDemoWithSyn  PD;

	   ThreadDemoWithSync( String name,  PrintDemoWithSyn pd){
	       threadName = name;
	       PD = pd;
	   }
	   public void run() {
	     /*synchronized(PD) {
	        PD.printCount();
	     }*/
		   PD.printCount();
	     System.out.println("Thread " +  threadName + " exiting.");
	   }

	   public void start ()
	   {
	      System.out.println("Starting " +  threadName );
	      if (t == null)
	      {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }

	}

	public class TestThreadWithSyncr {
	   public static void main(String args[]) {

	      PrintDemoWithSyn PD = new PrintDemoWithSyn();

	      ThreadDemoWithSync T1 = new ThreadDemoWithSync( "Thread - 1 ", PD );
	      ThreadDemoWithSync T2 = new ThreadDemoWithSync( "Thread - 2 ", PD );

	      T1.start();
	      T2.start();

	      // wait for threads to end
	      try {
	         T1.join();
	         T2.join();
	      } catch( Exception e) {
	         System.out.println("Interrupted");
	      }
	   }
	}