package com.jai.pattern;

/**
 * The Pattern16 class contains a method to print a specific numeric pattern.
 * The pattern consists of numbers increasing from 1 up to a certain value,
 * followed by spaces, and then numbers decreasing back to 1, forming a symmetric shape.
 */
public class Pattern16
{
	/**
	 * Prints a symmetric numeric pattern based on the input value n.
	 * <pre>
	 * For example, for n = 5, the output will be:
	 * 1                               1
	 * 1   2                       2   1
	 * 1   2   3               3   2   1
	 * 1   2   3   4       4   3   2   1
	 * 1   2   3   4   5   4   3   2   1
	 * </pre>
	 *
	 * @param n the number of rows and the maximum number in the pattern
	 */
	public static void pattern16(int n)
	{
		// Number of spaces between the two sets of numbers in each row
		int sp = 2 * n - 3;
		// Number of numbers to print on each side of the pattern
		int st = 1;

		// Loop through each row
		for( int i = 1; i <= n; i++ )
		{
			// Print increasing numbers from 1 to st
			for( int j = 1; j <= st; j++ )
			{
				System.out.print(j + "\t");
			}

			// Print spaces (tabs) between the two sets of numbers
			for( int j = 1; j <= sp; j++ )
			{
				System.out.print("\t");
			}

			// On the last row, avoid repeating the middle number
			if( i == n )
			{
				st--;
			}

			// Print decreasing numbers from st down to 1
			for( int j = st; j >= 1; j-- )
			{
				System.out.print(j + "\t");
			}

			// Decrease the number of spaces by 2 for the next row
			sp -= 2;
			// Increase the number of numbers to print for the next row
			st++;

			// Move to the next line after each row
			System.out.println();
		}
	}
}
