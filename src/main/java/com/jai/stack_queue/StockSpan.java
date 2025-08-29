package com.jai.stack_queue;

public class StockSpan
{
	/**
	 * Calculates the stock span for each day.
	 * The stock span is defined as the number of consecutive days before the current day
	 * where the stock price was less than or equal to the current day's price.
	 * For example, if the stock prices are [100, 80, 60, 70, 60, 75, 85],
	 * the stock span for each day would be [1, 1, 1, 2, 1, 4, 6].
	 * The algorithm uses a stack to keep track of the indices of the stock prices.
	 * It iterates through the prices, and for each price, it pops elements from the stack
	 * until it finds a price that is greater than the current price.
	 * The span for the current price is then calculated based on the index of the last greater price found.
	 * This implementation has a time complexity of O(n) and a space complexity of O(n).
	 *
	 * @param prices An array of stock prices.
	 * @return An array containing the stock span for each day.
	 */
	public static int[] calculateSpan(int[] prices)
	{
		int n = prices.length;
		int[] span = new int[n];
		java.util.Stack<Integer> stack = new java.util.Stack<>();

		for( int i = 0; i < n; i++ )
		{
			while(!stack.isEmpty() && prices[stack.peek()] <= prices[i])
			{
				stack.pop();
			}
			span[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
			stack.push(i);
		}

		return span;
	}
}
