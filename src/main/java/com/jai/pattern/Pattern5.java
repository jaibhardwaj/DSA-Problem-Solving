package com.jai.pattern;

/**
 * The Pattern5 class provides methods to print various star patterns.
 */
public class Pattern5
{
	/**
	 * Prints a diamond-shaped pattern of stars with the specified number of rows.
	 * <p>
	 * The pattern consists of an upper and lower half, with the widest row in the middle.
	 * The number of rows, {@code n}, should be an odd positive integer to maintain symmetry.
	 * <p>
	 * Example for n = 5:
	 * <pre>
	 *   *
	 *  ***
	 * *****
	 *  ***
	 *   *
	 * </pre>
	 *
	 * @param n the total number of rows in the pattern (should be odd for symmetry)
	 */
	public static void pattern5(int n)
	{
		int sp = n / 2; // Number of spaces to print before stars on each line
		int st = 1;     // Number of stars to print on each line

		// Loop through each row
		for( int i = 1; i <= n; i++ )
		{
			// Print spaces for the current row
			for( int j = 1; j <= sp; j++ )
			{
				System.out.print(" ");
			}

			// Print stars for the current row
			for( int j = 1; j <= st; j++ )
			{
				System.out.print("*");
			}

			// Adjust the number of spaces and stars for the next row
			if( i <= n / 2 )
			{
				sp--;    // Decrease spaces in the upper half
				st += 2; // Increase stars in the upper half
			}
			else
			{
				sp++;    // Increase spaces in the lower half
				st -= 2; // Decrease stars in the lower half
			}

			// Move to the next line after printing each row
			System.out.println();
		}
	}
}

