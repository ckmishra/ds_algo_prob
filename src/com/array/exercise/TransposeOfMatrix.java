package com.array.exercise;

public class TransposeOfMatrix {

	//Transpose of symmetric Matrix
	public void transpose(int[][] inputMatrix){
		
		int row= inputMatrix[0].length;
		int col=row;
		
		for(int i =0;i<row;i++){
			for(int j=0;j<col;j++){
				if(i==j){
					continue;
				}
				if(j>i){
					int temp = inputMatrix[i][j];
					inputMatrix[i][j]=inputMatrix[j][i];
					inputMatrix[j][i] =temp;
					
				}
			}
		}
		
		
	}
	
	//Transpose of Nonsymmetric Matrix
	public void transposeNonSymmetric(int[][] inputMatrix,int r,int c){
		
		
		int row= r;
		int col=c;
		int size =row*col-1;
		int[] oneDArray= new int[size+1];
		int k=0;
		for(int i=0;i<row;i++){
			for(int j=0 ;j<col;j++){
				oneDArray[k++]=inputMatrix[i][j];	
			}
			
		}
		
		int i=1;
		int cycleBegin;
		int t;
		int next;
		int flag[]= new int[size+1];
		flag[0]=flag[size]=1;
		while(i<size){
			cycleBegin=i;
			t=oneDArray[i];
			do{
				next=(i*row) % size;
				int temp = oneDArray[next];
				oneDArray[next]=t;
				t=temp;
				flag[i]=1;
				i= next;
				
			}
			while(i!=cycleBegin);
			
			for(i=1;(flag[i]==1 && i<size);i++);
		}
 k=0;
 int[][] outputMatrix=new int[col][row];
		for( i=0;i<col;i++){
			for(int j=0 ;j<row;j++){
				outputMatrix[i][j]=	oneDArray[k++];
			}
			
		}
		printMatrix(outputMatrix, 5, 4);
	}

	
	private void printMatrix(int[][] inputMatrix,int row,int col){
		System.out.println("PRINTING MATRIX OF " +row + " ROW and "+col +" Column");
		for(int i=0;i<row;i++){
			for (int j = 0; j <col; j++) {
				System.out.print(inputMatrix[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String []args) {
		int[][] inputArray= new int[][]{{1,2,3,11},{4,5,6,12},{7,8,9,13},{6,4,3,1}};
		
		int[][] inputArray1= new int[][]{{1,2,3,1,5},{4,5,6,12,5},{7,8,9,13,3},{6,4,3,1,2}};
		
		
		TransposeOfMatrix tm = new TransposeOfMatrix();
		tm.transpose(inputArray);
		tm.printMatrix(inputArray, 4, 4);
		tm.transposeNonSymmetric(inputArray1, 4, 5);
		
	}
	
}
