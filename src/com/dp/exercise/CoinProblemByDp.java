package com.dp.exercise;

public class CoinProblemByDp {

	public static int findCoins(int[] coinsArray, int V) {
		int size = coinsArray.length;
		if (size == 0) {
			return 0;
		}
		if (V <= 0) {
			System.out.println("Please Enter Valid Number");
		}

		// look up table for 
		int[] table = new int[V+1];

		// populating lookup table, base case
		table[0] = 0;
		int MAX_INTEGER=1000;
		for (int i = 1; i <= V; i++) {
			table[i] = MAX_INTEGER;
		}
		// logic to compute number of coins
		for(int i=1;i<=V;i++){
			for(int j=0;j<size;j++){
				if(coinsArray[j]<=i){
					int subResult = table[i-coinsArray[j]];
					if(subResult != MAX_INTEGER && subResult + 1 < table[i]){
						table[i]= subResult + 1;
					}
				}
			}
		}
		return table[V];
	}
}
