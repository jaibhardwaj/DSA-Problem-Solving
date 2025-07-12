package com.jai.recursion;

import java.util.ArrayList;

/**
 * This class provides a method to generate all subsequences of a given string using recursion.
 * A subsequence is a sequence that can be derived from another sequence by deleting some elements without changing the order of the remaining elements.
 */
public class GetSubsequence
{
	/**
	 * Generates all subsequences of a given string using recursion.
	 *
	 * @param str The input string for which subsequences are to be generated.
	 * @return An ArrayList containing all subsequences of the input string.
	 */
	public static ArrayList<String> getSubsequences(String str)
	{
		if( str.isEmpty() )
		{
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add(""); // Base case: return an empty subsequence
			return baseResult;
		}

		char firstChar = str.charAt(0); // Get the first character
		String remainingString = str.substring(1); // Get the remaining string after the first character

		ArrayList<String> subsequencesOfRemaining = getSubsequences(remainingString); // Recursive call to get subsequences of the remaining string

		ArrayList<String> allSubsequences = new ArrayList<>();

		// Include the first character in all subsequences of the remaining string
		for( String subsequence : subsequencesOfRemaining )
		{
			allSubsequences.add(subsequence); // Add the subsequence without the first character
			allSubsequences.add(firstChar + subsequence); // Add the subsequence with the first character
		}
		return allSubsequences; // Return the list of all subsequences
	}
}
