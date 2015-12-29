package com.learning;

class MyRunnable implements Runnable{
	StringBuffer str; 
	public MyRunnable(StringBuffer s){
		str=s;
	}
	public  void run(){
		
		 synchronized (str) {
		for (int i =0;i<10;i++){
			System.out.print(Thread.currentThread().getName()+"-"+str+"\t");
		
     }
		System.out.print("\n");
		Character c= str.charAt(0);
		c++;
		str.delete(0, 1).append(c);
	}
	}
}

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	  StringBuffer sb= new StringBuffer("A");
      MyRunnable mr = new MyRunnable(sb);
	  
      Thread t1 = new Thread(mr);
      Thread t2 = new Thread(mr);
      Thread t3 = new Thread(mr);

      t1.setName("Tom");
      t2.setName("Dick");
      t3.setName("Harry");

      t1.start();
	  //t1.join();
	  t2.start();
	  //t1.run();
	  t3.start();  
	}

}
