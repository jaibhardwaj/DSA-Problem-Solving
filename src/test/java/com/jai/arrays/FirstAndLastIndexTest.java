package com.jai.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastIndexTest
{

	@Test
	void firstAndLastIndexTest()
	{
		int[] arr = {10, 20, 20, 20, 50, 60, 60, 60, 70, 80};
		final int firstIndex = FirstAndLastIndex.firstIndex(arr, 20);
		assertEquals(1, firstIndex);
		final int lastIndex = FirstAndLastIndex.lastIndex(arr, 20);
		assertEquals(3, lastIndex);
	}
}