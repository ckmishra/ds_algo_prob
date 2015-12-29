package com.learning;

public class PrintInFibnocciSequence {

	public  static int[] printMethod(int[] inputArray){
		
		int[] counterArray = new int[]{0,0};
		
		// Reading input array and counting no of Zeros and ones and storing count in couterArray
		for(int i=0;i<inputArray.length;i++){
			
			if(inputArray[i]==0){
				counterArray[0]=counterArray[0]+1;
			}
			
			if(inputArray[i]==1)
			{
				counterArray[1]=counterArray[1]+1;
			}
		}
		
        System.out.println("inputArray :");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i]);
		}

		int indexCount=0;
     	int len = inputArray.length;
     	
        int oddEvenTracker=0;
       
    	while(indexCount < len){
		
		for(int i=0;i < fibonacci(oddEvenTracker+1);i++){
		
			if(oddEvenTracker%2==0 && counterArray[0] > 0){
		
			inputArray[indexCount++]=0;
			counterArray[0]--;
			}
			
			if(oddEvenTracker%2==1 &&  counterArray[1]>0){
		
				inputArray[indexCount++]=1;
				counterArray[1]--;

			}							
		}
		oddEvenTracker++;
	}
		
		
		System.out.println("\nAfter Operation");
		
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i]);
		}

		
		return inputArray;
		
	}

	private static int fibonacci(int n) {
		// TODO Auto-generated method stub
		int[] fibArray= new int[n+1];
		
		 fibArray[0]=1;
		 fibArray[1]=1;
		
		if(n>=2){
			
			for(int i=2;i<n;i++)
				fibArray[i]= fibArray[i-1] + fibArray[i-2];
			}
		
		 return fibArray[n-1];
		
	}
	
 public static void main(String args[]){
	 
	 System.out.println(fibonacci(6));
	 
	 printMethod(new int[]{0,0,0,1,1,1,0,0,1,0,0,1,1,0,0,1,1,1,1,0,0,1,0});
	 printMethod(new int[]{1,1,1,0,0});
 }
}
