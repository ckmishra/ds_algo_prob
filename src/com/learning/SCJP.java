package com.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SCJP {

//	
//	public static void test(String str) {
//		 int check = 4;
//		 if (check==str.length()) {
//		 System.out.print(str.charAt(check -= 1) +", ");
//		 } else {
//		 System.out.print(str.charAt(0) + ", ");
//		 }
//		 }
//	
//	/**
//	 * @param args
//	 */
//	
	
	public static Iterator<?> reverse(List<?> list){
		Collections.reverse(list);
		return list.iterator();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Bar f = new Bar();
 f.addFive();
 Foo f1 = new Bar();
 
 System.out.println(f.a+""+f1.a);
 
 ArrayList<String> a = new ArrayList<String>();
 a.add("1");a.add("2");a.add("3");
	

	for (Object obj:a){
		System.out.println(obj);
	}
 }
}	
class Foo{
	public int a=3;
	public void addFive(){
		a+=5;
		System.out.println("a");
	}
}

class Bar extends Foo{
	public int a =8;
	public void addFive(){
		this.a+=5;System.out.println("b");
	}
	
	
}