package com.jai.pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Pattern19Test
{

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@BeforeEach
	public void setUpStreams()
	{
		System.setOut(new PrintStream(outContent));
	}

	@AfterEach
	public void restoreStreams()
	{
		System.setOut(originalOut);
	}

	@Test
	public void testPattern19_n7()
	{
		int n = 7;
		String expected =
				"****  *\n" +
						"   *  *\n" +
						"   *  *\n" +
						"*******\n" +
						"*  *   \n" +
						"*  *   \n" +
						"*  ****\n";

		Pattern19.pattern19(n);

		assertEquals(expected, outContent.toString());
	}
}