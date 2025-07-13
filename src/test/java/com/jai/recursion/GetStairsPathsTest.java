package com.jai.recursion;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for GetStairsPaths class.
 */
class GetStairsPathsTest
{

	/**
	 * Test getStairsPaths with n = 0 (base case).
	 */
	@Test
	void testGetStairsPaths_BaseCase()
	{
		ArrayList<String> result = GetStairsPaths.getStairsPaths(0);
		assertEquals(1, result.size());
		assertEquals("", result.get(0));
	}

	/**
	 * Test getStairsPaths with n = 1.
	 */
	@Test
	void testGetStairsPaths_OneStep()
	{
		ArrayList<String> result = GetStairsPaths.getStairsPaths(1);
		List<String> expected = List.of("1");
		assertEquals(expected, result);
	}

	/**
	 * Test getStairsPaths with n = 2.
	 */
	@Test
	void testGetStairsPaths_TwoSteps()
	{
		ArrayList<String> result = GetStairsPaths.getStairsPaths(2);
		List<String> expected = Arrays.asList("11", "2");
		assertTrue(result.containsAll(expected));
		assertEquals(2, result.size());
	}

	/**
	 * Test getStairsPaths with n = 3.
	 */
	@Test
	void testGetStairsPaths_ThreeSteps()
	{
		ArrayList<String> result = GetStairsPaths.getStairsPaths(3);
		List<String> expected = Arrays.asList("111", "12", "21", "3");
		assertTrue(result.containsAll(expected));
		assertEquals(4, result.size());
	}

	/**
	 * Test getStairsPaths with negative n (should return empty list).
	 */
	@Test
	void testGetStairsPaths_NegativeSteps()
	{
		ArrayList<String> result = GetStairsPaths.getStairsPaths(-1);
		assertTrue(result.isEmpty());
	}
}

