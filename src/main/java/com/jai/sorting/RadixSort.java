package com.jai.sorting;

import static com.jai.sorting.BubbleSort.printArray;

public class RadixSort
{

	// Radix Sort is a non-comparative integer sorting algorithm that sorts numbers by processing
	// individual digits. It works by sorting the numbers based on each digit, starting from the
	// least significant digit (LSD) to the most significant digit (MSD). The algorithm uses
	// a stable sorting algorithm (like Counting Sort) as a subroutine to sort the digits.
	// It is particularly efficient for sorting large sets of integers with a fixed number of digits.
	// Time Complexity: O(d * (n + k)), where d is the number of digits in the maximum number,
	// n is the number of elements in the array, and k is the range of the input (0-9 for each digit).
	// Space Complexity: O(n + k), where n is the number of elements in the array,
	// and k is the range of the input (0-9 for each digit).
	// The algorithm is stable, meaning that it preserves the relative order of equal elements.
	// It is not an in-place sorting algorithm, as it requires additional space for the
	// output array and the count array.
	public static void main(String[] args)
	{
		int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
		System.out.println("Original Array: ");
		printArray(arr);
		sort(arr);
		System.out.println("Sorted Array: ");
		printArray(arr);
	}

	/**
	 * Sorts the given array using Radix Sort algorithm.
	 * This method sorts the array in-place and does not return a new array.
	 * It uses Counting Sort as a subroutine to sort the digits of the numbers.
	 *
	 * @param arr The array of integers to be sorted.
	 */
	public static void sort(int[] arr)
	{
		if( arr == null || arr.length == 0 )
		{
			return;
		}

		// Find the maximum number to know the number of digits
		// We will use counting sort to sort elements based on each digit
		// starting from the least significant digit to the most significant digit
		// This is the essence of Radix Sort
		// The algorithm is stable, meaning that it preserves the relative order of equal elements.
		// It is not an in-place sorting algorithm, as it requires additional space for the
		// output array and the count array.
		int max = findMax(arr);
		for( int exp = 1; max / exp > 0; exp *= 10 )
		{
			countingSort(arr, exp);
		}
	}

	private static int findMax(int[] arr)
	{
		int max = arr[0];
		for( int num : arr )
		{
			if( num > max )
			{
				max = num;
			}
		}
		return max;
	}

	private static void countingSort(int[] arr, int exp)
	{
		int n = arr.length;
		int[] output = new int[n];
		int[] count = new int[10];

		// Initialize count array
		// This array will hold the count of occurrences of each digit (0-9)
		// We use 10 because we are dealing with decimal digits (0-9).
		// The count array will help us determine the position of each digit in the output array
		for( int i = 0; i < n; i++ )
		{
			count[(arr[i] / exp) % 10]++;
		}

		// Update count[i] to contain the actual position of this digit in output[]
		// This is where we accumulate the counts to get the positions
		// We start from 1 because we are dealing with digits 0-9
		// and we want to ensure that count[0] is 0, so we
		// can use it directly for the first digit.
		// This is a crucial step to ensure that the sorting is stable.
		for( int i = 1; i < 10; i++ )
		{
			count[i] += count[i - 1];
		}

		// Build the output array
		// We traverse the input array in reverse order to maintain the stability of the sort
		// This means that if two elements have the same digit, the one that appeared first
		// in the original array will appear first in the output array.
		// This is important for maintaining the relative order of equal elements.
		// We use the count array to find the correct position for each element in the output
		// array based on the current digit.
		// We decrement the count for each digit as we place it in the output array
		// to ensure that the next occurrence of the same digit goes to the next position.
		// This is what makes the algorithm stable.
		for( int i = n - 1; i >= 0; i-- )
		{
			int pos = count[(arr[i] / exp) % 10] - 1;
			output[pos] = arr[i];
			count[(arr[i] / exp) % 10]--;
		}

		System.arraycopy(output, 0, arr, 0, n);
	}
}
