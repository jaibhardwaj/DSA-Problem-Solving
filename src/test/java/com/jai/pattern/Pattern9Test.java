package com.jai.pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Pattern9Test
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
	public void testPattern9_Size5()
	{
		String expected =
				"*   *\n" +
						" * * \n" +
						"  *  \n" +
						" * * \n" +
						"*   *\n";
		Pattern9.pattern9(5);
		assertEquals(expected, outContent.toString());
	}

	@Test
	public void testPattern9_Size3()
	{
		String expected =
				"* *\n" +
						" * \n" +
						"* *\n";
		Pattern9.pattern9(3);
		assertEquals(expected, outContent.toString());
	}

	@Test
	public void testPattern9_Size1()
	{
		String expected = "*\n";
		Pattern9.pattern9(1);
		assertEquals(expected, outContent.toString());
	}
}
