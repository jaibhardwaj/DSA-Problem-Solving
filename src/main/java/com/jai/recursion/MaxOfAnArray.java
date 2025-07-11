package com.jai.recursion;

public class MaxOfAnArray
{
	/**
	 * The entry point of the program.
	 * <p>
	 * Initializes an array and invokes the recursive method to find the maximum element.
	 * </p>
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args)
	{
		int[] arr = {22, 3, 4, 19, 7};
		int max = findMax(arr, 0);
		System.out.println("Maximum element in the array: " + max);
	}

	/**
	 * Recursively finds the maximum element in an array.
	 *
	 * @param arr   the array to search
	 * @param index the current index in the array
	 * @return the maximum element found
	 */
	public static int findMax(int[] arr, int index)
	{
		// Defensive check for empty array
		if( arr.length == 0 )
		{
			throw new ArrayIndexOutOfBoundsException("Array is empty");
		}
		// Base case: if the index is equal to the length of the array, return a minimum value
		if( index == arr.length - 1 )
		{
			return arr[index];
		}

		// Recursive case: find the maximum in the rest of the array
		int maxInRest = findMax(arr, index + 1);

		// Compare the maximum found in the rest of the array with the current element
		if( maxInRest > arr[index] )
		{
			return maxInRest;
		}
		else
		{
			return arr[index];
		}
	}
}
