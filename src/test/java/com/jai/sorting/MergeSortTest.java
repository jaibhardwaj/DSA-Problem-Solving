package com.jai.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest
{
	@Test
	void testMergeSort_EmptyArray()
	{
		int[] input = {};
		int[] result = MergeSort.mergeSort(input, 0, 0);
		assertArrayEquals(new int[0], result);
	}

	@Test
	void testMergeSort_SingleElement()
	{
		int[] input = {5};
		int[] result = MergeSort.mergeSort(input, 0, 0);
		assertArrayEquals(new int[]{5}, result);
	}

	@Test
	void testMergeSort_SortedArray()
	{
		int[] input = {1, 2, 3, 4, 5};
		int[] result = MergeSort.mergeSort(input, 0, 4);
		assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
	}

	@Test
	void testMergeSort_UnsortedArray()
	{
		int[] input = {5, 3, 1, 4, 2};
		int[] result = MergeSort.mergeSort(input, 0, 4);
		assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
	}

	@Test
	void testMergeSort_DuplicateElements()
	{
		int[] input = {4, 2, 4, 2, 1};
		int[] result = MergeSort.mergeSort(input, 0, 4);
		assertArrayEquals(new int[]{1, 2, 2, 4, 4}, result);
	}

	@Test
	void testMergeSort_InvalidIndices()
	{
		int[] input = {1, 2, 3};
		assertThrows(IllegalArgumentException.class, () -> MergeSort.mergeSort(input, -1, 2));
		assertThrows(IllegalArgumentException.class, () -> MergeSort.mergeSort(input, 0, 3));
		assertThrows(IllegalArgumentException.class, () -> MergeSort.mergeSort(input, 2, 1));
	}
}

