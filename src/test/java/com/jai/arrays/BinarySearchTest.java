package com.jai.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest
{

	@Test
	void search()
	{
		int index = BinarySearch.search(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 0);
		assertEquals(0, index);
	}
}