package com.jai.sorting;

public class SelectionSort
{
	/**
	 * Main method to test the Selection Sort algorithm.
	 * It creates an array, sorts it using selectionSort, and prints the sorted array.
	 */
	public static void main(String[] args)
	{
		int[] arr = {64, 25, 12, 22, 11};
		System.out.println("Unsorted array:");
		printArray(arr);

		selectionSort(arr);

		System.out.println("Sorted array:");
		printArray(arr);
	}

	/**
	 * This method sorts an array using the Selection Sort algorithm.
	 * It repeatedly selects the smallest element from the unsorted portion
	 * and moves it to the beginning.
	 *
	 * @param arr The array to be sorted
	 */
	public static void selectionSort(int[] arr)
	{
		for( int i = 0; i < arr.length - 1; i++ )
		{
			int minIndex = i;
			for( int j = i + 1; j < arr.length; j++ )
			{
				if( arr[j] < arr[minIndex] )
				{
					minIndex = j;
				}
			}
			swap(arr, i, minIndex);
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
