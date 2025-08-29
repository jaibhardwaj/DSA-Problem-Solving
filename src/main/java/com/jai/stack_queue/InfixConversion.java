package com.jai.stack_queue;

import java.util.Stack;

public class InfixConversion
{

	/**
	 * This class provides methods to convert an infix expression to both prefix
	 * and postfix notation using stacks. It handles operator precedence and
	 * parentheses correctly.
	 */
	public static void main(String[] args)
	{
		String expression = "(2+3)*3-6/2";
		infixToPrefixAndPostfix(expression);
	}

	/**
	 * Converts an infix expression to both prefix and postfix notation.
	 * The algorithm uses two stacks: one for operators and one for operands.
	 * It processes the expression character by character, handling parentheses,
	 * operator precedence, and constructing the prefix and postfix expressions.
	 * The time complexity of this algorithm is O(n), where n is the length of the
	 * expression. This is because each character in the expression is processed
	 * exactly once, and each operation (push/pop) on the stacks is O(1).
	 *
	 * @param expression The infix expression to convert.
	 */
	public static void infixToPrefixAndPostfix(String expression)
	{
		Stack<String> prefix = new Stack<>();
		Stack<String> postfix = new Stack<>();
		Stack<Character> operatorStack = new Stack<>();

		for( int i = 0; i < expression.length(); i++ )
		{
			char ch = expression.charAt(i);
			if( ch == '(' )
			{
				operatorStack.push(ch);
			}
			else if( Character.isLetterOrDigit(ch) )
			{
				prefix.push(String.valueOf(ch)); // Push the digit as a string
				postfix.push(String.valueOf(ch)); // Push the digit as a string
			}
			else if( ch == ')' )
			{
				while(operatorStack.peek() != '(')
				{
					String b = postfix.pop();
					String a = postfix.pop();
					char operator = operatorStack.pop();
					postfix.push(postOperation(a, b, operator));
					prefix.push(preOperation(a, b, operator));
				}
				operatorStack.pop(); // Pop the '('
			}
			else if( ch == '+' || ch == '-' || ch == '*' || ch == '/' )
			{
				while(!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(ch))
				{
					String b = postfix.pop();
					String a = postfix.pop();
					char operator = operatorStack.pop();
					postfix.push(postOperation(a, b, operator));
					prefix.push(preOperation(a, b, operator));
				}
				operatorStack.push(ch);
			}
		}

		while(!operatorStack.isEmpty())
		{
			String b = postfix.pop();
			String a = postfix.pop();
			char operator = operatorStack.pop();
			postfix.push(postOperation(a, b, operator));
			prefix.push(preOperation(a, b, operator));
		}

		System.out.println("Prefix: " + prefix.peek());
		System.out.println("Postfix: " + postfix.peek());
	}

	public static String preOperation(String a, String b, char operator)
	{
		// This method constructs a prefix expression by placing the operator before its operands
		// For example, if a = "2", b = "3", and operator = '+', it returns "+23"
		// If the operator is not one of the specified operators, it returns an empty string
		// This is useful for converting infix expressions to prefix notation
		// where the operator precedes its operands.
		return switch(operator)
		{
			case '+' -> '+' + a + b;
			case '-' -> '-' + a + b;
			case '*' -> '*' + a + b;
			case '/' -> '/' + a + b;
			default -> ""; // For any other character, return an empty string
		};
	}

	public static String postOperation(String a, String b, char operator)
	{
		// This method constructs a postfix expression by placing the operator after its operands
		// For example, if a = "2", b = "3", and operator = '+', it returns "23+"
		// If the operator is not one of the specified operators, it returns an empty string
		// This is useful for converting infix expressions to postfix notation
		// where the operator follows its operands.
		// This is useful for converting infix expressions to postfix notation
		// where the operator follows its operands.
		return switch(operator)
		{
			case '+' -> a + b + '+';
			case '-' -> a + b + '-';
			case '*' -> a + b + '*';
			case '/' -> a + b + '/';
			default -> ""; // For any other character, return an empty string
		};
	}

	public static int precedence(char operator)
	{
		return switch(operator)
		{
			case '+', '-' -> 1;
			case '*', '/' -> 2;
			default -> -1; // For any other character, return -1
		};
	}
}
