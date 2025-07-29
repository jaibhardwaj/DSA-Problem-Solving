package com.jai.stack;

import java.util.Stack;

public class DuplicateBrackets
{
	public static boolean duplicateBrackets(String expression)
	{
		Stack<Character> stack = new Stack<>();

		for( int i = 0; i < expression.length(); i++ )
		{
			char ch = expression.charAt(i);

			// If the character is a closing bracket
			if( ch == ')' )
			{
				// Check if the top of the stack is an opening bracket
				if( stack.peek() == '(' )
				{
					return true; // Duplicate brackets found
				}
				// Pop elements until we find the matching opening bracket
				while(stack.peek() != '(')
				{
					stack.pop();
				}
				// Pop the opening bracket
				stack.pop();
			}
			else
			{
				// Push all other characters onto the stack
				stack.push(ch);
			}
		}

		return false; // No duplicate brackets found
	}
}
