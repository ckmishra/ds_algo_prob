package com.learning;
public class MinCoinCount {

	/**
	 * @param args
	 * @author mchandan
	 * Prob: Dynamic Programming to find Min no of Coin for given sum from set of coin denomination. 

	 */
	
	static int count(int []coinArray,int sum){
		
     int[] min=new int[sum+1];
     
     min[0]=0;//initlised with 0
     
   
     for(int i=1;i<=sum;i++)
     {
    	 min[i]=100; //Initilized with Larger No like infinity or anything.
    	
    	 for(int j=0;j<coinArray.length;j++)
    	 {
    		 if(coinArray[j] <= i && (min[i-coinArray[j]]+1 < min[i]))
    		 {
    	        min[i]=min[i-coinArray[j]]+1;    	
    		 }	 
     }
    	 
    	
     }
     
     if(min[sum]==100){
    	 return 0;
     }
     else
     return min[sum];
	}
     //Starting main
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []coinArray = {2,3,5,7};
		System.out.println(count(coinArray, 23));
		
	}

}

