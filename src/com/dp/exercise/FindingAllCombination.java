package com.dp.exercise;

import java.util.Scanner;
import java.util.TreeSet;

public class FindingAllCombination {

	private static char getCharForNumber(int i) {
		return i > 0 && i < 27 ? ((char) (i + 64)) : '_';
	}

	private static TreeSet<String> prepareDParray(int[] number) {
		char[][] dpArray = new char[number.length][number.length];

		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number.length; j++) {
				dpArray[i][j] = '0';
				if (i == j) {
					int temp = (number[i]);
					dpArray[i][j] = getCharForNumber(temp);
				}
				if (j > i && j < i + 2) {
					int temp = (number[i] * 10 + number[j]);
					dpArray[i][j] = getCharForNumber(temp);
				}
			}
		}

		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number.length; j++) {
				System.out.print(dpArray[i][j] + " ");
			}
			System.out.println();
		}

		// storing result
		TreeSet<String> result = new TreeSet<>();
		String temp = "";
		for (int i = 0; i < number.length; i++) {
			temp = temp + String.valueOf(dpArray[i][i]);
		}
		result.add(temp);

		int j = 0;
		temp = "";
		for (int i = 0; i < number.length - 1; i++) {
			j = i + 1;
			temp = String.valueOf(dpArray[i][j]);
			for (int k = 0; k < number.length; k++) {
				if (k != i && k > j)
					temp = temp + String.valueOf(dpArray[k][k]);
				if (k != i && k < j)
					temp = String.valueOf(dpArray[i - k - 1][i - k - 1]) + temp;
			}
			if (!temp.contains("_"))
				result.add(temp);
		}

		for (int i = 0; i < number.length; i++) {
			j = 0;
			temp = "";
			if (i > 0) {
				for (int m = 0; m < i; m++)
					temp = temp + String.valueOf(dpArray[m][m]);
			}
			for (int k = i; k < number.length; k += 2) {
				j = k + 1;
				if (j >= number.length || k >= number.length) {
					j = number.length - 1;
					k = number.length - 1;
				}
				temp = temp + String.valueOf(dpArray[k][j]);

				if (k != i && k > j)
					temp = temp + String.valueOf(dpArray[k][k]);
			}

			if (!temp.contains("_"))
				result.add(temp);
		}

		

		return result;
	}

	static void getMappingDp(String str) {
		int arr[] = new int[str.length()];
		long Dp[] = new long[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt("" + str.charAt(i));
		}

		Dp[0] = 1;
		if (arr[0] * 10 + arr[1] < 27)
			Dp[1] = 2;
		else
			Dp[1] = 1;

		for (int i = 2; i < arr.length; i++) {
			long combinedLast2didgits = 0;
			if (arr[i - 1] * 10 + arr[i] < 27)
				combinedLast2didgits = Dp[i - 2];
			Dp[i] = Dp[i - 1] + combinedLast2didgits;
		}
		System.out.println("Total mapping are:" + Dp[Dp.length - 1]);
	}

	public static void main(String[] args) {
		//int[] number = new int[] { 1, 2, 2, 1, 1 };
		//System.out.println(prepareDParray(number));
		//getMappingDp(String.valueOf("12211"));


        Scanner in = new Scanner(System.in);
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());
        
        StairCase(_n);
        
    
	}
	
	 static void StairCase(int n) {
	     String[][] array = new String[n][n];
	        
	        for(int i=0;i<n;i++){
	            for(int j=0;j<=i;j++){
	               array[i][n-1-j]="#";
	            }
	        }
	        
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	            	if(array[i][j]==null)
	            		array[i][j]=" ";
	                System.out.print(array[i][j]);
	            }
	            System.out.println();
	        }

	    }

}
