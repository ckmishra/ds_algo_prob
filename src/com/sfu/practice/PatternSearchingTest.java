package com.sfu.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class PatternSearchingTest {

	@Test
	public void test() {
		boolean result =PatternSearching.findPattern("abcdbcabdfe", "bcdc");
		assertTrue(result);
		 result =PatternSearching.findPattern("abcdbcabdfe", "bcd");
		assertTrue(result);
		
		result =PatternSearching.findPattern("abcfedgsfdaf", "abcdefg");
		assertTrue(result);
		result =PatternSearching.findPattern("cdsgsdgsa", "a");
		assertTrue(result);
		result =PatternSearching.findPattern("ccccccabbbbbbb", "abc");
		assertTrue(result);
		result =PatternSearching.findPattern("AAABABAA", "AAAB");
		assertTrue(result);
		result =PatternSearching.findPattern("AAABABAA", "AAABABAA");
		assertTrue(result);
		// negative test case
		result =PatternSearching.findPattern("AAABABAA", "AAABABAAKJ");
		assertFalse(result);
		result =PatternSearching.findPattern("AAABABAA", "cds");
		assertFalse(result);
	}

}
