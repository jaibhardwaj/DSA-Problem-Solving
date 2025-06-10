package com.jai.pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Pattern3Test
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
	public void testPattern3_n5()
	{
		Pattern3.pattern3(5);
		String expected =
				"    *\n" +
						"   **\n" +
						"  ***\n" +
						" ****\n" +
						"*****\n";
		assertEquals(expected, outContent.toString());
	}

	@Test
	public void testPattern3_n3()
	{
		Pattern3.pattern3(3);
		String expected =
				"  *\n" +
						" **\n" +
						"***\n";
		assertEquals(expected, outContent.toString());
	}
}
