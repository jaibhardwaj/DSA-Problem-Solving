package com.jai.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the MaxOfAnArray class.
 */
class MaxOfAnArrayTest
{

	/**
	 * Test with a typical array of positive numbers.
	 */
	@Test
	void testFindMax_TypicalArray()
	{
		int[] arr = {22, 3, 4, 19, 7};
		assertEquals(22, MaxOfAnArray.findMax(arr, 0));
	}

	/**
	 * Test with an array containing negative numbers.
	 */
	@Test
	void testFindMax_NegativeNumbers()
	{
		int[] arr = {-5, -1, -10, -3};
		assertEquals(-1, MaxOfAnArray.findMax(arr, 0));
	}

	/**
	 * Test with a single-element array.
	 */
	@Test
	void testFindMax_SingleElement()
	{
		int[] arr = {42};
		assertEquals(42, MaxOfAnArray.findMax(arr, 0));
	}

	/**
	 * Test with an empty array. Should throw ArrayIndexOutOfBoundsException.
	 */
	@Test
	void testFindMax_EmptyArray()
	{
		int[] arr = {};
		// The method will throw an exception when index == arr.length - 1, which is -1 for empty array
		// So, calling with index 0 will immediately throw ArrayIndexOutOfBoundsException
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> MaxOfAnArray.findMax(arr, 0));
	}
}
