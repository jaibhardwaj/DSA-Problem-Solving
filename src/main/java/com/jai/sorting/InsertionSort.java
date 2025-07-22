package com.jai.sorting;

public class InsertionSort
{

	/**
	 * Main method to test the Insertion Sort algorithm.
	 * It creates an array, sorts it using insertionSort, and prints the sorted array.
	 */
	public static void main(String[] args)
	{
		int[] arr = {64, 34, 25, 12, 22, 11, 90};
		System.out.println("Unsorted array:");
		printArray(arr);

		insertionSort(arr);

		System.out.println("Sorted array:");
		printArray(arr);
	}

	/**
	 * This method sorts an array using the Insertion Sort algorithm.
	 * It builds a sorted array one element at a time by repeatedly
	 * taking the next element and inserting it into the correct position.
	 *
	 * @param arr The array to be sorted
	 */
	public static void insertionSort(int[] arr)
	{
		for( int i = 0; i < arr.length - 1; i++ )
		{
			for( int j = i + 1; j > 0; j-- )
			{
				if( arr[j - 1] > arr[j] )
				{
					swap(arr, j, j - 1);
				}
				else
				{
					break; // No need to continue if the order is correct
				}
			}
		}
	}

	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void printArray(int[] arr)
	{
		for( int value : arr )
		{
			System.out.print(value + " ");
		}
		System.out.println();
	}
}
