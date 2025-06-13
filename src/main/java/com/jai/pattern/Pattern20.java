package com.jai.pattern;

/**
 * The Pattern20 class provides a method to print a 'W' shaped star pattern
 * based on the input size n. The pattern consists of a solid first and last row,
 * and for rows in the lower half, stars are printed on the diagonals to form a 'W'.
 */
public class Pattern20
{
	/**
	 * Prints a 'W' shaped star pattern of size n x n to the standard output.
	 * <p>
	 * The pattern has the following characteristics:
	 * <ul>
	 *   <li>The first and last rows are filled with stars ('*').</li>
	 *   <li>For rows in the lower half (i > n/2), stars are printed on the main and secondary diagonals.</li>
	 *   <li>All other positions are filled with spaces.</li>
	 * </ul>
	 * <p>
	 *
	 * @param n the size of the pattern (number of rows and columns)
	 */
	public static void pattern20(int n)
	{
		// Iterate over each row
		for( int i = 1; i <= n; i++ )
		{
			// Iterate over each column in the current row
			for( int j = 1; j <= n; j++ )
			{
				// Print star for the first or last row
				if( i == 1 || i == n )
				{
					System.out.print("*");
				}
				// For lower half rows, print star on main or secondary diagonal
				else if( i > n / 2 && (i == j || i + j == n + 1) )
				{
					System.out.print("*");
				}
				// Otherwise, print space
				else
				{
					System.out.print(" ");
				}
			}
			// Move to the next line after each row
			System.out.println();
		}
	}
}
