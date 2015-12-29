package com.sfu.practice;

import java.util.HashMap;

public class PatternSearching {
	
	public static boolean findPattern(String input, String pattern){
		if(input.length()< pattern.length()){
			return false;
		}
		HashMap<Character, Integer> charchterCount = new HashMap<>();

		// populate character count array
		for(int i=0;i<pattern.length();i++){
			if(charchterCount.get(pattern.charAt(i))==null){
				charchterCount.put(pattern.charAt(i), 1);
			}else{
				charchterCount.put(pattern.charAt(i), charchterCount.get(pattern.charAt(i))+1);
			}
		}
		
		for(int j=0;j<input.length();j++){
			for(int k =j;k<j+pattern.length();k++){
				if(charchterCount.get(input.charAt(k))==null){
					break;
				}else{
						charchterCount.put(input.charAt(k), charchterCount.get(input.charAt(k))-1);
					}
				if (charchterCount.get(input.charAt(k))==0){
					charchterCount.remove(input.charAt(k));
				}
			}
			if (charchterCount.isEmpty()){
				return true;
			}
		}
		
		return false;
		
	}

}
