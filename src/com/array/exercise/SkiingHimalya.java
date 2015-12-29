package com.array.exercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class SkiingHimalya {
  
	private static BufferedWriter out;
	private static Scanner fileScanner;


	public  int findLongestRun(int[][] input) {
		// TODO Auto-generated method stub

		int row=input.length;
		int col=input[0].length;
		int lenArray[][]=new int[row][col];
	
		//initialising Length array to 0
		
		for(int i=0;i< row;++i){
			for (int j = 0; j < col;++ j) {
				lenArray[i][j]=0;
			}
		}
	
		 int largestLength = 0;
	        for(int i = 0; i < row; ++ i)
	                for(int j = 0; j < col; ++ j)
	                        largestLength = max(largestLength, DepthSearch(i, j,lenArray,input));

	    return largestLength;
	
	}
	
	private  int DepthSearch(int x, int y,int[][] lenArray,int[][] inputArray)
	{
	        
	        int sum=0;

	        if(lenArray[x][y]!=0)
	                return lenArray[x][y];

	        if(y-1 >= 0 && inputArray[x][y] > inputArray[x][y-1]) {
	                sum = max(DepthSearch(x, y-1,lenArray,inputArray), sum);
	        }

	        if(y+1 < inputArray[0].length && inputArray[x][y] > inputArray[x][y+1]) {
	                sum = max(DepthSearch(x, y+1,lenArray,inputArray), sum);
	        }

	        if(x+1 < inputArray.length && inputArray[x][y] > inputArray[x+1][y]) {
	                sum = max(DepthSearch(x+1, y,lenArray,inputArray), sum);
	        }

	        if(x-1 >= 0 && inputArray[x][y] > inputArray[x-1][y]) {
	                sum = max(DepthSearch(x-1, y,lenArray,inputArray), sum);
	        }
	       
	        lenArray[x][y] = sum +1;
	        return lenArray[x][y];
	}

	private  int max(int x, int y) {
		// TODO Auto-generated method stub
		
		return x > y ? x :y;
	}
	
	
	public static void main(String args[]) throws IOException{
		
		 SkiingHimalya sh= new SkiingHimalya();
		
		try {
			fileScanner = new Scanner(new File("C:\\Users\\Shivansh\\Downloads\\input.txt"));
		    int noOfTestcases = fileScanner.nextInt();
		   
		   out = new BufferedWriter(new FileWriter(""));
		    
		  
		  
		   int result;
		    
		  while( noOfTestcases >0){
		  
			  	String nameOfTestcase=fileScanner.next();
		    	int row =fileScanner.nextInt();
		    	int col=fileScanner.nextInt();
		    	int[][] input= new int[row][col];
		    	
		    	for(int i=0;i<row;i++)
		    		for (int j = 0; j < col; j++) {
						input[i][j]=fileScanner.nextInt();
					}
		    	
		    	
		        result = sh.findLongestRun(input);
		        
		        out.write(nameOfTestcase +":" + result+"\n");
		        out.newLine();
							                
		        noOfTestcases--;
		    	
		    }
		  
		    
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Input File not Found");
			e.printStackTrace();
		}
		
		
	}

}
