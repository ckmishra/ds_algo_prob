package com.array.exercise;

import java.util.Arrays;
import java.util.Comparator;



class MyCompare implements Comparator<Integer>{
	
	
	public int compare(Integer i1,Integer i2){
		String x =Integer.toString(i1);
		String y =Integer.toString(i2);
		String xy= x.concat(y);
		String yx= y.concat(x);
		return Integer.valueOf(xy)-Integer.valueOf(yx) > 0 ? 0:1;
	 
	}
	
}
public class MakeBiggerNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
   
   Integer[] input = new Integer[]{546,54,60,77,548};
   
   	MyCompare mc = new MyCompare();

   	Arrays.sort(input,mc);
    
     for (int i = 0; i < input.length; i++) {
		System.out.print(input[i]);
	}
	}

}
