package com.jai.recursion;

public class LastIndexInArray
{
	/**
	 * Finds the last index of a given element in an array using recursion.
	 *
	 * @param arr   The array to search in.
	 * @param n     The element to find.
	 * @param id    The current index in the recursion start from 0.
	 * @return      The last index of the element in the array, or -1 if not found.
	 */
	public static int lastIndex(int[] arr, int n, int id)
	{
		// Base case: if the index is out of bounds, return -1
		if( id >= arr.length )
		{
			return -1; // Element not found
		}

		// Recursive call to check the next index
		int lastIndex = lastIndex(arr, n, id + 1);

		// If the last index is -1, it means the element was not found in the subsequent indices
		if ( lastIndex == -1 )
		{
			// Check if the current index matches the element
			if ( arr[id] == n )
			{
				return id; // Found the element at the current index
			}
		}

		// Otherwise, return the last index found in the recursive call
		return lastIndex;
	}
}
