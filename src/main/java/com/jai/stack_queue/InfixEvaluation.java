package com.jai.stack_queue;

import java.util.Stack;

public class InfixEvaluation
{
	/**
	 * Evaluates an infix expression containing single-digit integers and the
	 * operators +, -, *, /, and parentheses.
	 * The algorithm uses two stacks: one for operators and one for operands.
	 * It processes the expression character by character, handling parentheses,
	 * operator precedence, and performing calculations as needed.
	 * The time complexity of this algorithm is O(n), where n is the length of the
	 * expression. This is because each character in the expression is processed
	 * exactly once, and each operation (push/pop) on the stacks is O(1).
	 *
	 * @param expression The infix expression to evaluate.
	 * @return The result of the evaluated expression as an integer.
	 */
	public static int infixEvaluation(String expression)
	{
		Stack<Character> operatorStack = new Stack<>();
		Stack<Integer> operandStack = new Stack<>();

		for( int i = 0; i < expression.length(); i++ )
		{
			char ch = expression.charAt(i);
			if( ch == '(' )
			{
				operatorStack.push(ch);
			}
			else if( Character.isDigit(ch) )
			{
				operandStack.push(ch - '0'); // Convert char to int
			}
			else if( ch == ')' )
			{
				while(operatorStack.peek() != '(')
				{
					int b = operandStack.pop();
					int a = operandStack.pop();
					char operator = operatorStack.pop();
					int result = operation(a, b, operator);
					operandStack.push(result);
				}
				operatorStack.pop(); // Pop the '('
			}
			else if( ch == '+' || ch == '-' || ch == '*' || ch == '/' )
			{
				while(!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(ch))
				{
					int b = operandStack.pop();
					int a = operandStack.pop();
					char operator = operatorStack.pop();
					int result = operation(a, b, operator);
					operandStack.push(result);
				}
				operatorStack.push(ch);
			}
		}

		while(!operatorStack.isEmpty())
		{
			int b = operandStack.pop();
			int a = operandStack.pop();
			char operator = operatorStack.pop();
			int result = operation(a, b, operator);
			operandStack.push(result);
		}

		return operandStack.pop();
	}

	public static int precedence(char operator)
	{
		return switch(operator)
		{
			case '+', '-' -> 1;
			case '*', '/' -> 2;
			default -> -1; // Invalid operator
		};
	}

	public static int operation(int a, int b, char operator)
	{
		return switch(operator)
		{
			case '+' -> a + b;
			case '-' -> a - b;
			case '*' -> a * b;
			case '/' -> a / b;
			default -> throw new IllegalArgumentException("Invalid operator: " + operator);
		};
	}
}
