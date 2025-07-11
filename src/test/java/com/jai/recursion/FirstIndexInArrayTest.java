package com.jai.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the FirstIndexInArray class.
 */
class FirstIndexInArrayTest
{

	/**
	 * Test finding the first index of an element present in the array.
	 */
	@Test
	void testFindFirstIndex_ElementPresent()
	{
		int[] arr = {5, 3, 7, 3, 9};
		assertEquals(1, FirstIndexInArray.findFirstIndex(arr, 3, 0));
	}

	/**
	 * Test finding the first index when the element is not present.
	 */
	@Test
	void testFindFirstIndex_ElementNotPresent()
	{
		int[] arr = {5, 3, 7, 3, 9};
		assertEquals(-1, FirstIndexInArray.findFirstIndex(arr, 8, 0));
	}

	/**
	 * Test with an empty array.
	 */
	@Test
	void testFindFirstIndex_EmptyArray()
	{
		int[] arr = {};
		assertEquals(-1, FirstIndexInArray.findFirstIndex(arr, 3, 0));
	}

	/**
	 * Test when the element is at the first index.
	 */
	@Test
	void testFindFirstIndex_AtFirstIndex()
	{
		int[] arr = {4, 2, 3, 4};
		assertEquals(0, FirstIndexInArray.findFirstIndex(arr, 4, 0));
	}

	/**
	 * Test when the element is at the last index.
	 */
	@Test
	void testFindFirstIndex_AtLastIndex()
	{
		int[] arr = {1, 2, 3, 4};
		assertEquals(3, FirstIndexInArray.findFirstIndex(arr, 4, 0));
	}

	/**
	 * Test finding the first index using the optimized function when the element is present.
	 */
	@Test
	void testFindFirstIndexOptimized_ElementPresent()
	{
		int[] arr = {5, 3, 7, 3, 9};
		assertEquals(1, FirstIndexInArray.findFirstIndexOptimized(arr, 3, 0));
	}

	/**
	 * Test finding the first index using the optimized function when the element is not present.
	 */
	@Test
	void testFindFirstIndexOptimized_ElementNotPresent()
	{
		int[] arr = {5, 3, 7, 3, 9};
		assertEquals(-1, FirstIndexInArray.findFirstIndexOptimized(arr, 8, 0));
	}

	/**
	 * Test with an empty array using the optimized function.
	 */
	@Test
	void testFindFirstIndexOptimized_EmptyArray()
	{
		int[] arr = {};
		assertEquals(-1, FirstIndexInArray.findFirstIndexOptimized(arr, 3, 0));
	}

	/**
	 * Test when the element is at the first index using the optimized function.
	 */
	@Test
	void testFindFirstIndexOptimized_AtFirstIndex()
	{
		int[] arr = {4, 2, 3, 4};
		assertEquals(0, FirstIndexInArray.findFirstIndexOptimized(arr, 4, 0));
	}

	/**
	 * Test when the element is at the last index using the optimized function.
	 */
	@Test
	void testFindFirstIndexOptimized_AtLastIndex()
	{
		int[] arr = {1, 2, 3, 4};
		assertEquals(3, FirstIndexInArray.findFirstIndexOptimized(arr, 4, 0));
	}
}
