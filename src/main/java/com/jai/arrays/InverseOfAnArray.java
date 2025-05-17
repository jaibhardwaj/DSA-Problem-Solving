package com.jai.arrays;

public class InverseOfAnArray
{
	public static int[] inverse(int[] arr)
	{
		if( arr == null || arr.length == 0 )
		{
			return arr;
		}

		int[] rv = new int[arr.length];

		for( int i = 0; i < arr.length; i++ )
		{
			int v = arr[i];
			rv[v] = i;
		}

		return rv;
	}
}
