package com.Chandan;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.learning.FindTriple;

@RunWith(Parameterized.class)
public class FindTripleTest {

	
	@Parameterized.Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{new String[]{"Chandan","Chandan"},false},
			{new String[]{"a","a","a","a"},true},
			{new String[]{},false},
			{new String[]{"a","b","c"},false}
			
		});	
	}
	
	private String[] inputArray;
	private boolean isTriple;
	
	public FindTripleTest(String [] input,boolean isTriple)
	{
		this.inputArray = input;
		this.isTriple = isTriple;
     }
	
	
	@Test
	public void testCheckTriple() {
		FindTriple<String> ft= new FindTriple<String>();
	   
		assertEquals(this.isTriple,ft.checkTriple(this.inputArray));
	
		
	}


	
}
