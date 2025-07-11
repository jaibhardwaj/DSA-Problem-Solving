package com.jai.recursion;

public class AllIndicesOfAnElementInArray
{

	/**
	 * Finds all indices of a given element in an array using recursion.
	 *
	 * @param arr    The array to search in.
	 * @param target The element to find.
	 * @return An array containing all indices of the target element.
	 */
	public static int[] findAllIndices(int[] arr, int target, int index, int foundCount)
	{
		// Base case: if the index is out of bounds, return an empty array of size foundCount
		if( index >= arr.length )
		{
			return new int[foundCount];
		}

		if( arr[index] == target )
		{
			// If the current element matches the target, include it in the result
			int[] result = findAllIndices(arr, target, index + 1, foundCount + 1);
			result[foundCount] = index; // Store the current index in the result array
			return result;
		}
		else
		{
			// If the current element does not match, continue searching
			return findAllIndices(arr, target, index + 1, foundCount);
		}
	}
}
