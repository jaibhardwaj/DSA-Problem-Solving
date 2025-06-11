package com.jai.pattern;

/**
 * The Pattern9 class provides a method to print a specific pattern of asterisks ('*')
 * in the shape of an 'X' for a given size n. The pattern consists of two diagonals:
 * one from the top-left to the bottom-right, and the other from the top-right to the bottom-left.
 */
public class Pattern9
{
	/**
	 * Prints an 'X' pattern of size n using asterisks ('*').
	 * Each row contains n characters, with '*' printed at positions where
	 * the row and column indices are equal (main diagonal) or where their sum is n + 1 (secondary diagonal).
	 * All other positions are filled with spaces.
	 * <p>
	 * Example for n = 5:
	 * *   *
	 * * *
	 * *
	 * * *
	 * *   *
	 *
	 * @param n the size of the pattern (number of rows and columns)
	 */
	public static void pattern9(int n)
	{
		// Iterate over each row
		for( int i = 1; i <= n; i++ )
		{
			// Iterate over each column in the current row
			for( int j = 1; j <= n; j++ )
			{
				// Print '*' if the current position is on either diagonal
				if( i == j || i + j == n + 1 )
				{
					System.out.print("*");
				}
				else
				{
					// Otherwise, print a space
					System.out.print(" ");
				}
			}
			// Move to the next line after printing all columns in the current row
			System.out.println();
		}
	}
}

