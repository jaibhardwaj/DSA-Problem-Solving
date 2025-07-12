package com.jai.recursion;

import java.util.ArrayList;

public class GetKeypadCombination
{
	public static String[] keypad = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

	/**
	 * This method generates all possible combinations of characters that can be formed
	 * from a given string of digits based on a typical mobile keypad layout.
	 *
	 * @param str The input string containing digits (0-9).
	 * @return An ArrayList containing all possible combinations of characters.
	 */
	public static ArrayList<String> getKeypadCombination(String str)
	{
		// Base case: if the string is empty, return a list with an empty string
		if( str.isEmpty() )
		{
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}

		// Recursive case: process the first character and get combinations for the rest
		char ch = str.charAt(0);
		String remaining = str.substring(1);

		// Convert the character to its corresponding index in the keypad array
		int index = Character.getNumericValue(ch);
		String letters = keypad[index];

		// Recursive call to get combinations for the remaining string
		ArrayList<String> combinations = getKeypadCombination(remaining);

		// Prepare the result list by combining the current character with all combinations
		ArrayList<String> result = new ArrayList<>();

		for( int i = 0; i < letters.length(); i++ )
		{
			for( String combination : combinations )
			{
				result.add(letters.charAt(i) + combination);
			}
		}

		return result;
	}
}
