package com.jai.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnyBaseSubtractionTest
{

	@Test
	void addition()
	{
		final int number1 = AnyBaseSubtraction.subtraction(1212, 256, 8);
		assertEquals(734, number1);
	}
}