package com.jai.arrays;

public class SpanOfAnArray
{
	/**
	 * this function is return the difference between max value
	 * and min value of an array
	 * @param arr array
	 * @return span
	 */
	public static int span(int[] arr)
	{
		if( arr == null || arr.length == 0 )
		{
			return -1;
		}

		if( arr.length == 1 )
		{
			return arr[0];
		}

		int max = arr[0];
		int min = arr[0];

		for( int i = 1; i < arr.length; i++ )
		{
			if( arr[i] > max )
			{
				max = arr[i];
			}

			if( arr[i] < min )
			{
				min = arr[i];
			}
		}

		return max - min;
	}
}
