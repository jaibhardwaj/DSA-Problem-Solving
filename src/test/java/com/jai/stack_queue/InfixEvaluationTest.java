package com.jai.stack_queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for InfixEvaluation class.
 */
public class InfixEvaluationTest
{
	/**
	 * Test infixEvaluation with simple expressions.
	 */
	@Test
	public void testSimpleExpressions()
	{
		assertEquals(7, InfixEvaluation.infixEvaluation("3+4"));
		assertEquals(14, InfixEvaluation.infixEvaluation("2*7"));
		assertEquals(2, InfixEvaluation.infixEvaluation("8/4"));
		assertEquals(1, InfixEvaluation.infixEvaluation("5-4"));
	}

	/**
	 * Test infixEvaluation with parentheses and precedence.
	 */
	@Test
	public void testParenthesesAndPrecedence()
	{
		assertEquals(12, InfixEvaluation.infixEvaluation("(2+3)*3-6/2"));
		assertEquals(12, InfixEvaluation.infixEvaluation("(1+2)*(3+1)"));
		assertEquals(7, InfixEvaluation.infixEvaluation("(1+2)*2+1"));
	}

	/**
	 * Test infixEvaluation with nested parentheses.
	 */
	@Test
	public void testNestedParentheses()
	{
		assertEquals(20, InfixEvaluation.infixEvaluation("((2+3)*4)"));
		assertEquals(6, InfixEvaluation.infixEvaluation("((1+2)+(1+2))"));
	}

	/**
	 * Test infixEvaluation with single digit.
	 */
	@Test
	public void testSingleDigit()
	{
		assertEquals(5, InfixEvaluation.infixEvaluation("5"));
	}
}

