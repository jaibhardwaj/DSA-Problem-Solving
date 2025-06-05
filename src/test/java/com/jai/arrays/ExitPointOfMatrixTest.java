package com.jai.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExitPointOfMatrixTest
{

	@Test
	void exitPoint()
	{
		int[][] matrix = {
				{0, 0, 1, 0},
				{1, 0, 0, 1},
				{0, 0, 0, 1},
				{1, 0, 1, 0}
		};
		final int[] point = ExitPointOfMatrix.exitPoint(matrix);
		assertArrayEquals(new int[]{2, 0}, point);
	}
}