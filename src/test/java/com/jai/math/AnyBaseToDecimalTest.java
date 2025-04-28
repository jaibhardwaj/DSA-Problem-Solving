package com.jai.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnyBaseToDecimalTest
{

	@Test
	void anyBaseToDecimal()
	{
		final int number1 = AnyBaseToDecimal.anyBaseToDecimal(111001, 2);
		assertEquals(57, number1);

		final int number2 = AnyBaseToDecimal.anyBaseToDecimal(1172, 8);
		assertEquals(634, number2);

	}
}