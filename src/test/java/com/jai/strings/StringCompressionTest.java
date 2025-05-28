package com.jai.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest
{

	@Test
	void compression1()
	{
		String result = StringCompression.compression1("aaabbcccddaeef");
		assertEquals("abcdaef", result);
	}
	@Test
	void compression2()
	{
		String result = StringCompression.compression2("aaabbcccddaeeff");
		assertEquals("a3b2c3d2ae2f2", result);
	}
}