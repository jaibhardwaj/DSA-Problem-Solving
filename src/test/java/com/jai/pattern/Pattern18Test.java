package com.jai.pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Pattern18Test
{

	private final PrintStream originalOut = System.out;
	private ByteArrayOutputStream outContent;

	@BeforeEach
	public void setUpStreams()
	{
		outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
	}

	@AfterEach
	public void restoreStreams()
	{
		System.setOut(originalOut);
	}

	@Test
	public void testPattern18_n7()
	{
		int n = 7;
		String expected =
				"""
						*\t*\t*\t*\t*\t*\t*
						\t*\t\t\t\t*
						\t\t*\t\t*
						\t\t\t*
						\t\t*\t*\t*
						\t*\t*\t*\t*\t*
						*\t*\t*\t*\t*\t*\t*
						""";

		Pattern18.pattern18(n);

		//assertEquals(expected, outContent.toString());
	}
}