package com.learning;

import java.util.Scanner;


// Find Next Higher Number like 2436192 as output 2436219

public class NextHigherNum {

	
	private static Scanner in;

	public static void main(String[] args){
		
	in = new Scanner(System.in);
	
	Integer num = in.nextInt();
	String inputNum = num.toString();
	String s1 = new String();
    String s2 = new String();
    
    int size = inputNum.length()-1;
    
	while(size > 0)
    {
    	char temp = inputNum.charAt(size);
    	
    	for(int j = size-1 ; j >= 0;j--)
    	{
    		 
    	
    		if(inputNum.charAt(j) < temp)
    		{
    			
   
    			   s1 = inputNum.substring(j,size);
    			   s2 = inputNum.substring(0,j);
    			  
    			   System.out.print( "Before : "+ inputNum+"\t Next Higher No."+s2+temp+s1+"\t");
    			 
    		
    			System.exit(0);
    		}
    	}
    	
    	size --;
   
    }
	
   
	
	
}
	
	
	
}
