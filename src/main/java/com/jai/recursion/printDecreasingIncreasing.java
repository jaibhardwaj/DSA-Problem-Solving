package com.jai.recursion;

/**
 * Demonstrates a recursive method to print numbers in decreasing
 * and then increasing order.
 * <p>
 * For a given integer n, the program prints numbers from n down to 1,
 * and then from 1 back up to n, using recursion.
 * </p>
 */
public class printDecreasingIncreasing
{
	/**
	 * The entry point of the program.
	 * <p>
	 * Initializes an integer value and invokes the recursive method
	 * to print the decreasing and increasing sequence.
	 * </p>
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args)
	{
		int n = 5;
		printDecreasingIncreasing(n);
	}

	/**
	 * Recursively prints numbers from n down to 1 and then back up to n.
	 * <p>
	 * For a given integer n, this method prints the value of n,
	 * then recursively calls itself with n-1, and after returning from
	 * the recursion, prints n again. This results in a sequence where
	 * numbers decrease to 1 and then increase back to n.
	 * </p>
	 *
	 * @param n the starting integer to print decreasing and increasing sequence
	 */
	public static void printDecreasingIncreasing(int n)
	{
		if( n == 0 )
		{
			return;
		}
		System.out.println(n);
		printDecreasingIncreasing(n - 1);
		System.out.println(n);
	}
}
