package com.jai.pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Pattern16Test
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
	public void testPattern16_n3()
	{
		Pattern16.pattern16(3);
		String expected =
				"""
						1\t\t\t\t1\t
						1\t2\t\t2\t1\t
						1\t2\t3\t2\t1\t
						""";
		assertEquals(expected, outContent.toString());
	}

	@Test
	public void testPattern16_n1()
	{
		Pattern16.pattern16(1);
		String expected = "1\t\n";
		assertEquals(expected, outContent.toString());
	}

	@Test
	public void testPattern16_n2()
	{
		Pattern16.pattern16(2);
		String expected =
				"""
						1\t\t1\t
						1\t2\t1\t
						""";
		assertEquals(expected, outContent.toString());
	}
}