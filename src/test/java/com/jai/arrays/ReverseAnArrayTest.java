package com.jai.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseAnArrayTest
{

	@Test
	void reverse()
	{
		int[] arr = ReverseAnArray.reverse(new int[]{1, 2, 3, 4, 5});
		assertArrayEquals(new int[]{5, 4, 3, 2, 1}, arr);

		int[] arr2 = ReverseAnArray.reverse(new int[]{1, 2, 3, 4});
		assertArrayEquals(new int[]{4, 3, 2, 1}, arr2);

		int[] arr3 = ReverseAnArray.reverse(new int[]{});
		assertNull(arr3);
	}
}