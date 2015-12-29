package com.learning;

public class PrintCharWithCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Scanner s = new Scanner(System.in);
	
		char[] input =new char[20];

		String temp = "aaabbbbccd";
		for(int i=0; i<temp.length();i++){
			
			input[i]=temp.charAt(i);
		
		}
		int i=0;
		int j=0;

		while(i<input.length)
		{     		
			int count =0;
	
			while( j < input.length){
               
				if(input[j] != input[j+1]){
					 i=j;
					break;
				}
				else count++;
				
			}
			
			System.out.print(count+"\t");
		}

		
		
	}
	
	


}
