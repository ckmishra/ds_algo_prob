package com.array.exercise;


import java.util.Arrays;

public class FindPair {
	
	public static void  getPairHavingSum(int[] inputArray,int k){
		Arrays.sort(inputArray);
		int i=0;
		int j=inputArray.length-1;
		
		while(j > 0 && i < j){
			
			if(inputArray[i]+inputArray[j]==k){	
				break;
			}

			else if(inputArray[i] + inputArray[j] > k){	
				j--;
				
			}
			
			else{
				
				i++;
			  }
			}
		if(i==j)
		{
			System.out.println("No Pair Having given Sum");
		}
		
		else{		
			System.out.println(inputArray[i]);	
			System.out.println(inputArray[j]);
		}
	}
	
	public static void getPairHavingDiff(int[] inputArray,int k){
	Arrays.sort(inputArray);
	int i=0;
	int j=1;
	while(j<inputArray.length && i < j){
		if(inputArray[j]-inputArray[i]==k){
			
			break;
		}

		else if(inputArray[j]-inputArray[i] < k){
			j++;
		}
		else{
			i++;
		}
	}
	if(j==i)
		{
		System.out.println("No Pair Having given Difference");
		}
	
	else{		
		System.out.println(inputArray[i]);	
		System.out.println(inputArray[j]);
		}
	}
	
	public static void findSubarray(int[] inputArray,int sum){
		
		
   	}
	
	public static void main(String []args){
		
		int[] input = new int[]{2,4,3,5,15,18,20};
		
		System.out.println("Pair With Given Diff:");
		getPairHavingDiff(input,6);
		System.out.println("Pair with Given Sum :");
		getPairHavingSum(input,32);
	}

}
