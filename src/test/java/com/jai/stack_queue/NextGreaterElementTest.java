package com.jai.stack_queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElementTest
{
	@Test
	void testNextGreaterElement_basic()
	{
		int[] arr = {4, 5, 2, 25};
		int[] expected = {5, 25, 25, -1};
		assertArrayEquals(expected, NextGreaterElement.nextGreaterElement(arr));
	}

	@Test
	void testNextGreaterElement_allDescending()
	{
		int[] arr = {9, 7, 5, 3};
		int[] expected = {-1, -1, -1, -1};
		assertArrayEquals(expected, NextGreaterElement.nextGreaterElement(arr));
	}

	@Test
	void testNextGreaterElement_allSame()
	{
		int[] arr = {2, 2, 2, 2};
		int[] expected = {-1, -1, -1, -1};
		assertArrayEquals(expected, NextGreaterElement.nextGreaterElement(arr));
	}

	@Test
	void testNextGreaterElement_singleElement()
	{
		int[] arr = {10};
		int[] expected = {-1};
		assertArrayEquals(expected, NextGreaterElement.nextGreaterElement(arr));
	}

	@Test
	void testNextGreaterElement_empty()
	{
		int[] arr = {};
		int[] expected = {};
		assertArrayEquals(expected, NextGreaterElement.nextGreaterElement(arr));
	}
}

