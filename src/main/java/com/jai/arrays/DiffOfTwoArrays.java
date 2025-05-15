package com.jai.arrays;

public class DiffOfTwoArrays
{
	public static int[] subtraction(int[] arr1, int[] arr2)
	{
		int[] arr3 = new int[arr2.length];

		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = arr3.length - 1;
		int b = 0;

		while(k >= 0)
		{
			int d, d1 = 0, d2 = 0;

			if( i >= 0 )
			{
				d1 = arr1[i];
			}

			if( j >= 0 )
			{
				d2 = arr2[j];
			}

			d2 -= b;

			if( d2 >= d1 )
			{
				d = d2 - d1;
				b = 0;
			}
			else
			{
				d = d2 + 10 - d1;
				b = 1;
			}

			arr3[k] = d;

			i--;
			j--;
			k--;
		}

		return arr3;
	}
}
