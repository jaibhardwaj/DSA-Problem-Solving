package com.jai.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for MergeTwoSortedArray class.
 */
class MergeTwoSortedArrayTest
{

	@Test
	void testMerge_BothNonEmpty()
	{
		int[] arr1 = {1, 3, 5};
		int[] arr2 = {2, 4, 6};
		int[] expected = {1, 2, 3, 4, 5, 6};
		assertArrayEquals(expected, MergeTwoSortedArray.merge(arr1, arr2));
	}

	@Test
	void testMerge_OneEmpty()
	{
		int[] arr1 = {};
		int[] arr2 = {2, 4, 6};
		int[] expected = {2, 4, 6};
		assertArrayEquals(expected, MergeTwoSortedArray.merge(arr1, arr2));
	}

	@Test
	void testMerge_BothEmpty()
	{
		int[] arr1 = {};
		int[] arr2 = {};
		int[] expected = {};
		assertArrayEquals(expected, MergeTwoSortedArray.merge(arr1, arr2));
	}

	@Test
	void testMerge_DuplicateElements()
	{
		int[] arr1 = {1, 2, 2};
		int[] arr2 = {2, 3};
		int[] expected = {1, 2, 2, 2, 3};
		assertArrayEquals(expected, MergeTwoSortedArray.merge(arr1, arr2));
	}

	@Test
	void testMerge_NegativeNumbers()
	{
		int[] arr1 = {-3, -1, 2};
		int[] arr2 = {-2, 0, 3};
		int[] expected = {-3, -2, -1, 0, 2, 3};
		assertArrayEquals(expected, MergeTwoSortedArray.merge(arr1, arr2));
	}
}

