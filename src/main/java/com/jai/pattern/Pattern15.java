package com.jai.pattern;

public class Pattern15
{
	/**
	 * Prints a symmetric numeric pyramid pattern based on the given number of rows.
	 * <p>
	 * For a given odd integer n, the pattern consists of n rows. Each row contains
	 * a sequence of numbers that increase to the center and then decrease, with
	 * appropriate tab spacing to maintain symmetry.
	 * </p>
	 *
	 * <p>
	 * <b>Sample Input/Output:</b>
	 * <pre>
	 * pattern15(5);
	 * Output:
	 *         1
	 *     2   3   2
	 * 3   4   5   4   3
	 *     2   3   2
	 *         1
	 * </pre>
	 * </p>
	 *
	 * @param n the number of rows in the pattern (should be an odd positive integer)
	 */
	public static void pattern15(int n)
	{
		int sp = n / 2; // Number of leading spaces (tabs) for the current row
		int st = 1;     // Number of numbers to print in the current row
		int temp = 1;   // Starting number for the current row

		for( int i = 1; i <= n; i++ )
		{
			// Print leading spaces (tabs)
			for( int j = 1; j <= sp; j++ )
			{
				System.out.print("\t");
			}

			int num = temp; // Initialize the number to print
			// Print the numbers in the current row
			for( int j = 1; j <= st; j++ )
			{
				System.out.print(num + "\t");
				if( j <= st / 2 )
				{
					num++; // Increment number until the center
				}
				else
				{
					num--; // Decrement number after the center
				}
			}

			// Adjust the number of spaces, numbers, and starting number for the next row
			if( i <= n / 2 )
			{
				sp--;
				st += 2;
				temp++;
			}
			else
			{
				sp++;
				st -= 2;
				temp--;
			}

			System.out.println();

		}
	}
}
