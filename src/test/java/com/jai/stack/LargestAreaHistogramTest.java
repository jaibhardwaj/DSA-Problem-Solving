package com.jai.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestAreaHistogramTest
{
	@Test
	void testLargestRectangleArea_basic()
	{
		int[] arr = {6, 2, 5, 4, 5, 1, 6};
		int result = LargestAreaHistogram.largestRectangleArea(arr);
		assertEquals(12, result);
	}

	@Test
	void testLargestRectangleArea_singleBar()
	{
		int[] arr = {5};
		int result = LargestAreaHistogram.largestRectangleArea(arr);
		assertEquals(5, result);
	}

	@Test
	void testLargestRectangleArea_allSameHeight()
	{
		int[] arr = {3, 3, 3, 3};
		int result = LargestAreaHistogram.largestRectangleArea(arr);
		assertEquals(12, result);
	}

	@Test
	void testLargestRectangleArea_emptyArray()
	{
		int[] arr = {};
		int result = LargestAreaHistogram.largestRectangleArea(arr);
		assertEquals(0, result);
	}

	@Test
	void testLargestRectangleArea_decreasingHeights()
	{
		int[] arr = {5, 4, 3, 2, 1};
		int result = LargestAreaHistogram.largestRectangleArea(arr);
		assertEquals(9, result);
	}
}

