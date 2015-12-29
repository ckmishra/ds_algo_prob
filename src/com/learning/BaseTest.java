package com.learning;

public class BaseTest {

	 String s = "hello";
	
	public static void main(String... s){
		int a=5;
		boolean b1=true;
		boolean b2=false;
		if(a==4 && !b2){
			System.out.println(1);
		}	
		System.out.println(b2);
		if(b1 && (b2 = true))
			System.out.println(b2);
		
		
	}
	
}
