package com.jai.stack;

import java.util.Stack;

public class SlidingWIndowMaximum
{

	public static void main(String[] args)
	{
		int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
		int k = 3;
		slidingWindowMaximum(arr, k);
	}
	/**
	 * Given an array of integers and a window size k, this method finds the maximum
	 * element in each sliding window of size k.
	 * The algorithm uses a stack to efficiently find the next greater element for
	 * each element in the array, allowing the calculation of the maximum for each
	 * sliding window.
	 * <p>
	 * The time complexity of this algorithm is O(n), where n is the number of
	 * elements in the array. This is because each element is pushed and popped from
	 * the stack at most once.
	 *
	 * @param arr An array of integers.
	 * @param k   The size of the sliding window.
	 */
	public static void slidingWindowMaximum(int[] arr, int k)
	{

		Stack<Integer> stack = new Stack<>();
		int[] nge = new int[arr.length];

		// Fill the next greater element (nge) array
		// nge[i] will store the index of the next greater element for arr[i]
		// If there is no greater element, nge[i] will be arr.length
		// This is done in reverse order to efficiently find the next greater element
		// for each element in the array.
		// The stack is used to keep track of indices of elements in a way that allows
		// us to find the next greater element in O(1) time for each element
		// after the initial O(n) pass to fill the nge array.
		for( int i = arr.length - 1;  i >= 0 ; i-- )
		{
			while( !stack.isEmpty() && arr[i] >= arr[stack.peek()] )
			{
				stack.pop();
			}

			if( stack.isEmpty() )
			{
				nge[i] = arr.length;
			}
			else
			{
				nge[i] = stack.peek();
			}

			stack.push(i);
		}

		// Now, we can find the maximum element in each sliding window of size k
		// We iterate through the array and for each starting index of the window,
		// we find the first index in the nge array that is greater than or equal to
		// the starting index of the window plus k. This gives us the index of the
		// maximum element in the current sliding window.
		// We then print the maximum element for each sliding window.
		// The time complexity of this part is O(n) as well, since we are
		// iterating through the array once and using the nge array to find the maximum
		// element in constant time for each sliding window.
		// The overall time complexity remains O(n).
		// The space complexity is O(n) due to the nge array and the stack.
		// The stack is used to keep track of indices of elements in a way that allows
		// us to find the next greater element in O(1) time for each element
		// after the initial O(n) pass to fill the nge array.
		int j;
		for( int i = 0; i <= arr.length - k ; i++ )
		{
			j = i;
			while( nge[j] < i + k )
			{
				j = nge[j];
			}

			System.out.println(arr[j]);
		}
	}
}
