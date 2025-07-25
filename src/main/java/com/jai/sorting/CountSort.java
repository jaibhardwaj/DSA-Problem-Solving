package com.jai.sorting;

public class CountSort
{
	public static int[] countSort(int[] arr)
	{

		if( arr == null || arr.length == 0 )
		{
			return new int[0];
		}

		if( arr.length == 1 )
		{
			return new int[]{arr[0]};
		}

		// Find the minimum and maximum values in the array
		int min = arr[0];
		int max = arr[0];

		for( int i = 1; i < arr.length; i++ )
		{
			if( arr[i] < min )
			{
				min = arr[i];
			}
			if( arr[i] > max )
			{
				max = arr[i];
			}
		}

		// Create a frequency array
		int range = max - min + 1;

		int[] farr = new int[range];

		// Count the frequency of each element in the original array
		for( int i = 0; i < arr.length; i++ )
		{
			farr[arr[i] - min]++;
		}

		// Modify the frequency array to store the cumulative counts
		for( int i = 1; i < farr.length; i++ )
		{
			farr[i] = farr[i] + farr[i - 1];
		}

		// Create the output array and fill it using the frequency array
		int[] ans = new int[arr.length];
		// Traverse the original array in reverse order to maintain stability
		for( int i = arr.length - 1; i >= 0; i-- )
		{
			int idx = farr[arr[i] - min] - 1; // Get the index for the current element
			ans[idx] = arr[i];
			farr[arr[i] - min]--;
		}

		return ans;
	}
}
