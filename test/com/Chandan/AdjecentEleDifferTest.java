package com.Chandan;

import static org.junit.Assert.*;

import org.junit.Test;

import com.learning.AdjecentEleDiffer;

public class AdjecentEleDifferTest {

	@Test
	public void testIterateSequence() {
		assertEquals(0,AdjecentEleDiffer.iterateSequence(new int[]{1,3,5}, 2));
		assertEquals(2,AdjecentEleDiffer.iterateSequence(new int[]{2,3,1,2,1,6},4));

	}

}
