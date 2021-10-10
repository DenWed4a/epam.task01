package com.epam.uoa.logic;

import org.junit.Assert;
import org.junit.Test;

public class UnionLogicTest {

	@Test
	public void test() {
		
		int[] firstArray = { 1, 2, 3, 4, 5 };
		int[] secondArray = { 10, 20, 30, 40, 50, 60, 70 };
		int k = 2;
		int[] expectedArray = { 1, 2, 3, 10, 20, 30, 40, 50, 60, 70, 4, 5 };
		int[] realArray;
		realArray = UnionLogic.Union(firstArray, secondArray, k);
		Assert.assertArrayEquals(expectedArray, realArray);

	}

}
