package com.jai.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToggleCaseTest
{

	@Test
	void toggleCase()
	{
		final String result = ToggleCase.toggleCase("pepCoDIng");
		System.out.println(result);
		assertEquals("PEPcOdiNG", result);
	}
}