package com.jai.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalTraversalTest
{

	@Test
	void traverse()
	{
		int[][] matrix = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		List<Integer> expected = Arrays.asList(1,6,11,16,2,7,12,3,8,4);
		List<Integer> result = DiagonalTraversal.traverse(matrix);
		assertEquals(expected, result);
	}
}