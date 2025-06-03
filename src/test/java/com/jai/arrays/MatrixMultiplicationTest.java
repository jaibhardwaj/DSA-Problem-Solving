package com.jai.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixMultiplicationTest
{

	@Test
	void multiplication()
	{
		int[][] arr1 = { {1, 2, 3}, {4, 5, 6} }, arr2 = { {7, 8, 9, 10}, {11, 12, 13, 14}, {15, 16, 17, 18} };
		final int[][] multiplication = MatrixMultiplication.multiplication(arr1, arr2);
		int[][] arr3 = { {74, 80, 86, 92}, {173, 188, 203, 218} };
		assertArrayEquals(arr3, multiplication);
	}
}