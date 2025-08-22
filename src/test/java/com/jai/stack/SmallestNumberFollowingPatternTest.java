package com.jai.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for SmallestNumberFollowingPattern.
 */
class SmallestNumberFollowingPatternTest
{

	@Test
	void testTypicalPatterns()
	{
		assertEquals("124365", SmallestNumberFollowingPattern.smallestNumber("IIDID"));
		assertEquals("21435", SmallestNumberFollowingPattern.smallestNumber("DIDI"));
		assertEquals("12345", SmallestNumberFollowingPattern.smallestNumber("IIII"));
		assertEquals("54321", SmallestNumberFollowingPattern.smallestNumber("DDDD"));
	}

	@Test
	void testEdgeCases()
	{
		assertEquals("12", SmallestNumberFollowingPattern.smallestNumber("I"));
		assertEquals("21", SmallestNumberFollowingPattern.smallestNumber("D"));
		assertEquals("1", SmallestNumberFollowingPattern.smallestNumber(""));
	}

	@Test
	void testLongPattern()
	{
		String pattern = "IDIDIDID";
		assertEquals("132547698", SmallestNumberFollowingPattern.smallestNumber(pattern));
	}
}
