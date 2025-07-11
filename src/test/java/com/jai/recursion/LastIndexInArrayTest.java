package com.jai.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the LastIndexInArray class.
 */
class LastIndexInArrayTest
{

	/**
	 * Test when the element is present multiple times.
	 */
	@Test
	void testLastIndex_ElementPresentMultipleTimes()
	{
		int[] arr = {1, 2, 3, 2, 4, 2, 5};
		assertEquals(5, LastIndexInArray.lastIndex(arr, 2, 0));
	}

	/**
	 * Test when the element is present only once.
	 */
	@Test
	void testLastIndex_ElementPresentOnce()
	{
		int[] arr = {1, 2, 3, 4, 5};
		assertEquals(2, LastIndexInArray.lastIndex(arr, 3, 0));
	}

	/**
	 * Test when the element is not present.
	 */
	@Test
	void testLastIndex_ElementNotPresent()
	{
		int[] arr = {1, 2, 3, 4, 5};
		assertEquals(-1, LastIndexInArray.lastIndex(arr, 9, 0));
	}

	/**
	 * Test with an empty array.
	 */
	@Test
	void testLastIndex_EmptyArray()
	{
		int[] arr = {};
		assertEquals(-1, LastIndexInArray.lastIndex(arr, 1, 0));
	}

	/**
	 * Test when the element is at the first index.
	 */
	@Test
	void testLastIndex_AtFirstIndex()
	{
		int[] arr = {7, 2, 3, 4, 5};
		assertEquals(0, LastIndexInArray.lastIndex(arr, 7, 0));
	}

	/**
	 * Test when the element is at the last index.
	 */
	@Test
	void testLastIndex_AtLastIndex()
	{
		int[] arr = {1, 2, 3, 4, 8};
		assertEquals(4, LastIndexInArray.lastIndex(arr, 8, 0));
	}
}

