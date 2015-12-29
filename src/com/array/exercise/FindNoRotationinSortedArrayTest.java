package com.array.exercise;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class FindNoRotationinSortedArrayTest {
	FindNoofRotationinSortedArray frs= new FindNoofRotationinSortedArray();
	
	@Test
	public void test1() {
		ArrayList<Integer> input_1  = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			input_1.add(i);
		}
		
		assertEquals(0,frs.findrthIteminRotatedArray(input_1));
		
	}
	
	@Test
	public void test2(){
		ArrayList<Integer> input_2= new ArrayList<>();
		input_2.add(15);
		input_2.add(10);
		input_2.add(5);
		input_2.add(2);
		input_2.add(1);
		input_2.add(1);
		input_2.add(1);
		input_2.add(1);
		input_2.add(0);
		assertEquals(8,frs.findrthIteminRotatedArray(input_2));
	}
	
	@Test
	public void test3(){
		ArrayList<Integer> input_3= new ArrayList<>();
		input_3.add(15);
		input_3.add(10);
		input_3.add(5);
		input_3.add(5);
		input_3.add(5);
		input_3.add(1);
		input_3.add(2);
		input_3.add(2);
		input_3.add(2);
		input_3.add(2);
		input_3.add(2);
		assertEquals(5,frs.findrthIteminRotatedArray(input_3));
	}
	
	@Test
	public void test4(){
		ArrayList<Integer> input_3= new ArrayList<>();
		input_3.add(15);
		input_3.add(10);
		input_3.add(5);
		input_3.add(1);
		input_3.add(2);
		input_3.add(2);
		input_3.add(2);
		
		assertEquals(3,frs.findrthIteminRotatedArray(input_3));
	}
	
	@Test
	public void test5(){
		ArrayList<Integer> input_3= new ArrayList<>();
		input_3.add(15);
		input_3.add(10);
		input_3.add(5);
		input_3.add(1);
		input_3.add(2);
		input_3.add(2);
		input_3.add(2);
		
		assertEquals(3,frs.findrthIteminRotatedArray(input_3));
	}

}
