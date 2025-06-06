package com.jai.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchIn2DSortedMatrixTest
{

	@Test
	public void testValuePresentInMatrix()
	{
		int[][] matrix = {
				{1, 4, 7, 11},
				{2, 5, 8, 12},
				{3, 6, 9, 16},
				{10, 13, 14, 17}
		};
		List<Integer> expected = Arrays.asList(1, 1); // 5 is at (1,1)
		assertEquals(expected, SearchIn2DSortedMatrix.search(matrix, 5));
	}

	@Test
	public void testValueNotPresentInMatrix()
	{
		int[][] matrix = {
				{1, 4, 7, 11},
				{2, 5, 8, 12},
				{3, 6, 9, 16},
				{10, 13, 14, 17}
		};
		assertEquals(Collections.emptyList(), SearchIn2DSortedMatrix.search(matrix, 15));
	}

	@Test
	public void testValueAtTopRightCorner()
	{
		int[][] matrix = {
				{1, 4, 7, 11},
				{2, 5, 8, 12},
				{3, 6, 9, 16},
				{10, 13, 14, 17}
		};
		List<Integer> expected = Arrays.asList(0, 3); // 11 is at (0,3)
		assertEquals(expected, SearchIn2DSortedMatrix.search(matrix, 11));
	}

	@Test
	public void testValueAtBottomLeftCorner()
	{
		int[][] matrix = {
				{1, 4, 7, 11},
				{2, 5, 8, 12},
				{3, 6, 9, 16},
				{10, 13, 14, 17}
		};
		List<Integer> expected = Arrays.asList(3, 0); // 10 is at (3,0)
		assertEquals(expected, SearchIn2DSortedMatrix.search(matrix, 10));
	}

	@Test
	public void testSingleElementMatrixValuePresent()
	{
		int[][] matrix = {
				{42}
		};
		List<Integer> expected = Arrays.asList(0, 0);
		assertEquals(expected, SearchIn2DSortedMatrix.search(matrix, 42));
	}

	@Test
	public void testSingleElementMatrixValueAbsent()
	{
		int[][] matrix = {
				{42}
		};
		assertEquals(Collections.emptyList(), SearchIn2DSortedMatrix.search(matrix, 99));
	}
}
