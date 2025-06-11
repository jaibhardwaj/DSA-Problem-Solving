package com.jai.pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Pattern10Test
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
	void testPattern10_n5()
	{
		String expected =
				"  *\n"
						+ " * *\n"
						+ "*   *\n"
						+ " * *\n"
						+ "  *\n";
		Pattern10.pattern10(5);
		assertEquals(expected, outContent.toString());
	}

	@Test
	void testPattern10_n3()
	{
		String expected =
				" *\n"
						+ "* *\n"
						+ " *\n";
		Pattern10.pattern10(3);
		assertEquals(expected, outContent.toString());
	}

	@Test
	void testPattern10_n1()
	{
		String expected = "*\n";
		Pattern10.pattern10(1);
		assertEquals(expected, outContent.toString());
	}
}
