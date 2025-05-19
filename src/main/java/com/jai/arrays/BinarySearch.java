package com.jai.arrays;

public class BinarySearch
{
	public static int search(int[] arr, int num)
	{
		if(arr == null || arr.length == 0 )
		{
			return -1;
		}

		int low = 0;
		int high = arr.length - 1;

		while( low <= high )
		{
			int mid = (low + high) / 2;

			if(num == arr[mid])
			{
				return mid;
			}
			else if( num < arr[mid] )
			{
				high = mid - 1;
			}
			else
			{
				low = mid + 1;
			}
		}

		return -1;
	}
}
