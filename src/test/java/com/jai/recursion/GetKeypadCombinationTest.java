package com.jai.recursion;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the GetKeypadCombination class.
 */
class GetKeypadCombinationTest
{
	@Test
	void testGetKeypadCombination_Typical()
	{
		ArrayList<String> result = GetKeypadCombination.getKeypadCombination("23");
		// According to the keypad mapping in the class:
		// 2 -> "def", 3 -> "ghi"
		List<String> correctExpected = Arrays.asList(
				"dg", "dh", "di",
				"eg", "eh", "ei",
				"fg", "fh", "fi"
		);
		assertTrue(result.containsAll(correctExpected) && correctExpected.containsAll(result),
				"Should return all keypad combinations for '23' as per keypad mapping");
	}

	@Test
	void testGetKeypadCombination_Empty()
	{
		ArrayList<String> result = GetKeypadCombination.getKeypadCombination("");
		assertEquals(1, result.size(), "Empty string should return one combination (empty string)");
		assertEquals("", result.get(0));
	}

	@Test
	void testGetKeypadCombination_SingleDigit()
	{
		ArrayList<String> result = GetKeypadCombination.getKeypadCombination("2");
		List<String> expected = Arrays.asList("d", "e", "f");
		assertTrue(result.containsAll(expected) && expected.containsAll(result));
	}
}
