package com.dp.exercise;

public class FindingSquareCount {
	public static int findSquareCount(int num){
		int[] squareCount = new int[num];
		
		// base case
		squareCount[0]=0;
		squareCount[1]=1;
		squareCount[2]=2;
		squareCount[3]=3;
		
		for(int i =4 ; i<=num;i++){
			squareCount[i] = i;
			
			for(int j=1;j<=i;j++){
				int temp = j*j;
				if(temp > i)
					break;
				else{
					squareCount[i]=Math.min(squareCount[i],1+squareCount[i-temp]);
				}
			}
			
		}
		return squareCount[num];
	}
}
