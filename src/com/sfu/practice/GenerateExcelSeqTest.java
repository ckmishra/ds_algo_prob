package com.sfu.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenerateExcelSeqTest {

	@Test
	public void test() {
		GenerateExcelSequence.generateSequence(-1);
		GenerateExcelSequence.generateSequence(4);
		GenerateExcelSequence.generateSequence(5);
		GenerateExcelSequence.generateSequence(10);
		GenerateExcelSequence.generateSequence(22);
	}

}
