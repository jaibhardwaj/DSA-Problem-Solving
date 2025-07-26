package com.jai.sorting;

public class Sort01
{
	public static void main(String[] args)
	{
		int[] arr = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
		System.out.println("Before sorting:");
		for( int num : arr )
		{
			System.out.print(num + " ");
		}

		System.out.println();
		sort01(arr);
		System.out.println("After sorting:");
		for( int num : arr )
		{
			System.out.print(num + " ");
		}
	}

	/**
	 * Sorts an array containing only 0s and 1s in O(n) time complexity.
	 * This implementation uses a two-pointer technique to partition the array into two parts:
	 * one part containing all 0s and the other part containing all 1s.
	 * This is a stable sort, as it maintains the relative order of 0s and 1s.
	 * This implementation works in O(n) time complexity and O(1) space complexity.
	 * The algorithm works by maintaining two pointers:
	 * - `i` traverses the array from the beginning to the end.
	 * - `j` keeps track of the position where the next 0 should be placed.
	 * When a 0 is encountered at index `i`, it is swapped with the element at index `j`, and `j` is incremented.
	 * The process continues until the end of the array is reached.
	 * @param arr The array to be sorted, which contains only 0s and 1s.
	 */
	public static void sort01(int[] arr)
	{
		int i = 0;
		int j = 0;

		while(i < arr.length)
		{
			if( arr[i] == 0 )
			{
				// Swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
			i++;
		}
	}
}
