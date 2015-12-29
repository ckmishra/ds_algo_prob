package com.sfu.practice;

public class GenerateExcelSequence {
	public static String[] baseSequence = new String[] { "A", "B", "C", "D","E" };

	public static void generateSequence(int length) {
		if(length<=0){
			return;
		}
		
		int baseLength = baseSequence.length;
		int no_of_Iteration = length / baseSequence.length;
		int reminder = length % baseSequence.length;
		int iterationCount = no_of_Iteration;
		//output 
		String[] outputSequence = new String[length];
		int pointer=0;
		String getPrefix="";
		
		while(iterationCount > 0){
			for(int j=0;j<baseLength;j++) {
				outputSequence[pointer++]= getPrefix+baseSequence[j];
			}
			getPrefix= baseSequence[no_of_Iteration-iterationCount];
			iterationCount--;

		}
		
		// for handling reminder
		if(reminder !=0){
			if(no_of_Iteration!=0){
				getPrefix= baseSequence[no_of_Iteration-1];
			}
			for(int j=0;j<reminder;j++) {
				outputSequence[pointer++]= getPrefix+baseSequence[j];
			}
		}
		
		print(outputSequence);
		return;
	}
	
	// helper method to print array of String output
	private static void print(String[] output) {
		for(int i =0 ;i< output.length;i++){
			System.out.print(output[i]+" ");
		}
	}
}
