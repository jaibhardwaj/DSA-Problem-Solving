package com.jai.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class for searching a value in a 2D matrix where each row and each column is sorted in ascending order.
 */
public class SearchIn2DSortedMatrix
{
	/**
	 * Searches for a given value in a 2D sorted matrix.
	 * The matrix must have each row and each column sorted in ascending order.
	 * <p>
	 * The search starts from the top-right corner and moves left or down depending on the comparison.
	 * </p>
	 *
	 * @param arr The 2D integer array (matrix) to search in. Must be non-null and have at least one row and one column.
	 * @param val The integer value to search for.
	 * @return A list containing the row and column indices of the found value.
	 * If the value is not found, returns an empty list.
	 * The returned list will contain exactly two elements if the value is found: [rowIndex, columnIndex].
	 */
	public static List<Integer> search(int[][] arr, int val)
	{
		int i = 0;
		int j = arr[0].length - 1;

		List<Integer> list = new ArrayList<>();

		// Start from the top-right corner and search for the value
		while(i < arr.length && j >= 0)
		{
			if( arr[i][j] == val )
			{
				// Value found, add indices to the result list and return
				list.add(i);
				list.add(j);
				return list;
			}
			else if( val < arr[i][j] )
			{
				// Move left if the current value is greater than the target
				j--;
			}
			else if( val > arr[i][j] )
			{
				// Move down if the current value is less than the target
				i++;
			}
		}

		// Value not found, return empty list
		return list;
	}
}

