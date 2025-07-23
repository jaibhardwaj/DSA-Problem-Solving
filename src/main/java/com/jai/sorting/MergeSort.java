package com.jai.sorting;

import static com.jai.sorting.MergeTwoSortedArray.merge;

public class MergeSort
{

	/**
	 * Sorts the given array using merge sort algorithm.
	 *
	 * @param array The array to be sorted.
	 * @return A new sorted array.
	 */
	public static int[] mergeSort(int[] array, int low, int high)
	{
		if( array == null || array.length == 0 )
		{
			return new int[0];
		}

		if( low < 0 || high >= array.length || low > high )
		{
			throw new IllegalArgumentException("Invalid low or high index");
		}

		// Base case: if the array has one or zero elements, it is already sorted.
		if( low == high )
		{
			return new int[] { array[low] };
		}

		// Recursive case: split the array into halves and merge the sorted halves.
		int mid = (low + high) / 2;
		int[] left = mergeSort(array, low, mid);
		int[] right = mergeSort(array, mid + 1, high);

		// Merge the sorted halves.
		return merge(left, right);
	}
}
