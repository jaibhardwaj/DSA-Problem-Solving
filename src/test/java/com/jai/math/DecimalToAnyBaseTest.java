package com.jai.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalToAnyBaseTest
{

	@Test
	void decimalToAnyBase()
	{
		final int number1 = DecimalToAnyBase.decimalToAnyBase(57, 2);
		assertEquals(111001, number1);

		final int number2 = DecimalToAnyBase.decimalToAnyBase(634, 8);
		assertEquals(1172, number2);
	}
}