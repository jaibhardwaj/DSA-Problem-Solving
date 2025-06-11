package com.jai.pattern;

/**
 * The Pattern7 class provides a method to print a specific pattern to the console.
 * The pattern consists of an n x n grid where asterisks (*) are printed on the main diagonal,
 * and spaces are printed elsewhere.
 */
public class Pattern7
{
	/**
	 * Prints an n x n pattern with asterisks on the main diagonal.
	 * For example, for n = 4:
	 * <pre>
	 * *
	 *  *
	 *   *
	 *    *
	 * </pre>
	 *
	 * @param n the size of the pattern (number of rows and columns)
	 */
	public static void pattern7(int n)
	{
		for( int i = 1; i <= n; i++ )
		{
			for( int j = 1; j <= n; j++ )
			{
				if( i == j )
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
