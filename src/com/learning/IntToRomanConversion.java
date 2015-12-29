package com.learning;

import java.util.Scanner;
import java.util.TreeMap;

public class IntToRomanConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num = new int[] { 1, 5, 4, 56, 90 };

		String[] output = converter(num);

		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

	// Method for converting Decimal to Roman

	static String[] converter(int[] input) {
		// Lookup for basic building blocks.
		TreeMap<Integer, String> basicElement = new TreeMap<Integer, String>();
		basicElement.put(1, "I");
		basicElement.put(4, "IV");
		basicElement.put(5, "V");
		basicElement.put(9, "IX");
		basicElement.put(10, "X");
		basicElement.put(40, "XL");
		basicElement.put(50, "L");
		basicElement.put(90, "XC");
		basicElement.put(100, "C");
		basicElement.put(400, "CD");
		basicElement.put(500, "D");
		basicElement.put(900, "CM");
		basicElement.put(1000, "M");
		// Output String array
		String[] result = new String[input.length];

		// logic 
		for (int i = 0; i < input.length; i++) {
			String s = "";
			while (input[i] > 0) {
				Integer lower = basicElement.floorKey(input[i]);
				s = s + basicElement.get(lower);
				input[i] = input[i] - lower;
			}
			result[i] = s;
		}
		return result;
	}
}