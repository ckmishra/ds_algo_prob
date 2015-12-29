package com.learning;

 class Main {

	public static void  main(String []args) {
		MyThread mt = new MyThread();
		mt.run();
		System.out.println("Main Output");
		int A=0;
		System.out.println(A);
		
	}
	
}
