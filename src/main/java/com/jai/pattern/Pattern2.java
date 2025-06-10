package com.jai.pattern;

/**
 * The Pattern2 class provides a method to print a pattern of asterisks
 * in decreasing order, forming a right-angled triangle.
 */
public class Pattern2
{
	/**
	 * Prints a right-angled triangle pattern of asterisks with the given number of rows.
	 * Each row contains one less asterisk than the previous row.
	 * <p>
	 * Example for n = 4:
	 * ****
	 * ***
	 * **
	 * *
	 *
	 * @param n the number of rows in the pattern
	 */
	public static void pattern2(int n)
	{
		for( int i = n; i >= 1; i-- )
		{
			for( int j = 1; j <= i; j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

