package com.learning;

public class AdjecentEleDiffer {

	public static int iterateSequence(int[] inputArr,int N){
		
		for(int j=0;j<N;j++){
		for (int i = 1; i < inputArr.length-j; i++) {
			
			inputArr[i-1]=inputArr[i]-inputArr[i-1];
			
			}
		}	
		int sum=0;
		for (int i = 0; i < inputArr.length-N; i++) {
		sum+=inputArr[i];	
		System.out.print(inputArr[i]+" ");
		}
		
		return sum;
	}
	

}
