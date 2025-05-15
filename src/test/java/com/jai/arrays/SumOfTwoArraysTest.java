package com.jai.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SumOfTwoArraysTest
{

	@Test
	void addition()
	{
		int[] arr1 = {1};
		int[] arr2 = {2, 3, 4, 5, 6};
		final int[] addition = SumOfTwoArrays.addition(arr1, arr2);
		assertArrayEquals(new int[]{3, 3, 4, 5, 6}, addition);

		int[] arr3 = null;
		int[] arr4 = {2, 3, 4, 5, 6};
		final int[] addition2 = SumOfTwoArrays.addition(arr3, arr4);
		assertNull(addition2);

		int[] arr5 = {};
		int[] arr6 = {2, 3, 4, 5, 6};
		final int[] addition3 = SumOfTwoArrays.addition(arr5, arr6);
		assertArrayEquals(new int[]{2, 3, 4, 5, 6}, addition3);
	}
}