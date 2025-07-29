package com.jai.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the DuplicateBrackets class.
 */
class DuplicateBracketsTest
{

	@Test
	void testDuplicateBracketsTrue()
	{
		assertTrue(DuplicateBrackets.duplicateBrackets("((a+b)+((c+d)))"));
		assertTrue(DuplicateBrackets.duplicateBrackets("((a+b))"));
		assertTrue(DuplicateBrackets.duplicateBrackets("(a)+((b))"));
	}

	@Test
	void testDuplicateBracketsFalse()
	{
		assertFalse(DuplicateBrackets.duplicateBrackets("(a+b)+(c+d)"));
		assertFalse(DuplicateBrackets.duplicateBrackets("(a+(b+c)+(d+e))"));
		assertFalse(DuplicateBrackets.duplicateBrackets("a+b+c+d"));
	}

	@Test
	void testEmptyString()
	{
		assertFalse(DuplicateBrackets.duplicateBrackets(""));
	}

	@Test
	void testNoBrackets()
	{
		assertFalse(DuplicateBrackets.duplicateBrackets("abc"));
	}
}

