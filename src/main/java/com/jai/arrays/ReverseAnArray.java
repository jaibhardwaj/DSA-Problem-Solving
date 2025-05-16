package com.jai.arrays;

public class ReverseAnArray
{
	public static int[] reverse(int[] arr)
	{
		if( arr == null || arr.length == 0 )
		{
			return null;
		}

		if( arr.length == 1 )
		{
			return arr;
		}

		int i = 0;
		int j = arr.length - 1;

		while(i <= j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;
		}

		return arr;
	}
}
