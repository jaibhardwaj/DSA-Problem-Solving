package com.jai.pattern;

/**
 * The Pattern10 class provides a method to print a specific pattern of asterisks ('*')
 * and spaces to the console. The pattern resembles a hollow diamond or hourglass shape,
 * depending on the value of n.
 */
public class Pattern10
{
	/**
	 * Prints a hollow diamond/hourglass pattern of asterisks ('*') with the given number of rows.
	 * The pattern is symmetric and consists of n rows, where n should be an odd positive integer
	 * for best visual results.
	 * <p>
	 * Example for n = 5:
	 *    *
	 *  *   *
	 * *     *
	 *  *   *
	 *    *
	 *
	 * @param n the number of rows in the pattern (should be an odd positive integer)
	 */
	public static void pattern10(int n)
	{
		// os: number of outer spaces before the first asterisk in each row
		int os = n / 2;
		// is: number of inner spaces between asterisks in each row
		int is = -1;

		// Loop through each row
		for( int i = 1; i <= n; i++ )
		{
			// Print outer spaces
			for( int j = 1; j <= os; j++ )
			{
				System.out.print(" ");
			}

			// Print the first asterisk
			System.out.print("*");

			// Print inner spaces (only if is >= 0)
			for( int j = 1; j <= is; j++ )
			{
				System.out.print(" ");
			}

			// Print the second asterisk for all rows except the first and last
			if( i > 1 && i < n )
			{
				System.out.print("*");
			}

			// Move to the next line after each row
			System.out.println();

			// Update the number of outer and inner spaces for the next row
			if( i <= n / 2 )
			{
				os--;
				is += 2;
			}
			else
			{
				os++;
				is -= 2;
			}
		}
	}
}

