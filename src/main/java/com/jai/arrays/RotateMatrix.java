package com.jai.arrays;

public class RotateMatrix
{
	/**
	 * Rotates a given square 2D integer matrix 90 degrees clockwise in-place.
	 * <p>
	 * The rotation is performed in two steps:
	 * <ol>
	 *   <li>Transpose the matrix (swap arr[i][j] with arr[j][i] for all i, j).</li>
	 *   <li>Reverse each row of the transposed matrix.</li>
	 * </ol>
	 *
	 * <b>Example:</b>
	 * <pre>
	 * Input:
	 * a b c d
	 * e f g h
	 * i j k l
	 * m n o p
	 *
	 * Output:
	 * m i e a
	 * n j f b
	 * o k g c
	 * p l h d
	 * </pre>
	 *
	 * @param arr The square 2D integer array to rotate.
	 * @return The rotated 2D integer array (rotated in-place).
	 * @throws NullPointerException if arr is null.
	 * @throws ArrayIndexOutOfBoundsException if arr is not a square matrix.
	 */
	public static int[][] rotate(int[][] arr)
	{
		// transpose
		/*
		 *  a b c d		 a e i m
		 *  e f g h  ->  b f j n
		 *  i j k l		 c g k o
		 *  m n o p		 d h l p
		 * */
		for( int i = 0; i < arr.length; i++ )
		{
			for( int j = i; j < arr[0].length; j++ )
			{
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		// reverse the matrix row by row
		for( int i = 0; i < arr.length; i++ )
		{
			int li = 0;
			int ri = arr.length - 1;

			while(li < ri)
			{
				int temp = arr[i][li];
				arr[i][li] = arr[i][ri];
				arr[i][ri] = temp;
				li++;
				ri--;
			}
		}

		return arr;
	}
}
