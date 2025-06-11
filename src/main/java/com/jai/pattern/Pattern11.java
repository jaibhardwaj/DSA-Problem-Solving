package com.jai.pattern;

/**
 * The Pattern11 class provides a method to print a specific numeric pattern.
 * The pattern printed is a left-aligned triangle of consecutive numbers,
 * where each row contains an increasing count of numbers starting from 1.
 * <p>
 * Example for n = 4:
 * 1
 * 23
 * 456
 * 78910
 */
public class Pattern11
{
	/**
	 * Prints a left-aligned triangle of consecutive numbers.
	 * Each row i contains i numbers, starting from 1 and incrementing sequentially.
	 *
	 * @param n the number of rows to print in the pattern
	 */
	public static void pattern11(int n)
	{
		int val = 1; // Initialize the starting value to print
		for( int i = 1; i <= n; i++ )
		{
			// Print 'i' numbers in the current row
			for( int j = 1; j <= i; j++ )
			{
				System.out.print(val); // Print the current value
				val++; // Increment the value for the next number
			}
			System.out.println(); // Move to the next line after each row
		}
	}
}
