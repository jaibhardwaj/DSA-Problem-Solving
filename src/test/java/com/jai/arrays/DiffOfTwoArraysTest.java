package com.jai.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiffOfTwoArraysTest
{

	@Test
	void subtraction()
	{
		int[] arr1 = {9, 9, 9, 9};
		int[] arr2 = {3, 3, 3, 3, 3};
		final int[] sub = DiffOfTwoArrays.subtraction(arr1, arr2);
		assertArrayEquals(new int[]{2, 3, 3, 3, 4}, sub);

		int[] arr3 = {1};
		int[] arr4 = {1, 0, 0, 0};
		final int[] sub2 = DiffOfTwoArrays.subtraction(arr3, arr4);
		assertArrayEquals(new int[]{0, 9, 9, 9}, sub2);
	}
}