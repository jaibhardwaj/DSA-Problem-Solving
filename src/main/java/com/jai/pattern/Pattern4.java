package com.jai.pattern;

/**
 * The Pattern4 class provides a method to print a left-aligned triangle pattern
 * of asterisks ('*') with decreasing number of stars and increasing spaces on each line.
 * <p>
 * Example for n = 5:
 * <pre>
 * *****
 *  ****
 *   ***
 *    **
 *     *
 * </pre>
 */
public class Pattern4
{
	/**
	 * Prints a left-aligned triangle pattern of asterisks with the specified number of rows.
	 *
	 * @param n the number of rows in the pattern
	 */
	public static void pattern4(int n)
	{
		int sp = 0; // Number of spaces to print before stars on each line
		int st = n; // Number of stars to print on each line

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

			// Move to the next row: increment spaces, decrement stars
			sp++;
			st--;
			System.out.println();
		}
	}
}

