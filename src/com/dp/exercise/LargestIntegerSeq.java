package com.dp.exercise;

public class LargestIntegerSeq {

	/**
	 * @param args
	 */
	
	public static int findLIS(int[] input){
		
		int length=input.length;
		int[] lookUp = new int[length];
		int max=0;
		
		for(int i =0; i<length;i++){
			lookUp[i]=1;
		}
		for(int i=1;i<length;i++){
			for (int j = 0; j < i; j++) {
				if(input[i] > input[j] && lookUp[i] < lookUp[j]+1 )
					{
						lookUp[i] = lookUp[j]+1;
					}
			}
			
		}
		
		for( int i =0; i<length;i++){
		if(lookUp[i]!=1)
			System.out.print(input[i]+" ");
		}
		for( int i =0; i< length;i++){
			if(max < lookUp[i])
				max=lookUp[i];
		}
		
		
		return max;
		
	}
	
	public static void main(String[] args) {
		 int [] inputArray = new int[]{10,9,23,56,1,100};
		 
		 int result =findLIS(inputArray);
		  System.out.println("Largest Integer Sequence is ="+result);
		
		  
	}

}
