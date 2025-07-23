package com.jai.sorting;

import static com.jai.sorting.BubbleSort.printArray;

public class PartioningAnArray
{

	/**
	 * Main method to test the partitioning of an array.
	 * It creates an array, partitions it around a pivot,
	 * and prints the partitioned array.
	 */
	public static void main(String[] args)
	{
		int[] arr = {10, 80, 30, 90, 40, 50, 70};
		int pivot = 5; // Choosing the element at index 3 as the pivot (value 90)

		System.out.println("Unpartitioned array:");
		printArray(arr);

		partition(arr, pivot);

		System.out.println("Partitioned array:");
		printArray(arr);
	}

	/**
	 * This method partitions an array around a pivot element.
	 * Elements less than the pivot are moved to the left,
	 * and elements greater than the pivot are moved to the right.
	 *
	 * @param arr   The array to be partitioned
	 * @param pivot The starting index of the partition
	 */
	public static void partition(int[] arr, int pivot)
	{
		int i = 0;
		int j = 0;

		while(i < arr.length)
		{
			if( arr[i] <= arr[pivot] )
			{
				swap(arr, i, j);
				i++;
				j++;
			}
			else if( arr[i] > arr[pivot] )
			{
				i++;
			}
		}
	}

	private static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
