package com.jai.pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the Pattern1 class.
 */
public class Pattern1Test
{

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@BeforeEach
	void setUpStreams()
	{
		System.setOut(new PrintStream(outContent));
	}

	@AfterEach
	void restoreStreams()
	{
		System.setOut(originalOut);
	}

	@Test
	void testPattern1WithN3()
	{
		Pattern1.pattern1(3);
		String expected = "x\nxx\nxxx\n";
		assertEquals(expected, outContent.toString());
	}

	@Test
	void testPattern1WithN1()
	{
		Pattern1.pattern1(1);
		String expected = "x\n";
		assertEquals(expected, outContent.toString());
	}

	@Test
	void testPattern1WithN0()
	{
		Pattern1.pattern1(0);
		String expected = "";
		assertEquals(expected, outContent.toString());
	}
}
