package com.jai.recursion;

public class Factorial
{
	/**
	 * The entry point of the program.
	 * <p>
	 * Initializes an integer value and invokes the recursive method
	 * to calculate the factorial.
	 * </p>
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args)
	{
		int n = 5;
		System.out.println("Factorial of " + n + " is: " + factorial(n));
	}

	/**
	 * Recursively calculates the factorial of a given integer n.
	 * <p>
	 * The factorial of n (denoted as n!) is the product of all positive integers
	 * from 1 to n. This method uses recursion to compute the factorial.
	 * </p>
	 *
	 * @param n the integer for which to calculate the factorial
	 * @return the factorial of n
	 */
	public static int factorial(int n)
	{
		if (n == 0 || n == 1)
		{
			return 1;
		}

		return n * factorial(n - 1);
	}
}
