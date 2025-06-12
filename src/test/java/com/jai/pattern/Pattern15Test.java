package com.jai.pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the Pattern15 class.
 */
public class Pattern15Test
{

	private final PrintStream originalOut = System.out;
	private ByteArrayOutputStream outContent;

	@BeforeEach
	void setUpStreams()
	{
		outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
	}

	@AfterEach
	void restoreStreams()
	{
		System.setOut(originalOut);
	}

	@Test
	void testPattern15With5()
	{
		String expected =
				"\t\t1\t\n" +
						"\t2\t3\t2\t\n" +
						"3\t4\t5\t4\t3\t\n" +
						"\t2\t3\t2\t\n" +
						"\t\t1\t\n";
		Pattern15.pattern15(5);
		assertEquals(expected, outContent.toString());
	}

	@Test
	void testPattern15With1()
	{
		String expected = "1\t\n";
		Pattern15.pattern15(1);
		assertEquals(expected, outContent.toString());
	}

	@Test
	void testPattern15With3()
	{
		String expected =
				"\t1\t\n" +
						"2\t3\t2\t\n" +
						"\t1\t\n";
		Pattern15.pattern15(3);
		assertEquals(expected, outContent.toString());
	}

	@Test
	void testPattern15WithOddNumber()
	{
		// n = 7
		String expected =
				"\t\t\t1\t\n" +
						"\t\t2\t3\t2\t\n" +
						"\t3\t4\t5\t4\t3\t\n" +
						"4\t5\t6\t7\t6\t5\t4\t\n" +
						"\t3\t4\t5\t4\t3\t\n" +
						"\t\t2\t3\t2\t\n" +
						"\t\t\t1\t\n";
		Pattern15.pattern15(7);
		assertEquals(expected, outContent.toString());
	}
}