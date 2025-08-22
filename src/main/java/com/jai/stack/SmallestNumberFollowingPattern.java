package com.jai.stack;

import java.util.Stack;

public class SmallestNumberFollowingPattern
{

	/**
	 * Main method to test the smallestNumber function.
	 *
	 * @param args Command line arguments (not used).
	 */
	public static void main(String[] args)
	{
		String pattern = "IIDID";
		String result = smallestNumber(pattern);
		System.out.println("Smallest number following the pattern '" + pattern + "' is: " + result);
	}

	/**
	 * Finds the smallest number following a given pattern of 'I' (increasing) and 'D' (decreasing).
	 *
	 * @param pattern The pattern string consisting of 'I' and 'D'.
	 * @return The smallest number that follows the given pattern.
	 */
	public static String smallestNumber(String pattern)
	{
		Stack<Integer> stack = new Stack<>();
		StringBuilder result = new StringBuilder();
		int num = 1;
		for( char ch : pattern.toCharArray() )
		{
			if( ch == 'I' )
			{
				stack.push(num++);
				while(!stack.isEmpty())
				{
					result.append(stack.pop());
				}
			}
			else if( ch == 'D' )
			{
				stack.push(num++);
			}
		}
		stack.push(num);
		while(!stack.isEmpty())
		{
			result.append(stack.pop());
		}

		return result.toString();
	}
}
