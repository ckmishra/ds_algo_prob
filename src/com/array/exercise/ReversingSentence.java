package com.array.exercise;

public class ReversingSentence {

	public String reverseSentence(String inputString){
		char[] inputArray= inputString.toCharArray();
		int startWord=0;
		int endWord=0;
		int size=inputString.length();
		
		//Reversing Word
		while(startWord< size && endWord <=size){
			if(endWord==size||inputArray[endWord]==' '){
				reverse(inputArray, startWord, endWord);
				if(endWord!=size-1)
				{
					startWord=endWord+1;	
					endWord++;
				}
			}
			else
			{
				endWord++;
			}	
			
		}
		// Reversing Sentence
		if(endWord==size+1){
			reverse(inputArray, 0, endWord-1);
		}
		
		//Converting Array to String for output
		String output="";
		for (int i = 0; i < inputArray.length; i++) {
		output=output+inputArray[i];	
		}
		return output;
	}
	
	//Utility Function for reverse
	private void reverse (char[] input,int start,int end){
		for(int i= start;i<end;i++)
		{	char temp=input[i];
			input[i]=input[end-1];
			input[--end]=temp;
		}
		
	}
	
}
