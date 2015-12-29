package com.learning;

public class LargestSector {
	
	public static void main(String []args) {
		
		int input[][]=new int[6][6];
	
		for (int i=0;i<6;i++){
			for(int j=0;j<6;j++)
			input[i][j]=0;
		}
		input[0][0]=1;
		input[1][1]=1;
		input[0][1]=1;
		input[1][2]=1;
		input[2][2]=1;
		input[4][0]=1;
		input[4][1]=1;
		input[5][0]=1;
		input[4][4]=1;
		input[4][5]=1;
		input[5][4]=1;
		input[5][5]=1;
	}
	
	
	static void findLargestSector(int[][] input){
		
		for(int i=0;i<6;i++){
		
              for(int j=0;j<6;j++){

	if(input[i][j]==input[i][j+1]){
		
		
		
		
	}
				
             }
			
			
			
		}
		
		
	}
	
	

}
