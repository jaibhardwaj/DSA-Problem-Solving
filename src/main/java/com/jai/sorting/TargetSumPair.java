package com.jai.sorting;

import java.util.Arrays;

public class TargetSumPair
{
	public static void main(String[] args)
	{
		int[] arr = {7, 15, 3, 18, 6, 4, 19, 2, 12, 11, 9};
		int targetSum = 15;
		System.out.println("Pairs with sum " + targetSum + ":");
		findTargetSumPairs(arr, targetSum);
	}

	/**
	 * Finds and prints all pairs in the array that sum up to the target sum.
	 * This implementation uses a two-pointer technique after sorting the array.
	 * The two-pointer technique works by initializing one pointer at the start of the array and another at the end.
	 * It then checks the sum of the elements at these two pointers:
	 * - If the sum is equal to the target sum, it prints the pair and moves both pointers inward.
	 * - If the sum is less than the target sum, it moves the left pointer to the right to increase the sum.
	 * - If the sum is greater than the target sum, it moves the right pointer to the left to decrease the sum.
	 * This approach ensures that all pairs are found without duplicates, as the array is sorted and the pointers move inward.
	 * It works in O(n log n) time complexity due to sorting, followed by O(n) for finding pairs.
	 *
	 * @param arr       The input array of integers.
	 * @param targetSum The target sum for which pairs are to be found.
	 */
	private static void findTargetSumPairs(int[] arr, int targetSum)
	{
		Arrays.sort(arr);

		int left = 0;
		int right = arr.length - 1;

		while(left < right)
		{
			int currentSum = arr[left] + arr[right];
			if( currentSum == targetSum )
			{
				System.out.println("Pair found: (" + arr[left] + ", " + arr[right] + ")");
				left++;
				right--;
			}
			else if( currentSum < targetSum )
			{
				left++;
			}
			else // currentSum > targetSum
			{
				right--;
			}
		}
	}
}
