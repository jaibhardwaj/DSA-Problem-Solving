package com.jai.pattern;

/**
 * Prints a pattern of Fibonacci numbers in a triangular format.
 */
public class Pattern12
{
	/**
	 * Prints a pattern of Fibonacci numbers in a triangular format.
	 * <p>
	 * For a given integer n, the method prints n rows. The first row contains 1 Fibonacci number,
	 * the second row contains 2, and so on, with each number in the pattern being the next in the Fibonacci sequence.
	 * </p>
	 *
	 * <p>
	 * Example pattern for n = 5 (with spaces for clarity):
	 * <pre>
	 * 0
	 * 1 1
	 * 2 3 5
	 * 8 13 21 34
	 * 55 89 144 233 377
	 * </pre>
	 * </p>
	 *
	 * @param n the number of rows to print in the pattern
	 */
	public static void pattern12(int n)
	{
		int a = 0; // First Fibonacci number
		int b = 1; // Second Fibonacci number

		// Loop through each row
		for( int i = 1; i <= n; i++ )
		{
			// Print 'i' Fibonacci numbers in the current row
			for( int j = 1; j <= i; j++ )
			{
				System.out.print(a + " "); // Print the current Fibonacci number with a space

				// Calculate the next Fibonacci number
				int c = a + b;
				a = b;
				b = c;
			}
			System.out.println(); // Move to the next line after each row
		}
	}
}
