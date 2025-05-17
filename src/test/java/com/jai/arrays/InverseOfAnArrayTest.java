package com.jai.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InverseOfAnArrayTest
{

	@Test
	void inverse()
	{
		int[] arr = InverseOfAnArray.inverse(new int[]{3, 4, 1, 2, 0});
		assertArrayEquals(new int[]{4, 2, 3, 0, 1}, arr);
	}
}