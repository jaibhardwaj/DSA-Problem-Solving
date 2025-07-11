package com.jai.recursion;

public class FirstIndexInArray
{

	public static int findFirstIndexOptimized(int[] arr, int target, int index)
	{
		// Check if the array is empty or the index is out of bounds
		if( index >= arr.length || arr.length == 0 )
		{
			return -1; // Base case: reached the end of the array or array is empty
		}

		// Check if the current index matches the target
		if( arr[index] == target )
		{
			return index; // Found the target element
		}

		// Recursive call to check the next index
		return findFirstIndexOptimized(arr, target, index + 1);
	}

	/**
	 * Finds the first index of a given element in an array using recursion.
	 *
	 * @param arr    The array to search in.
	 * @param target The element to find.
	 * @param index  The current index in the recursion.
	 * @return The first index of the target element, or -1 if not found.
	 */
	public static int findFirstIndex(int[] arr, int target, int index)
	{
		// Check if the array is empty or the index is out of bounds
		if( index >= arr.length || arr.length == 0 )
		{
			return -1; // Base case: reached the end of the array or array is empty
		}

		// Recursive call to check the next index
		final int firstIndex = findFirstIndex(arr, target, index + 1);

		// Check if the current index matches the target
		if( arr[index] == target )
		{
			return index; // Found the target element
		}
		else
		{
			// If not found at the current index, return the result from the next index
			return firstIndex;
		}
	}
}
