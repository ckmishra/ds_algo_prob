package com.array.exercise;

import static org.junit.Assert.*;

import org.junit.Test;

public class SkiingHimalyaTest {

	@Test
	public void testFindLongestRun() {
		SkiingHimalya s= new SkiingHimalya();
     int a1[][]=new int [][]{{7,2,3,4,5},
    		 {36, 37 ,38,34 ,6 },
    		 {33 ,44,46,40, 7 },
    		 {24 ,43,42 ,41 ,8 },
    		 {35 ,32 ,47 ,30, 9}};
     assertEquals(14,s.findLongestRun(a1));
     int a2[][]= new int[][]{
    		 {56, 14 ,51, 58, 88 },
    		 {26 ,94 ,24 ,39 ,41 },
    		 {24 ,16 ,8 ,51, 51 },
    		 {76 ,72 ,77 ,43 ,10 },
    		 {38 ,50 ,59 ,84 ,81} ,
    		 {5 ,23 ,37 ,71, 77} ,
    		 {96 ,10 ,93 ,53 ,82 },
    		 {94 ,15 ,96 ,69, 9 },
    		 {74 ,0, 62 ,38 ,96 },
    		 {37 ,54 ,55 ,82, 38}
     };
     assertEquals(7,s.findLongestRun(a2));
     int a3[][]=new int [][]{
    		 {1, 2, 3, 4, 5 },
    		 {16 ,17 ,18 ,19 ,6 },
    		 {15, 24, 25, 20, 7 },
    		 {14 ,23 ,22 ,21 ,8 },
    		 {13, 12, 11, 10, 9} };
     assertEquals(25,s.findLongestRun(a3));
	
	
	}

}
