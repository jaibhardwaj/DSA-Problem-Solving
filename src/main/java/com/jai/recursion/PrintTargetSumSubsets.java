package com.jai.recursion;

public class PrintTargetSumSubsets
{

	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5};
		int targetSum = 5;
		printSubsets(arr, targetSum, 0, "", 0);
	}

	/**
	 * This method prints all subsets of the given array that sum up to the target sum.
	 *
	 * @param arr The input array
	 * @param targetSum The target sum to achieve
	 * @param index The current index in the array
	 * @param currentSubset The current subset being formed
	 * @param currentSum The sum of the current subset
	 */
	private static void printSubsets(int[] arr, int targetSum, int index, String currentSubset, int currentSum)
	{
		// Base case: If we have considered all elements
		if( index == arr.length)
		{
			if( currentSum == targetSum )
			{
				System.out.println(currentSubset);
			}
			return;
		}

		// Include the current element
		printSubsets(arr, targetSum, index + 1, currentSubset + arr[index] + " ", currentSum + arr[index]);

		// Exclude the current element
		printSubsets(arr, targetSum, index + 1, currentSubset, currentSum);
	}
}
