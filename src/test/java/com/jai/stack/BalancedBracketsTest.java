package com.jai.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the BalancedBrackets class.
 */
class BalancedBracketsTest
{

	@Test
	void testBalancedBrackets_TrueCases()
	{
		assertFalse(BalancedBrackets.balancedBrackets("())"));
		assertTrue(BalancedBrackets.balancedBrackets("([]){}"));
		assertTrue(BalancedBrackets.balancedBrackets("{[()]}"));
		assertTrue(BalancedBrackets.balancedBrackets("((({[]})))"));
		assertTrue(BalancedBrackets.balancedBrackets("")); // empty string
	}

	@Test
	void testBalancedBrackets_FalseCases()
	{
		assertFalse(BalancedBrackets.balancedBrackets("("));
		assertFalse(BalancedBrackets.balancedBrackets(")("));
		assertFalse(BalancedBrackets.balancedBrackets("([)]"));
		assertFalse(BalancedBrackets.balancedBrackets("((())"));
		assertFalse(BalancedBrackets.balancedBrackets("{[(])}"));
	}

	@Test
	void testBalancedBrackets_OnlyNonBrackets()
	{
		assertTrue(BalancedBrackets.balancedBrackets("abc123"));
	}
}

