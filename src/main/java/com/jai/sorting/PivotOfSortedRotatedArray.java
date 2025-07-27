package com.jai.sorting;

public class PivotOfSortedRotatedArray
{
	public static void main(String[] args)
	{
		int[] arr = {4, 5, 6, 7, 0, 1, 2};
		int pivotIndex = findPivot(arr);
		System.out.println("Pivot index: " + pivotIndex);
		System.out.println("Pivot element: " + arr[pivotIndex]);
	}

	/**
	 * Finds the pivot index in a sorted and rotated array.
	 * The pivot is the index of the smallest element in the array.
	 * This implementation uses a modified binary search to find the pivot in O(log n) time complexity.
	 *
	 * @param arr The sorted and rotated array.
	 * @return The index of the pivot element.
	 */
	public static int findPivot(int[] arr)
	{
		int left = 0;
		int right = arr.length - 1;

		while(left < right)
		{
			int mid = (left + right) / 2;

			if( arr[mid] > arr[right] )
			{
				// Pivot is in the right half
				left = mid + 1;
			}
			else if( arr[mid] < arr[right] )
			{
				// Pivot is in the left half or at mid
				right = mid;
			}
			else
			{
				// arr[mid] == arr[right], we cannot determine the side, so reduce the right pointer
				right--;
			}
		}

		return left; // Pivot is at the left index
	}
}
