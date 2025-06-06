package com.jai.arrays;

/**
 * Utility class for rotating a specific shell (layer) of a 2D matrix.
 * The shell is extracted, rotated, and then placed back into the matrix.
 */
public class ShellRotate
{

	/**
	 * Rotates the specified shell of a 2D array by r positions.
	 *
	 * @param arr The 2D integer array (matrix) to operate on.
	 * @param s   The shell number to rotate (1-based index).
	 * @param r   The number of positions to rotate the shell by.
	 */
	public static void shellRoate(int[][] arr, int s, int r)
	{
		// 1st step: Extract the shell into a 1D array
		int[] oneD = fillOneDFromShell(arr, s);

		// 2nd step: Rotate the 1D array
		roateOneD(oneD, r);

		// 3rd step: Fill the rotated 1D array back into the shell
		fillShellFromOneD(arr, s, oneD);
	}

	/**
	 * Fills the specified shell of the 2D array with values from the provided 1D array.
	 *
	 * @param arr  The 2D integer array (matrix) to fill.
	 * @param s    The shell number to fill (1-based index).
	 * @param oneD The 1D array containing the values to fill into the shell.
	 */
	private static void fillShellFromOneD(int[][] arr, int s, int[] oneD)
	{
		int minr = s - 1;
		int minc = s - 1;
		int maxr = arr.length - s;
		int maxc = arr[0].length - s;

		int idx = 0;

		// Left wall
		for( int i = minr, j = minc; i <= maxr; i++ )
		{
			arr[i][j] = oneD[idx];
			idx++;
		}

		// Bottom wall
		for( int i = maxr, j = minc + 1; j <= maxc; j++ )
		{
			arr[i][j] = oneD[idx];
			idx++;
		}

		// Right wall
		for( int i = maxr - 1, j = maxc; i >= minr; i-- )
		{
			arr[i][j] = oneD[idx];
			idx++;
		}

		// Top wall
		for( int i = minr, j = maxc - 1; j >= minc + 1; j-- )
		{
			arr[i][j] = oneD[idx];
			idx++;
		}
	}

	/**
	 * Rotates the given 1D array by r positions using an external utility.
	 *
	 * @param oneD The 1D array to rotate.
	 * @param r    The number of positions to rotate the array by.
	 */
	private static void roateOneD(int[] oneD, int r)
	{
		RotateAnArray.rotate2(oneD, r);
	}

	/**
	 * Extracts the elements of the specified shell from the 2D array into a 1D array.
	 *
	 * @param arr The 2D integer array (matrix) to extract from.
	 * @param s   The shell number to extract (1-based index).
	 * @return A 1D array containing the elements of the specified shell.
	 */
	private static int[] fillOneDFromShell(int[][] arr, int s)
	{
		int minr = s - 1;
		int minc = s - 1;
		int maxr = arr.length - s;
		int maxc = arr[0].length - s;
		int size = (maxr - minr + 1) * 2 + (maxc - minc + 1) * 2 - 4;

		int[] oneD = new int[size];
		int idx = 0;

		// Left wall
		for( int i = minr, j = minc; i <= maxr; i++ )
		{
			oneD[idx] = arr[i][j];
			idx++;
		}

		// Bottom wall
		for( int i = maxr, j = minc + 1; j <= maxc; j++ )
		{
			oneD[idx] = arr[i][j];
			idx++;
		}

		// Right wall
		for( int i = maxr - 1, j = maxc; i >= minr; i-- )
		{
			oneD[idx] = arr[i][j];
			idx++;
		}

		// Top wall
		for( int i = minr, j = maxc - 1; j >= minc + 1; j-- )
		{
			oneD[idx] = arr[i][j];
			idx++;
		}

		return oneD;
	}


}
