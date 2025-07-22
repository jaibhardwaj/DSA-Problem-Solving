package com.jai.sorting;

public class MergeTwoSortedArray
{

	/**
	 * Merges two sorted arrays into one sorted array.
	 *
	 * @param arr1 First sorted array
	 * @param arr2 Second sorted array
	 * @return A new sorted array containing all elements from both input arrays
	 */
	public static int[] merge(int[] arr1, int[] arr2)
	{
		int n1 = arr1.length;
		int n2 = arr2.length;
		int[] mergedArray = new int[n1 + n2];
		int i = 0, j = 0, k = 0;

		// Merge the two arrays until one of them is fully traversed
		while(i < n1 && j < n2)
		{
			if( arr1[i] <= arr2[j] )
			{
				mergedArray[k] = arr1[i];
				i++;
			}
			else
			{
				mergedArray[k] = arr2[j];
				j++;
			}
			k++;
		}

		// If there are remaining elements in arr1, add them
		while(i < n1)
		{
			mergedArray[k] = arr1[i];
			i++;
			k++;
		}

		// If there are remaining elements in arr2, add them
		while(j < n2)
		{
			mergedArray[k] = arr2[j];
			j++;
			k++;
		}

		return mergedArray;
	}
}
