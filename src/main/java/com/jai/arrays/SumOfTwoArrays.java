package com.jai.arrays;

public class SumOfTwoArrays
{
	/**
	 * this function is to add two arrays have values less than 10;
	 * @param arr1 array 1
	 * @param arr2 array 2
	 * @return sum of two array
	 */
	public static int[] addition(int[] arr1, int[] arr2)
	{
		if( arr1 == null || arr2 == null )
		{
			return null;
		}

		if( arr1.length == 0 )
		{
			return arr2;
		}

		if( arr2.length == 0 )
		{
			return arr1;
		}

		int max = Math.max(arr1.length, arr2.length);

		int[] arr3 = new int[max];

		int i;
		for( i = 0; i < arr1.length && i < arr2.length; i++ )
		{
			arr3[i] = arr1[i] + arr2[i];
		}

		while(i < arr1.length)
		{
			arr3[i] = arr1[i];
			i++;
		}

		while(i < arr2.length)
		{
			arr3[i] = arr2[i];
			i++;
		}

		return arr3;
	}
}
