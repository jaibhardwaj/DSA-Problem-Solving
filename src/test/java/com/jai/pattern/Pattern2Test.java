package com.jai.pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Pattern2Test
{

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@BeforeEach
	void setUpStreams()
	{
		System.setOut(new PrintStream(outContent));
	}

	@AfterEach
	void restoreStreams()
	{
		System.setOut(originalOut);
	}

	@Test
	void testPattern2WithN4()
	{
		Pattern2.pattern2(4);
		String expected = "****\n***\n**\n*\n";
		assertEquals(expected, outContent.toString());
	}

	@Test
	void testPattern2WithN1()
	{
		Pattern2.pattern2(1);
		String expected = "*\n";
		assertEquals(expected, outContent.toString());
	}

	@Test
	void testPattern2WithN0()
	{
		Pattern2.pattern2(0);
		String expected = "";
		assertEquals(expected, outContent.toString());
	}
}
