package com.jai.pattern;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Pattern13Test
{

	/**
	 * Helper method to capture the output of pattern13.
	 */
	private String getPatternOutput(int n)
	{
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		try
		{
			Pattern13.pattern13(n);
		}
		finally
		{
			System.setOut(originalOut);
		}
		return outContent.toString();
	}

	@Test
	void testPattern13_nIs1()
	{
		String expected = "1 \n";
		assertEquals(expected, getPatternOutput(1));
	}

	@Test
	void testPattern13_nIs3()
	{
		String expected = ""
				+ "1 \n"
				+ "1 1 \n"
				+ "1 2 1 \n";
		assertEquals(expected, getPatternOutput(3));
	}

	@Test
	void testPattern13_nIs5()
	{
		String expected = ""
				+ "1 \n"
				+ "1 1 \n"
				+ "1 2 1 \n"
				+ "1 3 3 1 \n"
				+ "1 4 6 4 1 \n";
		assertEquals(expected, getPatternOutput(5));
	}

	@Test
	void testPattern13_nIs0()
	{
		String expected = "";
		assertEquals(expected, getPatternOutput(0));
	}
}