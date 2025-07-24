package com.jai.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSelectTest
{
	@Test
	void testQuickSelectMiddleElement()
	{
		int[] arr = {7, 10, 4, 3, 20, 15};
		int k = 3;
		int result = QuickSelect.quickSelect(arr, 0, arr.length - 1, k);
		assertEquals(7, result, "The 3rd smallest element should be 7");
	}

	@Test
	void testQuickSelectFirstElement()
	{
		int[] arr = {7, 10, 4, 3, 20, 15};
		int k = 1;
		int result = QuickSelect.quickSelect(arr, 0, arr.length - 1, k);
		assertEquals(3, result, "The smallest element should be 3");
	}

	@Test
	void testQuickSelectLastElement()
	{
		int[] arr = {7, 10, 4, 3, 20, 15};
		int k = 6;
		int result = QuickSelect.quickSelect(arr, 0, arr.length - 1, k);
		assertEquals(20, result, "The largest element should be 20");
	}

	@Test
	void testQuickSelectSingleElement()
	{
		int[] arr = {42};
		int k = 1;
		int result = QuickSelect.quickSelect(arr, 0, arr.length - 1, k);
		assertEquals(42, result, "The only element should be 42");
	}

	@Test
	void testQuickSelectWithDuplicates()
	{
		int[] arr = {5, 3, 5, 2, 2, 8};
		int k = 4;
		int result = QuickSelect.quickSelect(arr, 0, arr.length - 1, k);
		assertEquals(5, result, "The 4th smallest element should be 5");
	}
}

