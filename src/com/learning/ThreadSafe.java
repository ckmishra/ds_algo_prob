package com.learning;
public class ThreadSafe {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSafe2 ts2 = new ThreadSafe2();
		
		ts2.start();
		
		synchronized (ts2) {
		
			try {System.out.println("Waiting for TS2:");
		
			ts2.wait();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println("Comp :Total is ="+ts2.total);
		
	}
		
	}	
	
}
	
	class ThreadSafe2 extends Thread
	{   int total;
		public void run(){
		synchronized(this){
			total=0;
			for(int i=0;i<100;i++)
			{
				total+=i;
			}
		}
		notify();
		}
	}

