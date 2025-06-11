package com.jai.pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the Pattern8 class.
 */
public class Pattern8Test
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
	public void testPattern8_nIs1()
	{
		Pattern8.pattern8(1);
		String expected = "*\n";
		assertEquals(expected, outContent.toString());
	}

	@Test
	public void testPattern8_nIs3()
	{
		Pattern8.pattern8(3);
		String expected =
				"  *\n" +
						" * \n" +
						"*  \n";
		assertEquals(expected, outContent.toString());
	}

	@Test
	public void testPattern8_nIs5()
	{
		Pattern8.pattern8(5);
		String expected =
				"    *\n" +
						"   * \n" +
						"  *  \n" +
						" *   \n" +
						"*    \n";
		assertEquals(expected, outContent.toString());
	}
}
