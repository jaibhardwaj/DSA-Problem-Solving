package com.jai.stack;

import java.util.Stack;

public class PostfixEvaluationAndConversion
{
	/**
	 * Evaluates a postfix expression and converts it to infix and prefix expressions.
	 *
	 * @param args The postfix expression to evaluate.
	 */
	public static void main(String[] args)
	{
		String expression = "264*8/+3-";
		evaluatePostfix(expression);
	}

	/**
	 * Evaluates the given postfix expression and converts it to infix and prefix expressions.
	 *
	 * @param expression The postfix expression to evaluate.
	 */
	public static void evaluatePostfix(String expression)
	{
		Stack<Integer> valueStack = new Stack<>();
		Stack<String> infixStack = new Stack<>();
		Stack<String> prefixStack = new Stack<>();

		for( char ch : expression.toCharArray() )
		{
			if( Character.isDigit(ch) )
			{
				valueStack.push(ch - '0');
				infixStack.push(ch + "");
				prefixStack.push(ch + "");
			}
			else
			{
				int b = valueStack.pop();
				int a = valueStack.pop();
				int result = switch(ch)
				{
					case '+' -> a + b;
					case '-' -> a - b;
					case '*' -> a * b;
					case '/' -> a / b;
					default -> 0;
				};

				valueStack.push(result);

				String infixB = infixStack.pop();
				String infixA = infixStack.pop();
				infixStack.push("(" + infixA + " " + ch + " " + infixB + ")");

				String prefixB = prefixStack.pop();
				String prefixA = prefixStack.pop();
				prefixStack.push(ch + prefixA + prefixB);
			}
		}

		System.out.println("Postfix Expression: " + expression);
		System.out.println("Evaluated Result: " + valueStack.pop());
		System.out.println("Infix Expression: " + infixStack.pop());
		System.out.println("Prefix Expression: " + prefixStack.pop());
	}
}
