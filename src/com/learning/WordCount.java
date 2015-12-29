package com.learning;

import java.util.ArrayList;
import java.util.Scanner;


public class WordCount {

	private static Scanner in;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	    in = new Scanner(System.in);
		
		String s = in.nextLine();
	
	  int _length = s.length();
      int fact = fact(_length);
	 System.out.print(fact+"\t");
	 
	 char[] input=  s.toCharArray();
	 
	 java.util.Arrays.sort(input);
	 
	 String sorted =new String(input);
	
	 for(int i=0;i<sorted.length();)
	 {  
		    int counter=0;
	
			char c=sorted.charAt(i);

			//System.out.print(Character.valueOf(c)+ "\t"+Character.valueOf(sorted.charAt(++i)));
			int j=i;
			while(Character.valueOf(c)==Character.valueOf(sorted.charAt(j++)))
			{
				
				counter++;
			}
	
			
			System.out.print(Character.valueOf(c) +"\t"+ counter+"\t"); 
			i=i+counter;
	 }
	 System.out.print(sorted);
  }
  
 
	
static int fact(int n)
{
	 int fact =1;
	  for(int i=1;i<=n;i++) {
		 fact= fact *i;
	 }	
	  return fact;
}
	
	static ArrayList<Character>  findN(String str) { 
	    ArrayList<Character> _input = new ArrayList<Character>();
	    int len = str.length();

	    for (int i=0;i<len;i++) { 
	        _input.add(str.charAt(i));
	    }

	   return _input;
	    

	}

	
}
