package com.jai.pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the Pattern7 class.
 */
public class Pattern7Test {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@BeforeEach
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@AfterEach
	public void restoreStreams() {
		System.setOut(originalOut);
	}

	@Test
	public void testPattern7_n1() {
		Pattern7.pattern7(1);
		String expected = "*\n";
		assertEquals(expected, outContent.toString());
	}

	@Test
	public void testPattern7_n3() {
		Pattern7.pattern7(3);
		String expected =
				"*  \n" +
						" * \n" +
						"  *\n";
		assertEquals(expected, outContent.toString());
	}

	@Test
	public void testPattern7_n4() {
		Pattern7.pattern7(4);
		String expected =
				"*   \n" +
						" *  \n" +
						"  * \n" +
						"   *\n";
		assertEquals(expected, outContent.toString());
	}

	@Test
	public void testPattern7_n0() {
		Pattern7.pattern7(0);
		String expected = "";
		assertEquals(expected, outContent.toString());
	}
}
