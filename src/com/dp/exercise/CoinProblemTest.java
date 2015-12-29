package com.dp.exercise;

import org.junit.Assert;
import org.junit.Test;

public class CoinProblemTest {

	@Test
	public void testEmptyCoinsArray() {
		int[] input = new int[]{};
		int value =17;
		int result = CoinProblemByDp.findCoins(input, value);
		Assert.assertEquals(result, 0);
	}
	@Test
	public void testSimpleCase() {
		int[] input = new int[]{1,2,5,10};
		int value =17;
		int result = CoinProblemByDp.findCoins(input, value);
		Assert.assertEquals(3,result);
	}

}
