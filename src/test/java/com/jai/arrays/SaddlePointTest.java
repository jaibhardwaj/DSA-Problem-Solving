package com.jai.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaddlePointTest
{

	@Test
	void saddlePoint()
	{
		int[][] matrix = {
				{1,  2,  3},
				{4,  5,  6},
				{7,  8, 9}
		};

		final int r = SaddlePoint.saddlePoint(matrix);
		assertEquals(7, r);
	}
}