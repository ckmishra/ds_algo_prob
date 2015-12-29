package com.learning;

import java.util.HashMap;
import java.util.Scanner;

public class CharOccuranceInString {

	private static Scanner in;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Character, Integer>  hMap = new HashMap<Character, Integer>();
		
		in = new Scanner(System.in);
		
		String input = in.nextLine();
		
		
	for(int i =0;i < input.length();i++)
	{
		int count=1;
		char temp = input.charAt(i);
		
		if(hMap.get(temp)!=null)
		{
		  hMap.put(temp, hMap.get(temp).intValue()+1);	
		}
		else
		
		hMap.put(temp,count);
	
	}

	
// hMap.toString();
 System.out.println(hMap.toString());
		
	}

}
