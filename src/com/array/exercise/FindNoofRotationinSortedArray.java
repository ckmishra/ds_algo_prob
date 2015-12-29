package com.array.exercise;

import java.util.ArrayList;

public class FindNoofRotationinSortedArray {
	
	public FindNoofRotationinSortedArray(){}
	
		public int findrthIteminRotatedArray(ArrayList<Integer> rotatedArray){
			
			int r=0;
			int length=rotatedArray.size();
			
			while( length > 2) {
				if(rotatedArray.get(r) >=rotatedArray.get(++r) && rotatedArray.get(r)<rotatedArray.get(++r))
				{
					break;
				}
				else{
					--r;
				}
				length--;
			}
			if(r==0)
				return r;
			else if(length==2)
				return r+1;
			else 
				return r-1;
				
		}

	
}
