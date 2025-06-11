package com.jai.pattern;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the Pattern11 class.
 */
public class Pattern11Test
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
	public void testPattern11_WithN1()
	{
		Pattern11.pattern11(1);
		assertEquals("1\n", outContent.toString());
	}

	@Test
	public void testPattern11_WithN3()
	{
		Pattern11.pattern11(3);
		assertEquals("1\n23\n456\n", outContent.toString());
	}

	@Test
	public void testPattern11_WithN4()
	{
		Pattern11.pattern11(4);
		assertEquals("1\n23\n456\n78910\n", outContent.toString());
	}

	@Test
	public void testPattern11_WithN0()
	{
		Pattern11.pattern11(0);
		assertEquals("", outContent.toString());
	}
}