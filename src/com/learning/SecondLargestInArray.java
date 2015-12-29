package com.learning;

import java.util.Scanner;

public class SecondLargestInArray {

	private static Scanner in;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		in = new Scanner(System.in);
		int n = in.nextInt();

		int input[] = new int[n];
		
		for(int i=0 ; i<n ;i++){
			
			input[i] = in.nextInt();
			
		}
		
		sorting(input, n);
		
		
		
	}
	
	static void sorting(int arr[],int n){
		
		int temp;
		
		for(int i=0; i<n; i++){
			
			for(int j=i;j<n;j++){
				
			
			if(arr[i] > arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				 
			}
			
		 }
		
	 }
		
		int count=0;
		for(int i=0; i<n; i++){
			
			System.out.println(arr[i]);
			
			if(arr[i]==arr[0]){
				count++;
			}
			
			
		}
		System.out.println("Second smallest Elemnt is" );
		System.out.println(arr[count]);
		
}	

}
