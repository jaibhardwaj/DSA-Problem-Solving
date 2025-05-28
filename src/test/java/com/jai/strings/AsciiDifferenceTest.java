package com.jai.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsciiDifferenceTest
{

	@Test
	void asciiDiff()
	{
		String result = AsciiDifference.asciiDiff("abdgca");
		assertEquals("a1b2d3g-4c-2a", result);
	}
}