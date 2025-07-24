package com.jai.sorting;

public class QuickSort
{
	/**
	 * Main method to test the Quick Sort algorithm.
	 * It creates an array, sorts it using quickSort, and prints the sorted array.
	 */
	public static void main(String[] args)
	{
		int[] arr = {64, 34, 25, 12, 22, 11, 90};
		System.out.println("Unsorted array:");
		printArray(arr);

		quickSort(arr, 0, arr.length - 1);

		System.out.println("Sorted array:");
		printArray(arr);
	}

	/**
	 * This method sorts an array using the Quick Sort algorithm.
	 *
	 * @param arr  The array to be sorted
	 * @param low  The starting index of the sub-array
	 * @param high The ending index of the sub-array
	 */
	public static void quickSort(int[] arr, int low, int high)
	{
		if(low >= high) // Base case: if the sub-array has one or no elements, it's already sorted
		{
			return;
		}

		// Choosing the last element as the pivot
		// This is a common choice, but other strategies can be used as well
		int pivot = arr[high]; // Choosing the last element as the pivot

		// Partitioning the array around the pivot
		// Elements less than or equal to the pivot will be on the left,
		// and elements greater than the pivot will be on the right
		// The partition function will return the index of the pivot after partitioning
		// This index will be used to recursively sort the left and right sub-arrays
		// The pivot is chosen as the last element in the current sub-array
		// This is a common choice, but other strategies can be used as well
		// The partition function will rearrange the elements in the array
		// so that all elements less than or equal to the pivot are on the left,
		// and all elements greater than the pivot are on the right
		int partitionIndex = partition(arr, low, high, pivot);

		// Recursively sort the left and right sub-arrays
		quickSort(arr, low, partitionIndex - 1); // Recursively sort the left sub-array
		quickSort(arr, partitionIndex + 1, high); // Recursively sort the right sub-array
	}

	public static int partition(int[] arr, int low, int high, int pivot)
	{
		int i = low;
		int j = low;

		while(i <= high)
		{
			if(arr[i] <= pivot)
			{
				swap(arr, i, j);
				i++;
				j++;
			}
			else
			{
				i++;
			}
		}

		return j - 1; // Return the index of the pivot after partitioning
	}

	private static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void printArray(int[] arr)
	{
		for( int value : arr )
		{
			System.out.print(value + " ");
		}
		System.out.println();
	}
}
