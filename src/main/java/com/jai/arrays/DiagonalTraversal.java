package com.jai.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * The DiagonalTraversal class provides a method to traverse a square 2D array (matrix)
 * diagonally from the top-left to the bottom-right, collecting elements along each diagonal
 * above and including the main diagonal.
 */
public class DiagonalTraversal
{
	/**
	 * Traverses the given square matrix diagonally, starting from the main diagonal and moving
	 * towards the top-right corner. For each diagonal, elements are collected from top to bottom.
	 * <p>
	 * For example, given the matrix:
	 * [
	 * [1, 2, 3],
	 * [4, 5, 6],
	 * [7, 8, 9]
	 * ]
	 * The returned list will be: [1, 5, 9, 2, 6, 3]
	 *
	 * @param arr a square 2D integer array to traverse diagonally
	 * @return a list of integers representing the diagonal traversal order
	 */
	public static List<Integer> traverse(int[][] arr)
	{
		List<Integer> list = new ArrayList<>();
		for( int gap = 0; gap < arr.length; gap++ )
		{
			for( int i = 0, j = gap; j < arr.length; i++, j++ )
			{
				list.add(arr[i][j]);
			}
		}

		return list;
	}
}
