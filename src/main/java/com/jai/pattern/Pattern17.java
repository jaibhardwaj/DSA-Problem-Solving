package com.jai.pattern;

/**
 * The Pattern17 class provides a method to print a specific star pattern.
 * The pattern consists of a centered row of stars, with increasing and then decreasing
 * number of stars on each row, forming a symmetric shape with a wide middle row.
 */
public class Pattern17
{
	/**
	 * Prints a symmetric star pattern based on the given size.
	 * <pre>
	 * For n = 7, the output will be:
	 *             *
	 *             *   *
	 *             *   *   *
	 * *   *   *   *   *   *   *
	 *             *   *   *
	 *             *   *
	 *             *
	 * </pre>
	 *
	 * @param n The number of rows in the pattern. Should be an odd positive integer for symmetry.
	 */
	public static void pattern17(int n)
	{
		int sp = n / 2; // Number of leading spaces (tabs) before stars
		int st = 1;     // Number of stars to print on the current row

		for( int i = 1; i <= n; i++ )
		{
			// For the middle row, print stars instead of spaces
			if( i == n / 2 + 1 )
			{
				for( int j = 1; j <= sp; j++ )
				{
					System.out.print("*\t");
				}
			}
			else
			{
				for( int j = 1; j <= sp; j++ )
				{
					System.out.print("\t");
				}
			}

			// Print the stars for the current row
			for( int j = 1; j <= st; j++ )
			{
				System.out.print("*\t");
			}

			// Adjust the number of stars for the next row
			if( i <= n / 2 )
			{
				st++;
			}
			else
			{
				st--;
			}

			System.out.println();
		}
	}
}
