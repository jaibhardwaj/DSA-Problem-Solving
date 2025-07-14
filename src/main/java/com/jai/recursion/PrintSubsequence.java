package com.jai.recursion;

/**
 * This class demonstrates how to print all subsequences of a given string using recursion.
 * A subsequence is a sequence derived from another sequence where some elements may be deleted
 * without changing the order of the remaining elements.
 */
public class PrintSubsequence
{
	public static void main(String[] args)
	{
		String que = "abc";
		printSubsequences(que, "");
	}

	/**
	 * This method prints all subsequences of a given string.
	 *
	 * @param que The input string from which subsequences are generated.
	 * @param ans The current subsequence being built.
	 */
	public static void printSubsequences(String que, String ans)
	{
		// Base case: if the input string is empty, print the answer
		if (que.isEmpty())
		{
			System.out.println(ans);
			return;
		}

		// Recursive case: process the first character and recurse for the rest
		char ch = que.charAt(0);
		String ros = que.substring(1);

		// Include the character
		printSubsequences(ros, ans + ch);

		// Exclude the character
		printSubsequences(ros, ans + "");
	}
}
