package com.jai.stack;

import java.util.Stack;

public class PrefixEvaluationAndConversion
{

	public static void main(String[] args)
	{
		String expression = "-+2/*6483";
		evaluatePrefix(expression);
	}

	/**
	 * Evaluates a prefix expression and converts it to infix and postfix expressions.
	 *
	 * @param expression The prefix expression to evaluate.
	 */
	public static void evaluatePrefix(String expression)
	{
		Stack<Integer> valueStack = new Stack<>();
		Stack<String> infixStack = new Stack<>();
		Stack<String> postStack = new Stack<>();

		for( int i = expression.length() - 1; i >= 0; i-- )
		{
			char ch = expression.charAt(i);
			if( Character.isDigit(ch) )
			{
				valueStack.push(ch - '0');
				infixStack.push(ch + "");
				postStack.push(ch + "");
			}
			else
			{
				int a = valueStack.pop();
				int b = valueStack.pop();
				int result = switch(ch)
				{
					case '+' -> a + b;
					case '-' -> a - b;
					case '*' -> a * b;
					case '/' -> a / b;
					default -> 0;
				};

				valueStack.push(result);

				String infixA = infixStack.pop();
				String infixB = infixStack.pop();
				infixStack.push("(" + infixA + ch + infixB + ")");

				String postA = postStack.pop();
				String postB = postStack.pop();
				postStack.push(postA + postB + ch);
			}
		}

		System.out.println("Value: " + valueStack.pop());
		System.out.println("Infix: " + infixStack.pop());
		System.out.println("Postfix: " + postStack.pop());
	}
}
