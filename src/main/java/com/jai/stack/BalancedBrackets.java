package com.jai.stack;

import java.util.Stack;

public class BalancedBrackets
{
	/**
	 * Checks if the brackets in the given expression are balanced.
	 * This method uses a stack to keep track of opening brackets and ensures
	 * that each closing bracket matches the most recent unmatched opening bracket.
	 *
	 * @param expression The string expression containing brackets.
	 * @return true if the brackets are balanced, false otherwise.
	 */
	public static boolean balancedBrackets(String expression)
	{
		Stack<Character> stack = new Stack<>();

		for( int i = 0; i < expression.length(); i++ )
		{
			char ch = expression.charAt(i);

			if( ch == '(' || ch == '{' || ch == '[' )
			{
				stack.push(ch);
			}
			else if( ch == ')' || ch == '}' || ch == ']' )
			{
				if( stack.isEmpty() )
				{
					return false; // Unmatched closing bracket
				}

				char top = stack.pop();
				if( (ch == ')' && top != '(') ||
						(ch == '}' && top != '{') ||
						(ch == ']' && top != '[') )
				{
					return false; // Mismatched brackets
				}
			}
		}

		return stack.isEmpty(); // True if all brackets are matched
	}
}
