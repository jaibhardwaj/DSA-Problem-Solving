package com.jai.pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Pattern5Test
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
	void testPattern4WithOddInput()
	{
		// Given
		int n = 5;
		String expectedOutput =
				"  *\n"
						+ " ***\n"
						+ "*****\n"
						+ " ***\n"
						+ "  *\n";

		// When
		Pattern5.pattern5(n);

		// Then
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testPattern4WithSmallestOddInput()
	{
		// Given
		int n = 1;
		String expectedOutput = "*\n";

		// When
		Pattern5.pattern5(n);

		// Then
		assertEquals(expectedOutput, outContent.toString());
	}
}
