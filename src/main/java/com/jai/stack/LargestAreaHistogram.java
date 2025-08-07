package com.jai.stack;

import java.util.Stack;

public class LargestAreaHistogram
{
	/**
	 * Given an array of integers representing the heights of bars in a histogram,
	 * this method calculates the area of the largest rectangle that can be formed
	 * within the histogram.
	 * The algorithm uses a stack to efficiently find the left and right boundaries
	 * for each bar, allowing the calculation of the maximum area rectangle that can
	 * be formed with each bar as the shortest bar in the rectangle.
	 * <p>
	 * The time complexity of this algorithm is O(n), where n is the number of bars
	 * in the histogram. This is because each bar is pushed and popped from the stack
	 * at most once.
	 *
	 * @param arr An array of integers representing the heights of bars in the histogram.
	 * @return The area of the largest rectangle that can be formed within the histogram.
	 */
	public static int largestRectangleArea(int[] arr)
	{

		// fill left array
		int[] left = new int[arr.length];

		Stack<Integer> st1 = new Stack<>();

		for( int i = 0; i < arr.length; i++ )
		{
			while( !st1.isEmpty() && arr[st1.peek()] >= arr[i] )
			{
				st1.pop();
			}

			left[i] = st1.isEmpty() ? -1 : st1.peek();
			st1.push(i);
		}

		// fill right array
		int[] right = new int[arr.length];

		Stack<Integer> st2 = new Stack<>();

		for( int i = arr.length - 1; i >= 0; i-- )
		{
			while( !st2.isEmpty() && arr[st2.peek()] >= arr[i] )
			{
				st2.pop();
			}

			right[i] = st2.isEmpty() ? arr.length : st2.peek();
			st2.push(i);
		}

		int maxArea = 0;
		for( int i = 0; i < arr.length; i++ )
		{
			int width = right[i] - left[i] - 1;
			int area = width * arr[i];
			if( area > maxArea )
			{
				maxArea = area;
			}
		}

		return maxArea;
	}
}
