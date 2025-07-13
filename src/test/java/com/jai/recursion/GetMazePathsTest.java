package com.jai.recursion;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for GetMazePaths class.
 */
class GetMazePathsTest
{

	/**
	 * Test getMazePaths for a 1x1 maze (start == end).
	 */
	@Test
	void testGetMazePaths_BaseCase()
	{
		ArrayList<String> result = GetMazePaths.getMazePaths(0, 0, 0, 0);
		assertEquals(1, result.size());
		assertEquals("", result.get(0));
	}

	/**
	 * Test getMazePaths for a 2x2 maze.
	 */
	@Test
	void testGetMazePaths_2x2()
	{
		ArrayList<String> result = GetMazePaths.getMazePaths(0, 0, 1, 1);
		List<String> expected = Arrays.asList("HV", "VH");
		assertTrue(result.containsAll(expected));
		assertEquals(2, result.size());
	}

	/**
	 * Test getMazePaths for a 3x3 maze.
	 */
	@Test
	void testGetMazePaths_3x3()
	{
		ArrayList<String> result = GetMazePaths.getMazePaths(0, 0, 2, 2);
		List<String> expected = Arrays.asList(
				"HHVV", "HVHV", "HVVH", "VHHV", "VHVH", "VVHH"
		);
		assertTrue(result.containsAll(expected));
		assertEquals(6, result.size());
	}

	/**
	 * Test getMazePaths for a single row maze.
	 */
	@Test
	void testGetMazePaths_SingleRow()
	{
		ArrayList<String> result = GetMazePaths.getMazePaths(0, 0, 0, 2);
		List<String> expected = List.of("VV");
		assertEquals(expected, result);
	}

	/**
	 * Test getMazePaths for a single column maze.
	 */
	@Test
	void testGetMazePaths_SingleColumn()
	{
		ArrayList<String> result = GetMazePaths.getMazePaths(0, 0, 2, 0);
		List<String> expected = List.of("HH");
		assertEquals(expected, result);
	}
}

