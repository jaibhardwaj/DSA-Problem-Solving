package com.jai.arrays;

/**
 * Utility class for finding the saddle point in a 2D integer array (matrix).
 */
public class SaddlePoint
{
	/**
	 * Finds the saddle point in a 2D integer array (matrix).
	 * <p>
	 * A saddle point is defined as an element that is the minimum in its row
	 * and the maximum in its column.
	 * </p>
	 *
	 * @param arr the 2D integer array (matrix) to search for a saddle point
	 * @return the value of the saddle point if it exists; otherwise, -1
	 */
	public static int saddlePoint(int[][] arr)
	{
		// Iterate over each row
		for( int i = 0; i < arr.length; i++ )
		{
			// Find the column index of the minimum element in the current row
			int svj = 0;
			for( int j = 1; j < arr[0].length; j++ )
			{
				if( arr[i][j] < arr[i][svj] )
				{
					svj = j;
				}
			}

			// Assume the found minimum is a saddle point
			boolean flag = true;

			// Check if the found minimum is the maximum in its column
			for( int k = 0; k < arr.length; k++ )
			{
				if( arr[k][svj] > arr[i][svj] )
				{
					flag = false;
					break;
				}
			}

			// If it is a saddle point, return its value
			if( flag )
			{
				return arr[i][svj];
			}
		}

		// No saddle point found
		return -1;
	}
}

