package com.jai.arrays;

public class MatrixMultiplication
{
	public static int[][] multiplication(int[][] arr1, int[][] arr2)
	{
		int r1 = arr1.length;
		int c1 = arr1[0].length;

		int r2 = arr2.length;
		int c2 = arr2[0].length;

		if( c1 != r2 )
		{
			return null;
		}

		int[][] arr3 = new int[r1][c2];

		for( int i = 0; i < r1; i++ )
		{
			for( int j = 0; j < c2; j++ )
			{
				for( int k = 0; k < c1; k++ )
				{
					arr3[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}

		return arr3;
	}
}
