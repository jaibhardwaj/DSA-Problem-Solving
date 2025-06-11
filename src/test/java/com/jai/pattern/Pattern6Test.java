package com.jai.pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Pattern6Test
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
	void testPattern6WithOddInput()
	{
		int n = 5;
		String expected =
						"*** ***\n" +
						"**   **\n" +
						"*     *\n" +
						"**   **\n" +
						"*** ***\n";
		Pattern6.pattern6(n);
		assertEquals(expected, outContent.toString());
	}

	@Test
	void testPattern6WithSmallestOddInput()
	{
		int n = 1;
		String expected = "* *\n";
		Pattern6.pattern6(n);
		assertEquals(expected, outContent.toString());
	}
}
