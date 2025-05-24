package com.jai.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromicSubstringTest
{

	@Test
	void palindromicSubstring()
	{
		assertEquals(9, PalindromicSubstring.palindromicSubstring("abccbc"));
	}
}