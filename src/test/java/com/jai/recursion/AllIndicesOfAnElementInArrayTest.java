package com.jai.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the AllIndicesOfAnElementInArray class.
 */
class AllIndicesOfAnElementInArrayTest
{

	/**
	 * Test when the target element appears multiple times.
	 */
	@Test
	void testFindAllIndices_MultipleOccurrences()
	{
		int[] arr = {1, 2, 3, 2, 4, 2, 5};
		int[] expected = {1, 3, 5};
		assertArrayEquals(expected, AllIndicesOfAnElementInArray.findAllIndices(arr, 2, 0, 0));
	}

	/**
	 * Test when the target element appears only once.
	 */
	@Test
	void testFindAllIndices_SingleOccurrence()
	{
		int[] arr = {1, 2, 3, 4, 5};
		int[] expected = {2};
		assertArrayEquals(expected, AllIndicesOfAnElementInArray.findAllIndices(arr, 3, 0, 0));
	}

	/**
	 * Test when the target element does not appear.
	 */
	@Test
	void testFindAllIndices_NoOccurrence()
	{
		int[] arr = {1, 2, 3, 4, 5};
		int[] expected = {};
		assertArrayEquals(expected, AllIndicesOfAnElementInArray.findAllIndices(arr, 9, 0, 0));
	}

	/**
	 * Test with an empty array.
	 */
	@Test
	void testFindAllIndices_EmptyArray()
	{
		int[] arr = {};
		int[] expected = {};
		assertArrayEquals(expected, AllIndicesOfAnElementInArray.findAllIndices(arr, 1, 0, 0));
	}

	/**
	 * Test when the target is at the first and last index.
	 */
	@Test
	void testFindAllIndices_AtFirstAndLastIndex()
	{
		int[] arr = {7, 2, 3, 4, 7};
		int[] expected = {0, 4};
		assertArrayEquals(expected, AllIndicesOfAnElementInArray.findAllIndices(arr, 7, 0, 0));
	}
}

