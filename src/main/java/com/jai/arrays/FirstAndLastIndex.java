package com.jai.arrays;

public class FirstAndLastIndex
{
	public static int firstIndex(int[] arr, int data)
	{
		if( arr == null || arr.length == 0 )
		{
			return -1;
		}

		int low = 0;
		int high = arr.length - 1;
		int firstIndex = -1;

		while( low <= high )
		{
			int mid = ( low + high ) / 2;

			if( data < arr[mid] )
			{
				high = mid - 1;
			}
			else if( data > arr[mid] )
			{
				low = mid + 1;
			}
			else
			{
				firstIndex = mid;
				high = mid - 1;
			}
		}

		return firstIndex;
	}

	public static int lastIndex(int[] arr, int data)
	{
		if( arr == null || arr.length == 0 )
		{
			return -1;
		}

		int low = 0;
		int high = arr.length - 1;
		int lastIndex = -1;

		while( low <= high )
		{
			int mid = ( low + high ) / 2;

			if( data < arr[mid] )
			{
				high = mid - 1;
			}
			else if( data > arr[mid] )
			{
				low = mid + 1;
			}
			else
			{
				lastIndex = mid;
				low = mid + 1;
			}
		}

		return lastIndex;
	}
}
