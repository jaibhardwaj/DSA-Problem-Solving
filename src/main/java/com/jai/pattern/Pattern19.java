package com.jai.pattern;

/**
 * The Pattern19 class provides a method to print a specific star pattern based on the input size.
 * The pattern is symmetric and consists of stars ('*') and spaces, forming a unique shape.
 *
 * Example output for n = 7:
 *
 * ****  *
 *    *  *
 *    *  *
 * *******
 * *  *
 * *  *
 * *  ****
 */
public class Pattern19
{
	/**
	 * Prints a star pattern of size n to the standard output.
	 * The pattern is constructed using nested loops and conditional logic to determine
	 * where stars and spaces should be printed on each line.
	 *
	 * @param n the size of the pattern (number of rows and columns). Should be an odd positive integer for best results.
	 */
	public static void pattern19(int n)
	{
		for( int i = 1; i <= n; i++ )
		{
			for( int j = 1; j <= n; j++ )
			{
				// Top-left quadrant
				if( i <= n / 2 )
				{
					if( j <= n / 2 )
					{
						if( i == 1 )
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					// Top-right quadrant
					else if( j == n || j == n / 2 + 1 )
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				// Middle row
				else if( i == n / 2 + 1 )
				{
					System.out.print("*");
				}
				// Bottom-left quadrant
				else
				{
					if( j == 1 || j == n / 2 + 1 )
					{
						System.out.print("*");
					}
					// Bottom-right quadrant
					else if( j > n / 2 + 1 )
					{
						if( i == n )
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}