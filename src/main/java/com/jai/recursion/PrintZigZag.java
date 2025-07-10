package com.jai.recursion;

public class PrintZigZag
{
	/**
	 * The entry point of the program.
	 * <p>
	 * Initializes an integer value and invokes the recursive method
	 * to print numbers in zigzag order.
	 * </p>
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args)
	{
		int n = 2;
		printZigZag(n);
	}

	/**
	 * Recursively prints numbers in zigzag order from 1 to n.
	 *
	 * @param n the integer up to which to print in zigzag order
	 */
	public static void printZigZag(int n)
	{
		if (n == 0)
		{
			return;
		}

		System.out.println("Pre " + n);
		printZigZag(n - 1);
		System.out.println("In " + n);
		printZigZag(n - 1);
		System.out.println("Post " + n);
	}
}
