package com.learning;

public class GetNoOfSteps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(getSteps(1137638148));
		
		
	}
	
	public static int getSteps(int N){
		
		
	int no_Steps=0;
	
	while(N>10)
	{	
		int temp=1;
		no_Steps++;
		while(N > 0)
		{
			 int rem=N%10;
			 N=N/10;
			 temp=temp*rem;
			 
			 if(temp==0){
				 return no_Steps;
			 }
			
		}
		N=temp;
	}	
	 	
		return no_Steps;
	}
	

}
