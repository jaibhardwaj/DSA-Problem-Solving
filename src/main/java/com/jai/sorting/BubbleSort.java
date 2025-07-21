package com.jai.sorting;

public class BubbleSort
{

	/**
	 * Main method to test the Bubble Sort algorithm.
	 * It creates an array, sorts it using bubbleSort, and prints the sorted array.
	 */
	public static void main(String[] args)
	{
		int[] arr = {64, 34, 25, 12, 22, 11, 90};
		System.out.println("Unsorted array:");
		printArray(arr);

		bubbleSort(arr);

		System.out.println("Sorted array:");
		printArray(arr);
	}

	/**
	 * This method sorts an array using the Bubble Sort algorithm.
	 * It repeatedly steps through the list, compares adjacent elements,
	 * and swaps them if they are in the wrong order.
	 *
	 * @param arr The array to be sorted
	 */
	public static void bubbleSort(int[] arr)
	{
		for (int i = 0; i < arr.length - 1; i++)
		{
			for (int j = 0; j < arr.length - i - 1; j++)
			{
				if (isSmaller(arr[j + 1], arr[j]))
				{
					swap(arr, j, j + 1);
				}
			}
		}
	}

	/**
	 * This method checks if the first integer is smaller than the second.
	 *
	 * @param a The first integer
	 * @param b The second integer
	 * @return true if a is smaller than b, false otherwise
	 */
	public static boolean isSmaller(int a, int b)
	{
		return a < b;
	}

	/**
	 * This method swaps two elements in an array.
	 *
	 * @param arr The array containing the elements to be swapped
	 * @param i   The index of the first element
	 * @param j   The index of the second element
	 */
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/**
	 * This method prints the elements of an array.
	 *
	 * @param arr The array to be printed
	 */
	public static void printArray(int[] arr)
	{
		for (int value : arr)
		{
			System.out.print(value + " ");
		}
		System.out.println();
	}
}
