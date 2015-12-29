package com.learning;

import java.util.ArrayList;
import java.util.List;

public class ListTry {
	
	
	
	
	
	
	public static void main(String []args) {
		
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(25);
		myList.add(35);
		
		List<Integer> anoList =myList;
		//anoList.add("Hello mishra");
		for(Object o :anoList)
			System.out.println(o);
		
	}

}
