package com.jai.recursion;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the GetSubsequence class.
 */
class GetSubsequenceTest
{
	/**
	 * Test getSubsequences with a non-empty string.
	 */
	@Test
	void testGetSubsequences_NonEmptyString()
	{
		List<String> expected = Arrays.asList("", "c", "b", "bc", "a", "ac", "ab", "abc");
		ArrayList<String> result = GetSubsequence.getSubsequences("abc");
		assertTrue(result.containsAll(expected) && expected.containsAll(result),
				"Should return all subsequences of 'abc'");
	}

	/**
	 * Test getSubsequences with an empty string.
	 */
	@Test
	void testGetSubsequences_EmptyString()
	{
		ArrayList<String> result = GetSubsequence.getSubsequences("");
		assertEquals(1, result.size(), "Empty string should return one subsequence (empty string)");
		assertEquals("", result.get(0));
	}

	/**
	 * Test getSubsequences with a single character string.
	 */
	@Test
	void testGetSubsequences_SingleChar()
	{
		ArrayList<String> result = GetSubsequence.getSubsequences("x");
		assertTrue(result.containsAll(Arrays.asList("", "x")) && result.size() == 2);
	}
}

