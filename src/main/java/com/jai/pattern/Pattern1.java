package com.jai.pattern;

/**
 * The Pattern1 class provides a method to print a simple pattern of 'x' characters.
 */
public class Pattern1
{
	/**
	 * Prints a left-aligned triangle pattern of 'x' characters.
	 * <p>
	 * For a given integer n, this method prints n rows. The first row contains one 'x',
	 * the second row contains two 'x's, and so on, up to n rows.
	 * </p>
	 *
	 * @param n the number of rows in the pattern to print
	 *
	 * <pre>
	 * Example output for n = 3:
	 * x
	 * xx
	 * xxx
	 * </pre>
	 */
	public static void pattern1(int n)
	{
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("x");
			}
			System.out.println();
		}
	}
}

