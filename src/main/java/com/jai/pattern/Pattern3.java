package com.jai.pattern;

/**
 * The Pattern3 class provides a method to print a right-aligned triangle pattern of asterisks.
 */
public class Pattern3
{
	/**
	 * Prints a right-aligned triangle pattern of asterisks of height and width {@code n}.
	 * <p>
	 * For example, if {@code n = 5}, the output will be:
	 * <pre>
	 *     *
	 *    **
	 *   ***
	 *  ****
	 * *****
	 * </pre>
	 *
	 * @param n the number of rows and columns for the pattern; must be a positive integer
	 */
	public static void pattern3(int n)
	{
		for( int top = n; top >= 1; top-- )
		{
			for( int j = 1; j <= n; j++ )
			{
				if( j >= top )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

