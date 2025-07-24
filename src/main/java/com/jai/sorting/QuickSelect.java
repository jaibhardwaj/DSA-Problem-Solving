package com.jai.sorting;

import static com.jai.sorting.QuickSort.partition;

public class QuickSelect
{
	public static int quickSelect(int[] arr, int low, int high, int k)
	{
		if (low == high) // Base case: if the sub-array has one element, return it
		{
			return arr[low];
		}

		int pivot = arr[high]; // Choosing the last element as the pivot
		int pivotIndex = partition(arr, low, high, pivot); // Partitioning the array around the pivot

		if (k - 1 == pivotIndex) // If the pivot index is the same as k, we've found our element
		{
			return arr[pivotIndex];
		}
		else if (k - 1 < pivotIndex) // If k is less than the pivot index, search in the left sub-array
		{
			return quickSelect(arr, low, pivotIndex - 1, k);
		}
		else // If k is greater than the pivot index, search in the right sub-array
		{
			return quickSelect(arr, pivotIndex + 1, high, k);
		}
	}
}
