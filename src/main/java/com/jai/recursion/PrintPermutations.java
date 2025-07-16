package com.jai.recursion;

public class PrintPermutations
{

	/**
	 * Main method to test the printPermutations function.
	 *
	 * @param args Command line arguments (not used).
	 */
	public static void main(String[] args)
	{
		String str = "abc"; // Input string for which permutations are to be printed
		printPermutations(str, ""); // Start the recursive function with an empty answer string
	}

	/**
	 * This method prints all permutations of a given string.
	 *
	 * @param str The input string for which permutations are to be printed.
	 * @param ans The current permutation being built.
	 */
	public static void printPermutations(String str, String ans)
	{
		// Base case: if the input string is empty, print the current permutation
		if( str.isEmpty() )
		{
			System.out.println(ans);
			return;
		}

		// Recursive case: iterate through each character in the string
		for( int i = 0; i < str.length(); i++ )
		{
			char ch = str.charAt(i); // Get the current character
			String remaining = str.substring(0, i) + str.substring(i + 1); // Remaining characters after removing the current one
			printPermutations(remaining, ans + ch); // Recursive call with updated parameters
		}
	}
}
