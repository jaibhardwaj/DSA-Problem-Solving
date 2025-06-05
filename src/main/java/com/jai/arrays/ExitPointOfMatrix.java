package com.jai.arrays;

public class ExitPointOfMatrix
{
	public static int[] exitPoint(int[][] arr)
	{
		int[] point = new int[2];

		int dir = 0;
		int i = 0;
		int j = 0;

		while(true)
		{
			dir = (dir + arr[i][j]) % 4;
			if( dir == 0 )
			{
				j++;
			}
			else if( dir == 1 )
			{
				i++;
			}
			else if( dir == 2 )
			{
				j--;
			}
			else if( dir == 3 )
			{
				i--;
			}

			if( i < 0 )
			{
				i++;
				break;
			}
			else if( j < 0 )
			{
				j++;
				break;
			}
			else if( i == arr.length )
			{
				i--;
				break;
			}
			else if( j == arr[0].length )
			{
				j--;
				break;
			}
		}

		point[0] = i;
		point[1] = j;

		return point;
	}
}
