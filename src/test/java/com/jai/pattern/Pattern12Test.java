package com.jai.pattern;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Pattern12Test
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
	public void testPattern11_n5()
	{
		Pattern12.pattern12(5);
		String expectedOutput =
				"0 \n" +
						"1 1 \n" +
						"2 3 5 \n" +
						"8 13 21 34 \n" +
						"55 89 144 233 377 \n";
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	public void testPattern11_n1()
	{
		Pattern12.pattern12(1);
		String expectedOutput = "0 \n";
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	public void testPattern11_n0()
	{
		Pattern12.pattern12(0);
		String expectedOutput = "";
		assertEquals(expectedOutput, outContent.toString());
	}
}