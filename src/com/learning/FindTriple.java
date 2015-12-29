package com.learning;


public class FindTriple<T> {
 

	
	public boolean checkTriple(T[] input)
	{
	
		for( int i=0 ;i< input.length;i++)
		{
			if(i !=0 && i!=1)
			{ 
				if(input[i-1]==input[i] && input[i-2]==input[i])
				{
					return true;
				}
				
			}
		
		}
		
		return false;
	}
	
}
