package com.array.exercise;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReversingSentenceTest {

	ReversingSentence rs = new ReversingSentence();
	@Test
	public void test1() {
		assertEquals("Chandan Mishra", rs.reverseSentence("Mishra Chandan"));
		assertEquals("Kumar Chandan Mishra", rs.reverseSentence("Mishra Chandan Kumar"));
		assertEquals("Chandan Kumar Mishra", rs.reverseSentence("Mishra Kumar Chandan"));
		assertEquals("Chandan Mishra Kumar", rs.reverseSentence("Kumar Mishra Chandan"));
		assertEquals("Chandan Mishra Chandan", rs.reverseSentence("Chandan Mishra Chandan"));
		assertEquals("Mishra Kumar Chandan", rs.reverseSentence("Chandan Kumar Mishra"));
	}

}
