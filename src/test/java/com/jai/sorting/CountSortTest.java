package com.jai.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountSortTest
{
	@Test
	void testCountSort_basic()
	{
		int[] arr = {4, 2, 2, 8, 3, 3, 1};
		int[] expected = {1, 2, 2, 3, 3, 4, 8};
		assertArrayEquals(expected, CountSort.countSort(arr));
	}

	@Test
	void testCountSort_withNegatives()
	{
		int[] arr = {-5, -10, 0, -3, 8, 5, -1, 10};
		int[] expected = {-10, -5, -3, -1, 0, 5, 8, 10};
		assertArrayEquals(expected, CountSort.countSort(arr));
	}

	@Test
	void testCountSort_empty()
	{
		int[] arr = {};
		int[] expected = {};
		assertArrayEquals(expected, CountSort.countSort(arr));
	}

	@Test
	void testCountSort_singleElement()
	{
		int[] arr = {42};
		int[] expected = {42};
		assertArrayEquals(expected, CountSort.countSort(arr));
	}

	@Test
	void testCountSort_allSame()
	{
		int[] arr = {7, 7, 7, 7};
		int[] expected = {7, 7, 7, 7};
		assertArrayEquals(expected, CountSort.countSort(arr));
	}
}

