package com.jai.pattern;

/**
 * The Pattern18 class provides a method to print a specific star pattern
 * based on the input size n. The pattern consists of stars and tabs arranged
 * in a symmetric, hollow diamond-like shape.
 */
public class Pattern18
{
	/**
	 * Prints a symmetric, hollow diamond-like star pattern of size n.
	 * <p>
	 * The pattern uses tabs ("\t") for spacing and stars ("*") for the pattern.
	 * The number of rows printed is equal to n. The pattern is hollow in the
	 * upper half except for the border stars, and solid in the lower half.
	 * </p>
	 * <p>
	 * Example output for n = 7:
	 * <pre>
	 * *	*	*	*	*	*	*
	 * 		*				*
	 * 			*		*
	 * 				*
	 * 			*	*	*
	 * 		*	*	*	*	*
	 * *	*	*	*	*	*	*
	 * </pre>
	 *
	 * @param n the size of the pattern (number of rows); should be an odd positive integer
	 */
	public static void pattern18(int n)
	{
		// Number of leading spaces (in tabs) before the stars in each row
		int sp = 0;
		// Number of stars (and inner spaces) to print in each row
		int st = n;

		// Loop through each row
		for( int i = 1; i <= n; i++ )
		{
			// Print leading spaces (tabs) for the current row
			for( int j = 1; j <= sp; j++ )
			{
				System.out.print("\t");
			}

			// Print stars and inner spaces for the current row
			for( int j = 1; j <= st; j++ )
			{
				// For upper half (excluding first row), print spaces inside the pattern except for borders
				if( i > 1 && i <= n / 2 && j > 1 && j < st )
				{
					System.out.print("\t");
				}
				else
				{
					System.out.print("*\t");
				}
			}

			// Adjust the number of spaces and stars for the next row
			if( i <= n / 2 )
			{
				sp++;      // Increase leading spaces
				st -= 2;   // Decrease stars (and inner spaces)
			}
			else
			{
				sp--;      // Decrease leading spaces
				st += 2;   // Increase stars (and inner spaces)
			}

			// Move to the next line after finishing the current row
			System.out.println();
		}
	}
}
