package com.jai.pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Pattern17Test
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
	void testPattern17_n7()
	{
		int n = 7;
		String expected =
				"\t\t\t*\t\n" +
						"\t\t\t*\t*\t\n" +
						"\t\t\t*\t*\t*\t\n" +
						"*\t*\t*\t*\t*\t*\t*\t\n" +
						"\t\t\t*\t*\t*\t\n" +
						"\t\t\t*\t*\t\n" +
						"\t\t\t*\t\n";

		Pattern17.pattern17(n);
		assertEquals(expected, outContent.toString());
	}

	@Test
	void testPattern17_n5()
	{
		int n = 5;
		String expected =
				"\t\t*\t\n" +
						"\t\t*\t*\t\n" +
						"*\t*\t*\t*\t*\t\n" +
						"\t\t*\t*\t\n" +
						"\t\t*\t\n";

		Pattern17.pattern17(n);
		assertEquals(expected, outContent.toString());
	}
}