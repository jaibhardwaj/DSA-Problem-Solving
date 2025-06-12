package com.jai.pattern;

/**
 * The Pattern13 class provides a method to print a specific pattern of numbers.
 * The pattern printed is Pascal's Triangle up to n rows.
 */
public class Pattern13
{
	/**
	 * Prints Pascal's Triangle up to the specified number of rows.
	 * <p>
	 * Example output for n = 5:
	 * <pre>
	 * 1
	 * 1 1
	 * 1 2 1
	 * 1 3 3 1
	 * 1 4 6 4 1
	 * </pre>
	 *
	 * @param n the number of rows of Pascal's Triangle to print
	 */
	public static void pattern13(int n)
	{
		for( int i = 0; i < n; i++ )
		{
			int icj = 1;

			for( int j = 0; j <= i; j++ )
			{
				System.out.print(icj + " ");
				// Calculate the next binomial coefficient in the row
				int icjp1 = (icj * (i - j)) / (j + 1);
				icj = icjp1;
			}

			System.out.println();
		}
	}
}