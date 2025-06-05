package com.jai.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateMatrixTest
{

	@Test
	void rotate()
	{
		int[][] matrix = {
				{1,  2,  3,  4},
				{5,  6,  7,  8},
				{9,  10, 11, 12},
				{13, 14, 15, 16}
		};
		int[][] result = {
				{13, 9,  5, 1},
				{14, 10, 6, 2},
				{15, 11, 7, 3},
				{16, 12, 8, 4}
		};
		final int[][] r = RotateMatrix.rotate(matrix);
		assertArrayEquals(result, r);
	}
}