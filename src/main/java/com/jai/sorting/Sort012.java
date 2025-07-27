package com.jai.sorting;

public class Sort012
{
	public static void main(String[] args)
	{
		int[] arr = {0, 1, 2, 0, 1, 2, 0, 1, 2};
		System.out.println("Before sorting:");
		for( int num : arr )
		{
			System.out.print(num + " ");
		}

		System.out.println();
		sort012(arr);
		System.out.println("After sorting:");
		for( int num : arr )
		{
			System.out.print(num + " ");
		}
	}

	/**
	 * Sorts an array containing only 0s, 1s, and 2s in O(n) time complexity.
	 * This implementation uses the Dutch National Flag problem solution, which is a three-way partitioning algorithm.
	 * It maintains three pointers:
	 * - `i` for the current element being processed,
	 * - `j` for the position of the next 0,
	 * - `k` for the position of the next 2.
	 * The algorithm works by iterating through the array and swapping elements to ensure that all 0s are at the beginning,
	 * all 1s are in the middle, and all 2s are at the end.
	 * This implementation works in O(n) time complexity and O(1) space complexity.
	 * @param arr The array to be sorted, which contains only 0s, 1s, and 2s.
	 */
	public static void sort012(int[] arr)
	{
		int i = 0;
		int j = 0;
		int k = arr.length - 1;


		while(i <= k)
		{
			if( arr[i] == 0 )
			{
				swap(arr, i, j);
				i++;
				j++;
			}
			else if( arr[i] == 1 )
			{
				i++;
			}
			else // arr[i] == 2
			{
				swap(arr, i, k);
				k--;
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
